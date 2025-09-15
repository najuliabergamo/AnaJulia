package com.example.aula2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class imcresultado extends AppCompatActivity {

    Button b;
    ImageView imageView;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imcresultado);

        tvResultado=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageViewPerfil);

        Intent i =getIntent();
        Bundle b=i.getExtras();

        Double peso =b.getDouble("peso");
        Double altura =b.getDouble("altura");
        Double imc = peso/(altura*altura);

        tvResultado.setText(Double.toString(imc));


    }
}