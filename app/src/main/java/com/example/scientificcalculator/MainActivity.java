package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;

    Button btn_sun;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_muli;
    Button btn_0;
    Button btn_div;
    Button btn_dot;
    Button btn_res;
    Button btn_c;
    Button btn_min;
    Button btn_plus;
    ImageButton btn_del;
    Button btn_tan;
    Button btn_cos;
    Button btn_sin;
    Button btn_fact;
    Button btn_sqrt;
    Button btn_log;
    Button btn_ln;
    Button btn_xn;
    Button btn_moon;
    Button btn_bin;

    String sign, value1, value2;
    Double num1, num2, result;
    Integer num3;
    boolean hasDot, darkmod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);
        btn_sun = (Button) findViewById(R.id.btn_sun);
        btn_moon = (Button) findViewById(R.id.btn_moon);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_log = (Button) findViewById(R.id.btn_log);
        btn_ln = (Button) findViewById(R.id.btn_ln);
        btn_xn = (Button) findViewById(R.id.btn_xn);
        btn_fact = (Button) findViewById(R.id.btn_fact);
        btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_res = (Button) findViewById(R.id.btn_res);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_min = (Button) findViewById(R.id.btn_min);
        btn_muli = (Button) findViewById(R.id.btn_muli);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_del = (ImageButton) findViewById(R.id.btn_del);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_bin = (Button) findViewById(R.id.btn_bin);

        darkmod = true;
        hasDot = false;

    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setText(input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sun(View view) {

        if (darkmod){
            btn_sun.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_moon.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_1.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_2.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_3.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_4.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_5.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_6.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_7.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_8.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_9.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_0.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_log.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_ln.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_xn.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_fact.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_sqrt.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_sin.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_cos.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_tan.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_div.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_res.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_plus.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_min.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_muli.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_dot.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_del.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_c.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            btn_bin.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            input.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            signBox.setBackgroundColor(getResources().getColor(R.color.colorSecondaryLite));
            darkmod = false;
        }

    }
    @SuppressLint("SetTextI18n")
    public void btnClick_moon(View view) {
        if (!darkmod) {
            btn_sun.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_4.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_5.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_6.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_7.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_8.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_9.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_0.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_log.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_ln.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_xn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_fact.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_sqrt.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_sin.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_cos.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_tan.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_div.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_res.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_plus.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_min.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_muli.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_dot.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_del.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_moon.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_c.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            btn_bin.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            input.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            signBox.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            darkmod = true;
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            hasDot = true;
        }

    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        hasDot = false;
    }

    public void btnClick_subtract(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        hasDot = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("×");
        hasDot = false;
    }

    public void btnClick_divide(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("÷");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_bin(View view) {
        sign = "to bin";
        input.setText(null);
        hasDot = false;
        signBox.setText("to binary");
    }

    public void btnClick_rnd(View view) {
        value1 = Double.toString(Math.random() * 2000 - 1000);
        input.setText(value1);
        hasDot = false;
        signBox.setText("random");
    }

    public void btnClick_med(View view) {
        sign = "med";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("medium");
    }

    public void btnClick_round(View view) {
        sign = "round";
        value1 = input.getText().toString();
        num1 = Double.parseDouble(value1);
        value2 = Double.toString(Math.round(num1));
        input.setText(value2);
        hasDot = false;
        signBox.setText("round");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        sign = "log";
        input.setText(null);
        signBox.setText("log");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        sign = "ln";
        input.setText(null);
        signBox.setText("ln");
        hasDot = false;
    }

    public void btnClick_power(View view) {
        sign = "power";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("xⁿ");
    }

    public void btnClick_factorial(View view) {
        sign = "factorial";
        input.setText(null);
        hasDot = false;
        signBox.setText("!");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        sign = "sin";
        input.setText(null);
        hasDot = false;
        signBox.setText("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        sign = "cos";
        input.setText(null);
        hasDot = false;
        signBox.setText("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        sign = "tan";
        input.setText(null);
        hasDot = false;
        signBox.setText("tan");
    }

    public void btnClick_root(View view) {
        sign = "root";
        input.setText(null);
        hasDot = false;
        signBox.setText("√");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if (sign == null) {
            signBox.setText("Error!");
        } else if (input.getText().equals("")) {
            signBox.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            signBox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "to bin":
                    value1 = input.getText().toString();
                    num3 = Integer.parseInt(value1);
                    input.setText(Integer.toBinaryString(num3) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "med":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = (num1 + num2) / 2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
            }

        }
    }


    public void btnClick_delete(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {

        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }


}
