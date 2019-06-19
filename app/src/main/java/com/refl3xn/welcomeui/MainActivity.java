package com.refl3xn.welcomeui;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView headTextView, niceTextView, bottomTextView, registerTextView;
    Button loginButton;
    ConstraintLayout layout;

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

        layout = findViewById(R.id.layout);
        layout.setAlpha(0);
        layout.animate().alpha(1).setDuration(400);

        headTextView = findViewById(R.id.headTextView);
        niceTextView = findViewById(R.id.niceTextView);
        bottomTextView = findViewById(R.id.bottomTextView);
        registerTextView = findViewById(R.id.registerTextView);
        loginButton = findViewById(R.id.loginButton);

        headTextView.setAlpha(0);
        niceTextView.setAlpha(0);
        bottomTextView.setAlpha(0);
        registerTextView.setAlpha(0);
        loginButton.setAlpha(0);

        headTextView.setTranslationY(20);
        niceTextView.setTranslationY(20);
        bottomTextView.setTranslationY(20);
        loginButton.setTranslationY(20);
        registerTextView.setTranslationY(20);

        headTextView.animate().translationYBy(-20).alpha(1).setDuration(1000);
        niceTextView.animate().translationYBy(-20).alpha((float) 0.5).setDuration(1000);
        bottomTextView.animate().translationYBy(-20).alpha(1).setDuration(1000);
        loginButton.animate().translationYBy(-20).alpha(1).setDuration(1000);
        registerTextView.animate().translationYBy(-20).alpha(1).setDuration(1000);
    }
}
