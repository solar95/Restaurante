package com.example.solar.restaurante;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

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

        View item = LayoutInflater.from(context).inflate(R.layout.item, null);

        //Imagen
        ImageView image = item.findViewById(R.id.item_imagen);
        image.setImageResource(data.get(position).getImageID());

        //Nombre
        TextView nombre = item.findViewById(R.id.item_nombre);
        nombre.setText(data.get(position).getNombre());



        LinearLayout body = item.findViewById(R.id.item_body);

        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return item;
    }
}