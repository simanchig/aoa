package com.simanchig.aoa;

import java.lang.reflect.*;
import android.content.*;

public class ClassSaver
{
	private SharedPreferences _prefs;

	public ClassSaver(SharedPreferences prefs, Console console)
	{
		_prefs = prefs;
	}
	
	public void save(Object object)
	{
		for(Field field : object.getClass().getFields())
		{
			int saveAnnotations = field.getAnnotationsByType(Save.class).length;
			if(saveAnnotations == 0) continue;
			
			saveField(field, object);
		}
	}
	
	public void load(Object object)
	{
		for(Field field : object.getClass().getFields())
		{
			int saveAnnotations = field.getAnnotationsByType(Save.class).length;
			if(saveAnnotations == 0) continue;

			loadField(field, object);
		}
	}

	private void loadField(Field field, Object object)
	{
		String fieldName = field.getName();
		
		try
		{
			if (_prefs.contains(fieldName) == false) return;
			
			if (field.getType() == Integer.class)
				field.set(object, _prefs.getInt(field.getName(), 0));

			if (field.getType() == Boolean.class)
				field.set(object, _prefs.getBoolean(field.getName(), false));
		}
		catch (IllegalAccessException e)
		{
			Console.log("Failed to access " + fieldName);
		}
		catch (IllegalArgumentException e)
		{
			Console.log(fieldName + " load error");
		}
	}

	private void saveField(Field field, Object object)
	{
		String fieldName = field.getName();
		
		try
		{
			if (field.getType() == Integer.class)
				Console.saveInt(fieldName, field.getInt(object));
			
			if (field.getType() == Boolean.class)
				Console.saveBool(fieldName, field.getBoolean(object));
		}
		catch (IllegalAccessException e)
		{
			Console.log("Failed to access " + fieldName);
		}
		catch (IllegalArgumentException e)
		{
			Console.log(fieldName + " save error");
		}
	}
}
