package com.example.shadmanfahimahmad.gobangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SylhetSActivity extends AppCompatActivity {

    TextView body, transport, accomodation, logistics;
    TextView Sylhetbody, Sylhettransport, Sylhetaccomodation, Sylhetlogistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_s);


        body = (TextView)findViewById(R.id.Body);
        transport = (TextView)findViewById(R.id.Transport);
        accomodation = (TextView)findViewById(R.id.Accomodation);
        logistics = (TextView)findViewById(R.id.Logistics);

        Sylhetbody = (TextView)findViewById(R.id.SylhetBody);
        Sylhettransport = (TextView)findViewById(R.id.SylhetTransport);
        Sylhetaccomodation = (TextView)findViewById(R.id.SylhetAccomodation);
        Sylhetlogistics = (TextView)findViewById(R.id.SylhetLogistics);


        body.setText("Suggested Tour Guide Information: \n Name: Shahid, Phone: +8801678586257 \n Name: Towhid, Phone: +880166987959\n Guide Fee: BDT 800");
        transport.setText("Suggested Transport:\n BUS - Minimum Fare: BDT 470, Maximum Fare: BDT 1500\n Rental Car (BDT 8500 Depending on location)");
        accomodation.setText("Accomodation Suggestions:\n Hotel Britannia\n Hotel Dallas Rent: BDT 800 - 2000");
        logistics.setText("Suggested Logistics: \n Bag Pack, Clothes, toiletries, Medicine (As required)");

        Sylhetbody.setText("Suggested Tour Guide Information: \n Name: Mostofa Kamal Reion, Phone: +8801914788741 \n Name: Shohag, Phone: +8801960478594\n Guide Fee: BDT 500");
        Sylhettransport.setText("Suggested Transport:\n Bus - Fare BDT 470 - 550\n Rental Car: BDT 2500  ");
        Sylhetaccomodation.setText("Suggested Accomodation: Uno Rest House, Rate: BDT 300 - BDT 900/night ");
        Sylhetlogistics.setText("Suggested Logistics: \n Bag Pack, toiletries, Clothes, Medicine (As required)");
    }
}
