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
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nikx
 */
public class pnl_dj extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form pnl_home
     */
    public pnl_dj() {
        initComponents();
        datatable();
    }
    
    public void datatable(){
        Object[] Baris ={"Kode Jabatan","Nama Jabatan","Gaji Pokok","Golongan","Tunjangan Jabatan"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel_j.setModel(tabmode);
        String sql = "select * from jabatan inner join golongan on jabatan.gol = golongan.gol";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kd_jabatan");
                String b = hasil.getString("nm_jabatan");
                String c = hasil.getString("gaji_pokok");
                String d = hasil.getString("gol");
                String e = hasil.getString("tunjangan_jabatan");
                
            
                String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e){}
    }
    
    
    public void erasetable(){
    if (tabmode.getRowCount() > 0) {
    for (int i = tabmode.getRowCount() - 1; i > -1; i--) {
        tabmode.removeRow(i);
    }
}
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_j = new javax.swing.JTable();
        kd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1010, 533));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("DATA JABATAN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        tabel_j.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_j.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabel_jFocusGained(evt);
            }
        });
        tabel_j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_jMouseClicked(evt);
            }
        });
        tabel_j.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabel_jPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_j);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 108, 820, 292));

        kd.setPreferredSize(new java.awt.Dimension(0, 0));
        add(kd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
//         tabel_j.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//         int[] selectedRows = tabel_j.getSelectedRows();
//        StringBuilder b = new StringBuilder();
//  b.append("delete from jabatan where ");
//  for (int i = 0; i < selectedRows.length; i++) {
//      int row = selectedRows[i]; 
//      String no = tabmode.getValueAt(row, 0).toString();
//      b.append("kd_jabatan='"+no+"'");
//      if (i < selectedRows.length - 1) {
//         b.append(" OR ");  //omit the last OR
//      } 
//  }
//  try {
//               PreparedStatement stat = conn.prepareStatement(b.toString());
//               stat.executeUpdate(b.toString());
//               JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
//               datatable();
//           }catch (SQLException e){
//               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
//           }



        int ok = JOptionPane.showConfirmDialog(null, "Yakin untuk di hapus ?","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
       if (ok==0){
           String sql = "delete from jabatan where kd_jabatan ='"+kd.getText()+"'";
           try {
               PreparedStatement stat = conn.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
               datatable();
           }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
           }
       }
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
       tambah_dj tdj = new tambah_dj();
       tdj.setVisible(true);
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void tabel_jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_jMouseClicked
       int bar = tabel_j.getSelectedRow();
       String a = tabmode.getValueAt(bar, 0).toString();
       
       kd.setText(a);
    }//GEN-LAST:event_tabel_jMouseClicked

    private void tabel_jFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabel_jFocusGained

    }//GEN-LAST:event_tabel_jFocusGained

    private void tabel_jPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabel_jPropertyChange
       
    }//GEN-LAST:event_tabel_jPropertyChange

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        
    }//GEN-LAST:event_formMouseEntered

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
       
    }//GEN-LAST:event_formMouseMoved

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       
    }//GEN-LAST:event_formFocusGained

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
       ubah_dj udj = new ubah_dj();
       udj.setVisible(true);
       int bar = tabel_j.getSelectedRow();
       String a = tabmode.getValueAt(bar, 0).toString();
       String b = tabmode.getValueAt(bar, 1).toString();
       String c = tabmode.getValueAt(bar, 2).toString();
       String d = tabmode.getValueAt(bar, 3).toString();
       
       udj.kd_jabatan.setText(a);
       udj.nm_jabatan.setText(b);
       udj.gp.setText(c);
       udj.golongan.setSelectedItem(d);
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        datatable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kd;
    public javax.swing.JTable tabel_j;
    // End of variables declaration//GEN-END:variables
}
