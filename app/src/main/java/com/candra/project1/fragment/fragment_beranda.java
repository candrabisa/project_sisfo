package com.candra.project1.fragment;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.candra.project1.R;
import com.candra.project1.activity.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_beranda extends Fragment {

    public fragment_beranda() {
        // Required empty public constructor
    }

    MediaPlayer mp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beranda, container, false);
        FloatingActionButton fb_SoundBeranda = view.findViewById(R.id.fb_Beranda);

        mp = MediaPlayer.create(getContext(), R.raw.selamatdatang_pengertian);
        fb_SoundBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp = MediaPlayer.create(getContext(), R.raw.selamatdatang_pengertian);
                    } else {
                        mp.start();
                    }
                } catch(Exception e) { e.printStackTrace(); }
            }
        });

        return view;
    }
    @Override
    public void onPause() {
        super.onPause();
        mp.pause();
    }
}
