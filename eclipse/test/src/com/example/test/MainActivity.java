package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.widget.Button;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;



public class MainActivity extends Activity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event){
        		float size = event.getSize();
        		btn.setText(Float.toString(size));
        		btn.setBackgroundColor(0xAAAAFFFF);
        		return true;
        	}
        	
        });
    }
}
