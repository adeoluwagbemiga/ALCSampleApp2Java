package com.adeoluwa.alcsampleapp2java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView1;
    private TextView mTextView2;
    private EditText mEditText;
    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView1 = (TextView) findViewById(R.id.textView1);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mEditText = (EditText) findViewById(R.id.editText);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);

        mButton2.setOnClickListener(this);
        mButton1.setOnClickListener(this);
        mTextView1.setOnClickListener(this);
    }

//    public void showText(View view) {
//        String displayText = mEditText.getText().toString();
//        mTextView1.setText(displayText);
//    }


    @Override
    public void onClick(View view) {
        String displayText = mEditText.getText().toString();

        //mTextView2.setText(displayText);
        int id = view.getId();
        switch (id){
            case R.id.button1:
                mTextView1.setText(displayText);
                break;
            case R.id.button2:
                mTextView2.setText(displayText);
                break;
            case R.id.textView1:
                String mystring = "ALC WITH GOOGLE 3.0";
                mTextView1.setText(mystring);
                break;
        }
    }
}
