/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.EntPenerimaan;
import java.util.List;
/**
 *
 * @author RIZKY
 */
public interface Intfpenerimaan_barang {
    boolean TransaksiBaru (EntPenerimaan p);
    
    List Savepenerimaan_barang (String kode, String Nama);
    
    String kodeBaru();
}
