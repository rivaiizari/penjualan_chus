
import static KoneksiDb.config.configDB;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SEVENPION
 */
public class tess {
    
    public static void main(String args[]) {
         try {
            java.sql.Connection conn=(Connection) configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT Alamat, Password FROM pegawai");
       //     tblAcc.setModel(DbUtils.resultSetToTableModel(sql));
            while(sql.next()){
             System.out.println(sql.getString(1));
            }
            //String tkj="1234567".substring(0,5);
            //System.out.println(tkj);
            String nom="120";
            int nom2 = nom.length();
            String xaa="KR000";
            // String[] xa = xaa.split();
            System.out.println(xaa.length());
            if(nom2==1){
                String za= xaa.substring(0,4)+nom;            
                System.out.println(za);
            }else if(nom2==2){
                String za= xaa.substring(0,3)+nom;            
                System.out.println(za);
            }else if(nom2==3){
                String za= xaa.substring(0,2)+nom;            
                System.out.println(za);
            }
            
            
            
            
        }catch (SQLException | HeadlessException e) {
        //     } catch (Exception e) { 
        }
         System.out.println("generate");
         //sssss
         try {
            int no = 1;
            //String sql = "SELECT COUNT(Kd_Penjualan) as Gene FROM penjualan";
            java.sql.Connection conn=(Connection) configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT COUNT(Kd_Penjualan) as Gene FROM penjualan");
            sql.next();
            int j = sql.getInt(1)+1;
            //String nom=res.getString("Gene");
            System.out.println(j);
            String nom="71";
            int nom2 = nom.length();
            
            //int nom2 = nom.length();
            /*String xaa="KR000";
            // String[] xa = xaa.split();
            System.out.println(xaa.length());
            if(nom2==1){
                String za= xaa.substring(0,4)+nom;            
                System.out.println(za);
                //txtKj.setText(za);
            }else if(nom2==2){
                String za= xaa.substring(0,3)+nom;            
                System.out.println(za);
                //txtKj.setText(za);
            }else if(nom2==3){
                String za= xaa.substring(0,2)+nom;            
                System.out.println(za);
                //txtKj.setText(za);
            }*/
             
        } catch (Exception e) {

        }
         
     }
}
