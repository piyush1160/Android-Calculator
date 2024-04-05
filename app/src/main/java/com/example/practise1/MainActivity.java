 package com.example.practise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     TextView text;
     EditText e1,e2;
     Button b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toast.makeText(this, "Good Moring", Toast.LENGTH_SHORT).show();

        text = findViewById(R.id.textView2);
        e1 = findViewById(R.id.editTextNumber3);
        e2 = findViewById(R.id.editTextNumber4);
        b1 = findViewById(R.id.button);
        b2= findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(e1.getText().toString()) + Integer.parseInt(e2.getText().toString());

                text.setText("The sum of 2 number is : " + sum);
            }
        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int multiply = Integer.parseInt(e1.getText().toString()) * Integer.parseInt(e2.getText().toString());
//
//                text.setText("The multiplication of 2 number is : " + multiply);
//            }
//        });

    }
     public void multiplication(View view){
         int multiply = Integer.parseInt(e1.getText().toString()) * Integer.parseInt(e2.getText().toString());

         text.setText("The multiplication of 2 number is : " + multiply);
     }



}