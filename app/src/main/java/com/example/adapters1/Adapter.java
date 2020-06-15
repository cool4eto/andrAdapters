package com.example.adapters1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adapter extends ArrayAdapter<Animal> {

    private  List<Animal> animals = new ArrayList<Animal>();

    public Adapter(@NonNull Context context, int resource, List<Animal> objects) {
        super(context, resource, objects);
        this.animals=objects;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.layout, null);// извлича се обекта на изгледа в които ще се зареждат наните
        TextView textView = (TextView) v.findViewById(R.id.textView);// извлича текстови изглед по ID
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);// извлича изглед на изображение по ID
        imageView.setImageResource(animals.get(position).getPictrueID());//поставя снимка по ID от ресурсите на приложението
        textView.setText(animals.get(position).getName());//поставя Текста към снимката
        return v;//връща като резултат обекта който трябва да се зареди в ListView елемента
    }
    }

