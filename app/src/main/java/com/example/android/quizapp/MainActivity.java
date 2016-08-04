package com.example.android.quizapp;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Integer[] userAns = new Integer[5];
    Integer[] correctAns = {3,1,2,3,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        if(radioGroup1 != null) {
            radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case R.id.q1ans1:
                            userAns[0] = 1;
                            break;
                        case R.id.q1ans2:
                            userAns[0] = 2;
                            break;
                        case R.id.q1ans3:
                            userAns[0] = 3;
                            break;
                        case R.id.q1ans4:
                            userAns[0] = 4;
                            break;
                        default:
                            break;
                    }
                }
            });
        }

        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        if(radioGroup2 != null) {
            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case R.id.q2ans1:
                            userAns[1] = 1;
                            break;
                        case R.id.q2ans2:
                            userAns[1] = 2;
                            break;
                        case R.id.q2ans3:
                            userAns[1] = 3;
                            break;
                        case R.id.q2ans4:
                            userAns[1] = 4;
                            break;
                        default:
                            break;
                    }
                }
            });
        }

        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radioGroup3);
        if(radioGroup3 != null) {
            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case R.id.q3ans1:
                            userAns[2] = 1;
                            break;
                        case R.id.q3ans2:
                            userAns[2] = 2;
                            break;
                        case R.id.q3ans3:
                            userAns[2] = 3;
                            break;
                        case R.id.q3ans4:
                            userAns[2] = 4;
                            break;
                        default:
                            break;
                    }
                }
            });
        }

        RadioGroup radioGroup4 = (RadioGroup)findViewById(R.id.radioGroup4);
        if(radioGroup4 != null) {
            radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case R.id.q4ans1:
                            userAns[3] = 1;
                            break;
                        case R.id.q4ans2:
                            userAns[3] = 2;
                            break;
                        case R.id.q4ans3:
                            userAns[3] = 3;
                            break;
                        case R.id.q4ans4:
                            userAns[3] = 4;
                            break;
                        default:
                            break;
                    }
                }
            });
        }

        RadioGroup radioGroup5 = (RadioGroup)findViewById(R.id.radioGroup5);
        if(radioGroup5 != null) {
            radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case R.id.q5ans1:
                            userAns[4] = 1;
                            break;
                        case R.id.q5ans2:
                            userAns[4] = 2;
                            break;
                        case R.id.q5ans3:
                            userAns[4] = 3;
                            break;
                        case R.id.q5ans4:
                            userAns[4] = 4;
                            break;
                        default:
                            break;
                    }
                }
            });
        }

        Button saveBtn = (Button) findViewById(R.id.save_btn_id);
        if(saveBtn != null) {
            saveBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Save your answers", Toast.LENGTH_SHORT).show();
                }
            });
        }

        Button submitBtn = (Button) findViewById(R.id.submit_btn_id);
        if(submitBtn != null) {
            submitBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    
                    boolean flag = Arrays.equals(correctAns,userAns);
                    if(flag ) {
                        Toast.makeText(MainActivity.this, "Congratulations!! All your answers are correct..", Toast.LENGTH_SHORT).show();
                    } else {
                       Toast.makeText(MainActivity.this, "Your answers are not correct..", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }


    /*public void setAns(RadioGroup radioGroup, final int id1, final int id2, final int id3, final int id4,final int index) {

        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case id1:
                            ans[index] = 1;
                            break;
                        case id2:
                            ans[index] = 2;
                            break;
                        case id3:
                            ans[index] = 3;
                            break;
                        case id4:
                            ans[index] = 4;
                            break;
                        default:
                            break;
                    }
                }
            });
        }
    }*/
}
