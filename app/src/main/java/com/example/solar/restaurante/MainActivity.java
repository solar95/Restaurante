package com.example.solar.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    public void abrirCuenta(View view){
        Intent cuentaIntent = new Intent(this,Cuenta.class);
        startActivity(cuentaIntent);

    }

    public void llamarMesero(View view){
        Toast.makeText(this,"Mesero en camino...",Toast.LENGTH_SHORT).show();
    }
}
