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

public class MinumanKhas extends Fragment implements ListAdapter.ItemClickListener {

  RecyclerView rviewListMinum;
    List<model> listdataMinum;
    ListAdapter adapter;
    public MinumanKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewListMinum = view.findViewById(R.id.rvList);
        listdataMinum = new ArrayList<>();


        model banjar = new model();
        banjar.setName("Soto Banjar");
        banjar.setDesc("Soto ayam dengan kuah bening, mie, dan perkedel. ");
        banjar.setImage(R.drawable.soto_banjajr);
        listdataMinum.add(banjar);

        model asampedas = new model();
        asampedas.setName("Ikan Asam Pedas");
        asampedas.setDesc("Ikan masak dalam kuah asam pedas kaya rempah.");
        asampedas.setImage(R.drawable.ikan_asampedas);
        listdataMinum.add(asampedas);

        model himpit = new model();
        himpit.setName("Nasi Himpit");
        himpit.setDesc("Nasi padat dipotong kecil, disajikan dengan kuah kari.");
        himpit.setImage(R.drawable.nasi_himpit);
        listdataMinum.add(himpit);

        model sambaltempoyak = new model();
        sambaltempoyak.setName("Sambal Tempoyak");
        sambaltempoyak.setDesc("Sambal durian fermentasi dengan cabai dan bawang.");
        sambaltempoyak.setImage(R.drawable.sambal_tempoyak);
        listdataMinum.add(sambaltempoyak);

        model birak = new model();
        birak.setName("Air Birak");
        birak.setDesc("Minuman buah fermentasi khas Dayak.");
        birak.setImage(R.drawable.air_birak);
        listdataMinum.add(birak);

        model teler = new model();
        teler.setName("Es Teler");
        teler.setDesc("Minuman es campur buah segar dengan susu dan es serut.");
        teler.setImage(R.drawable.esteler);
        listdataMinum.add(teler);

        model patin = new model();
        patin.setName("Patin Bakar");
        patin.setDesc("Ikan patin panggang dengan bumbu rempah.");
        patin.setImage(R.drawable.patin_bakar);
        listdataMinum.add(patin);

        rviewListMinum.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdataMinum, getContext());
        rviewListMinum.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    public void onItemClick(View view, int position) {

    }
}
