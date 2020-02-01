package com.example.james.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setid();
        onclick();
       // Integer.parseInt("15")

    }

    void onclick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            textView.setText("hello");
            }
        });
    }

    void setid() {
        button = findViewById(R.id.newa);
        textView=findViewById(R.id.show1);
    }

    void toast(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
