package com.example.main.Models;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private int stok;
    private int harga;
    private int batasBawahStok;
    private int batasAtasStok;


    //Fungsi Gets
    public String getKodeProduk(){
        return this.kodeProduk;
    }
    public String getNamaProduk(){
        return this.namaProduk;
    }
    public int getStokProduk(){
        return this.stok;
    }
    public int getHargaProduk(){
        return this.harga;
    }
    public int getBatasAtasStokProduk(){
        return this.batasAtasStok;
    }
    public int getBatasBawahStokProduk(){
        return this.batasBawahStok;
    }
}
