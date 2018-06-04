package com.example.solar.restaurante;

public class Consumible {

    private String nombre;
    private int precio;
    private String comentarios;
    private int imageID;

    public Consumible(String nombre , int precio , int imageID){
        this.nombre = nombre;
        this.precio = precio;
        this.imageID = imageID;
    }

    public Consumible(String nombre , int precio){

        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }


}
