package com.example.myapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class reporteFragment extends Fragment {


    public reporteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView;
        AdaptadorReporte adaptReporter;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reporte, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.reportesRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        //objeto de la clase Adaptador
        adaptReporter = new AdaptadorReporte(cargaImagenes(), getActivity(), R.layout.cardview);
        recyclerView.setAdapter(adaptReporter);
        return view;
    }

    public ArrayList<Reporte> cargaImagenes() {
        ArrayList<Reporte> cardImagenes = new ArrayList<Reporte>();
        cardImagenes.add(new Reporte("https://meditacionesdeldia.files.wordpress.com/2016/04/paisaje-hermoso.jpg", "esta es una prueba"));
        cardImagenes.add(new Reporte("http://aforisticamente.com/wp-content/uploads/2016/12/paisaje1.jpg", "esta es una prueba1"));
        cardImagenes.add(new Reporte("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy4qjLB6fnNTtbY5pJXI9zAo6zXfYRnGWToXyDjHur5VpYR_yg", "esta es una prueba2"));
        cardImagenes.add(new Reporte("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSE6zUCXvf7qYSjOK6U4wdkIbs8KDsFDzqOykC0J9UuIYzhRqeFww", "esta es una prueba3"));
        return cardImagenes;

    }

}
