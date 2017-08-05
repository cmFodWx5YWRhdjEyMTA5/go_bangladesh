package com.example.shadmanfahimahmad.gobangladesh;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    EditText firstname, lastname, username, password, identification, dateofbirth, phone, emergency, email;
    Button register;
    RequestQueue requestQueue;
    String insertUrl = "http://gobangladesh.000webhostapp.com/Members.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstname = (EditText) findViewById(R.id.etfirstname);
        lastname = (EditText) findViewById(R.id.etlastname);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpassword);
        identification = (EditText) findViewById(R.id.etidentification);
        dateofbirth = (EditText) findViewById(R.id.etdateofbirth);
        phone = (EditText) findViewById(R.id.etphone);
        emergency = (EditText) findViewById(R.id.etemergency);
        email = (EditText)findViewById(R.id.etemail);

        register = (Button)findViewById(R.id.bregister);

        requestQueue = Volley.newRequestQueue(getApplicationContext());

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> parameters  = new HashMap<String, String>();
                        parameters.put("firstname",firstname.getText().toString());
                        parameters.put("lastname",lastname.getText().toString());
                        parameters.put("username",username.getText().toString());
                        parameters.put("password",password.getText().toString());
                        parameters.put("identification", identification.getText().toString());
                        parameters.put("dateofbirth",dateofbirth.getText().toString());
                        parameters.put("phone",phone.getText().toString());
                        parameters.put("emergency",emergency.getText().toString());
                        parameters.put("email",email.getText().toString());


                        return parameters;
                    }
                };
                requestQueue.add(request);
                Intent i = new Intent(RegisterActivity.this, LgoinActivity.class);
                startActivity(i);
            }

        });

    }
}
