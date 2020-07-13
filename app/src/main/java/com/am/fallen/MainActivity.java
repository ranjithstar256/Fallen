package com.am.fallen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    String s1,s2;
    TextView textView;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i("abcd","hello world!!");

        // Classname obj = new Classname();
        MainActivity acb = new MainActivity();
        String d =  acb.add();
        Log.i("abcd",d);

        acb.cat("i drink milk");


        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        b=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();

                s2=e2.getText().toString();

                Toast.makeText(MainActivity.this, s1+" from "+s2, Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();

                s2=e2.getText().toString();

                textView.setText(s1+ " not from "+s2);

            }
        });

    }


    public String add(){
        Log.i("abcd","this is add method");
        return "this is what i returned";
    }


    public void cat(String s){
        Log.i("abcd","this is cat method "+s);
    }
}