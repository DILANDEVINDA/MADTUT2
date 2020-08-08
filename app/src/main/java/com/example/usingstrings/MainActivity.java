package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate called...");
    }


    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "OnStart called...");

    }


    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "OnResume called...");
    }


    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "OnPause called...");
    }


    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "OnStop called...");
    }



    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "OnDestroy called...");
    }





}