package com.example.calclauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.runCalcButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("calc://launch");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.putExtra("hello", "Hello, my dear friend!");
                startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW, uri), ""));
            }
        });

    }
}