package com.example.jvitstudentbuddy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {
    private CardView cardScheduler;
    private CardView cardNotes;
    private CardView cardCalculator;

    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SharedPreferences sharedpreferences = getSharedPreferences( "shared_prefs", Context.MODE_PRIVATE);
        String username =sharedpreferences.getString( "username","" ).toString();
        Toast.makeText(getApplicationContext(),"Welcome"+username, Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.cardExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
        CardView scheduler = findViewById(R.id.cardScheduler);
        scheduler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, SchedulerActivity.class));
            }
        });
        CardView location = findViewById(R.id.cardLocation);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.co.in/maps/place/JNANAVIKAS+INSTITUITE+OF+TECHNOLOGY/@12.8971414,77.4588463,17z/data=!3m1!4b1!4m6!3m5!1s0x3bae38c8e06077e3:0x1c70ae4284490516!8m2!3d12.8971414!4d77.4614212!16s%2Fg%2F1hc5v5w13?entry=ttu");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        CardView calculator = findViewById(R.id.cardCalculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, CalculatorActivity2.class));
            }
        });
        CardView about = findViewById(R.id.cardAbout);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, AboutActivity.class));
            }
        });
        CardView results = findViewById(R.id.cardResult);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, ResultSchemeActivity.class));
            }
        });
        CardView notes = findViewById(R.id.cardNotes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, Note1Activity.class));
            }
        });
        CardView rating = findViewById(R.id.cardFeedback);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, FeedbackActivity.class));
            }
        });
        HomeActivity.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return HomeActivity.context;
    }

    public static int getPx(Context context, int dimensionDp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dimensionDp * density + 0.5f);
    }


    }



