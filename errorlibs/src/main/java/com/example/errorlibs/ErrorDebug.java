package com.example.errorlibs;

import android.util.Log;

public class ErrorDebug {

    private static final String TAG = "Test";

    public static void e(String message){
        Log.e(TAG, message);
    }

}
