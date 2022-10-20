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
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class FragmentCategory extends Fragment {
    private GridView gridView;
    private AdapterCategory adapterCategory;
    private List<Music> musicArrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_category, container, false);
        gridView = (GridView) view.findViewById(R.id.grView);
        musicArrayList = new ArrayList<>();
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.nonstop,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Nostop"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.chill,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Chill-Lofi"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.remix,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Tre Remix"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.nhac8d,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac 8D-Nhac AO"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.che,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac che"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.mashup,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Mashup"));
        musicArrayList.add(new Music("EM CỦA NGÀY HÔM QUA| SƠN TÙNG MVP",R.drawable.nhac8d,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Lk Nonstop Remix"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.nhac8d,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Viet My"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.nonstop,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Electro House Mix"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.mashup,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Acoustic"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.remix,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Viet 9X"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.mashup,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","LK Bolero"));
        musicArrayList.add(new Music("RẰNG EM MÃI MÃI BÊN ANH| RE FT TOU FU HOR FYY(NHAC TIK TOK)",R.drawable.chill,Lyrics.EMCUANGAYHOMQUA,"123,4K","00:04:29","Nhac Rap Viet" ));
        adapterCategory= new AdapterCategory(getContext(),0,musicArrayList);
        gridView.setAdapter(adapterCategory);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), ActivitycategoryDetail.class);
                intent.putExtra("key1", musicArrayList.get(i).getCategory());
                intent.putExtra("key2", musicArrayList.get(i).getImg());
                startActivity(intent);
            }
        });
        return view;
    }
}