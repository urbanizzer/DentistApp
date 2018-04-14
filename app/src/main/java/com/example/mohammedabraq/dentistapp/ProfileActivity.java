package com.example.mohammedabraq.dentistapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mohammed Abraq on 4/8/2018.
 */

public class ProfileActivity extends AppCompatActivity {

    TextView DoctorName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        DoctorName = findViewById(R.id.doctorName);
        String Name = getIntent().getStringExtra("DoctorName");
        String Speciality = getIntent().getStringExtra("DoctorSpeciality");
        String Experience = getIntent().getStringExtra("DoctorExperience");
        String UnderGraduate = getIntent().getStringExtra("DoctorUndergraduate");
        String Graduate = getIntent().getStringExtra("DoctorGraduate");
        String Timing = getIntent().getStringExtra("DoctorTiming");
        DoctorName.setText(Name);
    }
}