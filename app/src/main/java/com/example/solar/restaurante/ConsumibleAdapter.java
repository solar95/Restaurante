package com.example.solar.restaurante;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.ListIterator;

public class ConsumibleAdapter extends ArrayAdapter<Consumible> {
    private Context context;
    private ArrayList<Consumible> data;




    public ConsumibleAdapter(Context context, ArrayList<Consumible> data) {
        super(context, R.layout.item, data);
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        final View item = LayoutInflater.from(context).inflate(R.layout.item, null);

        //Imagen
        ImageView image = item.findViewById(R.id.item_imagen);
        image.setImageResource(data.get(position).getImageID());

        //Nombre
        final TextView nombre = item.findViewById(R.id.item_nombre);
        nombre.setText(data.get(position).getNombre());

        //Precio
        final TextView precio = item.findViewById(R.id.item_precio);
        precio.setText(Integer.toString(data.get(position).getPrecio()));

        //Cantidad
        final TextView cantidad = item.findViewById(R.id.item_cantidad);

        //Botones Cantidad
        ImageButton masCantidad = item.findViewById(R.id.btnMas);
        ImageButton menosCantidad = item.findViewById(R.id.btnMenos);

        LinearLayout body = item.findViewById(R.id.item_body);

        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        masCantidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nactual = cantidad.getText().toString();
                Integer numero = Integer.parseInt(nactual)+1;
                cantidad.setText(numero.toString());
                String n = nombre.getText().toString();
                String p = precio.getText().toString();
                int pn = Integer.parseInt(p);
                Consumible consumible = new Consumible(n,pn);
                Cliente.getInstance(getContext()).add(consumible);


            }
        });

        menosCantidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nactual = cantidad.getText().toString();
                Integer numero = Integer.parseInt(nactual)-1;
                cantidad.setText(numero.toString());
                String n = nombre.getText().toString();
                String p = precio.getText().toString();
                int pn = Integer.parseInt(p);
                Consumible consumible = new Consumible(n,pn);

                //Cliente.getInstance(getContext()).remove(Cliente.getInstance(getContext()).size()-1);



                    int j;

                    for (j = 0; j < Cliente.getInstance(getContext()).size();j++){
                        if (Cliente.getInstance(getContext()).get(j).getNombre().equals(consumible.getNombre()));
                        Toast.makeText(getContext(),"Si aplica",Toast.LENGTH_SHORT).show();
                        Cliente.getInstance(getContext()).remove(j);
                        break;
                    }

            }
        });



        return item;
    }
}