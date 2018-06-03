package com.example.solar.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOrdenar , btnCuenta , btnMesero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOrdenar = findViewById(R.id.boton_ordenar);
        btnCuenta = findViewById(R.id.boton_cuenta);
        btnMesero = findViewById(R.id.boton_mesero);


    }

    public void abrirOrdenar(View view) {
        Intent ordenarIntent = new Intent(this,Ordenar.class);
        startActivity(ordenarIntent);
    }
}
