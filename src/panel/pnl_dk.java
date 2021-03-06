/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.*;

/**
 *
 * @author Nikx
 */
public class pnl_dk extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    home menu = new home();
    /**
     * Creates new form pnl_home
     */
    public pnl_dk() {
        initComponents();
        datatable();
    }

    
    protected void datatable(){
        Object[] Baris ={"Nomor Pegawai","Nama Karyawan","Tempat Lahir","Tanggal Lahir","Jenis Kelamin","Agama","Status","Anak","Alamat","No. Telp","Pendidikan","Golongan","Jabatan","Gaji Pokok","Tanggal Diangkat"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel_k.setModel(tabmode);
        String sql = "select * from dk inner join jabatan on dk.kd_jabatan = jabatan.kd_jabatan inner join golongan on jabatan.gol = golongan.gol";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nip");
                String b = hasil.getString("nama");
                String c = hasil.getString("tempat_lahir");
                String d = hasil.getString("tanggal_lahir");
                String e = hasil.getString("jenis_kelamin");
                String f = hasil.getString("agama");
                String g = hasil.getString("pernikahan");
                String h = hasil.getString("anak");
                String i = hasil.getString("alamat");
                String j = hasil.getString("telp");
                String k = hasil.getString("pendidikan");
                String l = hasil.getString("gol");
                String m = hasil.getString("nm_jabatan");
                String n = hasil.getString("gaji_pokok");
                String o = hasil.getString("tgl_diangkat");
            
                String[] data={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
                tabmode.addRow(data);
            }
        } catch (Exception e){}
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_k = new javax.swing.JTable();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        nip = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1010, 533));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("DATA KARYAWAN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        tabel_k.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_kMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_k);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1040, 350));

        rSButtonRiple1.setBackground(new java.awt.Color(227, 227, 227));
        rSButtonRiple1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_filled_20px_1.png"))); // NOI18N
        rSButtonRiple1.setText("HAPUS DATA");
        rSButtonRiple1.setColorHover(new java.awt.Color(0, 204, 153));
        rSButtonRiple1.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, -1, -1));

        rSButtonRiple2.setBackground(new java.awt.Color(227, 227, 227));
        rSButtonRiple2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_file_filled_20px.png"))); // NOI18N
        rSButtonRiple2.setText("UBAH DATA");
        rSButtonRiple2.setColorHover(new java.awt.Color(0, 204, 153));
        rSButtonRiple2.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        rSButtonRiple3.setBackground(new java.awt.Color(227, 227, 227));
        rSButtonRiple3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_plus_filled_20px.png"))); // NOI18N
        rSButtonRiple3.setText("TAMBAH DATA");
        rSButtonRiple3.setColorHover(new java.awt.Color(0, 204, 153));
        rSButtonRiple3.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });
        add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        nip.setPreferredSize(new java.awt.Dimension(0, 0));
        add(nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        tambah_dk tdk = new tambah_dk();
        tdk.setVisible(true);
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
       int ok = JOptionPane.showConfirmDialog(null, "Yakin untuk di hapus ?","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
       if (ok==0){
           String sql = "delete from dk where nip ='"+nip.getText()+"'";
           try {
               PreparedStatement stat = conn.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
               datatable();
           }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
           }
       }
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void tabel_kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_kMouseClicked
        int bar = tabel_k.getSelectedRow();
       String a = tabmode.getValueAt(bar, 0).toString();
       
       nip.setText(a);
    }//GEN-LAST:event_tabel_kMouseClicked

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
       ubah_dk udk = new ubah_dk();
       udk.setVisible(true);
       int bar = tabel_k.getSelectedRow();
       String a = tabmode.getValueAt(bar, 0).toString();
       String b = tabmode.getValueAt(bar, 1).toString();
       String c = tabmode.getValueAt(bar, 2).toString();
//       String d = tabmode.getValueAt(bar, 3).toString();
    try {
        java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)tabmode.getValueAt(bar, 3));
        udk.tl2.setDate(date);
    } catch (ParseException ex) {
        Logger.getLogger(pnl_dk.class.getName()).log(Level.SEVERE, null, ex);
    }
       String e = tabmode.getValueAt(bar, 4).toString();
       String f = tabmode.getValueAt(bar, 5).toString();
       String g = tabmode.getValueAt(bar, 6).toString();
       String h = tabmode.getValueAt(bar, 7).toString();
       String i = tabmode.getValueAt(bar, 8).toString();
       String j = tabmode.getValueAt(bar, 9).toString();
       String k = tabmode.getValueAt(bar, 10).toString();
       String l = tabmode.getValueAt(bar, 11).toString();
       String m = tabmode.getValueAt(bar, 12).toString();
//       String n = tabmode.getValueAt(bar, 13).toString();  
       udk.nip.setText(a);
       udk.nk.setText(b);
       udk.tl.setSelectedItem(c);
       
       if(e.equals("Laki-laki")) {udk.l.setSelected(true); udk.p.setSelected(false);}
       else {udk.l.setSelected(false); udk.p.setSelected(true);}
       udk.agm.setSelectedItem(f);
       
       if(g.equals("Sudah Menikah")) {udk.sm.setSelected(true); udk.bm.setSelected(false);}
       else {udk.sm.setSelected(false); udk.bm.setSelected(true);}
       udk.ja.setText(h);
       udk.alm.setText(i);
       udk.telp.setText(j);
       udk.pend.setSelectedItem(k);
       udk.golongan.setSelectedItem(l);
       udk.Jabatan.setSelectedItem(m);
//       udk.tm.setDate(n);
       
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        datatable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nip;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    javax.swing.JTable tabel_k;
    // End of variables declaration//GEN-END:variables
}
