package com.example.secondprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView out;
    EditText inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = findViewById(R.id.out);
        inp = findViewById(R.id.inp);
    }
    public void btn(View v){
//        String str = inp.getText().toString();
//        out.setText("hi~"+str);
        String text = inp.getText().toString();
        float t = Float.parseFloat(text);



    }
}