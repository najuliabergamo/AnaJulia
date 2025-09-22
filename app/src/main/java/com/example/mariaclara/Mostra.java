package com.example.mariaclara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Mostra extends AppCompatActivity {

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mostra);

        resultado=findViewById(R.id.Resultado);

        Intent i =getIntent();
        Bundle b=i.getExtras();

        assert b != null;
        Double n =b.getDouble("n");

        Double tabuada = (n*1), (n*2), (n*3), (n*4), (n*5), (n*6), (n*7) , (n*8) , (n*9) , (n*10);

        resultado.setText(Double.toString(tabuada));

    }
}