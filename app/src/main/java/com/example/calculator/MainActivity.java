package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity
{
    MaterialButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    MaterialButton btnAdd, btnMinus, btnDivide, btnMultiply;
    MaterialButton btnReset, btnPow2, btnNumb_In_Numb;

    TextView txtFirstNum, txtSecondNum, txtOperands, txtResult;

    int number;
    int tempNumber = 0;

    boolean buttonCheck = false;
    boolean firstNumberCheck = false;
    boolean secondNumberCheck = false;
    boolean resultNumberCheck = false;
    boolean FlagOperandsCheck = false;

    int num1 = 0, num2 = 0;

    int add0_1 = 0, minus0_1 = 0, multi0_1 = 0, divide0_1 = 0;

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

    public void numbers_ONClicks(View view) {
        int id = view.getId();


        switch (id) {
            case R.id.main_btn_one:
                buttonCheck = true;
                number = 1;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }

                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }


                break;


            case R.id.main_btn_two:
                buttonCheck = true;
                number = 2;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_three:
                buttonCheck = true;
                number = 3;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_four:
                buttonCheck = true;
                number = 4;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_five:
                buttonCheck = true;
                number = 5;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_six:
                buttonCheck = true;
                number = 6;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_seven:
                buttonCheck = true;
                number = 7;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_eight:
                buttonCheck = true;
                number = 8;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_nine:
                buttonCheck = true;
                number = 9;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_zero:
                buttonCheck = true;
                number = 0;

                if (txtResult.getText().toString().trim().length() > 0) {
                    txtFirstNum.setText("");
                    txtSecondNum.setText("");
                    txtOperands.setText("");
                    txtResult.setText("");
                    buttonCheck = false;
                    firstNumberCheck = false;
                    secondNumberCheck = false;
                    FlagOperandsCheck = false;
                    resultNumberCheck = true;
                }
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(String.valueOf(number));
                    firstNumberCheck = true;
                } else {
                    txtSecondNum.append(String.valueOf(number));
                    secondNumberCheck = true;
                }

                break;


            case R.id.main_btn_dot:
                buttonCheck = true;
                if (!FlagOperandsCheck) {
                    txtFirstNum.append(".");
                } else
                    {
                    txtSecondNum.append(".");
                }

                break;


        }
    }

    public void operands_ONCLICKS(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.main_btn_add:
                if (firstNumberCheck) {
                    add0_1 = 1;
                    minus0_1 = 0;
                    multi0_1 = 0;
                    divide0_1 = 0;
                    txtOperands.setText(" ");
                    FlagOperandsCheck = true;
                    txtOperands.setText("+");
                }

                break;


            case R.id.main_btn_minus:
                if (firstNumberCheck) {
                    add0_1 = 0;
                    minus0_1 = 1;
                    multi0_1 = 0;
                    divide0_1 = 0;
                    txtOperands.setText(" ");
                    FlagOperandsCheck = true;
                    txtOperands.setText("-");
                }

                break;


            case R.id.main_btn_multiply:
                if (firstNumberCheck) {
                    add0_1 = 0;
                    minus0_1 = 0;
                    multi0_1 = 1;
                    divide0_1 = 0;
                    txtOperands.setText(" ");
                    FlagOperandsCheck = true;
                    txtOperands.setText("X");
                }

                break;


            case R.id.main_btn_divide:
                if (firstNumberCheck) {
                    add0_1 = 0;
                    minus0_1 = 0;
                    multi0_1 = 0;
                    divide0_1 = 1;
                    txtOperands.setText(" ");
                    FlagOperandsCheck = true;
                    txtOperands.setText("/");
                }

                break;

            case R.id.main_btn_equal:
                int tempTotal = add0_1 + minus0_1 + divide0_1 + multi0_1;
                num1 = Integer.parseInt(txtFirstNum.getText().toString());
                num2 = Integer.parseInt(txtSecondNum.getText().toString());

                try {
                    if (firstNumberCheck && secondNumberCheck && tempTotal == 1) {
                        if (add0_1 == 1) {
                            txtResult.setText(" ");
                            num1 = num1 + num2;
                            txtResult.setText(String.valueOf(num1));
                            resultNumberCheck = false;
                        } else if (minus0_1 == 1) {
                            txtResult.setText(" ");
                            if (num1 >= num2) {
                                num1 = num1 - num2;
                                txtResult.setText(String.valueOf(num1));
                                resultNumberCheck = false;
                            } else {// if (num2 > num1)
                                num2 = num2 - num1;
                                txtResult.setText("-" + num2);
                                resultNumberCheck = false;
                            }
                        } else if (multi0_1 == 1) {
                            txtResult.setText(" ");
                            txtResult.setText(String.valueOf(num1 * num2));
                            resultNumberCheck = false;
                        } else if (divide0_1 == 1) {
                            txtResult.setText(" ");
                            txtResult.setText(String.valueOf(num1 / num2));
                            resultNumberCheck = false;
                        } else {
                            Toast.makeText(this, "Error...", Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception e) {
                    Toast.makeText(this, "Error in Math..." + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void topButtons_ONCLICKS(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.main_btn_reset:
                txtFirstNum.setText("");
                txtSecondNum.setText("");
                txtOperands.setText("");
                txtResult.setText("");
                buttonCheck = false;
                firstNumberCheck = false;
                secondNumberCheck = false;
                FlagOperandsCheck = false;
                resultNumberCheck = true;
                break;


            case R.id.main_btn_x2:
                if (firstNumberCheck)
                {
                    if (buttonCheck)
                    {
                        number = Integer.parseInt(txtFirstNum.getText().toString());
                        number = number * number;
                        txtResult.setText(String.valueOf(number));
                    } else {
                        Toast.makeText(this, "No Number Entered ...", Toast.LENGTH_SHORT).show();
                    }
                } else if (resultNumberCheck) {
                    int tempRestultX2 = Integer.parseInt(String.valueOf(txtResult.getText()));
                    txtResult.append("\n");
                    txtResult.append(" -> x2 -> ");
                    txtResult.append(String.valueOf(tempRestultX2));
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


        }
    }

}
