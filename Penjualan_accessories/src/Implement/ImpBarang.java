/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import KoneksiDb.KoneksiDb;
import Entity.EntBarang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interface.IntfBarang;

/**
 *
 * @author RIZKY
 */
public class ImpBarang implements IntfBarang{
    private String query;
    private KoneksiDb koneksi;
    private boolean status;
    private ResultSet rsBarang, rsKode;
    private List<EntBarang> listBarang;
    
    public ImpBarang() {
        koneksi = new KoneksiDb();
        koneksi.getKoneksi();
    }

    @Override
    public boolean saveBarang(EntBarang b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editBarang(EntBarang b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBarang(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectBarang(String kode, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String kodeBaru() {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntBarang> selectBarang() {
        throw new UnsupportedOperationException("Not supported yet.");
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBarang(EntBarang Barang) {
        throw new UnsupportedOperationException("Not supported yet.");
    //To change body of generated methods, choose Tools | Templates.
    }

}
