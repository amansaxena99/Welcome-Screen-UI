package com.refl3xn.welcomeui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView headTextView, niceTextView, bottomTextView, registerTextView;
    Button loginButton;

    public void loginClicked(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }

    public void registerClicked(View view){
        Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headTextView = findViewById(R.id.headTextView);
        headTextView.setAlpha(0);
        niceTextView = findViewById(R.id.niceTextView);
        niceTextView.setAlpha(0);
        bottomTextView = findViewById(R.id.bottomTextView);
        bottomTextView.setAlpha(0);
        registerTextView = findViewById(R.id.registerTextView);
        registerTextView.setAlpha(0);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setAlpha(0);

        headTextView.animate().translationYBy(-20);
        headTextView.animate().alpha(1).setDuration(1000);

        niceTextView.animate().translationYBy(-20);
        niceTextView.animate().alpha((float) 0.5).setDuration(1000);

        loginButton.animate().translationYBy(-20);
        loginButton.animate().alpha(1).setDuration(1000);


        bottomTextView.animate().alpha(1).setDuration(1000);
        bottomTextView.animate().translationYBy(-20);

        registerTextView.animate().alpha(1).setDuration(1000);
        registerTextView.animate().translationYBy(-20);
    }
}
