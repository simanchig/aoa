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
}
