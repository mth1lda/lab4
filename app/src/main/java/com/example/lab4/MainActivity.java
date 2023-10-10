package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void morning(View view) {
        Intent intent = new Intent(MainActivity.this, MorningActivity.class);
        intent.putExtra("FROM", "удаление всех данных");
        startActivity(intent);
    }
}