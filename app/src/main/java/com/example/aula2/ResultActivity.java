package com.example.aula2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView resultTextView;
    private TextView classificacao;
    private Button backButton;

    private ImageView imageViewPerfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcresultado);

        // Pegando os IDs do layout
        resultTextView = findViewById(R.id.TvResultado);
        classificacao= findViewById(R.id.classificacao);
        backButton = findViewById(R.id.botao);
        imageViewPerfil = findViewById(R.id.ftCorpo);
        // Recebe o IMC da tela anterior
        double imc = getIntent().getDoubleExtra("IMC_VALUE", 0);

        // Exibe IMC
        resultTextView.setText(String.format("IMC: %.2f", imc));

        // Exibe classificação
        classificacao.setText(getClassification(imc));

        // Botão Voltar
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volta para Activity anterior
            }
        });
    }

    private String getClassification(double imc) {
        if (imc < 18.5) {
            return "Classificação: Abaixo do peso";
        } else if (imc < 24.9) {
            return "Classificação: Peso normal";
        } else if (imc < 29.9) {
            return "Classificação: Sobrepeso";
        } else if (imc < 34.9) {
            return "Classificação: Obesidade grau 1";
        } else if (imc < 39.9) {
            return "Classificação: Obesidade grau 2";
        } else {
            return "Classificação: Obesidade grau 3";
        }
    }
}
