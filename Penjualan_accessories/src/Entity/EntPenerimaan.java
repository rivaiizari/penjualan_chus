/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author RYZKY
 */
public class EntPenerimaan {
    private String kopenerimaan;
    private String kopegawai;
    private String koasesoris;
    private String namaasesoris;
    private String stok;
    private String harga; 
    private String jumlah;
    private String totalharga;
    private String tanggal ;

    public String getKopenerimaan() {
        return kopenerimaan;
    }

    public void setKopenerimaan(String kopenerimaan) {
        this.kopenerimaan = kopenerimaan;
    }

    public String getKopegawai() {
        return kopegawai;
    }

    public void setKopegawai(String kopegawai) {
        this.kopegawai = kopegawai;
    }

    public String getKoasesoris() {
        return koasesoris;
    }

    public void setKoasesoris(String koasesoris) {
        this.koasesoris = koasesoris;
    }

    public String getNamaasesoris() {
        return namaasesoris;
    }

    public void setNamaasesoris(String namaasesoris) {
        this.namaasesoris = namaasesoris;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(String totalharga) {
        this.totalharga = totalharga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
