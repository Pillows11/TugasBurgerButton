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

public class MakananFavorite extends Fragment implements ListAdapter.ItemClickListener {

    RecyclerView rviewList;
    List<model> listdatamakan;
    ListAdapter adapter;

    public MakananFavorite() {
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


        model gudeg = new model();
        gudeg.setName("Gudeg");
        gudeg.setDesc("Nangka muda dengan santan dan gula merah, disajikan dengan ayam dan telur.");
        gudeg.setImage(R.drawable.gudeg);
        listdatamakan.add(gudeg);

        model liwet = new model();
        liwet.setName("Nasi Liwet");
        liwet.setDesc("Nasi dengan santan dan rempah-rempah, disajikan dengan lauk-pauk.");
        liwet.setImage(R.drawable.nasi_liwet);
        listdatamakan.add(liwet);

        model tahuCampur = new model();
        tahuCampur.setName("Tahu Campur");
        tahuCampur.setDesc("Tahu goreng dengan kuah, telur, tauge, dan kacang kedelai.");
        tahuCampur.setImage(R.drawable.tahu_campur);
        listdatamakan.add(tahuCampur);

        model rujakCingur = new model();
        rujakCingur.setName("Rujak Cingur");
        rujakCingur.setDesc("Rujak buah dengan potongan daging cingur dan bumbu kacang.");
        rujakCingur.setImage(R.drawable.rujak_cingur);
        listdatamakan.add(rujakCingur);

        model soto = new model();
        soto.setName("Soto Kudus");
        soto.setDesc("Soto ayam bening dengan mie, tauge, dan perkedel.");
        soto.setImage(R.drawable.soto_kudus );
        listdatamakan.add(soto);

        model pletok = new model();
        pletok.setName("Bir Pletok");
        pletok.setDesc("Minuman hangat dengan jahe, kayu manis, dan gula aren.");
        pletok.setImage(R.drawable.bir_pletok);
        listdatamakan.add(pletok);

        model bandrek = new model();
        bandrek.setName("Bandrek");
        bandrek.setDesc("Minuman hangat dengan santan, jahe, dan gula merah.");
        bandrek.setImage(R.drawable.bandrek);
        listdatamakan.add(bandrek);

        model ronde = new model();
        ronde.setName("Wedang Ronde");
        ronde.setDesc("Bola ketan dengan kuah jahe.");
        ronde.setImage(R.drawable.ronde);
        listdatamakan.add(ronde);

        model bajigur = new model();
        bajigur.setName("Bajigur");
        bajigur.setDesc("Minuman hangat dengan santan, jahe, dan gula merah.");
        bajigur.setImage(R.drawable.bajigur);
        listdatamakan.add(bajigur);

        model dawet = new model();
        dawet.setName("Es Dawet Ayu");
        dawet.setDesc("Es campur dengan dawet, santan, dan gula merah.");
        dawet.setImage(R.drawable.es_dawet);
        listdatamakan.add(dawet);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdatamakan, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    @Override
    public void onItemClick(View view, int position) {
    }
}
