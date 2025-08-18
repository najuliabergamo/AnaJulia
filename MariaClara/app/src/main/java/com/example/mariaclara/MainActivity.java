package com.example.mariaclara;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int contador;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        textView.setText(Integer.toString(contador));
        textView.setOnClickListener(  v -> {
            contador++;
            textView.setText(Integer.toString(contador));
        });


    }
}