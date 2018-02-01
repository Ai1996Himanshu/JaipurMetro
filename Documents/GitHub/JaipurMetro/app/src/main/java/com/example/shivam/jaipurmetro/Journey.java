package com.example.shivam.jaipurmetro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Journey extends AppCompatActivity {

    String place[]={"Mansarovar","New Atish Market","Vivek Vihar","Shyam Nagar","Ram Nagar","Civil Lines","Railway Staton","Sindhi Camp","Chand Pole","Choti Chaupar","Badi Chaupar"};
    Spinner sp1,sp2;
    Button b1;
    static String from,to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);
        sp1=(Spinner)findViewById(R.id.spinner1);
        sp2=(Spinner)findViewById(R.id.spinner2);
        b1=findViewById(R.id.bFind);

        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(Journey.this,R.layout.support_simple_spinner_dropdown_item,place);
        sp1.setAdapter(arr);
        sp2.setAdapter(arr);

       sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
               from = (String) adapterView.getItemAtPosition(pos);
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {
               from = "";

           }
       });
       sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
               to = (String)adapterView.getItemAtPosition(pos);
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {
            to ="";
           }
       });
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(Journey.this,Find.class);
               startActivity(i);
           }
       });


    }
}
