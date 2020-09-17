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
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import menu.home;
import static panel.pnl_gk.tabel_gk;

/**
 *
 * @author Nikx
 */
public class tambah_gk extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    DefaultTableModel tabmode;
    /**
     * Creates new form tambah_gk
     */
    public tambah_gk() {
        initComponents();
        setLocationRelativeTo(null);
        aktif();
        golongan2();
        golongan4();
        golongan5();
        golongan6();
        golongan();
        
    }
    
    
    protected void kosong(){
        nk.setText("");
        gaji.setText("");
        tunjangan.setText("");
        ul.setText("");
        total_gaji.setText("");
    }
    
    protected void aktif(){
        nip.setEnabled(true);
        nip.requestFocus();
    }
    
    private void golongan(){
        try{
          String sql="select * from dk inner join jabatan on dk.kd_jabatan = jabatan.kd_jabatan inner join golongan on jabatan.gol = golongan.gol where dk.nip='"+nip.getSelectedItem().toString()+"'";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs=pst.executeQuery(sql);
          
          while(rs.next()){
          String a =rs.getString("nama");
          String b =rs.getString("gaji_pokok");
          String c =rs.getString("tunjangan_jabatan");
          String d =rs.getString("kd_jabatan");
          String e =rs.getString("gol");
          nk.setText(a);
          gaji.setText(b);
          tunjangan.setText(c);
          kj.setText(d);
          gl.setText(e);
          }
          
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    public void golongan2(){
        try{
          String sql="select * from dk";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs=pst.executeQuery(sql);
          
          
          while(rs.next()){
          String name =rs.getString("nip");
          nip.addItem(name);
          }
          
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    
     private void golongan4(){
         pot.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        try{
          String sql="select * from potongan";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs=pst.executeQuery(sql);
          DefaultListModel m=new DefaultListModel();
          while(rs.next()){
          String a =rs.getString("nama_potongan");
          m.addElement(a);
          }
          pot.setModel(m);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    
      private void golongan5(){
         pot.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
         DefaultListModel m=new DefaultListModel();
        try{
          String sql="select * from lembur";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs=pst.executeQuery(sql);
          
          while(rs.next()){
          String a =rs.getString("id_lembur");
          String b =rs.getString("jam_lembur");
          il.addItem(b);
          ula.setText(a);
          }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
     
    public void golongan6(){
        try{
          String tunjangan="SELECT * FROM `lembur` WHERE id_lembur ='"+ula.getText()+"'";
          PreparedStatement pst1 = conn.prepareStatement(tunjangan);
            ResultSet rs2=pst1.executeQuery(tunjangan);
          
          
          while(rs2.next()){
          String a =rs2.getString("upah_lembur");
          ul.setText(a);
          }
          
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        
    pot.setSelectionModel(new DefaultListSelectionModel() {
    @Override
    public void setSelectionInterval(int index0, int index1) {
        if(super.isSelectedIndex(index0)) {
            super.removeSelectionInterval(index0, index1);
        }
        else {
            super.addSelectionInterval(index0, index1);
        }
    }
});
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nk = new javax.swing.JTextField();
        gaji = new javax.swing.JTextField();
        tunjangan = new javax.swing.JTextField();
        total_gaji = new javax.swing.JTextField();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        nip = new javax.swing.JComboBox<>();
        ul = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kj = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pot = new javax.swing.JList<>();
        tp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        il = new javax.swing.JComboBox<>();
        gl = new javax.swing.JTextField();
        ula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NIP");

        jLabel2.setText("Nama Karyawan");

        jLabel3.setText("Gaji Pokok");

        jLabel4.setText("Tunjangan");

        jLabel5.setText("Potongan");

        jLabel6.setText("Total Gaji");

        nk.setEditable(false);

        gaji.setEditable(false);

        tunjangan.setEditable(false);

        total_gaji.setEditable(false);

        rSButtonRiple1.setBackground(new java.awt.Color(227, 227, 227));
        rSButtonRiple1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_filled_20px.png"))); // NOI18N
        rSButtonRiple1.setText("SIMPAN");
        rSButtonRiple1.setColorHover(new java.awt.Color(0, 204, 153));
        rSButtonRiple1.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        rSButtonRiple2.setBackground(new java.awt.Color(227, 227, 227));
        rSButtonRiple2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_window_filled_20px.png"))); // NOI18N
        rSButtonRiple2.setText("BATAL");
        rSButtonRiple2.setColorHover(new java.awt.Color(0, 204, 153));
        rSButtonRiple2.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        nip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipActionPerformed(evt);
            }
        });

        ul.setEditable(false);

        jLabel7.setText("Upah Lembur");

        kj.setEditable(false);
        kj.setUI(null);
        kj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kj.setEnabled(false);
        kj.setOpaque(false);

        pot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pot);

        tp.setEditable(false);

        jLabel8.setText("Total Potongan");

        il.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilActionPerformed(evt);
            }
        });

        gl.setUI(null);
        gl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glActionPerformed(evt);
            }
        });

        ula.setEditable(false);
        ula.setText("jTextField1");
        ula.setUI(null);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gaji, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton3))
                            .addComponent(nk, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(gl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(ula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(total_gaji, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(tunjangan, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(il, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton3)
                            .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(gl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(ula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        potongan pot = new potongan();
        pot.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        kosong();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipActionPerformed
        golongan();
    }//GEN-LAST:event_nipActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        String sql = "insert into gaji (nip,kd_jabatan,gol,id_lembur,total_potongan,total_gaji) values (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nip.getSelectedItem().toString());
            stat.setString(2, kj.getText());
            stat.setString(3, gl.getText());
            stat.setString(4, ula.getText());
            stat.setString(5, tp.getText());
            stat.setString(6, total_gaji.getText());
            stat.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
//            datatable();
//            new CambiaPanel(hm.panel2, new pnl_gk());
//            pnl_gk pgk = new pnl_gk();
//            pgk.tabmode.fireTableDataChanged();
            dispose();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void ilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilActionPerformed
        golongan6();
    }//GEN-LAST:event_ilActionPerformed

    private void potMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potMouseClicked
//        String selected=pot.getSelectedValue().toString();
pot.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Object[] areaList = pot.getSelectedValues();
        try{
          String tunjangan="SELECT SUM(jumlah_potongan) total FROM `potongan` WHERE nama_potongan in (";
          for( int i=0; i<areaList.length ; i++){
    tunjangan += "\'"+ areaList[i]+"\'";
    if (i<areaList.length-1)
        tunjangan+=",";
}
tunjangan+=")";

PreparedStatement pst1 = conn.prepareStatement(tunjangan);
            ResultSet rs2=pst1.executeQuery(tunjangan);

          while(rs2.next()){
          String a =rs2.getString("total");
          tp.setText(a);
          }
          
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        
//    int gp,tj,lem,potongan,first,second;
//    gp=Integer.parseInt(gaji.getText());
//    tj=Integer.parseInt(tunjangan.getText());
//    lem=Integer.parseInt(ul.getText());
//    potongan=Integer.parseInt(tp.getText());
//    
//    first=gp+tj+lem;
//    second=first-potongan;
//    
//    total_gaji.setText(String.valueOf(second));
    }//GEN-LAST:event_potMouseClicked

    private void glActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_glActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int gp,tj,lem,potongan,first,second;
    gp=Integer.parseInt(gaji.getText());
    tj=Integer.parseInt(tunjangan.getText());
    lem=Integer.parseInt(ul.getText());
    potongan=Integer.parseInt(tp.getText());
    
    first=gp+tj+lem;
    second=first-potongan;
    
    total_gaji.setText(String.valueOf(second));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tambah_gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_gk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gaji;
    private javax.swing.JTextField gl;
    private javax.swing.JComboBox<String> il;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kj;
    private javax.swing.JComboBox<String> nip;
    private javax.swing.JTextField nk;
    private javax.swing.JList<String> pot;
    private javax.swing.JTextField total_gaji;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField tunjangan;
    private javax.swing.JTextField ul;
    private javax.swing.JTextField ula;
    // End of variables declaration//GEN-END:variables
}
