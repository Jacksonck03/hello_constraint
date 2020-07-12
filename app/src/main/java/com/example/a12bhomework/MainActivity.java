package com.example.a12bhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button Reset;
    private Button ODDEVEN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount= (TextView) findViewById(R.id.show_count);
        Reset= (Button) findViewById(R.id.button_zero);
        ODDEVEN = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);

    }

    public void BackZero(View view) {
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        Reset.setBackgroundColor(Color.GRAY);
    }

    public void CountUp(View view) {
        mCount++;
        if(mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
        Reset.setBackgroundColor(Color.MAGENTA);
        if(mCount %2 == 0 ) {
            ODDEVEN.setBackgroundColor(Color.GREEN);
        }
        else{
            ODDEVEN.setBackgroundColor(Color.BLUE);
        }
    }
}