package com.example.librarytest;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "Test";

    public static void d(String message){
        Log.d(TAG, message);
    }
}