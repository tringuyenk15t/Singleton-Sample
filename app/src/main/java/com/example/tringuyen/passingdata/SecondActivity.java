package com.example.tringuyen.passingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.data_text);
        textView.setText(SingleTon.getInstance().getData().getId() + ": " + SingleTon.getInstance().getData().getName() );
    }
}
