package com.example.shadmanfahimahmad.gobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuggestionsActivity extends AppCompatActivity {

    Button Dhaka, Barisal, Sylhet, Chittagong, Khulna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);

        Dhaka = (Button)findViewById(R.id.btDhaka);
        Barisal = (Button)findViewById(R.id.btBarisal);
        Sylhet = (Button)findViewById(R.id.btSylhet);
        Chittagong = (Button)findViewById(R.id.btChittagong);
        Khulna = (Button)findViewById(R.id.btKhulna);


        Dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dhaka = new Intent(SuggestionsActivity.this, DhakaSActivity.class);
                startActivity(dhaka);
            }
        });

        Barisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisal = new Intent (SuggestionsActivity.this, BarisalSActivity.class);
                startActivity(barisal);
            }
        });

        Sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khulna = new Intent(SuggestionsActivity.this, khulnaSActivity.class);
                startActivity(khulna);
            }
        });

        Chittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctg = new Intent(SuggestionsActivity.this, ctgActivity.class);
                startActivity(ctg);
            }
        });

        Sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sylhet = new Intent(SuggestionsActivity.this, SylhetSActivity.class);
                startActivity(sylhet);
            }
        });
        Khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khulna = new Intent(SuggestionsActivity.this, khulnaSActivity.class);
            }
        });
    }
}
