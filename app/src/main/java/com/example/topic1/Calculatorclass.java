package com.example.topic1;

import android.widget.TextView;

public class Calculatorclass {
    private int first, second;
    private TextView ResultDis;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public TextView getResultDis() {
        return ResultDis;
    }

    public void setResultDis(TextView resultDis) {
        ResultDis = resultDis;
    }

    public int add(){
        return first+second;
    }

    public int sub(){
        return first-second;
    }

    public int Mul(){
        return first*second;
    }
    public int Div(){
        return first/second;
    }

    public String Foradd(){
        return first + "+" + second;
    }

    public String Forsub(){
        return first + "-" + second;
    }

    public String Formul(){
        return first + "*" + second;
    }

    public String Fordiv(){
        return first + "/" + second;
    }

}
