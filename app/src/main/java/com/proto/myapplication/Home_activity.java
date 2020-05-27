package com.proto.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home_activity extends AppCompatActivity {

    private ImageButton profile,wallet,history,web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);



        history = (ImageButton) findViewById(R.id.history_button);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        profile = (ImageButton) findViewById(R.id.profile_button);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        wallet = (ImageButton) findViewById(R.id.wallet_button);
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        web = (ImageButton) findViewById(R.id.web_button);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

    }

    public void openActivity2(){
        Intent intent1 = new Intent(this, History_activity.class);
        startActivity(intent1);
    }

    public void openActivity3(){
        Intent intent1 = new Intent(this, Profile_activity.class);
        startActivity(intent1);
    }

    public void openActivity4(){
        Intent intent1 = new Intent(this, Wallet_activity.class);
        startActivity(intent1);
    }

    public void openActivity5(){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}
