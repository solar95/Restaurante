package com.example.solar.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nombre;
    ArrayList<Consumible> pedidos = new ArrayList<Consumible>();


    public Cliente(){}

    public Cliente(ArrayList<Consumible> pedidos){
        this.pedidos = pedidos;
    }




}
