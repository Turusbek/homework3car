package com.example.homework3car;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.location.Address;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> car = new ArrayList<>();
        car.add("Bmw");
        car.add("Toyota");
        car.add("Mersedes");
        car.add("Lexus");
        car.add("Tesla");
        car.add("Shevrolet");
        car.add("Hyundai");
        car.add("Ford");
        car.add("Jeep");
        car.add("Audi");
        car.add("Vaz");
        car.add("Passat");
        car.add("Honda");
        car.add("Mazda");
        car.add("Kia");
        car.add("Volkswagen");
        CarAdapter adapter = new CarAdapter(car);
        recyclerView.setAdapter(adapter);
    }
}