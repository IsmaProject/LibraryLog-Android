package com.example.librarytest;

import android.view.MotionEvent;
import android.view.View;

public class Tests {

    private int hideSystemBar(){
        return View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }


    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if(e1 == null || e2 == null) return false;
        if(e1.getPointerCount() > 1 || e2.getPointerCount() > 1) return false;
        else {
            try { // right to left swipe .. go to next page
                if(e1.getX() - e2.getX() > 100 && Math.abs(velocityX) > 800) {
                    //do your stuff
                    // Intent i = new Intent(MainActivity.this, AppsListActivity.class);
                    return true;
                } //left to right swipe .. go to prev page
                else if (e2.getX() - e1.getX() > 100 && Math.abs(velocityX) > 800) {
                    //do your stuff
                    // Intent i = new Intent(AppsListActivity.this, MainActivity.class);
                    return true;
                }
            } catch (Exception e) { // nothing
            }
            return false;
        }
    }
}
