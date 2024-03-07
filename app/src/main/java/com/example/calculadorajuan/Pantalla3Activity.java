package com.example.calculadorajuan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Pantalla3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);


        Intent intent = getIntent();
        String valorAngulo = intent.getStringExtra("angulo");
        String valorValor = intent.getStringExtra("valor");
        String valorPotencia = intent.getStringExtra("potencia");
        String valorNumero = intent.getStringExtra("numero");


        double angulo = Double.parseDouble(valorAngulo);
        double valor = Double.parseDouble(valorValor);
        double potencia = Double.parseDouble(valorPotencia);
        double numero = Double.parseDouble(valorNumero);

        double seno = Math.sin(Math.toRadians(angulo));
        double coseno = Math.cos(Math.toRadians(angulo));
        double raizCuadrada = Math.sqrt(numero);
        double resultadoPotencia = Math.pow(numero, potencia);


        TextView textViewResultados = findViewById(R.id.textViewResultados);
        textViewResultados.setText("RESULTADOS:");

        TextView textViewSenoCoseno = findViewById(R.id.textViewSenoCoseno);
        textViewSenoCoseno.setText("SENO: " + seno + "\nCOSENO: " + coseno);

        TextView textViewRaizCuadrada = findViewById(R.id.textViewRaizCuadrada);
        textViewRaizCuadrada.setText("RAÍZ CUADRADA: " + raizCuadrada);

        TextView textViewPotencia = findViewById(R.id.textViewPotencia);
        textViewPotencia.setText("POTENCIA: " + resultadoPotencia);
    }
}
