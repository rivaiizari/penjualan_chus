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
public class EntDistributor {
    private String kodistributor;
    private String nama;
    private String notelepon;
    private String alamat;
    private String carikodenama; 

    public String getKodistributor() {
        return kodistributor;
    }

    public void setKodistributor(String kodistributor) {
        this.kodistributor = kodistributor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(String notelepon) {
        this.notelepon = notelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getCarikodenama() {
        return carikodenama;
    }

    public void setCarikodenama(String carikodenama) {
        this.carikodenama = carikodenama;
    }
}
