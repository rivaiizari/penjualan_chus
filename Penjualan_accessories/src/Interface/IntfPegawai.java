/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.EntPegawai;
import java.util.List;

/**
 *
 * @author RIZKY
 */
public interface IntfPegawai {
    boolean addPegawai (EntPegawai e);
    
    boolean savePegawai (EntPegawai e);
    
    boolean editPegawai (EntPegawai e);
    
    boolean deletePegawai (String kode);
    
    List selectPegawai (String kode, String nama);
    
    String buatKode();
}
