//package com.candra.project1.fragment;
//
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import com.candra.project1.R;
//import com.candra.project1.activity.activity_tentang;
//
//import java.util.Random;
//
///**
// * A simple {@link Fragment} subclass.
// */
//public class fragment_quiz extends Fragment implements View.OnClickListener{
//
//    private Button btnMulai;
//
//    public fragment_quiz() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_quiz, container, false);
//
//    }
//
//    public void OnViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
//        super.onViewCreated(view, savedInstanceState);
//
//        btnMulai = view.findViewById(R.id.btn_mulaiKuis);
//        btnMulai.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
//                builder.setCancelable(false);
//                builder.setTitle("KUIS");
//                builder.setMessage("Apakah kamu yakin ingin memulai kuis?");
//                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        int min = 1;
//                        int max = 10;
//
//                        Random r = new Random();
//                        int random = r.nextInt(max - min + 1) + min; //+1 if max is inclusive
//                        switch (random) {
//                            case 1:
//                                Intent intent1 = new Intent(getContext(), activity_soal1.class);
//                                startActivity(intent1);
//                                break;
//
//                            case 2:
//                                Intent intent2 = new Intent(getContext(), activity_soal2.class);
//                                startActivity(intent2);
//                                break;
//
//                            case 3:
//                                Intent intent3 = new Intent(getContext(), activity_soal3.class);
//                                startActivity(intent3);
//                                break;
//                        }
//                    }
//                });
//                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                    }
//                });
//                AlertDialog alert = builder.create();
//                alert.show();
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View view) {
//        if (view == btnMulai){
//            int min = 1;
//            int max = 10;
//
//            Random r = new Random();
//            int random = r.nextInt(max - min + 1) + min; //+1 if max is inclusive
//            switch (random) {
//                case 1:
//                    Intent intent1 = new Intent(getContext(), activity_soal1.class);
//                    startActivity(intent1);
//                    break;
//
//                case 2:
//                    Intent intent2 = new Intent(getContext(), activity_soal2.class);
//                    startActivity(intent2);
//                    break;
//
//                case 3:
//                    Intent intent3 = new Intent(getContext(), activity_soal3.class);
//                    startActivity(intent3);
//                    break;
//            }
//        }
//
//    }
//}