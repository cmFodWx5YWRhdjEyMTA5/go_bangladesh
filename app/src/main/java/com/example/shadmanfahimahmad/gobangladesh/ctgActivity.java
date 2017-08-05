package com.example.shadmanfahimahmad.gobangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ctgActivity extends AppCompatActivity {

    TextView body, transport, accomodation, logistics;
    TextView coxbody, coxtransport, coxaccomodation, coxlogistics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctg);

        body = (TextView)findViewById(R.id.Body);
        transport = (TextView)findViewById(R.id.Transport);
        accomodation = (TextView)findViewById(R.id.Accomodation);
        logistics = (TextView)findViewById(R.id.Logistics);

        coxbody = (TextView)findViewById(R.id.CoxBody);
        coxtransport = (TextView)findViewById(R.id.CoxTransport);
        coxaccomodation = (TextView)findViewById(R.id.CoxAccomodation);
        coxlogistics = (TextView)findViewById(R.id.CoxLogistics);


        body.setText("Suggested Tour Guide Information: \n Name: Hasan, Phone: +8801679036537 \n Name: Saied, Phone: +8801670911959\n Guide Fee: BDT 800");
        transport.setText("Suggested Transport:\n BUS - Minimum Fare: BDT 400, Maximum Fare: BDT 1500\n Rental Car (BDT 3500 - 7000 Depending on location)");
        accomodation.setText("Suggested Accomodation: Hotel Lords Inn, Phone Number: +8801948622215, Rate: BDT 1000 - BDT 1500/night");
        logistics.setText("Suggested Logistics: \n Bag Pack, Minimum two sets of clothes, toiletries, Medicine (As required)");

        coxbody.setText("Suggested Tour Guide Information: \n Name: Mostofa Kamal Reion, Phone: +8801914788741 \n Name: Shohag, Phone: +8801960478594\n Guide Fee: BDT 500");
        coxtransport.setText("Suggested Transport:\n BUS - Fare: BDT 800 - 1600\n Rental Car: BDT 3500  ");
        coxaccomodation.setText("Suggested Accomodation: Mermaid Beach Resort, Phone Number: +8801970125215, Rate: BDT 800 - BDT 10,000/night ");
        coxlogistics.setText("Suggested Logistics: \n Bag Pack, Minimum two sets of clothes, toiletries, Medicine (As required)");
    }
}
