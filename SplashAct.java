package com.example.fareco;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashAct extends AppCompatActivity {
    ImageView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        splash = findViewById(R.id.logow);

        Glide.with(getApplicationContext()).load(R.drawable.farecogif).into(splash);

        // Start the MainActivity after a delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashAct.this, Login.class);
                startActivity(intent);
                finish(); // Close the splash screen activity
            }
        }, 2000); // 3000 milliseconds (3 seconds) delay, adjust as needed
    }
}

