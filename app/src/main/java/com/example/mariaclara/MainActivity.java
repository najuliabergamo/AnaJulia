package com.example.mariaclara;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("cicloVida", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("cicloVida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cicloVida", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("cicloVida", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("cicloVida", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("cicloVida", "onDestroy");
    }
}



