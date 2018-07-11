/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;


import Entity.EntPenjualan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interface.IntfPenjualan;
import KoneksiDb.Koneksi;

//
//public class Imppenjualan {
//    
//}
//dao error

public class Imppenjualan implements IntfPenjualan{
    private String query;
    private Koneksi koneksiDb;
    private boolean status;
    private ResultSet rsJual;
    
    public Imppenjualan(){
        koneksiDb = new Koneksi();
        koneksiDb.getKoneksi();
    }
    
    public boolean insertJual(EntPenjualan j) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    status = false;
    query = "INSERT INTO penjualan VALUES('"+j.getKodejual()+"','"+j.getKodepeg()+"','"+j.getTgljual()+"')";  //nggak muncil
    status = koneksiDb.eksekusiQuery(query, false);
    return status;
 //    status = false;
// catatan    query = "INSERT INTO detail_penj VALUES('"+j.getKodejual()+"','"+j.getKodeso()+"','"+j.getJmlhjual()+"','"+j.getHrgjual()+"')"; 
    

    /**
     *
     * @param 
     * @return
     */
    public boolean insertDetJual(EntPenjualan j) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    status = false;
    query = "INSERT INTO detail_penj VALUES('"+j.getKodejual()+"','"+j.getKodeso()+"','"+j.getJmlhjual()+"','"+j.getHrgjual()+"')"; 
    status = koneksiDb.eksekusiQuery(query, false);
    return status;
    } // can

    public String kodeBaru(String tgl, String kodeDepan) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String kode = "";
    int angka = 0;
    query = "select max(right(kd_penj,4)) as kode from penjualan where tgl_penj = '"+tgl+"'";
    status = koneksiDb.eksekusiQuery(query, true);
    if (status){
        rsJual = koneksiDb.getRs();
        try {
            rsJual.next();
            angka = rsJual.getInt(1);
            if (angka<10){
                kode = kodeDepan + "000" + (angka+1);
            }else if(angka<100){
                kode = kodeDepan + "00" + (angka+1);
            }else if(angka<1000){
                kode = kodeDepan + "0" + (angka+1);
            } else {
                kode = kodeDepan + String.valueOf(angka + 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    return kode;
    }

    @Override
    public boolean insertPenjualan(EntPenjualan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean savePenjualan(EntPenjualan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectPenjualan(String kode, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String kodeBaru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertDetJual(EntPenjualan penj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertJual(EntPenjualan penj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertDetJual(EntPenjualan penj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertJual(EntPenjualan penj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
