package com.example.andr_lesson_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_task);
        Button button1 = findViewById(R.id.task1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher1 = new Intent(MainActivity.this, Task1.class);
                MainActivity.this.startActivity(switcher1);
            }
        });
        Button button2 = findViewById(R.id.task2);
        button2.setOnClickListener(view -> {
            Intent switcher2 = new Intent(MainActivity.this, Task2.class);
            MainActivity.this.startActivity(switcher2);
        });
        Button button3 = findViewById(R.id.task3);
        button3.setOnClickListener(view -> {
            Intent switcher3 = new Intent(MainActivity.this, Task3.class);
            MainActivity.this.startActivity(switcher3);
        });
    }
}
