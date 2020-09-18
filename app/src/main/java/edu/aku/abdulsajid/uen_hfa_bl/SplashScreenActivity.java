package edu.aku.abdulsajid.uen_hfa_bl;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import utils.MyPreferences;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);

// Clear Old Data Irfan


        final MyPreferences preferences = new MyPreferences(this);
        //    if (preferences.getReq1() == null) {

        preferences.setReq1("http://43.245.131.159/HFA/Testing/insert_info");


        preferences.setReqLogin("http://43.245.131.159/HFA/Testing/check_user_id");


        //     preferences.setReq1("http://10.199.88.191:61259///Testing/insert_info");

        // preferences.setReqLogin("http://10.199.88.191:61259///Testing/check_user_id");


        // preferences.setReq1("http://10.199.88.191:61259///Testing/insert_info");
        // preferences.setReq2("http://10.198.100.157:61259//Testing/insert_member_info");
        // preferences.setReq3("http://10.198.100.157:61259//Testing/insert_Question_key_comb");
        // preferences.setReq4("http://10.198.100.157:61259//Testing/insert_e");
        //  preferences.setReqLogin("http://10.199.88.191:61259//Testing/check_user_id");


        //   }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */

// show login or main page
                Intent mainIntent;
                if (preferences.getUserId() == -1) {
                    //mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                } else {
                    //  mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
                }
                mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                // mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);

                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, 1000);
    }


}
