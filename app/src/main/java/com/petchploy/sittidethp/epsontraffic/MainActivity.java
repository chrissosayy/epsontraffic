package com.petchploy.sittidethp.epsontraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    //explicit
    private ListView trafficListView;
    private Button aboutmeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
bindWidget();
    } //main method

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);


    }   // bindWidget
} //main class ;คือคำสั่ง

