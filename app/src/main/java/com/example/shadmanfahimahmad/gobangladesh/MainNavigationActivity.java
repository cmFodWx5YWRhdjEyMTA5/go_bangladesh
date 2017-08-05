package com.example.shadmanfahimahmad.gobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainNavigationActivity extends AppCompatActivity {

    Button Navigation, Suggestions, Maps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);

        Navigation = (Button) findViewById(R.id.buttonNavigation);
        Suggestions = (Button) findViewById(R.id.buttonSuggestions);
        Maps = (Button)findViewById(R.id.buttonMaps);

        Navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigation = new Intent(MainNavigationActivity.this, NavigationActivity.class);
                startActivity(navigation);
            }
        });

        Suggestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suggestions = new Intent(MainNavigationActivity.this, SuggestionsActivity.class);
                startActivity(suggestions);
            }
        });

        Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(MainNavigationActivity.this, MapsActivity.class);
                startActivity(map);
            }
        });

    }
}
