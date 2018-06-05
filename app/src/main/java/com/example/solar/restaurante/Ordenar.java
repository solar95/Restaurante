package com.example.solar.restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ordenar extends AppCompatActivity implements  AdapterView.OnItemClickListener{

    private ArrayList<Consumible> list1;
    private ListView lv1;
    private ConsumibleAdapter adapter;
    private TextView nombre, precio, cantidad;
    private Button btnCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ordenar);

        //ListView Code
        list1 = new ArrayList<Consumible>();
        llenarLista();
        btnCuenta = findViewById(R.id.btn_ordenar);
        nombre = findViewById(R.id.item_nombre);
        precio = findViewById(R.id.item_precio);
        adapter = new ConsumibleAdapter(this, list1);
        lv1 = findViewById(R.id.lv01);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(this);
        btnCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cuenta = new Intent(getApplicationContext(),Cuenta.class);
                startActivity(cuenta);

            }
        });
    }


    private void llenarLista(){

        list1.add(new Consumible("Alitas",80, R.drawable.alitas));
        list1.add(new Consumible("Cafe",20,R.drawable.cafe1));
        list1.add(new Consumible("Cerveza No. 1",30,R.drawable.cerveza1));
        list1.add(new Consumible("Cerveza No. 2",32,R.drawable.cerveza2));
        list1.add(new Consumible("Coca-Cola",18,R.drawable.coca1));
        list1.add(new Consumible("Cochinita",120,R.drawable.cochinita));
        list1.add(new Consumible("Crepa",55,R.drawable.crepa));
        list1.add(new Consumible("Enchiladas",70,R.drawable.enchiladas));
        list1.add(new Consumible("Hamburguesa",60,R.drawable.hamburguesa));
        list1.add(new Consumible("Hot Dog",30,R.drawable.hocho));
        list1.add(new Consumible("Papas fritas",45,R.drawable.papas));
        list1.add(new Consumible("Sushi",90,R.drawable.sushi));
        list1.add(new Consumible("Tequila No. 1",50,R.drawable.tequila1));
        list1.add(new Consumible("Tequila No. 2",55,R.drawable.tequila2));
        list1.add(new Consumible("Vino",70,R.drawable.vino1));

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        nombre.setText(list1.get(i).getNombre());
        precio.setText(list1.get(i).getPrecio());
    }


    public void pedirCuenta(View view) {
        Intent cuenta = new Intent(this,Cuenta.class);
        startActivity(cuenta);
        Toast.makeText(this,"Abriendo...",Toast.LENGTH_SHORT).show();
    }



}
