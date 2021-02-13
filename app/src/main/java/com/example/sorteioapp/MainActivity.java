package com.example.sorteioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    EditText edInicial, edFinal;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInicial = findViewById(R.id.editTextVinicial);
        edFinal = findViewById(R.id.editTextVFinal);
        textView = findViewById(R.id.textViewValorSorteado);
    }

    public void sorteioNumero(View view) {
        int vInicial = Integer.parseInt(edInicial.getText().toString());
        int vFinal = Integer.parseInt(edFinal.getText().toString());
        int numeroSorteado = 0;
        if (vInicial > vFinal){
            int temp = vInicial;
            vInicial = vFinal;
            vFinal = temp;
            numeroSorteado = (new Random().nextInt((vFinal - vInicial) + 1)) + vInicial;

        } else {
            numeroSorteado = (new Random().nextInt((vFinal - vInicial) + 1)) + vInicial;
        }
        textView.setText(Integer.toString(numeroSorteado));
    }
}