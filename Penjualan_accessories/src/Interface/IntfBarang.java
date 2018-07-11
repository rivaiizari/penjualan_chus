/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Entity.EntBarang;
import java.util.List;

/**
 *
 * @author RIZKY
 */
public interface IntfBarang {
    boolean saveBarang(EntBarang b);
    
    boolean editBarang(EntBarang b);
    
    boolean deleteBarang(String kode);
    
    List selectBarang (String kode, String nama);
    
    String kodeBaru();

    public List<EntBarang> selectBarang();

    public boolean deleteBarang(EntBarang Barang);

    public static class LoginDoa {

        public LoginDoa() {
        }
    }
    
}
