package com.simanchig.aoa;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

import Main;
import android.preference.*;
import android.content.*;

public class MainActivity extends Activity 
{
	public EditText commandField;
	public TextView consoleOutput;
	
	public SharedPreferences spref;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		commandField = findViewById(R.id.commandField);
		consoleOutput = findViewById(R.id.console);
		spref = PreferenceManager.getDefaultSharedPreferences(this);

		new Console(this);
		new Main();
    }

	public void onOkButtonClick(View view)
	{
		//Toast.makeText(this, "Command executed!", Toast.LENGTH_LONG).show();
		String input = commandField.getEditableText().toString();
		commandField.setText("");
		
		Console.invokeInputHandler(input);
	}
}
