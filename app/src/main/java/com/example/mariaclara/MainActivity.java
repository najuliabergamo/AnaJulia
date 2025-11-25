package com.example.mariaclara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Ntabu;
    Button Gerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Gerar = findViewById(R.id.Gerar);
        Ntabu = findViewById(R.id.Ntabu);

        // Configura o clique do botão "Gerar"
        Gerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verifica se o campo não está vazio
                String input = Ntabu.getText().toString();
                if (input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, insira um número", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    // muda o texto para um número Double
                    Double n = Double.parseDouble(input);

                    // Cria um Intent para ir para a Activity 'Mostra'
                    Intent intent = new Intent(MainActivity.this, Mostra.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("n", n);  // Coloca o número no bundle
                    intent.putExtras(bundle);   // Passa o bundle para o intent

                    // Inicia a Activity 'Mostra'
                    startActivity(intent);

                } catch (NumberFormatException e) {
                    // se o número for inválido
                    Toast.makeText(MainActivity.this, "Número inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
