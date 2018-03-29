package info.paybeam.www.paybeam.AddCard;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.braintreepayments.cardform.view.CardForm;
import com.cooltechworks.creditcarddesign.CardEditActivity;
import com.cooltechworks.creditcarddesign.CreditCardUtils;
import com.cooltechworks.creditcarddesign.CreditCardView;

import info.paybeam.www.paybeam.R;

public class AddCardActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        /*
        final View button = findViewById(R.id.scan_card);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCardActivity.this, CardEditActivity.class);
                startActivityForResult(intent, CREATE_NEW_CARD);
            }

        });
        */

    }


    /*
        final CardForm cardForm = findViewById(R.id.card_form);
        Button buy = findViewById(R.id.btnBuy);


        cardForm.cardRequired(true)
                .expirationRequired(true)
                .cvvRequired(true)
                .postalCodeRequired(true)
                .mobileNumberRequired(true)
                .mobileNumberExplanation("SMS is required on this number")
                .setup(AddCardActivity.this);


         //Include a Camera button at top right hand side for scanning of card



        final View button = findViewById(R.id.scan_card);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardForm.isCardScanningAvailable();
                cardForm.scanCard(AddCardActivity.this);

            }
        });
        */





}
