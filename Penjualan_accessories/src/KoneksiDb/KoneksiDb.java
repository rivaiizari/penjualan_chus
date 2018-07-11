/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoneksiDb;
import java.sql.*;
/**
 *
 * @author putri mya
 */
public class KoneksiDb {
      private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Statement Connection ;//tambahan dari from penjualan 
 

    
    
    

    public Connection getConn() {
        if (conn==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    String url = "jdbc:mysql://localhost:3306/penjualan_accessories";
                    conn = DriverManager.getConnection(url, "root", "");
                    System.out.println("Koneksi Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi gagal " + se);
                    System.exit(0);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class tidak ditemukan " + cnfe);
                System.exit(0);
            }
        }
        return conn;
    }

    public ResultSet getRs() {
        return rs;
    }

    public boolean eksekusiQuery(String query, boolean kategori){
        try {
            ps = conn.prepareStatement(query);
            if(kategori){
                rs = ps.executeQuery(); //select
            }else{
                ps.executeUpdate(); //insert, update, delete
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        new KoneksiDb().getConn();
    }

    public void getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
