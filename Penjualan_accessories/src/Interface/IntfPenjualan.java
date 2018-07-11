/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.EntPenjualan;
import java.util.List;

/**
 *
 * @author RIZKY
 */

public interface IntfPenjualan {
    //insert
    boolean insertJual (EntPenjualan j);
    boolean insertDetJual (EntPenjualan j);
    String kodeBaru(String tgl, String kodeDepan);
}

/*public interface IntfPenjualan {
    boolean insertPenjualan(EntPenjualan p);
    
    boolean savePenjualan (EntPenjualan p);
    
    List selectPenjualan(String kode, String nama);
 
    String kodeBaru();

    public void insertDetJual(EntPenjualan penj);

    public void insertJual(EntPenjualan penj);

    public String kodeBaru(String tanggal, String kodeDepan);
} */
