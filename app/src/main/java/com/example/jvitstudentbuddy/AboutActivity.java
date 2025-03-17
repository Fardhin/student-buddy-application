package com.example.jvitstudentbuddy;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class AboutActivity extends AppCompatActivity {
    TextView farazlinkedIn , rakeshlinkedIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //farazlinkedIn = findViewById(R.id.faraz_linkedIn);
        //rakeshlinkedIn = findViewById(R.id.rakesh_linkedIn);

        //farazlinkedIn.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
           //     gotoUrl("https://www.linkedin.com/in/faraz-shariff-203894268/");
          //  }
        //});

        //rakeshlinkedIn.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View v) {
         //       gotoUrls("https://www.linkedin.com/in/rakesh-jain-959025182/");
         //   }
      //  });

    }

    private void gotoUrls(String s) {
        Uri uris = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uris));
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


                  }
