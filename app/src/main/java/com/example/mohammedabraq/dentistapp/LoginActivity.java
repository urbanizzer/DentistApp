package com.example.mohammedabraq.dentistapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mohammed Abraq on 1/21/2018.
 */

public class LoginActivity extends AppCompatActivity {

    Button Signup;
    Button Login;

    EditText Email;
    EditText PassWord;

    public void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(
                Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Signup = findViewById(R.id.signupph);
        Login = findViewById(R.id.login);
        Email = findViewById(R.id.email);
        PassWord = findViewById(R.id.password);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Check_fieldValidation()) {
                    Toast.makeText(getApplicationContext(), "Logged In", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }

            }
        }); //end of login listener

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(i);

            }
        }); //end of signup listener


        // For hiding Keyboard on background touch
        Email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    hideSoftKeyboard(view);
                }
            }
        });

        PassWord.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    hideSoftKeyboard(view);
                }
            }
        });
        // end of hide keyboard methods
    }


    protected Boolean Check_fieldValidation(){ //Checking if the Entered text is valid or not

        if (Email.getText().toString().trim().equals("")){
            Email.setError("Email is Required");
            return false;
        }
        else if (PassWord.getText().toString().trim().equals("")){
            Email.setError("Password is Required");
            return false;
        }

       /* else if (!Email.getText().toString().contains("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
            return false;
        }*/

        return true;
    } // end of Check Validation Method
}
