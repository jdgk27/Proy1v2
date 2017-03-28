package com.grupo7.proy1.edd.proy1v2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel De León on 27/03/2017.
 */

public class Matriz {
    public String id;
    public String nombre;
    public String descri;

    /*public Matriz (String id, String nombre, String descri){
        this(id, nombre, descri);
    }*/

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setDescri(String descri){
        this.descri = descri;
    }

    public String getDescri(){
        return descri;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

}
