package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button clear, allClear, button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, add, subtract, point, multiply, divide, equalTo, closingParenthesis, openingParenthesis;
    private TextView result, expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clear = findViewById(R.id.clear);
        allClear = findViewById(R.id.allClear);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equalTo = findViewById(R.id.equalTo);
        point = findViewById(R.id.point);
        closingParenthesis = findViewById(R.id.closingParenthesis);
        openingParenthesis = findViewById(R.id.openingParenthesis);
        expression = findViewById(R.id.expression);
        result = findViewById(R.id.result);
        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                expression.setText("");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "0"));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "1"));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "2"));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "3"));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "4"));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "5"));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "6"));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "7"));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "8"));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "9"));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp = String.valueOf(expression.getText());
                expression.setText(exp.substring(0, exp.length() - 1));
            }
        });
        closingParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + ")"));
            }
        });
        openingParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.setText(String.valueOf(expression.getText() + "("));
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp=String.valueOf(expression.getText());
                int len=exp.length();
                if(len!=0) {
                    if("/*-+.".contains(exp.charAt(len - 1) + "")) {
                        expression.setText(exp.substring(0,len-1) + "+");
                    }
                    else {
                        expression.setText(exp+"+");
                    }
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp=String.valueOf(expression.getText());
                int len=exp.length();
                if(len!=0) {
                    if("/*-+.".contains(exp.charAt(len - 1) + "")) {
                        expression.setText(exp.substring(0,len-1) + "-");
                    }
                    else {
                        expression.setText(exp+"-");
                    }
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp=String.valueOf(expression.getText());
                int len=exp.length();
                if(len!=0) {
                    if("/*-+.".contains(exp.charAt(len - 1) + "")) {
                        expression.setText(exp.substring(0,len-1) + "*");
                    }
                    else {
                        expression.setText(exp+"*");
                    }
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp=String.valueOf(expression.getText());
                int len=exp.length();
                if(len!=0) {
                    if("/*-+.".contains(exp.charAt(len - 1) + "")) {
                        expression.setText(exp.substring(0,len-1) + "/");
                    }
                    else {
                        expression.setText(exp+"/");
                    }
                }
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp=String.valueOf(expression.getText());
                int len=exp.length();
                if(len!=0) {
                    if("/*-+.".contains(exp.charAt(len - 1) + "")) {
                        expression.setText(exp.substring(0,len-1) + ".");
                    }
                    else {
                        expression.setText(exp+".");
                    }
                }
            }
        });
        equalTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp=String.valueOf(expression.getText()),finalResult="";
                try{
                    Context context=Context.enter();
                    context.setOptimizationLevel(-1);
                    Scriptable scriptable=context.initStandardObjects();
                    finalResult = context.evaluateString(scriptable,exp,"Javascript",1,null).toString();
                    expression.setText(finalResult);
                }
                catch (Exception e)
                {
                    finalResult = "Math Error";
                }
                result.setText(finalResult);
            }
        });
    }
}