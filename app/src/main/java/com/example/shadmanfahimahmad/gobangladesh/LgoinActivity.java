package com.example.shadmanfahimahmad.gobangladesh;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class LgoinActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String LOGIN_URL = "http://gobangladesh.000webhostapp.com/Login.php";

    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";

    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonLogin, buttonNewsfeed;

    String username;
    String password;

    Button registerhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgoin);

        registerhere = (Button)findViewById(R.id.btregister);
        editTextUsername = (EditText) findViewById(R.id.etusername);
        editTextPassword = (EditText) findViewById(R.id.etpassword);

        buttonLogin = (Button) findViewById(R.id.btLogin);
        buttonNewsfeed = (Button)findViewById(R.id.btNewsfeed);

        buttonLogin.setOnClickListener(this);

        registerhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LgoinActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        buttonNewsfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent news = new Intent(LgoinActivity.this, FeedActivity.class);
                startActivity(news);
            }
        });
    }
    private void userLogin()
    {
        username = editTextUsername.getText().toString().trim();
        password = editTextPassword.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.trim().equals("success")) {
                    openProfile();
                } else {
                    Toast.makeText(LgoinActivity.this, response, Toast.LENGTH_LONG).show();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(LgoinActivity.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String, String>getParams() throws AuthFailureError{
                Map<String, String> map = new HashMap<String, String>();
                map .put(KEY_USERNAME, username);
                map.put(KEY_PASSWORD, password);
                return map;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void openProfile()
    {
        Intent i = new Intent(this, MainNavigationActivity.class);
        i.putExtra(KEY_USERNAME, username);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        userLogin();
    }


}
