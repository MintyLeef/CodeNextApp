package com.example.realcodenextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Coach first;
    Coach second;
    Coach third;
    Coach fourth;
    Coach fifth;
    Coach sixth;
    Coach seventh;
    Coach eigth;
    Coach ninth;
    Coach tenth;
    Coach eleventh;
    Coach twelfth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview);

        first = new Coach("Coach Stephanie", "steph@csege.org", "Blue Room");
        second = new Coach("Coach Natalie", "nataliebh@google.com", "Blue Room");
        third = new Coach("Coach Alyssa", "alyssa@csedge.org", "Blue Room");
        fourth = new Coach("Coach Peta", "N/A", "N/A");
        fifth = new Coach("Coach Blanca", "N/A", "N/A");
        sixth = new Coach("Coach Donna", "N/A", "Orange Room");
        seventh = new Coach("Coach Jason", "N/A", "Orange Room");
        eigth = new Coach("Coach JarJar", "N/A", "Jar Room");
        ninth = new Coach("Coach Anakin", "N/A", "Dark Room");
        tenth = new Coach("Coach Yoda", "N/A", "Light Room");
        eleventh = new Coach("Coach Chewie", "N/A", "Chewbaca Room");
        twelfth = new Coach("Storm Troopers", "N/A", "Death Star");

        ArrayList<Coach> coachArrayList= new ArrayList<>();
        coachArrayList.add(first);
        coachArrayList.add(second);
        coachArrayList.add(third);
        coachArrayList.add(sixth);
        coachArrayList.add(seventh);
        coachArrayList.add(fourth);
        coachArrayList.add(fifth);
        coachArrayList.add(eigth);
        coachArrayList.add(ninth);
        coachArrayList.add(tenth);
        coachArrayList.add(eleventh);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);
        coachArrayList.add(twelfth);




        CoachListAdapter adapter = new CoachListAdapter(this, R.layout.adapter_view_layout, coachArrayList);
        mListView.setAdapter(adapter);
    }
}
