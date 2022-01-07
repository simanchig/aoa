package com.simanchig.aoa;

import java.util.*;

public class Console
{
	private List<InputHandler> inputHandlers;
	private MainActivity activity;

	public Console(MainActivity activity)
	{
		inputHandlers = new ArrayList<InputHandler>();

		this.activity = activity;
	}

	public void addInputHandler(InputHandler handler)
	{
		inputHandlers.add(handler);
	}

	public void removeInputHandler(InputHandler handler)
	{
		inputHandlers.remove(handler);
	}

	public void print(String string)
	{
		activity.consoleOutput.setText(activity.consoleOutput.getText() + string);
	}

	public void println(String string)
	{
		activity.consoleOutput.setText(activity.consoleOutput.getText() + string + "\n");
	}

	public void clear()
	{
		activity.consoleOutput.setText("");
	}
	
	public void invokeInputHandler(String input)
	{
		for(InputHandler handler : inputHandlers)
		{
			handler.onInput(input);
		}
	}

	public void saveInt(String key, int value)
	{
		activity.spref.edit().putInt(key, value).apply();
	}

	public int loadInt(String key, int _default)
	{
		return activity.spref.getInt(key, _default);
	}

	public void saveBool(String key, boolean value)
	{
		activity.spref.edit().putBoolean(key, value).apply();
	}

	public boolean loadBool(String key, boolean _default)
	{
		return activity.spref.getBoolean(key, _default);
	}
}
