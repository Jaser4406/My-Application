package com.proto.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView ;
    private ImageButton profile,wallet,history,home;

    int[] IMAGES = {R.drawable.ic_grey_profile,R.drawable.ic_grey_profile,R.drawable.ic_grey_profile};
    String[] HEADINGS = new String[] { "Heading 1","Heading 2","Heading 3"};
    String[] BODIES = new String[] { "Body 1","Body 2","Body 3"};

    EditText txt,txt2;
    Button but,but2;
    ImageButton but3,but4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText) findViewById(R.id.text);
        but = (Button) findViewById(R.id.button4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                txt.setText("MEXICO");
            }
        });
        but2 = (Button) findViewById(R.id.button5);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                txt.setText("HISTORY AND CULTURE");
            }
        });

        but3 = (ImageButton) findViewById(R.id.button2);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                FrameLayout layout = (FrameLayout)findViewById(R.id.button0);
                layout.setVisibility(View.GONE);
            }
        });

        but4 = (ImageButton) findViewById(R.id.button10);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                FrameLayout layout = (FrameLayout)findViewById(R.id.button11);
                layout.setVisibility(View.GONE);
            }
        });


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
        Intent intent1 = new Intent(this, Profile_activity.class);
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
