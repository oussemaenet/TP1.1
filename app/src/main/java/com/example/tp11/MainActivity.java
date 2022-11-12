package com.example.tp11;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");

        try {
            // Creating the list
            List<Integer> list = Collections.unmodifiableList(
                    Arrays.asList(1, 2, 3, 4));

            // Print the list
            System.out.println("List : " + list.toString());

            // Trying to modify the list
            System.out.println("Trying to modify the list");
            list.set(0, list.get(0));
        }

        catch (Exception e) {
            System.out.println("Exception : " + e);
        }


        Log.e("tag","This is error Message");


    }
}