package com.simanchig.aoa;

public class Console
{
	private MainActivity activity;
	private InputHandler inputHandler;

	public Console(MainActivity activity)
	{
		this.activity = activity;
	}

	public void setInputHandler(InputHandler inputHandler)
	{
		this.inputHandler = inputHandler;
	}

	public InputHandler getInputHandler()
	{
		return inputHandler;
	}
	
	public void print(String string) {
		activity.console.setText(activity.console.getText() + string);
	}
	
	public void println(String string) {
		activity.console.setText(activity.console.getText() + string + "\n");
	}
	
	public void clear() {
		activity.console.setText("");
	}
	
	public void input(String input) {
		inputHandler.onInput(input);
	}
	
	public void saveInt(String key, int value) {
		activity.spref.edit().putInt(key, value).apply();
	}
	
	public int loadInt(String key, int _default) {
		return activity.spref.getInt(key, _default);
	}
	
	public void saveBool(String key, boolean value) {
		activity.spref.edit().putBoolean(key, value).apply();
	}

	public boolean loadBoal(String key, boolean _default) {
		return activity.spref.getBoolean(key, _default);
	}
}
