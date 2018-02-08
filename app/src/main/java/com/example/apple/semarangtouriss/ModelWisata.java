package com.example.apple.semarangtouriss;

/**
 * Created by apple on 2017/12/26.
 */

public class ModelWisata {
    private int image;
    private String judul;
    private String alamat;
    private String deskripsi;
    private Double latitude;
    private Double longitude;

    public ModelWisata(int image, String judul, String alamat, String deskripsi, Double latitude, Double longitude){
        this.image = image;
        this.judul = judul;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getImage(){
        return image;
    }

    public String getJudul(){
        return judul;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
