package com.simanchig.aoa;

import java.util.*;

public class Console
{
	public static ClassSaver saver;
	
	private final List<InputHandler> inputHandlers;
	private final MainActivity activity;
	private final StringBuilder logs;
	
	private static Console _singleton;

	public Console(MainActivity activity)
	{
		if(_singleton != null)
		{
			throw new RuntimeException("Second instance of singleton was created.");
		}
		
		_singleton = this;
		
		logs = new StringBuilder();
		inputHandlers = new ArrayList<InputHandler>();
		saver = new ClassSaver(activity.spref, this);
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
	
	public static void printLogs()
	{
		clear();
		println(_singleton.logs.toString());
	}
	
	public static void log(String string)
	{
		_singleton.logs.append(string + "\n");
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

	public static void saveInt(String key, int value)
	{
		_singleton.activity.spref.edit().putInt(key, value).apply();
	}

	public static int loadInt(String key, int _default)
	{
		return _singleton.activity.spref.getInt(key, _default);
	}

	public static void saveBool(String key, boolean value)
	{
		_singleton.activity.spref.edit().putBoolean(key, value).apply();
	}

	public static boolean loadBool(String key, boolean _default)
	{
		return _singleton.activity.spref.getBoolean(key, _default);
	}
}
