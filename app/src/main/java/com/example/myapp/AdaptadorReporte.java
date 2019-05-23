package com.example.myapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdaptadorReporte extends RecyclerView.Adapter<AdaptadorReporte.ReporteViewHolder>{

    private ArrayList<Reporte> reportes;
    private Activity activity;
    private int resources;

    public AdaptadorReporte(ArrayList<Reporte> reportes, Activity activity, int resources) {
        this.reportes = reportes;
        this.activity = activity;
        this.resources = resources;
    }

    @NonNull
    @Override
    public ReporteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resources,viewGroup,false);
        return new ReporteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReporteViewHolder reporteViewHolder, int i) {

        Reporte reporte = reportes.get(i);
        reporteViewHolder.tituloTxt.setText(reporte.getTitulo());
        Picasso.with(activity).load(reporte.getImagen()).into(reporteViewHolder.imageView);


    }

    @Override
    public int getItemCount() {

        return reportes.size();
    }

    class ReporteViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView tituloTxt;
        public ReporteViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            tituloTxt = (TextView) itemView.findViewById(R.id.tituloTxt);
        }
    }
}
