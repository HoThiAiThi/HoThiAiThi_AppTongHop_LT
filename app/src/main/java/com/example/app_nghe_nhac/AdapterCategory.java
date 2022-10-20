package com.example.app_nghe_nhac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterCategory extends ArrayAdapter<Music> {
    private Context context;
    private ArrayList<Music> musicArrayList;

    public AdapterCategory(@NonNull Context context, int resource, @NonNull List<Music> objects) {
        super(context, resource, objects);
        this.context= context;
        this.musicArrayList= new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView ==null){
            LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.custom_line_grilview,null);
        }
        if(musicArrayList.size()>0){
            Music music = this.musicArrayList.get(position);

            ImageView imgMusic =(ImageView) convertView.findViewById(R.id.img_musicCustom);
            TextView txtTenNhac=(TextView) convertView.findViewById(R.id.txt_tenNhac);
            imgMusic.setImageResource(music.getImg());
            txtTenNhac.setText(music.getCategory());
        }
        return convertView;
    }
}

