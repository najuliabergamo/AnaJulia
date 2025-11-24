package com.example.aula2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText weightEditText;
    private EditText heightEditText;
    private Button resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.edPeso);
        heightEditText = findViewById(R.id.edAltura);
        resultado = findViewById(R.id.resultado);

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateIMC();
            }
        });
    }

    private void calculateIMC() {
        String weightString = weightEditText.getText().toString();
        String heightString = heightEditText.getText().toString();

        if (!weightString.isEmpty() && !heightString.isEmpty()) {
            double weight = Double.parseDouble(weightString);
            double height = Double.parseDouble(heightString);
            double imc = weight / (height * height);

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("IMC_VALUE", imc);
            startActivity(intent);
        }
    }
}