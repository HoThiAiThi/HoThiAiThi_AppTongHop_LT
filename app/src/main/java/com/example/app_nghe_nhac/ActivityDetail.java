package com.example.app_nghe_nhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class ActivityDetail extends AppCompatActivity {
    TextView txtNameMusic,txtLyrics;
    ImageButton imgmp4;
    VideoView vdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtNameMusic =(TextView) findViewById(R.id.txt_detailNameMusic);
        txtLyrics =(TextView) findViewById(R.id.txt_loiBaiHat);
        imgmp4 =(ImageButton) findViewById(R.id.imgmp4);
        vdView = (VideoView) findViewById(R.id.vd_ViDeoMP4);

        Intent intent =getIntent();
        txtNameMusic.setText(intent.getStringExtra("key1"));
        txtLyrics.setText(intent.getStringExtra("key2"));

        imgmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmp4.setVisibility(View.INVISIBLE);
                switch (txtNameMusic.getText().toString()) {
                    case "EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP": {
                        vdView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.mtp));
                        break;
                    }
                }
                vdView.start();
                MediaController mediaController = new MediaController(ActivityDetail.this);
                mediaController.setMediaPlayer(vdView);
                vdView.setMediaController(mediaController);
            }
        });
    }
}