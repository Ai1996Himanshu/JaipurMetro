package com.example.shivam.jaipurmetro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Thread th = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(3000);
                }
                catch(Exception h){}
                finally {
                    Intent i = new Intent(FirstScreen.this,Journey.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        th.start();
    }
}
