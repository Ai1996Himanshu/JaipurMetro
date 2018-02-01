package com.example.shivam.jaipurmetro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Find extends AppCompatActivity {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        t1=findViewById(R.id.tFrom);
        t2=findViewById(R.id.tTo);
        t1.setText(Journey.from);
        t2.setText(Journey.to);
    }
}
