package com.example.exercice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText numberOne, numberTwo;
    RadioButton plus,moin,produit;
    Button calculate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOne = findViewById(R.id.number1);
        numberTwo = findViewById(R.id.number2);
        plus = findViewById(R.id.somme);
        moin = findViewById(R.id.moin);
        produit = findViewById(R.id.produit);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                double nbr=0;
                if (plus.isChecked()){
                    nbr= Double.parseDouble(numberOne.getText().toString())+Double.parseDouble(numberTwo.getText().toString());
                }else if  (moin.isChecked()){
                    nbr= Double.parseDouble(numberOne.getText().toString())-Double.parseDouble(numberTwo.getText().toString());
                }else if (produit.isChecked()){
                    nbr= Double.parseDouble(numberOne.getText().toString())*Double.parseDouble(numberTwo.getText().toString());
                }
                intent.putExtra("message",nbr);

                startActivity(intent);

            }
        });

    }
}