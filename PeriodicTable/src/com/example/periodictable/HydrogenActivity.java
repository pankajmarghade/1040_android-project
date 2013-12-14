package com.example.periodictable;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HydrogenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hydrogen);
		ListView listView1 = (ListView) findViewById(R.id.listView1);
	       
        String[] items = { "Name : Hydrogen", "symbol : H", "Atomic number : 1", "Atomic Weight:1.007 amu ","Isotope :  Protium" , "Group in Periodic Block : S", "Color : Colourless"  };
       
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
       
        listView1.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hydrogen, menu);
		return true;
	}

}
