package com.example.periodictable;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends Activity {
	 private RadioGroup quizGroup;
	  private RadioButton quizButton;
	  private Button btnDisplay;
	  String d1 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		addListenerOnButton();
	
	}
	public void addListenerOnButton() {
		 
		quizGroup = (RadioGroup) findViewById(R.id.radioquiz);
		btnDisplay = (Button) findViewById(R.id.btnDisplay);
	 
		btnDisplay.setOnClickListener(new OnClickListener() {
	 
			@Override
			public void onClick(View v) {
				d1 = quizButton.getText().toString();
			        // get selected radio button from radioGroup
				
				
	 
				// find the radiobutton by returned id
			    if( d1.equals("sblock")){
			    		Toast.makeText(QuizActivity.this,
					"correct answer", Toast.LENGTH_SHORT).show();
			    }
			    else {
			    	Toast.makeText(QuizActivity.this,
							"wrong answer", Toast.LENGTH_SHORT).show();
			    }
			    	
	 
			}
	 
		});
	 
	  }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz, menu);
		return true;
	}
	
	
	

}
