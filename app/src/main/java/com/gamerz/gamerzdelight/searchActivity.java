package com.gamerz.gamerzdelight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class searchActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView mLocation;
    @BindView(R.id.listView)ListView mList;

    private String[] games = new String[] {"resident evil2","mortal kombat xi","Gta v","hitman","tekken6","Need for speed","max payne"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,games);
        mList.setAdapter(adapter);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");

        mLocation.setText("These are the games you have searched for"+ location);
    }
}
