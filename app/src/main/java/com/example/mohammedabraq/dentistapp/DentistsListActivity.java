package com.example.mohammedabraq.dentistapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohammed Abraq on 4/6/2018.
 */

public class DentistsListActivity extends AppCompatActivity {

    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> NamelistItems = new ArrayList<>();
    ArrayList<String> SpecialitylistItems = new ArrayList<>();
    ArrayList<String> ExperiencelistItems = new ArrayList<>();
    ArrayList<String> UnderGraduateEducationlistItems = new ArrayList<>();
    ArrayList<String> GraduateEducationlistItems = new ArrayList<>();
    ArrayList<String> TiminglistItems = new ArrayList<>();

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    listAdapter adapter;

    ListView listView;
    Button backButton;
    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentists);

        listView = findViewById(R.id.list);
        backButton =findViewById(R.id.BackButton);
        homeButton =findViewById(R.id.Home);

        NamelistItems = new ArrayList<>();
        adapter = new listAdapter(this, NamelistItems, SpecialitylistItems, ExperiencelistItems,
                                    UnderGraduateEducationlistItems, GraduateEducationlistItems, TiminglistItems);
        listView.setAdapter(adapter);
        //Doctors Name List
        NamelistItems.add("Dr. Muhammad Al Yakoob");
        NamelistItems.add("Dr. Yaser Al Asrusi");
        NamelistItems.add("Dr. Ali");
        NamelistItems.add("Dr. Ahmed");
        //Doctors Speciality List Accordingly
        SpecialitylistItems.add("Endodontist");
        SpecialitylistItems.add("Endodontist");
        SpecialitylistItems.add("General Dentist");
        SpecialitylistItems.add("Orthodontist");
        //Doctors Experience List Accordingly
        ExperiencelistItems.add("10");
        ExperiencelistItems.add("10");
        ExperiencelistItems.add("2");
        ExperiencelistItems.add("2");
        //Doctors Under Graduate Education List Accordingly
        UnderGraduateEducationlistItems.add("Virginia Commonwealth University, USA");
        UnderGraduateEducationlistItems.add("Cairo University, Egypt");
        UnderGraduateEducationlistItems.add("Algonquin College Kuwait");
        UnderGraduateEducationlistItems.add("Algonquin College Kuwait");
        //Doctors Graduate Education List Accordingly
        GraduateEducationlistItems.add("Baylor College of Dentistry, USA");
        GraduateEducationlistItems.add("University of Buffalo, USA");
        GraduateEducationlistItems.add("Algonquin College Kuwait");
        GraduateEducationlistItems.add("Algonquin College Kuwait");
        //Doctors Timings List Accordingly
        TiminglistItems.add("08:00 A.M - 02:00 P.M");
        TiminglistItems.add("02:00 P.M - 10:00 P.M");
        TiminglistItems.add("10:00 P.M - 07:00 A.M");
        TiminglistItems.add("10:00 P.M - 07:00 A.M");
        adapter.notifyDataSetChanged();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("DoctorName", NamelistItems.get(position));
                startActivity(intent);
            }
        });
    }

}
