package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.Buffer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button one,two ,three,four,five,six,seven,eight,nine,zero,addop,subop,multiplyop,divop,equalop,clearop, dotop,spaceop,percentop;

    String str;
    TextView screen;
    Button op;

    boolean addition ,subtraction,multiplication,Division;
   int num1,num2,result;
   StringBuffer bf=new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initializeView();
       initializingListener();
    }
    @SuppressLint("MissingInflatedId")
    private void initializeView(){

        //Views for Number
        screen=findViewById(R.id.edtscreen);

        one=findViewById(R.id.Noone);
        two=findViewById(R.id.Notwo);
        three=findViewById(R.id.Nothree);
        four=findViewById(R.id.Nofour);
        five=findViewById(R.id.No5);
        six=findViewById(R.id.No6);
        seven=findViewById(R.id.No7);
        eight=findViewById(R.id.No8);
        nine=findViewById(R.id.No9);
        zero=findViewById(R.id.zero);
        //View for Operator
        addop=findViewById(R.id.addOp);
        subop=findViewById(R.id.minus);
        multiplyop=findViewById(R.id.multiplyop);
        divop=findViewById(R.id.divop);
        dotop=findViewById(R.id.dotop);
        spaceop=findViewById(R.id.spacop);
        clearop=findViewById(R.id.clearop);
        equalop=findViewById(R.id.equalop);
        percentop=findViewById(R.id.percentop);


    }
    private void initializingListener(){
       one.setOnClickListener(this);
       two.setOnClickListener(this);
       three.setOnClickListener(this);
       four.setOnClickListener(this);
       five.setOnClickListener(this);
       six.setOnClickListener(this);
       seven.setOnClickListener(this);
       eight.setOnClickListener(this);
       nine.setOnClickListener(this);
       zero.setOnClickListener(this);

       addop.setOnClickListener(this);
       subop.setOnClickListener(this);
       multiplyop.setOnClickListener(this);
       divop.setOnClickListener(this);
       percentop.setOnClickListener(this);
       dotop.setOnClickListener(this);
       spaceop.setOnClickListener(this);
       equalop.setOnClickListener(this);
       clearop.setOnClickListener(this);


    }


    @SuppressLint("ResourceType")
    @Override

    public void onClick(View view) {

        if (view == zero) {
            screen.setText(screen.getText() + "0");
        }
        if (view == one) {
            screen.setText(screen.getText() + "1");
            bf.append(1);


        }

        if (view == two) {
            screen.setText(screen.getText() + "2");
            bf.append(2);

        }
        if (view == three) {
            screen.setText(screen.getText() + "3");
        }
        if (view == four) {
            screen.setText(screen.getText() + "4");
        }
        if (view == five) {
            screen.setText(screen.getText() + "5");
        }
        if (view == six) {
            screen.setText(screen.getText() + "6");
        }
        if (view == seven) {
            screen.setText(screen.getText() + "7");
        }
        if (view == eight) {
            screen.setText(screen.getText() + "8");
        }
        if (view == nine) {
            screen.setText(screen.getText() + "9");
        }
        if (view == addop) {

                screen.setText(screen.getText() + "+");

                //num1=Integer.parseInt(screen.getText().toString());

               // screen.setText("");
                addition=true;


        }
            if (view == subop) {
                screen.setText(screen.getText() + "-");
                bf.append("+");
              // num1=Integer.parseInt(screen.getText().toString());

              //  screen.setText("");
                subtraction=true;

            }
            if (view == multiplyop) {
                screen.setText(screen.getText() + "*");
            }
            if (view == divop) {
                screen.setText(screen.getText() + "/");
            }
            if (view == percentop) {
                screen.setText(screen.getText() + "%");
            }
            if (view == clearop) {

                screen.setText("");
            }
            if (view == spaceop) {
                screen.setText(screen.getText() + " ");
            }
            if (view == dotop) {
                screen.setText(screen.getText() + ".");
            }
            if (view == equalop) {
                screen.setText(screen.getText() + "=");





                }
                if (addition=true) {
                    String []s= {String.valueOf(screen.getText().toString().split("//+",2))};

                    StringBuffer [] strbuffer=new StringBuffer[2];
                    strbuffer[0]=bf.append(s[0]);
                    strbuffer[1]=bf.append(s[1]);
                    num1=Integer.parseInt(String.valueOf(strbuffer[0]));
                    num2=Integer.parseInt(String.valueOf(strbuffer[1]));
                    result=num1+num2;
                    screen.setText(result);

                    addition=false;
                }
                 else if (subtraction=true){

                     result=num1-num2;
                     screen.setText(""+result);
                     subtraction=false;


                    }





            }
        }




