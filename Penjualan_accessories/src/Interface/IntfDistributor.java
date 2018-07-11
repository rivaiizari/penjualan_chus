/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.EntDistributor;
import java.util.List;

/**
 *
 * @author RIZKY
 */
public interface IntfDistributor {
    boolean addDistributor (EntDistributor d);
    
    boolean saveDistributor (EntDistributor d);
    
    boolean editDistributor (EntDistributor d);
    
    boolean deleteDistributor (EntDistributor d);
    
    List selectDistributor (String kode, String nama);
    
    String kodeBaru();
    
}
