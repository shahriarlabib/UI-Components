package com.feven.demoone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    private Button SigninBtn;
    private ImageView Google, Facebook, Apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        SigninBtn = findViewById(R.id.signin);
        Google = findViewById(R.id.google);
        Facebook = findViewById(R.id.facebook);
        Apple = findViewById(R.id.apple);
        SigninBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Thank You for sign in",Toast.LENGTH_SHORT).show();

            }
        });
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Sign in using google",Toast.LENGTH_SHORT).show();

            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Sign in using facebook",Toast.LENGTH_SHORT).show();

            }
        });
        Apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Sign in using apple id",Toast.LENGTH_SHORT).show();

            }
        });
    }
}