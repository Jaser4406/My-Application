package com.proto.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Profile_activity extends AppCompatActivity {

    private ImageButton web,wallet,history,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        history = (ImageButton) findViewById(R.id.history_button);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        web = (ImageButton) findViewById(R.id.web_button);
        web.setOnClickListener(new View.OnClickListener() {
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

        home = (ImageButton) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
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
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void openActivity4(){
        Intent intent1 = new Intent(this, Wallet_activity.class);
        startActivity(intent1);
    }

    public void openActivity5(){
        Intent intent1 = new Intent(this, Home_activity.class);
        startActivity(intent1);
    }
}
