package com.example.jiana.vieweventdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.jiana.vieweventdemo.view.Button1;
import com.example.jiana.vieweventdemo.view.View1;
import com.example.jiana.vieweventdemo.view.ViewGroup1;
import com.example.jiana.vieweventdemo.view.ViewGroup2;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ViewGroup1 viewGroup1;
    private ViewGroup2 viewGroup2;
    private View1 view1;
    private Button1 button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewGroup1 = (ViewGroup1) findViewById(R.id.viewGroup1);
        viewGroup2 = (ViewGroup2) findViewById(R.id.viewGroup2);
        view1 = (View1) findViewById(R.id.view1);
        button1 = (Button1) findViewById(R.id.button1);

//        viewGroup1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "viewGroup1 touch listener event = " + event.getAction());
//                return false;
//            }
//        });
//
//        viewGroup2.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "viewGroup2 touch listener event = " + event.getAction());
//                return false;
//            }
//        });
//
//
//        view1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "view1 touch listener event = " + event.getAction());
//                return false;
//            }
//        });
//
//        button1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "button1 touch listener event = " + event.getAction());
//                return false;
//            }
//        });

    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "------------------  dispatchTouchEvent = " + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "------------------  onTouchEvent = " + event.getAction());
        return super.onTouchEvent(event);
    }
    /*
E/MainActivity: ----------------  dispatchTouchEvent = 0
E/ViewGroup1: ------------------  dispatchTouchEvent = 0
E/ViewGroup1: ------------------  onInterceptTouchEvent = 0
E/ViewGroup2: ------------------  dispatchTouchEvent = 0
E/ViewGroup2: ------------------  onInterceptTouchEvent = 0
E/ViewGroup2: ------------------  onTouchEvent = 0
E/ViewGroup1: ------------------  onTouchEvent = 0
E/MainActivity: ----------------  onTouchEvent = 0
E/MainActivity: ----------------  dispatchTouchEvent = 2
E/MainActivity: ----------------  onTouchEvent = 2
E/MainActivity: ----------------  dispatchTouchEvent = 2
E/MainActivity: ----------------  onTouchEvent = 2
E/MainActivity: ----------------  dispatchTouchEvent = 2
E/MainActivity: ----------------  onTouchEvent = 2
E/MainActivity: ----------------  dispatchTouchEvent = 1
E/MainActivity: ----------------  onTouchEvent = 1

     */

}
