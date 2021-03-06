package com.example.librarytest;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "Test";

    public static void d(String message){
        Log.d(TAG, message);
    }

    public static int add(int nombreUn, int nombreDeux){
        return nombreUn + nombreDeux;
    }

    public static int rem(int nombreUn, int nombreDeux){
        return nombreUn - nombreDeux;
    }

    public static String tell(String phrase){
        return "vous avez ecrit " + phrase;
    }
}
