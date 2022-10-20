package com.example.app_nghe_nhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivitycategoryDetail extends AppCompatActivity {
    ListView listViewMusic;
    ArrayList<Music> musicArrayList ;
    AdapterMusic adapterMusic;
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycategory_detail);

        listViewMusic = (ListView) findViewById(R.id.lvcategory_detail);
        musicArrayList = new ArrayList<>();
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("K",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        adapterMusic = new AdapterMusic(ActivitycategoryDetail.this, R.layout.custom_line_music, musicArrayList);
        listViewMusic.setAdapter(adapterMusic);
        listViewMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ActivitycategoryDetail.this, ActivityDetail.class);
                intent.putExtra("key1", musicArrayList.get(i).getSingerAndSongwriter());
                intent.putExtra("key2", musicArrayList.get(i).getLyrics());
                startActivity(intent);
            }
        });
        img = (ImageView) findViewById(R.id.imgcategory_detail);
        txt= (TextView) findViewById(R.id.txtcategory_detail);
        Intent intent =getIntent();
        txt.setText(intent.getStringExtra("key1"));
        img.setImageResource(intent.getIntExtra("key2",0));
    }
}