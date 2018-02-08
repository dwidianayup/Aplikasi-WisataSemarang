package com.example.apple.semarangtouriss;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by apple on 2017/12/26.
 */

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {

    private Context context;
    private ArrayList<ModelWisata> wisatalist;

    public WisataAdapter(Context context, ArrayList<ModelWisata> wisatalist) {
        this.context = context;
        this.wisatalist = wisatalist;
    }
    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_wisata,parent,false);
        return new WisataViewHolder(view);
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView judul;
        TextView deskripsi;


        public WisataViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.gambar);
            judul = (TextView)itemView.findViewById(R.id.judul);

        }
    }

    @Override
    public void onBindViewHolder(WisataAdapter.WisataViewHolder holder,final int position) {
        holder.image.setImageResource(wisatalist.get(position).getImage());
        holder.judul.setText(wisatalist.get(position).getJudul());



        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailWisata.class);

                intent.putExtra("judul",wisatalist.get(position).getJudul());
                intent.putExtra("image",wisatalist.get(position).getImage());
                intent.putExtra("alamat",wisatalist.get(position).getAlamat());
                intent.putExtra("deskripsi",wisatalist.get(position).getDeskripsi());
                intent.putExtra("latitude",wisatalist.get(position).getLatitude());
                intent.putExtra("longitude",wisatalist.get(position).getLongitude());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return wisatalist.size();
    }


}
