package com.example.periodictable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InformationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_information);
		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.information, menu);
		return true;
	}
	public void addListenerOnButton() {

		final Context context = this;

		final Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(context, SInfoActivity.class);
                startActivity(intent);   

			}
			
		});
		final Button button1 = (Button) findViewById(R.id.button2);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				 
				Intent intent = new Intent(context, FInfoActivity.class);
                startActivity(intent);   

			}
			
		});
		final Button button2= (Button) findViewById(R.id.button3);
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				 
				Intent intent = new Intent(context, PInfoActivity.class);
                startActivity(intent);   

			}
			
		});
		final Button button3= (Button) findViewById(R.id.button4);
		button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(context,DInfoActivity.class);
                startActivity(intent);   

			}
			
		});
	}	

}
