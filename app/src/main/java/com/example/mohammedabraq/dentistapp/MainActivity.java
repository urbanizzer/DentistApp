package com.example.mohammedabraq.dentistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<String> arraylist;
    ArrayAdapter spinnerAdapter;
    Button ContinueButton;
    Button LogoutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        arraylist = new ArrayList<>();
        spinnerAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arraylist);
        ContinueButton = findViewById(R.id.Continue);
        LogoutButton = findViewById(R.id.Logout);
        spinner.setAdapter(spinnerAdapter);
        arraylist.add("Kuwait City");
        arraylist.add("Sharq");
        arraylist.add("Benaid Al Qar");
        arraylist.add("Shaab");
        arraylist.add("Hawally");
        arraylist.add("Salmiya");
        arraylist.add("Sabah Al Salem");
        arraylist.add("Mangaf");
        arraylist.add("Mahbula");
        arraylist.add("Fahaheel");
        arraylist.add("Jahra");
        spinnerAdapter.notifyDataSetChanged();

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SelectSpecialityActivity.class);
                startActivity(i);
            }
        });

        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Logged Out", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
