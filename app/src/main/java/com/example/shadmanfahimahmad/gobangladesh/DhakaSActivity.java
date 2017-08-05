package com.example.shadmanfahimahmad.gobangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DhakaSActivity extends AppCompatActivity {

    TextView body, transport, accomodation, logistics;
    TextView oldbody, oldtransport, oldaccomodation, oldlogistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_s);

        body = (TextView)findViewById(R.id.Body);
        transport = (TextView)findViewById(R.id.Transport);
        accomodation = (TextView)findViewById(R.id.Accomodation);
        logistics = (TextView)findViewById(R.id.Logistics);

        oldbody = (TextView)findViewById(R.id.OldBody);
        oldtransport = (TextView)findViewById(R.id.OldTransport);
        oldaccomodation = (TextView)findViewById(R.id.OldAccomodation);
        oldlogistics = (TextView)findViewById(R.id.OldLogistics);


        body.setText("Suggested Tour Guide Information: \n Name: Shahid, Phone: +8801678586257 \n Name: Towhid, Phone: +880166987959\n Guide Fee: BDT 800");
        transport.setText("Suggested Transport:\n BUS - Minimum Fare: BDT 60, Maximum Fare: BDT 100\n Rental Car (BDT 3500 Depending on location)");
        accomodation.setText("Similar to Dhaka Accomodation");
        logistics.setText("Suggested Logistics: \n Bag Pack, toiletries, Medicine (As required)");

        oldbody.setText("Suggested Tour Guide Information: \n Name: Mostofa Kamal Reion, Phone: +8801914788741 \n Name: Shohag, Phone: +8801960478594\n Guide Fee: BDT 500");
        oldtransport.setText("Suggested Transport:\n Rickshaw, CNG - Fare BDT 300 - 600\n Rental Car: BDT 2500  ");
        oldaccomodation.setText("Suggested Accomodation: Sheraton Hotel, Rate: BDT 4500 - BDT 60,000/night ");
        oldlogistics.setText("Suggested Logistics: \n Bag Pack, toiletries, Medicine (As required)");
    }
}
