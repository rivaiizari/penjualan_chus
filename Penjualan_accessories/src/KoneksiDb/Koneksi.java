/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoneksiDb;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author amikom
 */
public class Koneksi {

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection koneksi ;
    private ResultSet rs ;
    private PreparedStatement ps;
    
    public  Connection getKoneksi () {
        if(koneksi ==null) {
            // memangil dreive untuk koneksi ke MYSQL
                try {
                    Class.forName("com.mysql.jdbc.Driver") ;
            //memanggil koneksi database Mysql 
                 try {
                        String url = "jdbc:mysql://localhost:3306/penjualan8952";
                        koneksi =(Connection) DriverManager.getConnection(url, "root", "");     
                                System.out.println("Koneksi Sukses");                  
                    }catch (SQLException se) {
                                System.out.println("Koneksi gagal" + se);
                                System.exit(0);       
           
                    }
                }catch (ClassNotFoundException cnfe) {
                        System.out.println ("class tidak ditemukan" +cnfe) ;
                        System.exit (0);
                        }
                }
                 return koneksi; 
}
        public boolean eksekusiQuery (String query, boolean baris ){
            try{
                ps = (PreparedStatement) koneksi.prepareStatement(query);
                if (baris) {
                    rs=ps.executeQuery();
                } else {
                    ps.executeUpdate();
                }
                return true ;
                
                }catch (SQLException e) {
                    return false ;
                    
                }
            
            }
        //menambah method kobeksi agara kobneksi bisa 
        public static void main(String [] coba) {
            new Koneksi().getKoneksi();
     }

    public ResultSet getRs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
