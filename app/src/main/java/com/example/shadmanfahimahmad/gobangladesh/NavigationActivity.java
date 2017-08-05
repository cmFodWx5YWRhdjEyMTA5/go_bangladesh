package com.example.shadmanfahimahmad.gobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavigationActivity extends AppCompatActivity {

    Button dhaka, chittagong, khulna, barishal, sylhet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        dhaka = (Button)findViewById(R.id.dhk);
        chittagong = (Button)findViewById(R.id.ctg);
        khulna = (Button)findViewById(R.id.khl);
        barishal = (Button)findViewById(R.id.bari);
        sylhet = (Button)findViewById(R.id.syl);

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dhaka_1 = new Intent(NavigationActivity.this, DhakaActivity.class);
                startActivity(dhaka_1);
            }
        });

        chittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chittagong_1 = new Intent(NavigationActivity.this, ChittagongActivity.class);
                startActivity(chittagong_1);
            }
        });

        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khulna_1 = new Intent(NavigationActivity.this, KhulnaActivity.class);
                startActivity(khulna_1);
            }
        });

        barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barishal_1 = new Intent(NavigationActivity.this, BarisalActivity.class);
                startActivity(barishal_1);
            }
        });

        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sylhet_1 = new Intent(NavigationActivity.this, SylhetActivity.class);
                startActivity(sylhet_1);
            }
        });

    }
}
