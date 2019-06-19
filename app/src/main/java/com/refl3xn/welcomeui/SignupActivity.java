package com.refl3xn.welcomeui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    public void backClicked(View view){
        finish();
    }

    public void loginTextClicked(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void signupClicked(View view){
        Toast.makeText(this, "Sign Up successful :p", Toast.LENGTH_SHORT).show();
    }

    public void helpClicked(View view){
        Toast.makeText(this, "Help is on it's way :p", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
}
