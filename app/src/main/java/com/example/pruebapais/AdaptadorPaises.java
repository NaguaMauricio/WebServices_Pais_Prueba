package com.example.pruebapais;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorPaises extends ArrayAdapter<Paises> {

    public AdaptadorPaises(Context context, ArrayList<Paises> datos) {
        super(context, R.layout.ly_item, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) { //controla los datos
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.ly_item, null);// colocar  el layaut que posee la estuctura de los listView

        TextView lblTitulo = (TextView)item.findViewById(R.id.TxtPais);
        lblTitulo.setText(getItem(position).getPais());




        ImageView imageView = (ImageView)item.findViewById(R.id.imagePais);
        imageView.setTag(getItem(position).getImagen());

        Glide.with(this.getContext())
                .load(getItem(position).getImagen()).into(imageView);

        return item;

    }
}
