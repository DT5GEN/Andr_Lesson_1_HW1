package com.example.andr_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Task1 extends AppCompatActivity {

    private EditText firstSumNumber;
    private EditText secondSumNumber;
    private TextView summator;
    private TextView summationResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        initView();

        summator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                summationResult.setText(getSumFromView());
                Toast.makeText(Task1.this, "Сalculation completed!", Toast.LENGTH_SHORT).show();
            }
        });


    }


    private String getSumFromView() {
        String firstNumberStr = firstSumNumber.getText().toString();
        String secondNumberStr = secondSumNumber.getText().toString();
        String result;
        try {
            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondNumber = Integer.parseInt(secondNumberStr);
            int sum = firstNumber + secondNumber;

            result = String.valueOf(sum);
        } catch (Exception e) {
            e.printStackTrace();
            result = "ВВЕДИТЕ ЦЕЛЫЕ ЧИСЛА!";
        }

        return result;

    }


    private void initView() {
        firstSumNumber = (EditText) findViewById(R.id.task1_first_sum_number);
        secondSumNumber = (EditText) findViewById(R.id.task1_second_sum_number);
        summator = (TextView) findViewById(R.id.summator_angry_btn);
        summationResult = (TextView) findViewById(R.id.task1_summation_result);
    }


}