package com.example.pruebapais;

import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Paises {
    private String Pais;
    private String Imagen;






    public String getPais() {
        return Pais;
    }

    public void setPais(String titulo) {
        this.Pais = titulo;
    }
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String img) {
        this.Imagen ="http://www.geognos.com/api/en/countries/flag/"+img+".png";
    }

}
