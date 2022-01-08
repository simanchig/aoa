package com.simanchig.aoa;

import java.lang.reflect.*;
import android.content.*;

public class VariableSaver
{
	private SharedPreferences _prefs;
	private Console _console;

	public VariableSaver(SharedPreferences prefs, Console console)
	{
		_prefs = prefs;
		_console = console;
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
			if (field.getType() == Integer.class)
			{
				if (_prefs.contains(fieldName) == false) return;

				field.set(object, _prefs.getInt(field.getName(), 0));
			}

			if (field.getType() == Boolean.class)
			{
				if (_prefs.contains(fieldName) == false) return;

				field.set(object, _prefs.getBoolean(field.getName(), false));
			}
		}
		catch (IllegalAccessException e)
		{
			_console.println("Failed to access " + fieldName);
		}
		catch (IllegalArgumentException e)
		{
			_console.println(fieldName + " load error");
		}
	}

	private void saveField(Field field, Object object)
	{
		String fieldName = field.getName();
		
		try
		{
			if (field.getType() == Integer.class)
			{
				_prefs.edit().putInt(fieldName, field.getInt(object)).apply();
			}

			if (field.getType() == Boolean.class)
			{
				_prefs.edit().putBoolean(fieldName, field.getBoolean(object)).apply();
			}
		}
		catch (IllegalAccessException e)
		{
			_console.println("Failed to access " + fieldName);
		}
		catch (IllegalArgumentException e)
		{
			_console.println(fieldName + " save error");
		}
	}
}
