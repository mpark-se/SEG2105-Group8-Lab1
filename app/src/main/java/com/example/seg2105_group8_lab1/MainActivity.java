package com.example.seg2105_group8_lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSub, btnMul, btnDiv, btnClr, btnEql, btnDec;

    TextView display;

    double val1, val2;

    boolean add, sub, mul, div;

    enum Operator {none, add, minus, multiply, divide};
    Operator optr = Operator.none;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textViewValue);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnMul = findViewById(R.id.buttonMult);
        btnDiv = findViewById(R.id.buttonDiv);
        btnDec = findViewById(R.id.buttonDot);
        btnClr = findViewById(R.id.buttonClr);
        btnEql = findViewById(R.id.buttonEquals);

    }
}