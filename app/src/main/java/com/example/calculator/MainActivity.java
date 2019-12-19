package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    MaterialButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    MaterialButton btnAdd, btnMinus, btnDivide, btnMultiply;
    MaterialButton btnReset, btnPow2, btnNumb_In_Numb;

    TextView txtFirstNum, txtSecondNum, txtOperands, txtResult;

    double number;
    int tempNumber = 0;

    boolean buttonCheck = false;
    boolean firstNumberCheck = false;
    boolean secondNumberCheck = false;
    boolean FlagOperandsCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FINDVIEWS();
    }


    void FINDVIEWS() {
        txtFirstNum = findViewById(R.id.main_firstNumber);
        txtSecondNum = findViewById(R.id.main_secondNumber);
        txtOperands = findViewById(R.id.main_operands);
        txtResult = findViewById(R.id.main_resultNumber);
    }

    public void ON_CLICKS(View view) {
        int id = view.getId();


        switch (id) {
            case R.id.main_btn_reset:
                txtFirstNum.setText(" ");
                txtSecondNum.setText(" ");
                txtOperands.setText(" ");
                txtResult.setText(" ");
                break;


            case R.id.main_btn_x2:
                if (buttonCheck) {
                    number = Integer.parseInt(String.valueOf(txtFirstNum.getText()));
                    number = number * number;
                    txtResult.setText(String.valueOf(number));
                } else {
                    Toast.makeText(this, "No Number Entered ...", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.main_btn_sq:
                number = Integer.parseInt(String.valueOf(txtFirstNum.getText()));

                for (int i = 1; i < number / 2; i++) {
                    tempNumber = i * i;
                    if (tempNumber == number) {
                        txtResult.setText(String.valueOf(tempNumber));
                    }
                }

                number = 0;
                break;


            case R.id.main_btn_one:
                buttonCheck = true;
                number = 1;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }


                break;


            case R.id.main_btn_two:
                buttonCheck = true;
                number = 2;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_three:
                buttonCheck = true;
                number = 3;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_four:
                buttonCheck = true;
                number = 4;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_five:
                buttonCheck = true;
                number = 5;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_six:
                buttonCheck = true;
                number = 6;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_seven:
                buttonCheck = true;
                number = 7;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_eight:
                buttonCheck = true;
                number = 8;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_nine:
                buttonCheck = true;
                number = 9;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_zero:
                buttonCheck = true;
                number = 0;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                } else {
                    txtSecondNum.append(String.valueOf(number));
                }

                break;


            case R.id.main_btn_dot:
                buttonCheck = true;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(".");
                } else {
                    txtSecondNum.append(".");
                }

                break;


            case R.id.main_btn_add:
                txtOperands.setText(" ");
                FlagOperandsCheck = true;
                txtOperands.setText("+");

                break;


            case R.id.main_btn_minus:
                txtOperands.setText(" ");
                FlagOperandsCheck = true;
                txtOperands.setText("-");

                break;


            case R.id.main_btn_multiply:
                txtOperands.setText(" ");
                FlagOperandsCheck = true;
                txtOperands.setText("X");

                break;


            case R.id.main_btn_divide:
                txtOperands.setText(" ");
                FlagOperandsCheck = true;
                txtOperands.setText("/");

                break;


        }
    }

}
