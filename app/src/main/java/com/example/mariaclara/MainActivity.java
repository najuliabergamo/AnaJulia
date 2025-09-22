package com.example.mariaclara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText Ntabu;
    Button Gerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Gerar=findViewById(R.id.Gerar);
        Ntabu=findViewById(R.id.Ntabu);

        Intent i = new Intent(MainActivity.this, MainActivity.class);
        Bundle bundle =new Bundle();

        Double n = Double.parseDouble(Ntabu.getText().toString());
        bundle.putDouble("n",n);

    }
}