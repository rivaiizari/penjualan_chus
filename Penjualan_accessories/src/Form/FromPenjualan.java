    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.EntPegawai;
import Entity.EntPenjualan;
import Entity.GlobVarid;
import Factory.Factory;
import Interface.IntfPenjualan;
import static KoneksiDb.config.configDB;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author putri mya
 */
public class FromPenjualan extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private String[] tabelHeader;
    private IntfPenjualan penjDao;
    private EntPenjualan penj;
    public String kodeso,namaso, tkj;
    public int stock,baris,hrgjual,subtotal,total;

    private String tanggal(){
        //DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        return df.format(d);   
   } 
    private String kodeDepan(){
        DateFormat df = new SimpleDateFormat("ddMMyy");
        Date d = new Date();
        return df.format(d);   
   }
    
    public void aturButton(boolean status){
        btnCari.setEnabled(status);
        btnOke.setEnabled(status);
        btnAdd.setEnabled(status);
        btnSave.setEnabled(!status);
    
        if(status == true){
            btnExit.setText("Exit");
        }else{
            btnExit.setText("Cancel");
        }
    } // copy1
    
        public void aturteks(){
        txtKj.setEnabled(true);
        txtKp.setEnabled(true);
        txtTgl.setEnabled(true);
        txtKodeacc.setEnabled(true);
        txtNama.setEnabled(true);
        txtStock.setEnabled(true);
        txtHarga.setEnabled(true);
        txtJumlah.setEnabled(true);
        txtTgl.setText(tanggal());
        txtTotal.setEditable(true);
        txtKembali.setEditable(true);
    } // copy 2
        
           
    private void teksKosong(){
        txtKodeacc.setText("");
        txtNama.setText("");
        txtStock.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
    } //3
    //error dini.. awalnya
     private void aturTabel(){ //mengatur tampilan tabel
        tabelHeader = new String[]{"Kode Accessories", "Nama Accessories", "Stock", "Harga", "Jumlah", "Subtotal"};
        dtm = new DefaultTableModel(null, tabelHeader);
        tblJual.setModel(dtm);
    }
    public FromPenjualan() {
        initComponents();
        penjDao = Factory.getPenjualanDao();
        txtKp.setText(EntPegawai.getKodep());
        aturTabel();
        aturButton(true);
        btnAdd.requestFocus();
        aturteks();
        
        //KODE AKUN LOGIN
        GlobVarid globVarid = new GlobVarid();
        //globVarid.getKodePegGlb(txtKp)
        String xx= globVarid.getNamaPegGlb();
        txtKp.setText(globVarid.getKodePegGlb());
        
        //GENERATE KODE
        try {
            java.sql.Connection conn=(Connection) configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT Kd_Penjualan FROM penjualan ORDER BY Kd_Penjualan DESC LIMIT 1");
            
            sql.next();
            String kdp= sql.getString(1);
           // String kdps =kdp.substring(2,5);
            int kdpInt= Integer.parseInt(kdp.substring(2,5));
            int j = kdpInt+1;
            //Integer.parseInt(txtJumlah.getText());
            //String nom=String.parseStr(j);
            //int w=9;
            String nom= Integer.toString(j);
            int nom2 = nom.length();
            String xaa="KR000";
            // String[] xa = xaa.split();
            //System.out.println(nom2);
            if(nom2==1){
                String za= xaa.substring(0,4)+nom;            
                //System.out.println(za);
                txtKj.setText(za);
            }else if(nom2==2){
                String za= xaa.substring(0,3)+nom;            
                //System.out.println(za);
                txtKj.setText(za);
            }else if(nom2==3){
                String za= xaa.substring(0,2)+nom;            
                //System.out.println(za);
                txtKj.setText(za);
            }
             
        } catch (Exception e) {

        }
        
    } //c4
    
     public FromPenjualan(String kodeso, String namaso, int stock, int hrgjual) {
       initComponents();
       this.kodeso = kodeso;
       this.namaso = namaso;
       this.stock = stock;
       this.hrgjual = hrgjual;
       txtKodeacc.setText(kodeso);
       txtNama.setText(namaso);
       txtStock.setText(String.valueOf(stock));
       txtHarga.setText(String.valueOf(hrgjual));
       aturTabel();
       aturButton(true);
       aturteks();
    } //c5
    
   
  /*  public FromPenjualan() {
        initComponents();
    }*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKj = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTgl = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJual = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPembayaran = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnOke = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtKodeacc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 51, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Jumlah Bayar");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Kode Penjualan : ");

        txtKj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKjActionPerformed(evt);
            }
        });

        jLabel3.setText("Kode Pegawai :");

        jLabel4.setText("Tanggal :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKj, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(txtKp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtKp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/05 penjualan.png"))); // NOI18N

        jLabel12.setText("Kembalian ");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblJual.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblJualAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tblJual);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Harga");

        txtPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPembayaranActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("Kode Asesoris");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel7.setText("Nama Asesoris");

        jLabel8.setText("Stok");

        jLabel9.setText("Harga");

        jLabel10.setText("Jumlah ");

        btnOke.setText("Oke ");
        btnOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkeActionPerformed(evt);
            }
        });

        txtKodeacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeaccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtKodeacc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCari))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnOke))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOke)
                            .addComponent(btnCari)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKodeacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel2.setText("Transaksi Penjualan Asesoris ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(35, 35, 35)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPembayaran)
                            .addComponent(txtKembali))))
                .addGap(32, 32, 32))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(jLabel11)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        try {
            java.sql.Connection conn=(Connection) configDB();
            java.sql.Statement stm = conn.createStatement();
            //java.sql.ResultSet sql = stm.executeQuery("SELECT Kd_Pegawai,Nama_Pegawai, Password FROM pegawai");
            //hast1
            //java.sql.ResultSet sql = stm.executeQuery("SELECT Nama_Barang, Harga_Beli,Stock FROM barang WHERE Kd_Barang='"+txtKodeacc.getText()+"'");
            java.sql.ResultSet sql = stm.executeQuery("SELECT Kd_Barang, Nama_Barang, Harga_Beli,Stock FROM barang");
                while(sql.next()){
                    //String xa= txtKodeacc.getText();
                    //txtCodeacc.setText();
                    if(txtKodeacc.getText().equals(sql.getString("Kd_Barang"))){
                        txtNama.setText(sql.getString("Nama_Barang"));
                        txtHarga.setText(sql.getString("Harga_Beli"));
                        txtStock.setText(sql.getString("Stock"));
                    }else{
                       JOptionPane.showMessageDialog(null, "maaf kode barang tidak ditemukan"); 
                    }
                    /*txtNama.setText(sql.getString(1));   
                    txtStock.setText(sql.getString(2));   
                    System.out.println(sql.getString(1));

                    txtKp.setText(sql.getString(1));*/
                }                
        }catch (SQLException | HeadlessException e) {
            
        }
    // TODO add your handling code here:
        //boolean closable = true;
   //     FrmCariAcc cari = new FrmCariAcc(null, closable); //error
   //     cari.penj = this;
   //     cari.setVisible(true);
   //     cari.setResizable(true);
        /*txtKodeacc.setText(kodeso);
        txtNama.setText(namaso);
        txtStock.setText(String.valueOf(stock));
        txtHarga.setText(String.valueOf(hrgjual));
        txtJumlah.setEditable(true);
        txtJumlah.requestFocus();
        txtJumlah.setText(""); */
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtKodeaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeaccActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
          if(btnExit.getText().equals("Exit")){
        dispose();
    }else{
        aturButton(true);
        teksKosong();
        txtTotal.setText("");
        txtPembayaran.setText("");
        txtKembali.setText("");
        aturTabel();
    } //c6
          
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkeActionPerformed
        // TODO add your handling code here:
        int batas = Integer.parseInt(txtJumlah.getText());
        subtotal = 0;
            if(batas < 1){
                JOptionPane.showMessageDialog(null, "Maaf Anda belum memasukkan Jumlah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtJumlah.requestFocus();
            }else{
                subtotal = Integer.parseInt(txtHarga.getText()) * Integer.parseInt(txtJumlah.getText());
                dtm.addRow(new Object[]{txtKodeacc.getText(), txtNama.getText(), txtStock.getText(), txtHarga.getText(), txtJumlah.getText(), subtotal});
                total = total + subtotal;
                txtTotal.setText(String.valueOf(total));
                                                
                tkj=txtKj.getText().substring(0,5);
                /*try{
                    String sql = "INSERT INTO penjualan VALUES ('"+tkj+"','"+txtKp.getText()+"','"+txtTgl.getText()+"')"; //kemungkinan ada yang salah...
                    //String sql = "INSERT INTO penjualan VALUES ('PJ002','K0001','2018-07-01')"; //kemungkinan ada yang salah...
                    java.sql.Connection conn=(Connection) configDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    pst.execute();
                    //JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
                }catch(Exception e) {
                   JOptionPane.showMessageDialog(this, e.getMessage());
                }*/
                
                //input ke database
                try{
                    //int jumL = Integer.parseInt(txtJumlah.getText());
                    String sql = "INSERT INTO detail_penjualan VALUES ('"+txtKj.getText().substring(0,5)+"','"+txtKodeacc.getText()+"','"+Integer.parseInt(txtJumlah.getText())+"','"+subtotal+"')"; //kemungkinan ada yang salah...
                    //String sql = "INSERT INTO detail_penjualan VALUES ('KP006','AB001','1','1300000')"; //kemungkinan ada yang salah...
                    java.sql.Connection conn=(Connection) configDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    pst.execute();
                    //JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
                }catch(Exception e) {
                   JOptionPane.showMessageDialog(this, e.getMessage());
                }
                
                //update stock
                try{
                    int stockNow = Integer.parseInt(txtStock.getText()) - Integer.parseInt(txtJumlah.getText());
                    //String sql = "UPDATE barang detail_penjualan VALUES ('"+txtKj.getText().substring(0,5)+"','"+txtKodeacc.getText()+"','"+Integer.parseInt(txtJumlah.getText())+"','"+subtotal+"')"; //kemungkinan ada yang salah...
                    String sql ="UPDATE barang SET Stock= '"+stockNow+"' WHERE Kd_Barang = '"+txtKodeacc.getText()+"'";
                    java.sql.Connection conn=(Connection) configDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    pst.execute();
                    //JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
                }catch(Exception e) {
                   JOptionPane.showMessageDialog(this, e.getMessage());
                }
                 
                //KE TABLE
                /*try {
                    int no = 1;
                    String sql = "select * from barang";
                    java.sql.Connection conn=(Connection) configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while (res.next()) {
                        dtm.addRow(new Object[]{res.getString("Kd_Barang"), res.getString("Nama_Barang"), res.getString("Stock"), res.getString("Harga_Jual"), txtJumlah.getText(), subtotal});
                    }
                    //jTable1.setModel(model);
                } catch (Exception e) {
                    
                }*/
                
                //empity isian
                teksKosong();
            }
        txtTotal.setEditable(false);
        txtKembali.setEditable(false); //7
    }//GEN-LAST:event_btnOkeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        total = 0;
        txtTotal.setText(String.valueOf(total));
        btnSave.setEnabled(true);
        btnAdd.setEnabled(false);
        btnCari.setEnabled(true);
        //PenjualanDao = Factory.getPenjualanDao();
        txtTgl.setText(tanggal());
        txtKj.setText(penjDao.kodeBaru(tanggal(), kodeDepan()));
        txtKp.setText(EntPegawai.getKodep());
        aturteks();
        aturButton(false); //8 error
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
           int i;
        penj = new EntPenjualan();
        penj.setKodejual(txtKj.getText());
        penj.setKodepeg(txtKp.getText());
        penj.setTgljual(txtTgl.getText());
        penjDao.insertJual(penj);  


        //insert ke tabel detail penjualan
        baris = tblJual.getRowCount();
        for(i = 0; i < baris; i++){
           penj.setKodeso(dtm.getValueAt(i, 0).toString());
           penj.setHrgjual(Integer.parseInt(dtm.getValueAt(i, 3).toString()));
           penj.setJmlhjual(Integer.parseInt(dtm.getValueAt(i, 4).toString()));
           penjDao.insertDetJual(penj);
        }
        aturButton(true);
        teksKosong();
        txtKj.setText("");
        txtTotal.setText("");
        txtPembayaran.setText("");
        txtKembali.setText("");
        aturTabel(); //10
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPembayaranActionPerformed
        // TODO add your handling code here:
        int kembali;
        kembali = Integer.parseInt(txtPembayaran.getText()) - Integer.parseInt(txtTotal.getText());
        txtKembali.setText(String.valueOf(kembali));
        if (kembali<0){
            JOptionPane.showMessageDialog(null, "Maaf pembayaran kurang", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            txtPembayaran.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Kembali Rp. " + kembali);
            teksKosong();
            txtTotal.setText("");
            txtPembayaran.setText("");
            txtKembali.setText("");
            aturButton(true);
            btnSaveActionPerformed(evt);
        } //11
    }//GEN-LAST:event_txtPembayaranActionPerformed

    private void tblJualAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblJualAncestorAdded
        // TODO add your handling code here: inset
    }//GEN-LAST:event_tblJualAncestorAdded

    private void txtKjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKjActionPerformed
        // TODO add your handling code here:
        tkj=txtKj.getText().substring(0,5);
        try{
            String sql = "INSERT INTO penjualan VALUES ('"+tkj+"','"+txtKp.getText()+"','"+txtTgl.getText()+"')"; //kemungkinan ada yang salah...
            //String sql = "INSERT INTO penjualan VALUES ('PJ002','K0001','2018-07-01')"; //kemungkinan ada yang salah...
            java.sql.Connection conn=(Connection) configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        }catch(Exception e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtKjActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromPenjualan().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOke;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblJual;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtKj;
    private javax.swing.JTextField txtKodeacc;
    private javax.swing.JTextField txtKp;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPembayaran;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
