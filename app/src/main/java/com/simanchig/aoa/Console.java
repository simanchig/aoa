package com.simanchig.aoa;

import java.util.*;

public class Console
{
	public static VariableSaver saver;
	
	private final List<InputHandler> inputHandlers;
	private final MainActivity activity;
	
	private static Console _singleton;

	public Console(MainActivity activity)
	{
		if(_singleton != null)
		{
			throw new RuntimeException("Second instance of singleton was created.");
		}
		
		_singleton = this;
		
		inputHandlers = new ArrayList<InputHandler>();
		saver = new VariableSaver(activity.spref, this);
		this.activity = activity;
	}

	public static void addInputHandler(InputHandler handler)
	{
		_singleton.inputHandlers.add(handler);
	}

	public static void removeInputHandler(InputHandler handler)
	{
		_singleton.inputHandlers.remove(handler);
	}

	public static void print(String string)
	{
		_singleton.activity.consoleOutput.setText(_singleton.activity.consoleOutput.getText() + string);
	}

	public static void println(String string)
	{
		_singleton.activity.consoleOutput.setText(_singleton.activity.consoleOutput.getText() + string + "\n");
	}

	public static void clear()
	{
		_singleton.activity.consoleOutput.setText("");
	}
	
	public static void invokeInputHandler(String input)
	{
		for(InputHandler handler : _singleton.inputHandlers)
		{
			handler.onInput(input);
		}
	}

	public void saveInt(String key, int value)
	{
		//activity.spref.edit().putInt(key, value).apply();
	}

	public int loadInt(String key, int _default)
	{
		return _default;
		//return activity.spref.getInt(key, _default);
	}

	public void saveBool(String key, boolean value)
	{
		//activity.spref.edit().putBoolean(key, value).apply();
	}

	public boolean loadBool(String key, boolean _default)
	{
		return _default;
		//return activity.spref.getBoolean(key, _default);
	}
}
