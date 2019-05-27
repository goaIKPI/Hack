package com.example.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HelpCompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_company_activity);
        ImageButton btn = findViewById(R.id.group);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpCompany.this, profileComp.class);
                startActivity(intent);
            }
        });
        final Button btn1 = findViewById(R.id.endBtn);
        final Button btn2 = findViewById(R.id.endBtn1);
        final Button btn3 = findViewById(R.id.startBtn);
        final Button btn4 = findViewById(R.id.startBtn1);
        final TextView tv1 = findViewById(R.id.activeTxtView);
        final TextView tv2 = findViewById(R.id.activeTxtView1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.VISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.VISIBLE);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setVisibility(View.INVISIBLE);
                btn1.setVisibility(View.VISIBLE);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.VISIBLE);
            }
        });

    }
}
