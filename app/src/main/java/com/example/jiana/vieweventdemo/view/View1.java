package com.example.jiana.vieweventdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jiana on 16-4-4.
 */
public class View1 extends View {
    private static final String TAG = "View1";
    public View1(Context context) {
        super(context);
    }

    public View1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, "------------------  dispatchTouchEvent = " + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "------------------  onTouchEvent = " + event.getAction());
        return super.onTouchEvent(event);
    }
    /*
E/MainActivity: -------------  dispatchTouchEvent = 0
E/ViewGroup1: ---------------  dispatchTouchEvent = 0
E/ViewGroup1: ---------------  onInterceptTouchEvent = 0
E/ViewGroup2: ---------------  dispatchTouchEvent = 0
E/ViewGroup2: ---------------  onInterceptTouchEvent = 0
E/Button1: ------------------  dispatchTouchEvent = 0
E/Button1: ------------------  onTouchEvent = 0
E/MainActivity: -------------  dispatchTouchEvent = 2
E/ViewGroup1: ---------------  dispatchTouchEvent = 2
E/ViewGroup1: ---------------  onInterceptTouchEvent = 2
E/ViewGroup2: ---------------  dispatchTouchEvent = 2
E/ViewGroup2: ---------------  onInterceptTouchEvent = 2
E/Button1: ------------------  dispatchTouchEvent = 2
E/Button1: ------------------  onTouchEvent = 2
E/MainActivity: -------------  dispatchTouchEvent = 2
E/ViewGroup1: ---------------  dispatchTouchEvent = 2
E/ViewGroup1: ---------------  onInterceptTouchEvent = 2
E/ViewGroup2: ---------------  dispatchTouchEvent = 2
E/ViewGroup2: ---------------  onInterceptTouchEvent = 2
E/Button1: ------------------  dispatchTouchEvent = 2
E/Button1: ------------------  onTouchEvent = 2
E/MainActivity: -------------  dispatchTouchEvent = 1
E/ViewGroup1: ---------------  dispatchTouchEvent = 1
E/ViewGroup1: ---------------  onInterceptTouchEvent = 1
E/ViewGroup2: ---------------  dispatchTouchEvent = 1
E/ViewGroup2: ---------------  onInterceptTouchEvent = 1
E/Button1: ------------------  dispatchTouchEvent = 1
E/Button1: ------------------  onTouchEvent = 1

     */
}
