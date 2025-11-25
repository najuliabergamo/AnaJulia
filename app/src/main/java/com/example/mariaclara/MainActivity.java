package com.example.mariaclara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView numero;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.text);
        numero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView numero = (TextView) view;
                numero.setText("Click here");
                contador++;
                numero.setText(Integer.toString(contador));

            }
        });

        button = findViewById(R.id.botao);
        button.setText("Click here");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                b.setText("Click here");
                contador++;
                numero.setText(Integer.toString(contador));
            }
        });
    }
}