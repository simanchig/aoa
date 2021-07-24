package com.simanchig.aoa;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

import Main;

public class MainActivity extends Activity 
{
	public EditText commandField;
	public TextView console;
	
	private Console consoleObj;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		commandField = findViewById(R.id.commandField);
		console = findViewById(R.id.console);
		
		consoleObj = new Console(this);
		Main.main(consoleObj);
    }
	
	public void onOkButtonClick(View view) {
		Toast.makeText(this, "Command executed!", Toast.LENGTH_LONG).show();
		String input = commandField.getEditableText().toString();
		commandField.setText("");
		consoleObj.input(input);
	}
	
}
