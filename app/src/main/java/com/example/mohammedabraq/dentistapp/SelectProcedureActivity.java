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

public class SelectProcedureActivity extends AppCompatActivity{


    Spinner spinner;
    ArrayList<String> arraylist;
    ArrayAdapter spinnerAdapter;
    Button backButton;
    Button ContinueButton;
    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_procedure);
        spinner = findViewById(R.id.spinner);
        arraylist = new ArrayList<>();
        spinnerAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arraylist);
        ContinueButton = findViewById(R.id.Continue);
        backButton = findViewById(R.id.BackButton);
        homeButton =findViewById(R.id.Home);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        spinner.setAdapter(spinnerAdapter);
        arraylist.add("Cleaning / Scaling");
        arraylist.add("Gum Treatment");
        arraylist.add("Fillings");
        arraylist.add("Extraction");
        arraylist.add("Extraction Under General Anosthesisia");
        arraylist.add("Veneers");
        arraylist.add("Crowns");
        arraylist.add("Dental Implants");
        arraylist.add("Dentures (Removable");
        arraylist.add("Braces (Ortho)");
        arraylist.add("Childern Dentistry");
        arraylist.add("Bleaching Of Teeth");
        arraylist.add("Root Canal Treatment");
        arraylist.add("Treatment Under Nitrous Oxide Gas");
        arraylist.add("Microscopic Dentistry");
        spinnerAdapter.notifyDataSetChanged();

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DentistsListActivity.class);
                startActivity(i);
            }
        });


        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
