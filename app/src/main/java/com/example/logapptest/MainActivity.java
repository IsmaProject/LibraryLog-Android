package com.example.logapptest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.librarytest.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("jcb");
        LogDebug.add(2,9);
        LogDebug.rem(1,1);
        LogDebug.tell("chdjsbc");
    }
}
