package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Programs> programs = new ArrayList<>();

        Programs photoshop = new Programs("Adobe photoshop",R.drawable.photoshop,17.0);
        Programs lightroom = new Programs("Adobe lightroom",R.drawable.lightroom,9.0);
        Programs premier = new Programs("Adobe premier",R.drawable.premier,21.0);
        Programs aftereffects = new Programs("Adobe aftereffects",R.drawable.aftereffects,25.00);
        Programs audition = new Programs("Adobe audition",R.drawable.audition,16.0);

        programs.add(photoshop);
        programs.add(lightroom);
        programs.add(premier);
        programs.add(aftereffects);
        programs.add(audition);

        Adobe_Programs AdobePrograms = new Adobe_Programs(this,0,programs);

        ListView listview = findViewById(R.id.listView);

        listview.setAdapter((AdobePrograms));


    }
}