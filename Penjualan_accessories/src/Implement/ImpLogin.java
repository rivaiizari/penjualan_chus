/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import KoneksiDb.KoneksiDb;
import Entity.EntPegawai;
import Interface.IntfLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RIZKY
 */
public class ImpLogin implements IntfLogin {

    private KoneksiDb koneksiDb;
    private ResultSet rsLogin;
    private String query;
    private boolean status;

    public ImpLogin() {
        koneksiDb = new KoneksiDb();

    }

    @Override
    public boolean login(String kode, String password) {
        query = "SELECT * FROM pegawai WHERE kd_pegawai = '" + kode + "' AND password = '" + password + "'";
        status = koneksiDb.eksekusiQuery(query, true);

        if (status) {
            rsLogin = koneksiDb.getRs();
            try {
                rsLogin.next();
                Entity.EntPegawai p = new EntPegawai();
//                p.setKopegawai= rsLogin.getString(1);
//                namaStaff = rsLogin.getString(2);
//                telpStaff = rsLogin.getString(4);
//                passwordStaff = rsLogin.getString(3);
//                if (namaStaff == null) {
//                    status = false;
//                } else {
//                    status = true;
//                }
            } catch (SQLException se) {
                status = false;
            }
        }
        return status;
    }

    @Override
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        ImpLogin log = new ImpLogin();
        System.out.print(log.login("KP001", "12345"));
    }
}
