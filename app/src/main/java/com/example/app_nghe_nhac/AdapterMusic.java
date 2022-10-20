package com.example.app_nghe_nhac;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMusic extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Music> musicList;

    public AdapterMusic(Context context, int layout, List<Music> musicList) {
        this.context = context;
        this.layout = layout;
        this.musicList = musicList;
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(layout,null);

        ImageView imgView =(ImageView) view.findViewById(R.id.imgMusic);
        TextView txtLike= (TextView) view.findViewById(R.id.txt_like);
        TextView txtNameMusic= (TextView) view.findViewById(R.id.txt_nameMusic);
        TextView txtTime= (TextView) view.findViewById(R.id.txt_time);

        Music music = musicList.get(i);
        imgView.setImageResource(music.getImg());
        txtLike.setText(music.getLikes());
        txtNameMusic.setText(music.getSingerAndSongwriter());
        txtTime.setText(music.getTime());
        return view;
    }
}