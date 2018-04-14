package com.example.mohammedabraq.dentistapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mohammed Abraq on 1/21/2018.
 */

public class SignupActivity extends AppCompatActivity {

    EditText UserName;
    EditText Email;
    EditText Password;

    Button createAccount;
    Button backButton;

    public void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(
                Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        UserName = findViewById(R.id.userName);
        Email = findViewById(R.id.SignUpEmail);
        Password = findViewById(R.id.SignUpPassword);

        createAccount = findViewById(R.id.createAccount);
        backButton = findViewById(R.id.BackButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Check_fieldValidation()) {
                    Toast.makeText(getApplicationContext(), "User Registered Successfully", Toast.LENGTH_LONG).show();
                                finish();
                }

                else {
                    UserName.setError("Invalid Attempt");
                    Email.setError("Invalid Attempt");
                    Password.setError("Invalid Attempt");

                }
            }
        });

        // For hiding Keyboard on background touch

        UserName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    hideSoftKeyboard(view);
                }
            }
        });

        Email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    hideSoftKeyboard(view);
                }
            }
        });

        Password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    hideSoftKeyboard(view);
                }
            }
        });
        // end of hide keyboard methods
    }

    protected Boolean Check_fieldValidation(){

        if (UserName.getText().toString().trim().equals("")){
            UserName.setError("Username is Required");
            return false;
        }
        else if (Email.getText().toString().trim().equals("")){
            Email.setError("Email is Required");
            return false;
        }
        else if (Password.getText().toString().trim().equals("")){
            Email.setError("Password is Required");
            return false;
        }

        return true;
    }


}
