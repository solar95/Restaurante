package com.example.solar.restaurante;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Cliente{


    private static ArrayList<Consumible> sOrdenes;

    public static ArrayList<Consumible> getInstance(Context context){

        if (sOrdenes == null){
            sOrdenes = new ArrayList<Consumible>();
        }

        return sOrdenes;

    }


}
