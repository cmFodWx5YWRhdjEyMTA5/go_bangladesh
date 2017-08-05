package com.example.shadmanfahimahmad.gobangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BarisalSActivity extends AppCompatActivity {

    TextView body, transport, accomodation, logistics;
    TextView kuakatabody, kuakatatransport, kuakataaccomodation, kuakatalogistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal_s);

        body = (TextView)findViewById(R.id.Body);
        transport = (TextView)findViewById(R.id.Transport);
        accomodation = (TextView)findViewById(R.id.Accomodation);
        logistics = (TextView)findViewById(R.id.Logistics);

        kuakatabody = (TextView)findViewById(R.id.KuakataBody);
        kuakatatransport = (TextView)findViewById(R.id.KuakataTransport);
        kuakataaccomodation = (TextView)findViewById(R.id.KuakataAccomodation);
        kuakatalogistics = (TextView)findViewById(R.id.KuakataLogistics);


        body.setText("Suggested Tour Guide Information: \n Name: Shuvashish Howlader, Phone: +8801914788741 \n Name: Shohag, Phone: +8801960478594\n Guide Fee: BDT 500");
        transport.setText("Suggested Transport:\n BUS - Minimum Fare: BDT 300, Maximum Fare: BDT 500\n LAUNCH - Deck (BDT 200), Single Cabin (BDT 1000), Double Cabin (BDT 1800)");
        accomodation.setText("Suggested Accomodation: Hotel Arina, Phone Number: +8801970372215, Rate: BDT 500 - BDT 800/night \n Hotel Galib");
        logistics.setText("Suggested Logistics: \n Bag Pack, Minimum two sets of clothes, toiletries, Medicine (As required)");

        kuakatabody.setText("Suggested Tour Guide Information: \n Name: Shuvashish Howlader, Phone: +8801914788741 \n Name: Shohag, Phone: +8801960478594\n Guide Fee: BDT 500");
        kuakatatransport.setText("Suggested Transport:\n BUS - Fare: BDT 160\n Rental Car: BDT 3500 (Barisal - Kuakata) ");
        kuakataaccomodation.setText("Suggested Accomodation: Hotel Karina, Phone Number: +8801970125215, Rate: BDT 400 - BDT 800/night ");
        kuakatalogistics.setText("Suggested Logistics: \n Bag Pack, Minimum two sets of clothes, toiletries, Medicine (As required)");
    }
}
