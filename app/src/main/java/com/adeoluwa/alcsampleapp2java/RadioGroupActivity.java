package com.adeoluwa.alcsampleapp2java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioGroupActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    private RadioGroup mOptionRadioGroup;
    private RadioButton mOptionA;
    private RadioButton mOptionB;
    private RadioButton mOptionC;
    private RadioButton mOptionD;
    private Button mShowOptionBtn;
    private TextView mOptionDisplay;
    private String mTextToShow = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        initUI();
        mShowOptionBtn.setOnClickListener(this);
        mOptionRadioGroup.setOnCheckedChangeListener(this);
    }

    private void initUI(){
        mOptionRadioGroup = (RadioGroup)findViewById(R.id.option_radio_group);
        mOptionA = (RadioButton) findViewById(R.id.option_a);
        mOptionB = (RadioButton) findViewById(R.id.option_b);
        mOptionC = (RadioButton) findViewById(R.id.option_c);
        mOptionD = (RadioButton) findViewById(R.id.option_d);
        mShowOptionBtn = (Button) findViewById(R.id.btn_show_option);
        mOptionDisplay = (TextView) findViewById(R.id.option_display);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_show_option:
                //DO SOMETHING
                if(!mTextToShow.isEmpty())
                    mOptionDisplay.setText(mTextToShow);
                    Toast.makeText(this, mTextToShow, Toast.LENGTH_SHORT).show();
                break;

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int radio_id = radioGroup.getCheckedRadioButtonId();
        switch (radio_id){
            case R.id.option_a:
                //DO SOMETHING
                mTextToShow = mOptionA.getText().toString();
                Toast.makeText(this, mTextToShow, Toast.LENGTH_SHORT).show();
                break;
            case R.id.option_b:
                //DO SOMETHING
                mTextToShow = mOptionB.getText().toString();
                Toast.makeText(this, mTextToShow, Toast.LENGTH_SHORT).show();
                break;
            case R.id.option_c:
                //DO SOMETHING
                mTextToShow = mOptionC.getText().toString();
                Toast.makeText(this, mTextToShow, Toast.LENGTH_SHORT).show();
                break;
            case R.id.option_d:
                //DO SOMETHING
                mTextToShow = mOptionD.getText().toString();
                Toast.makeText(this, mTextToShow, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
