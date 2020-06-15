package com.example.adapters1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       List list = Collections.synchronizedList(new ArrayList<Animal>());
        Animal animal1=new Animal("Lion",R.drawable.lion);
        Animal animal2=new Animal("Monkey",R.drawable.monkey);
        Animal animal3=new Animal("Elephant",R.drawable.elephant);
        Animal animal4=new Animal("Koala",R.drawable.koala);
        Animal animal5=new Animal("Rhino",R.drawable.rhino);
        Animal animal6=new Animal("Pig",R.drawable.pig);
        Animal animal7=new Animal("Ostrich",R.drawable.ostrich);
        Animal animal8=new Animal("Panda",R.drawable.panda);
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);
        list.add(animal5);
        list.add(animal6);
        list.add(animal7);
        list.add(animal8);
        Adapter animalsAdapter=new Adapter(this,R.layout.layout,list);
        ListView listView = findViewById(R.id.listAnimal);
        listView.setAdapter(animalsAdapter);


    }
}
