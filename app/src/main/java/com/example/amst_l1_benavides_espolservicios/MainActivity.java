package com.example.amst_l1_benavides_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn_001);
        btn2 = (Button) findViewById(R.id.btn_002);
        btn3 = (Button) findViewById(R.id.btn_003);
        btn4 = (Button) findViewById(R.id.btn_004);
    }
}
