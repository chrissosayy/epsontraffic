package com.petchploy.sittidethp.epsontraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
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

        //button controller
        buttonControler();



    } //main method

    private void buttonControler() {

        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

// sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.mosquito);
                buttonMediaPlayer .start();

                //intent to webview
                Intent ObjIntent = new Intent(Intent.ACTION_VIEW);
                ObjIntent.setData(Uri.parse("https://www.youtube.com/watch?v=Vt8SHcBXFo4"));
                        startActivity(ObjIntent);


            } // event
        });


    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.btnaboutMe);


    }   // bindWidget
} //main class ;คือคำสั่ง

