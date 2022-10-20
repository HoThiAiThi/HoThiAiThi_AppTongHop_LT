package com.example.app_nghe_nhac;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FragmentRegime extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_regime, container, false);

        ImageView star1 =view.findViewById(R.id.star1);
        ImageView star2 =view.findViewById(R.id.star2);
        ImageView star3 =view.findViewById(R.id.star3);
        ImageView star4 =view.findViewById(R.id.star4);
        ImageView star5 =view.findViewById(R.id.star5);

        ImageView starof1 = view.findViewById(R.id.starof1);
        ImageView starof2 = view.findViewById(R.id.starof2);
        ImageView starof3 = view.findViewById(R.id.starof3);
        ImageView starof4 = view.findViewById(R.id.starof4);
        ImageView starof5 = view.findViewById(R.id.starof5);

        Button btn = view.findViewById(R.id.btn_danhGia);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Danh gia cua ban da duoc gui di", Toast.LENGTH_SHORT).show();
            }
        });
        star1.setVisibility(View.INVISIBLE);
        star2.setVisibility(View.INVISIBLE);
        star3.setVisibility(View.INVISIBLE);
        star4.setVisibility(View.INVISIBLE);
        star5.setVisibility(View.INVISIBLE);

        starof1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starof1.setVisibility(View.INVISIBLE);
                star1.setVisibility(View.VISIBLE);
            }
        });
        starof2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starof1.setVisibility(View.INVISIBLE);
                starof2.setVisibility(View.INVISIBLE);
                star1.setVisibility(View.VISIBLE);
                star2.setVisibility(View.VISIBLE);
            }
        });
        starof3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starof1.setVisibility(View.INVISIBLE);
                starof2.setVisibility(View.INVISIBLE);
                starof3.setVisibility(View.INVISIBLE);
                star1.setVisibility(View.VISIBLE);
                star2.setVisibility(View.VISIBLE);
                star3.setVisibility(View.VISIBLE);
            }
        });
        starof4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starof1.setVisibility(View.INVISIBLE);
                starof2.setVisibility(View.INVISIBLE);
                starof3.setVisibility(View.INVISIBLE);
                starof4.setVisibility(View.INVISIBLE);
                star1.setVisibility(View.VISIBLE);
                star2.setVisibility(View.VISIBLE);
                star3.setVisibility(View.VISIBLE);
                star4.setVisibility(View.VISIBLE);
            }
        });
        starof5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starof1.setVisibility(View.INVISIBLE);
                starof2.setVisibility(View.INVISIBLE);
                starof3.setVisibility(View.INVISIBLE);
                starof4.setVisibility(View.INVISIBLE);
                starof5.setVisibility(View.INVISIBLE);
                star1.setVisibility(View.VISIBLE);
                star2.setVisibility(View.VISIBLE);
                star3.setVisibility(View.VISIBLE);
                star4.setVisibility(View.VISIBLE);
                star5.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}