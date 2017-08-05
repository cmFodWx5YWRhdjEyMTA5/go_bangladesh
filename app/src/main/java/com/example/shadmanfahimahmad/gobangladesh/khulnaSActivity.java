package com.example.shadmanfahimahmad.gobangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class khulnaSActivity extends AppCompatActivity {

    TextView body, transport, accomodation, logistics;
    TextView kushbody, kushtransport, kushaccomodation, kushlogistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_s);



        body = (TextView)findViewById(R.id.Body);
        transport = (TextView)findViewById(R.id.Transport);
        accomodation = (TextView)findViewById(R.id.Accomodation);
        logistics = (TextView)findViewById(R.id.Logistics);

        kushbody = (TextView)findViewById(R.id.kushBody);
        kushtransport = (TextView)findViewById(R.id.kushTransport);
        kushaccomodation = (TextView)findViewById(R.id.kushAccomodation);
        kushlogistics = (TextView)findViewById(R.id.kushLogistics);


        body.setText("Suggested Tour Guide Information: \n Name: Shuvashish Howlader, Phone: +8801914788741 \n Name: Shohag, Phone: +8801960478594\n Guide Fee: BDT 500");
        transport.setText("Suggested Transport:\n BUS - Minimum Fare: BDT 250, Maximum Fare: BDT 950\n");
        accomodation.setText("Suggested Accomodation: Hotel Ovi, Phone Number: +8801970372215, Rate: BDT 400/night \n");
        logistics.setText("Suggested Logistics: \n Bag Pack, Minimum two sets of clothes, toiletries, Medicine (As required)");

        kushbody.setText("Suggested Tour Guide Information: \n Name: Konok, Phone: +8801914784856 \n Name: Munir, Phone: +8801670478594\n Guide Fee: BDT 500");
        kushtransport.setText("Suggested Transport:\n BUS - Fare: BDT 300 - 600\n Rental Car: BDT 3500 ");
        kushaccomodation.setText("Suggested Accomodation: Hotel Liberty, Phone Number: +8801970125215, Rate: BDT 400 - BDT 800/night ");
        kushlogistics.setText("Suggested Logistics: \n Bag Pack, Minimum two sets of clothes, toiletries, Medicine (As required)");
    }

}

