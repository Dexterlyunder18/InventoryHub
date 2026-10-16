package com.example.main.Models;

public class Kategori {
    private String namaKategori;

    public String getNamaKategori(){
        return this.namaKategori;
    }
    public String updateNamaKategori(String namaKategori){
        this.namaKategori = namaKategori;
        return this.namaKategori;
    }
}
