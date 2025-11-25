package com.example.mariaclara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editTextMin, editTextMax;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os componentes do layout
        editTextMin = findViewById(R.id.min);
        editTextMax = findViewById(R.id.max);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.botao);

        // Configurando o que acontece quando clica no botao
        button.setText("Sortear Número");
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // para pegar os valores que o usuario coloca no xml
                String minString = editTextMin.getText().toString();
                String maxString = editTextMax.getText().toString();

                // Verificar se os campos não estão vazios
                if (minString.isEmpty() || maxString.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, insira os valores de intervalo", Toast.LENGTH_SHORT).show();
                    return;
                }

                int nInicial, nFinal;
                try {
                    nInicial = Integer.parseInt(minString);
                    nFinal = Integer.parseInt(maxString);

                    // Verificar se o valor mínimo não é maior que o valor máximo
                    if (nInicial > nFinal) {
                        Toast.makeText(MainActivity.this, "O valor mínimo não pode ser maior que o valor máximo", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // Gerar número aleatório dentro do intervalo
                    Random random = new Random();
                    int nSorteado = random.nextInt((nFinal - nInicial) + 1) + nInicial;

                    // mostrar número sorteado
                    textView.setText(String.valueOf(nSorteado));
                } catch (NumberFormatException e) {
                    // se o valor inserido não for número válido
                    Toast.makeText(MainActivity.this, "Por favor, insira números válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
