package edu.ajh161.janineapp;
//All the images and pictures in this app wI got from my cousin.
//This is a business she is looking to drum up and is going around pitching her products to 
//different companies.
import android.net.Uri;
import android.os.Bundle;
 import android.app.Activity;
 import android.view.Menu;
 import android.view.View;
 import android.view.View.OnClickListener;
 import android.widget.Button;
 import android.content.Context;
 import android.content.Intent;


public class MainActivity extends Activity {
	Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void addListenerOnButton() {


        button = (Button) findViewById(R.id.butAbout);
          button2 = (Button) findViewById(R.id.butOrnaments);
          button3 = (Button) findViewById(R.id.butGift);

      }


       public void buttonClick(View v){
       Intent myIntent = new Intent(this, About.class);
       startActivity(myIntent);
   }

      public void button2Click(View v){
       Intent myIntent = new Intent(this, Ornaments.class);
         startActivity(myIntent);
      }

      public void butGift(View v){
          Intent myIntent = new Intent(this, GiftBoxes.class);
            startActivity(myIntent);
         }

}
