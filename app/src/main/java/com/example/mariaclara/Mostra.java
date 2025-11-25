package com.example.mariaclara;

import android.content.Intent;
import android.os.Bundle;
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

        resultado = findViewById(R.id.Resultado);

        // Recebe o Intent e os dados passados
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        // Verifica se o Bundle não é nulo
        assert bundle != null;
        Double n = bundle.getDouble("n");

        // Utiliza StringBuilder para concatenar os resultados da tabuada
        StringBuilder tabuada = new StringBuilder();

        // Usei 'j' no lugar de 'i' para evitar conflito
        for (int j = 1; j <= 10; j++) {
            tabuada.append(n).append(" x ").append(j).append(" = ").append(n * j).append("\n");
        }

        // Exibe o resultado na TextView
        resultado.setText(tabuada.toString());
    }
}
