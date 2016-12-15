package edu.ajh161.janineapp;

 import android.os.Bundle;
  import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.app.Activity;
import android.view.Menu;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

}
