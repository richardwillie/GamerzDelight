package com.gamerz.gamerzdelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.searchButton)Button mSearchButton;
    @BindView(R.id.locationEditText)EditText mLocationEditText;
    @BindView(R.id.textView)TextView mText;
    @BindView(R.id.textView2)TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"searching",Toast.LENGTH_SHORT).show();
                String location = mLocationEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this,searchActivity.class);
                intent.putExtra("location",location);
                startActivity(intent);
            }
        });
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,about.class);
                startActivity(intent);
            }
        });
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,latest.class);
                startActivity(intent);
            }
        });

    }
}
