package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    Button btn0,btn1,btn3,btn2,btn5,btn4,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnEq,btnP;
    EditText txtDis;
    int textOne,textTwo;
    TextView textcheckSum;
    public int symbol= 0 ;
Calculatorclass calculatorclass=new Calculatorclass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnEq=findViewById(R.id.btnEq);
        btnP=findViewById(R.id.btnP);
        txtDis=findViewById(R.id.txtDis);
        textcheckSum = findViewById(R.id.sumcheck);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(TextUtils.isEmpty(txtDis.getText())){
                    txtDis.setError("Enter a number");
                    return;
                }
                symbol=1;
                textOne=Integer.parseInt(txtDis.getText().toString());
                calculatorclass.setFirst(textOne);
                txtDis.getText().clear();
                textcheckSum.setText(textOne+"+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtDis.getText())){
                    txtDis.setError("Enter a number");
                    return;
                }
                symbol=2;
                textOne = Integer.parseInt(txtDis.getText().toString());
                calculatorclass.setFirst(textOne);
                txtDis.getText().clear();
                textcheckSum.setText(textOne+"-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtDis.getText())){
                    txtDis.setError("Enter a number");
                    return;
                }

                symbol=3;
                textOne = Integer.parseInt(txtDis.getText().toString());
                calculatorclass.setFirst(textOne);
                txtDis.getText().clear();
                textcheckSum.setText(textOne+"*");            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(txtDis.getText())){
                    txtDis.setError("Enter a number");
                    return;
                }
                symbol=4;
                textOne = Integer.parseInt(txtDis.getText().toString());
                calculatorclass.setFirst(textOne);
                txtDis.getText().clear();
                textcheckSum.setText(textOne+"/");
            }
        });




        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.getText().clear();
                textOne=0;
                textTwo=0;
                textcheckSum.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDis.setText(txtDis.getText().toString()+"0");
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(txtDis.getText())){
                    txtDis.setError("Enter a number");
                    return;
                }

                //  textOne=calc.getFirst();
                //textTwo=calc.getSecond();
                textTwo = Integer.parseInt(txtDis.getText().toString());
                calculatorclass.setSecond(textTwo);

                if (symbol == 1) {
                    textcheckSum.setText(calculatorclass.Foradd());
                    txtDis.setText(Integer.toString(calculatorclass.add()));
                    //  calc.add();
                } else if (symbol == 2) {
                    textcheckSum.setText(calculatorclass.Forsub());
                    txtDis.setText(Integer.toString(calculatorclass.sub()));
                    // calc.sub();
                } else if (symbol == 3) {
                    textcheckSum.setText(calculatorclass.Formul());
                    txtDis.setText(Integer.toString(calculatorclass.Mul()));
                    //calc.Mul();
                } else if (symbol == 4) {
                    textcheckSum.setText(calculatorclass.Fordiv());
                    txtDis.setText(Integer.toString(calculatorclass.Div()));
                    // calc.Div();
                }


            }
        });
    }
}
