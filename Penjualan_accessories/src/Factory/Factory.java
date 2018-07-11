/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Implement.ImpLogin;
import Interface.IntfLogin;
import Implement.ImpBarang;
import Interface.IntfBarang;
import Implement.Imppenjualan;
import Interface.IntfPenjualan;
import Implement.Imppegawai;
import Interface.IntfPegawai;
import Implement.Imppenerimaan_barang;
import Interface.Intfpenerimaan_barang;
import Implement.Impdistributor;
import Interface.IntfDistributor;
//beda sof
//otw

/**
 *
 * @author RIZKY
 */ // dipebaharuiin nida
public class Factory {
    private static IntfLogin loginDao;
    private static Imppegawai PegawaiDao;
    private static IntfPegawai pegawaiDao;
    private static ImpBarang BarangDao;
    private static Imppenjualan PenjualanDao;
    private static IntfPenjualan penjualanDao;
    private static Imppenerimaan_barang penerimaan_barangDao;
    private static Impdistributor DistributorDao;
    
    public static IntfLogin getLoginDao(){
        loginDao = new ImpLogin();
        return loginDao;
    }

    private static IntfBarang getBarangDao;
    public static IntfBarang getBarangDao(){
        BarangDao = new ImpBarang();
        return BarangDao;
    }
    
    private static IntfPenjualan getpenjualanDao;
    public static IntfPenjualan getPenjualanDao(){
//        PenjualanDao = new Imppenjualan();
        return penjualanDao;
    }
    
    private static IntfPegawai getPegawaiDao;
    public static IntfPegawai getPegawaiDao(){
        PegawaiDao = new Imppegawai();
        return pegawaiDao;
    }
    
    private static Intfpenerimaan_barang getpenerimaan_barangDao;
    public static Imppenerimaan_barang getpenerimaan_barangDao(){
        penerimaan_barangDao = new Imppenerimaan_barang();
        return penerimaan_barangDao;
    }
    
    //diupdate..nida
    private static IntfDistributor getDistributorDao;
    public static Impdistributor getDistributorDao(){
        DistributorDao = new Impdistributor();
        return DistributorDao;
    }
}
