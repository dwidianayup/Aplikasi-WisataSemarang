package com.example.apple.semarangtouriss;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWisata extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        int image = getIntent().getIntExtra("image",0);
        String judul = getIntent().getStringExtra("judul");
        String alamat = getIntent().getStringExtra("alamat");
        String deskripsi = getIntent().getStringExtra("deskripsi");

        getSupportActionBar().setTitle(judul);

        TextView textJudul = findViewById(R.id.judul2);
        textJudul.setText(judul.toString());
        ImageView srcGambar = findViewById(R.id.gambar2);
        srcGambar.setImageResource(image);
        TextView textAlamat = findViewById(R.id.alamat2);
        textAlamat.setText(alamat.toString());
        TextView textDeskripsi = findViewById(R.id.deskripsi2);
        textDeskripsi.setText(deskripsi.toString());
    }

    public void maps(View view) {
        Intent intent = new Intent(this, MapsActivity.class);

        Double latitude =  getIntent().getDoubleExtra("latitude",0);
        Double longitude = getIntent().getDoubleExtra("longitude",0);

        intent.putExtra("latitude",latitude);
        intent.putExtra("longitude",longitude);

        startActivity(intent);

    }
}
