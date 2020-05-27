package com.proto.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Wallet_activity extends AppCompatActivity {
    ListView listView ;
    private ImageButton profile,web,history,home;

    int[] IMAGES = {R.drawable.ic_grey_profile,R.drawable.ic_grey_profile,R.drawable.ic_grey_profile};
    String[] HEADINGS = new String[] { "Heading 1","Heading 2","Heading 3"};
    String[] BODIES = new String[] { "Body 1","Body 2","Body 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallet_activity);
        listView = (ListView) findViewById(R.id.list);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

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

        web = (ImageButton) findViewById(R.id.web_button);
        web.setOnClickListener(new View.OnClickListener() {
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
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void openActivity5(){
        Intent intent1 = new Intent(this, Home_activity.class);
        startActivity(intent1);
    }


    public class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name =(TextView)view.findViewById(R.id.textViewName);
            TextView textView_description =(TextView)view.findViewById(R.id.textViewdescription);
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(HEADINGS[i]);
            textView_description.setText(BODIES[i]);
            return view;
        }
    }
}
