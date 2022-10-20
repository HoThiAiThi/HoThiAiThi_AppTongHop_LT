package com.example.app_nghe_nhac;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {
    ListView listViewMusic;
    ArrayList<Music> musicArrayList ;
    AdapterMusic adapterMusic;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_home, container, false);

        listViewMusic = (ListView) view.findViewById(R.id.listViewMusicHome);
        musicArrayList = new ArrayList<>();
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.music,Lyrics.CONMUANGANGQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        musicArrayList.add(new Music("K",R.drawable.music,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29"));
        adapterMusic = new AdapterMusic(getContext(), R.layout.custom_line_music, musicArrayList);
        listViewMusic.setAdapter(adapterMusic);
        listViewMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("key1", musicArrayList.get(i).getSingerAndSongwriter());
                    intent.putExtra("key2", musicArrayList.get(i).getLyrics());
                    startActivity(intent);
            }
        });

        return view;
    }
}