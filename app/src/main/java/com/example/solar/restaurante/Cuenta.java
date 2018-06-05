package com.example.solar.restaurante;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Cuenta extends AppCompatActivity {

    TextView lista1,lista2,granTotal;
    String cadena_articulos = "";
    String cadena_precios = "";
    int gran_total = 0;
    Consumible ejemplo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cuenta);

        int l = Cliente.getInstance(this).size();


        for (int i = 0; i < l ; i++){
            ejemplo = Cliente.getInstance(getApplicationContext()).get(i);
            cadena_articulos = cadena_articulos + "\n " +ejemplo.getNombre().toString();
            cadena_precios = cadena_precios + "\n " +  "$" + String.valueOf(ejemplo.getPrecio());
            gran_total+=ejemplo.getPrecio();

        }




        lista1 = findViewById(R.id.cuenta_lista_articulos);
        lista1.setText(cadena_articulos);

        lista2 = findViewById(R.id.cuenta_lista_precios);
        lista2.setText(cadena_precios);

        granTotal = findViewById(R.id.cuenta_total);
        granTotal.setText("T O T A L = $"+" "+String.valueOf(gran_total));

        cadena_articulos = "";
        cadena_precios = "";
    }
}
