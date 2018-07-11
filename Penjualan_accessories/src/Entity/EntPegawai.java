/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author RYZKY
 * 
 */
public class EntPegawai {

    private String kode;
    private String nama;
    private String password;
    private String telp;
    private String alamat;
   
    private static String kodep;
    private static String namap ;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static String getKodep() {
        return kodep;
    }

    public static void setKodep(String kodep) {
        EntPegawai.kodep = kodep;
    }

    public static String getNamap() {
        return namap;
    }

    public static void setNamap(String namap) {
        EntPegawai.namap = namap;
    }

 
    
}
