package com.example.james.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bu1;
    TextView show1;
EditText input1,input2;
int temp1,temp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setid();



        onclick();
        // Integer.parseInt("15")

    }
    String translate(Object o)
    {
        return String.valueOf(o);
    }
    void onclick() {
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1= Integer.parseInt(input1.getText().toString()) ;
               temp2= Integer.parseInt(input2.getText().toString()) ;

                // Log.e("test", "fuck
                show1.setText(temp1 + temp2);
            }
        });
    }

    void setid() {
        bu1 = findViewById(R.id.bu1);
        show1 = findViewById(R.id.show1);
        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
    }


    void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
