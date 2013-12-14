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

public class MainActivity extends Activity {
	boolean check=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void addListenerOnButton() {

		final Context context = this;

		final Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				 check=true;
		         button.setBackgroundColor(Color.DKGRAY);
				Intent intent = new Intent(context, PeriodicActivity.class);
                startActivity(intent);   

			}
			
		});
	
		final Button button1 = (Button) findViewById(R.id.button2);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				 check=true;
		         button1.setBackgroundColor(Color.DKGRAY);
				Intent intent = new Intent(context, InformationActivity.class);
                startActivity(intent);   

			}
			
		});
	
		final Button button3= (Button) findViewById(R.id.button4);
		button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				 check=true;
		         button3.setBackgroundColor(Color.DKGRAY);
				Intent intent = new Intent(context, Help1Activity.class);
                startActivity(intent);   

			}
			
		
		});
}
}