package com.iamaravind.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addbtn,subbtn,mulbtn,divbtn,clear;
        clear = (Button) findViewById(R.id.clear);
        addbtn = (Button) findViewById(R.id.add);
        subbtn = (Button) findViewById(R.id.sub);
        mulbtn = (Button) findViewById(R.id.mul);
        divbtn = (Button) findViewById(R.id.div);
        final TextView result = (TextView) findViewById(R.id.result);
        final EditText num1, num2;
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float n1,n2,sum;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                sum = n1+n2;
                result.setText("Sum = "+Float.toString(sum));


            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float n1,n2,sub;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                sub = n1-n2;
                result.setText("Difference = "+Float.toString(sub));

            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float n1,n2,pro;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                pro = n1*n2;
                result.setText("Product = "+Float.toString(pro));

            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float n1,n2,div;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                div = n1/n2;
                result.setText("Quotient = "+Float.toString(div));

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("Result!!");
            }
        });
    }

}
