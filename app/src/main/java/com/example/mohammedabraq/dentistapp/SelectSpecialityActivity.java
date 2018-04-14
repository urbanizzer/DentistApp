package com.example.mohammedabraq.dentistapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by Mohammed Abraq on 4/6/2018.
 */

public class SelectSpecialityActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<String> arraylist;
    ArrayAdapter spinnerAdapter;
    Button backButton;
    Button ContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_speciality);
        spinner = findViewById(R.id.spinner);
        arraylist = new ArrayList<>();
        spinnerAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arraylist);
        backButton = findViewById(R.id.BackButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ContinueButton = findViewById(R.id.Continue);
        spinner.setAdapter(spinnerAdapter);
        arraylist.add("General Dentist");
        arraylist.add("Endodontist (Root Canals)");
        arraylist.add("Periodontist (Gum)");
        arraylist.add("Orthodontist (Braces)");
        arraylist.add("Prosthodontist (Crowns, Bridge)");
        arraylist.add("Pedodontist (Kids)");
        arraylist.add("Oral Surgeon");
        spinnerAdapter.notifyDataSetChanged();

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SelectProcedureActivity.class);
                startActivity(i);
            }
        });

    }
}
