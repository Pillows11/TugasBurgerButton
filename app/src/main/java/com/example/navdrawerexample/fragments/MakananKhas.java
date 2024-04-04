package com.example.navdrawerexample.fragments;
// HomeFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;
import com.example.navdrawerexample.ListAdapter;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;
import java.util.List;

public class MakananKhas extends Fragment implements ListAdapter.ItemClickListener {

    RecyclerView rviewList;
    List<model> listdatamakan;
    ListAdapter adapter;

    public MakananKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewList = view.findViewById(R.id.rvList2);
        listdatamakan = new ArrayList<>();


        model rendang = new model();
        rendang.setName("Rendang");
        rendang.setDesc("Daging sapi khas Sumatera dimasak dalam santan dan rempah-rempah.");
        rendang.setImage(R.drawable.rendang);
        listdatamakan.add(rendang);

        model satePadang = new model();
        satePadang.setName("Sate Padang");
        satePadang.setDesc("Daging sapi khas Sumatera dimasak dalam santan dan rempah-rempah.");
        satePadang.setImage(R.drawable.sate_padang);
        listdatamakan.add(satePadang);

        model pempek = new model();
        pempek.setName("Pempek");
        pempek.setDesc("Olahan ikan dan sagu dibentuk bulat atau lonjong, digoreng, dan disajikan dengan cuko.");
        pempek.setImage(R.drawable.pempek);
        listdatamakan.add(pempek);

        model laksa = new model();
        laksa.setName("Laksa");
        laksa.setDesc("Mie tebal dalam kuah santan pedas dengan telur, tauge, dan cabai.");
        laksa.setImage(R.drawable.laksa);
        listdatamakan.add(laksa);

        model mesir = new model();
        mesir.setName("Martabak Mesir");
        mesir.setDesc("Roti tebal isi daging sapi cincang, telur, dan bawang merah.");
        mesir.setImage(R.drawable.martabak_mesir);
        listdatamakan.add(mesir);

        model kopiTubruk = new model();
        kopiTubruk.setName("Kopi Tubruk");
        kopiTubruk.setDesc("Kopi hitam dengan gula, diseduh tanpa penyaringan.");
        kopiTubruk.setImage(R.drawable.kopi_tubruk);
        listdatamakan.add(kopiTubruk);

        model tuak = new model();
        tuak.setName("Tuak");
        tuak.setDesc("Minuman beralkohol dari nira atau getah pohon aren.");
        tuak.setImage(R.drawable.tuak);
        listdatamakan.add(tuak);

        model tehTarik = new model();
        tehTarik.setName("Teh Tarik");
        tehTarik.setDesc("Teh dengan susu kental manis, ditarik-tarik hingga berbusa.");
        tehTarik.setImage(R.drawable.teh_tarik);
        listdatamakan.add(tehTarik);

        model kawaDaun = new model();
        kawaDaun.setName("Kawa Daun");
        kawaDaun.setDesc("Kopi Aceh dengan daun pandan, jahe, dan gula aren.");
        kawaDaun.setImage(R.drawable.kawa_daun);
        listdatamakan.add(kawaDaun);

        model sagu = new model();
        sagu.setName("Sagu Malaka");
        sagu.setDesc("Minuman sagu dengan santan gula merah, disajikan dingin.");
        sagu.setImage(R.drawable.sagu_malakaa);
        listdatamakan.add(sagu);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdatamakan, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    @Override
    public void onItemClick(View view, int position) {
    }
}
