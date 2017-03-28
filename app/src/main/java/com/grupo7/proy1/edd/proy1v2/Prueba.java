package com.grupo7.proy1.edd.proy1v2;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Console;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Daniel De León on 27/03/2017.
 */

public class Prueba {
    public void Prueba(){
        String js = "[{\n" +
                "  \"Activos\": {\n" +
                "    \"descripcion\": \"Cotton\", \n" +
                "    \"id\": \"0\", \n" +
                "    \"nombre\": \"John\"}\n" +
                "}, \n" +
                "{\n" +
                "  \"Activos\": {\n" +
                "    \"descripcion\": \"Bilderback\", \n" +
                "    \"id\": \"1\", \n" +
                "    \"nombre\": \"Ashley\"}\n" +
                "}, \n" +
                "{\n" +
                "  \"Activos\": {\n" +
                "    \"descripcion\": \"Collins\",\n" +
                "    \"id\": \"2\",\n" +
                "    \"nombre\": \"Todd\"}\n" +
                "}, \n" +
                "{\n" +
                "  \"Activos\": {\n" +
                "    \"descripcion\": \"Lind\",\n" +
                "    \"id\": \"3\",\n" +
                "    \"nombre\": \"Mark\"}\n" +
                "}, \n" +
                "{\n" +
                "  \"Activos\": {\n" +
                "    \"descripcion\": \"Bass\",\n" +
                "    \"id\": \"4\",\n" +
                "    \"nombre\": \"Barbara\"}\n" +
                "}]";

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Matriz>>(){}.getType();
        List<Matriz> posts = (List<Matriz>) gson.fromJson(js, listType);

        Log.d("CREATION", posts.toString());
    }
}
