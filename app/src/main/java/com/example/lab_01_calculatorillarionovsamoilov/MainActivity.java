package com.example.lab_01_calculatorillarionovsamoilov;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText tA;
     EditText tB;
     TextView lRes;
     double A = 0;
     double B = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tA  = findViewById(R.id.A);
        tB  = findViewById(R.id.B);
        lRes= findViewById(R.id.Res);
    }

    public int Errors(int a) //Errors
    {
        if (tA.length() ==0)
        {
            lRes.setText("A or B field is empty"); // If A or B field is empty
            return -1;
        }

        if (a==1);
        {
            if(tB.length()==0)
            {
                lRes.setText("A or B field is empty");
                return -1;

            }
        }
        try
        {
            A = Double.parseDouble(tA.getText().toString());
            B = Double.parseDouble(tB.getText().toString());
        }
        catch (Exception ex)
        {
            lRes.setText("A or B value is not number"); //If A or B value is not number
            return -1;
        }
        return 0;
    }
    public void Add_click (View v)

    {
       int res = Errors( 1);
       if (res== -1)
       {
           return;
       }
       lRes.setText(String.valueOf(A+B));
       A=0;
       B=0;
    }

    public void Sub_click (View v)

    {
        int res = Errors( 1);
        if (res== -1)
        {
            return;
        }
        lRes.setText(String.valueOf(A-B));
        A=0;
        B=0;
    }

    public void Multi_click (View v)

    {
        int res = Errors( 1);
        if (res== -1)
        {
            return;
        }
        lRes.setText(String.valueOf(A*B));
        A=0;
        B=0;
    }

    public void Div_click (View v)

    {
        int res = Errors( 1);
        if (res== -1)
        {
            return;
        }
        if (B==0)
        {
            lRes.setText("You cannot divide number by zero");
            return;
        }
        lRes.setText(String.valueOf(A/B));
        A=0;
        B=0;
    }

    public void Sin_click (View v)
    {

        if (tA.length()==0 )
        {
            lRes.setText("A field is empty"); // If A field is empty
            return;
        }

        A = Double.parseDouble(tA.getText().toString());

        lRes.setText(String.valueOf(Math.sin(A)));

    }

    public void Cos_click (View v)
    {

        if (tA.length()==0 )
        {
            lRes.setText("A field is empty"); // If A field is empty
            return;
        }

        A = Double.parseDouble(tA.getText().toString());

        lRes.setText(String.valueOf(Math.cos(A)));

    }

    public void Tan_click (View v)
    {

        if (tA.length()==0 )
        {
            lRes.setText("A field is empty"); // If A field is empty
            return;
        }

        A = Double.parseDouble(tA.getText().toString());

        lRes.setText(String.valueOf(Math.tan(A)));

    }

    public void Pow_click (View v)
    {

        int res = Errors( 1);
        if (res== -1)
        {
            return;
        }

        A = Double.parseDouble(tA.getText().toString());
        B = Double.parseDouble(tB.getText().toString());
        lRes.setText(String.valueOf(Math.pow(A,B)));

    }

    public void SqrRoot_click (View v)
    {

        if (tA.length()==0 )
        {
            lRes.setText("A field is empty"); // If A field is empty
            return;
        }

        A = Double.parseDouble(tA.getText().toString());

        lRes.setText(String.valueOf(Math.sqrt(A)));
    }







}