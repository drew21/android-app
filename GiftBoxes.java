package edu.ajh161.janineapp;

import android.net.Uri;
import android.os.Bundle;
 import android.app.Activity;
 import android.view.Menu;
 import android.view.View;
 import android.view.View.OnClickListener;
 import android.widget.Button;
 import android.content.Context;
 import android.content.Intent;
import android.app.Activity;
import android.view.Menu;



public class GiftBoxes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gift_boxes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gift_boxes, menu);
		return true;
	}
	 public void web_click(View v)
	    {
	    	Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
	        myWebLink.setData(Uri.parse("http://www.crystalsandbows.com/"));
	        startActivity(myWebLink);
	    }
}
