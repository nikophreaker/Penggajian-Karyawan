/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import panel.CambiaPanel;
import panel.*;

/**
 *
 * @author Nikx
 */
public class home extends javax.swing.JFrame {
//GraphicsDevice myDevice;
//    Window myWindow;
//    DisplayMode newDisplayMode; 
    //Make close custom with joption
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
//        Toolkit tk = Toolkit.getDefaultToolkit();        
//         int xsize = (int) tk.getScreenSize().getWidth();
//         int ysize = (int) tk.getScreenSize().getHeight();
//         this.setSize(xsize,ysize);

//        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();        this.setSize(layar.width,layar.height);       
//        int kiri = (layar.width-this.getSize().width)/2;       
//        int atas = (layar.height-this.getSize().height)/2;       
//        setLocation(kiri,atas);       
//        jPanel1.setBounds(0,0,layar.width,(int) Math.round(layar.height-(layar.height*0.1)));

       
//        try {
//            myDevice.setFullScreenWindow(myWindow);
//            myDevice.setDisplayMode(newDisplayMode);
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Fullscreen gagal karena :"+e.toString());
//        } 

//        this.setLocationRelativeTo(this);
       
        this.hm.setSelected(true);
        
        new CambiaPanel(panel2, new pnl_home());
         tanggal_jam_sekarang();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelmenu = new javax.swing.JPanel();
        hm = new rojeru_san.RSButton();
        dk = new rojeru_san.RSButton();
        dj = new rojeru_san.RSButton();
        gk = new rojeru_san.RSButton();
        lk = new rojeru_san.RSButton();
        lap = new rojeru_san.RSButton();
        minimize = new rojeru_san.RSButton();
        exit = new rojeru_san.RSButton();
        panel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_list_60px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Dashboard - NikxPhreaker");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 920;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.4;
        jPanel1.add(jPanel2, gridBagConstraints);

        panelmenu.setBackground(java.awt.SystemColor.controlHighlight);
        panelmenu.setPreferredSize(new java.awt.Dimension(207, 248));

        hm.setBackground(new java.awt.Color(255, 255, 255));
        hm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_filled_20px.png"))); // NOI18N
        hm.setText("Home");
        hm.setColorHover(new java.awt.Color(255, 255, 255));
        hm.setColorText(new java.awt.Color(51, 51, 51));
        hm.setColorTextHover(new java.awt.Color(0, 0, 0));
        hm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hm.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        hm.setIconTextGap(20);
        hm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hmMouseReleased(evt);
            }
        });
        hm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmActionPerformed(evt);
            }
        });

        dk.setBackground(java.awt.SystemColor.controlHighlight);
        dk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_conference_background_selected_filled_20px.png"))); // NOI18N
        dk.setText("Data Karyawan");
        dk.setColorHover(new java.awt.Color(255, 255, 255));
        dk.setColorText(new java.awt.Color(51, 51, 51));
        dk.setColorTextHover(new java.awt.Color(0, 0, 0));
        dk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dk.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dk.setIconTextGap(20);
        dk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dkMouseReleased(evt);
            }
        });
        dk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dkActionPerformed(evt);
            }
        });

        dj.setBackground(java.awt.SystemColor.controlHighlight);
        dj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_guest_filled_20px.png"))); // NOI18N
        dj.setText("Data Jabatan");
        dj.setColorHover(new java.awt.Color(255, 255, 255));
        dj.setColorText(new java.awt.Color(51, 51, 51));
        dj.setColorTextHover(new java.awt.Color(0, 0, 0));
        dj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dj.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dj.setIconTextGap(20);
        dj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                djMouseReleased(evt);
            }
        });
        dj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                djActionPerformed(evt);
            }
        });

        gk.setBackground(java.awt.SystemColor.controlHighlight);
        gk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_get_cash_filled_20px.png"))); // NOI18N
        gk.setText("Gaji Karyawan");
        gk.setColorHover(new java.awt.Color(255, 255, 255));
        gk.setColorText(new java.awt.Color(51, 51, 51));
        gk.setColorTextHover(new java.awt.Color(0, 0, 0));
        gk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gk.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gk.setIconTextGap(20);
        gk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gkMouseReleased(evt);
            }
        });
        gk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gkActionPerformed(evt);
            }
        });

        lk.setBackground(java.awt.SystemColor.controlHighlight);
        lk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_overtime_filled_20px.png"))); // NOI18N
        lk.setText("Lembur Karyawan");
        lk.setColorHover(new java.awt.Color(255, 255, 255));
        lk.setColorText(new java.awt.Color(51, 51, 51));
        lk.setColorTextHover(new java.awt.Color(0, 0, 0));
        lk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lk.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lk.setIconTextGap(20);
        lk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lkMouseReleased(evt);
            }
        });
        lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lkActionPerformed(evt);
            }
        });

        lap.setBackground(java.awt.SystemColor.controlHighlight);
        lap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_test_results_filled_20px.png"))); // NOI18N
        lap.setText("Laporan");
        lap.setColorHover(new java.awt.Color(255, 255, 255));
        lap.setColorText(new java.awt.Color(51, 51, 51));
        lap.setColorTextHover(new java.awt.Color(0, 0, 0));
        lap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lap.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lap.setIconTextGap(20);
        lap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lapMouseReleased(evt);
            }
        });
        lap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapActionPerformed(evt);
            }
        });

        minimize.setBackground(java.awt.SystemColor.controlHighlight);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_minimize_window_filled_20px.png"))); // NOI18N
        minimize.setText("Minimize");
        minimize.setColorHover(new java.awt.Color(255, 255, 255));
        minimize.setColorText(new java.awt.Color(51, 51, 51));
        minimize.setColorTextHover(new java.awt.Color(0, 0, 0));
        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        minimize.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        minimize.setIconTextGap(20);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeMouseReleased(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });

        exit.setBackground(java.awt.SystemColor.controlHighlight);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_window_filled_20px.png"))); // NOI18N
        exit.setText("Exit");
        exit.setColorHover(new java.awt.Color(255, 255, 255));
        exit.setColorText(new java.awt.Color(51, 51, 51));
        exit.setColorTextHover(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exit.setIconTextGap(20);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitMouseReleased(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dk, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gk, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lk, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lap, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addComponent(hm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = -1;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.8;
        jPanel1.add(panelmenu, gridBagConstraints);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(new javax.swing.BoxLayout(panel2, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 791;
        gridBagConstraints.ipady = 466;
        jPanel1.add(panel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//       int position = this.panelmenu.getX();
//        if(position > -1){
//            Animacion.Animacion.mover_izquierda(0, -200, 2, 2, panelmenu);
//            Animacion.Animacion.mover_izquierda(20, -20, 2, 2, panel2);
//        }else{
//            Animacion.Animacion.mover_derecha(-200, 0, 2, 2, panelmenu);
//            Animacion.Animacion.mover_derecha(-200, 200, 2, 2, panel2);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       int confirm = JOptionPane.showOptionDialog(
             null, "Are You Sure to Close Application?", 
             "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
             JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == 0) {
           System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void exitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseReleased

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        setState(home.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeMouseReleased

    private void lapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapActionPerformed
        new CambiaPanel(panel2, new pnl_lap());
        hm.setBackground(new Color(227, 227, 227));
        dk.setBackground(new Color(227, 227, 227));
        dj.setBackground(new Color(227, 227, 227));
        gk.setBackground(new Color(227, 227, 227));
        lk.setBackground(new Color(227, 227, 227));
        lap.setBackground(new Color(255,255,255));
        this.hm.setSelected(false);
        this.dk.setSelected(false);
        this.dj.setSelected(false);
        this.gk.setSelected(false);
        this.lk.setSelected(false);
        this.lap.setSelected(true);
    }//GEN-LAST:event_lapActionPerformed

    private void lapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapMouseReleased

    }//GEN-LAST:event_lapMouseReleased

    private void lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lkActionPerformed
        new CambiaPanel(panel2, new pnl_lk());
        hm.setBackground(new Color(227, 227, 227));
        dk.setBackground(new Color(227, 227, 227));
        dj.setBackground(new Color(227, 227, 227));
        gk.setBackground(new Color(227, 227, 227));
        lk.setBackground(new Color(255,255,255));
        lap.setBackground(new Color(227, 227, 227));
        this.hm.setSelected(false);
        this.dk.setSelected(false);
        this.dj.setSelected(false);
        this.gk.setSelected(false);
        this.lk.setSelected(true);
        this.lap.setSelected(false);
    }//GEN-LAST:event_lkActionPerformed

    private void lkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkMouseReleased

    }//GEN-LAST:event_lkMouseReleased

    private void gkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gkActionPerformed
        new CambiaPanel(panel2, new pnl_gk());
        hm.setBackground(new Color(227, 227, 227));
        dk.setBackground(new Color(227, 227, 227));
        dj.setBackground(new Color(227, 227, 227));
        gk.setBackground(new Color(255,255,255));
        lk.setBackground(new Color(227, 227, 227));
        lap.setBackground(new Color(227, 227, 227));
        this.hm.setSelected(false);
        this.dk.setSelected(false);
        this.dj.setSelected(false);
        this.gk.setSelected(true);
        this.lk.setSelected(false);
        this.lap.setSelected(false);
    }//GEN-LAST:event_gkActionPerformed

    private void gkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gkMouseReleased

    }//GEN-LAST:event_gkMouseReleased

    private void djActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_djActionPerformed
        new CambiaPanel(panel2, new pnl_dj());
        hm.setBackground(new Color(227, 227, 227));
        dk.setBackground(new Color(227, 227, 227));
        dj.setBackground(new Color(255,255,255));
        gk.setBackground(new Color(227, 227, 227));
        lk.setBackground(new Color(227, 227, 227));
        lap.setBackground(new Color(227, 227, 227));
        this.hm.setSelected(false);
        this.dk.setSelected(false);
        this.dj.setSelected(true);
        this.gk.setSelected(false);
        this.lk.setSelected(false);
        this.lap.setSelected(false);
    }//GEN-LAST:event_djActionPerformed

    private void djMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_djMouseReleased

    }//GEN-LAST:event_djMouseReleased

    private void dkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dkActionPerformed
        new CambiaPanel(panel2, new pnl_dk());
        hm.setBackground(new Color(227, 227, 227));
        dk.setBackground(new Color(255,255,255));
        dj.setBackground(new Color(227, 227, 227));
        gk.setBackground(new Color(227, 227, 227));
        lk.setBackground(new Color(227, 227, 227));
        lap.setBackground(new Color(227, 227, 227));
        this.hm.setSelected(false);
        this.dk.setSelected(true);
        this.dj.setSelected(false);
        this.gk.setSelected(false);
        this.lk.setSelected(false);
        this.lap.setSelected(false);
    }//GEN-LAST:event_dkActionPerformed

    private void dkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dkMouseReleased

    }//GEN-LAST:event_dkMouseReleased

    private void hmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmActionPerformed
        new CambiaPanel(panel2, new pnl_home());
        hm.setBackground(new Color(255,255,255));
        dk.setBackground(new Color(227, 227, 227));
        dj.setBackground(new Color(227, 227, 227));
        gk.setBackground(new Color(227, 227, 227));
        lk.setBackground(new Color(227, 227, 227));
        lap.setBackground(new Color(227, 227, 227));
        this.hm.setSelected(true);
        this.dk.setSelected(false);
        this.dj.setSelected(false);
        this.gk.setSelected(false);
        this.lk.setSelected(false);
        this.lap.setSelected(false);
    }//GEN-LAST:event_hmActionPerformed

    private void hmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hmMouseReleased

    }//GEN-LAST:event_hmMouseReleased

    /**home
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new home().setVisible(true);
//                 home inst = new home();
//                inst.setLocationRelativeTo(null);
//            // membuat frame menjadi fullscreen
//            GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//            if(device.isFullScreenSupported()) {
//            device.setFullScreenWindow(inst);
//            }
//            inst.setVisible(true);

            try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                home frame = new home();
frame.setAlwaysOnTop(false);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocation(0, 0);
frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
frame.setSize(dim);
frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
frame.addWindowListener(exitListener);
// This will stop the background window from become focused,
// potentially hiding the other windows
frame.setFocusableWindowState(true);
frame.setFocusable(false);
frame.setVisible(true);

            }
            
WindowListener exitListener = new WindowAdapter() {

    @Override
    public void windowClosing(WindowEvent e) {
        int confirm = JOptionPane.showOptionDialog(
             null, "Are You Sure to Close Application?", 
             "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
             JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == 0) {
           System.exit(0);
        }
    }
};
        });
    }
    
    
    //untuk realtime tanggal dan jam
    public void tanggal_jam_sekarang(){
        Thread p=new Thread(){
            public void run(){
                for(;;){
                Calendar cal = new GregorianCalendar();
                int hari = cal.get(Calendar.DAY_OF_MONTH);
                int bulan = cal.get(Calendar.MONTH);
                int tahun = cal.get(Calendar.YEAR);
                jLabel3.setText(hari+"/"+(bulan+1)+"/"+tahun);
                int jam = cal.get(Calendar.HOUR);
                int menit = cal.get(Calendar.MINUTE);
                int detik = cal.get(Calendar.SECOND);
                int AM_PM = cal.get(Calendar.AM_PM);
                String day_night = "";
                if (AM_PM == 1) { day_night = "PM"; } 
                else { day_night = "AM"; }
                String waktu1 = jam+":"+menit+":"+detik+""+day_night;
                jLabel5.setText(waktu1);
                try{ sleep(1000); }
                catch(InterruptedException ex){
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex); } 
                } } }; p.start(); }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton dj;
    private rojeru_san.RSButton dk;
    private rojeru_san.RSButton exit;
    private rojeru_san.RSButton gk;
    private rojeru_san.RSButton hm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSButton lap;
    private rojeru_san.RSButton lk;
    private rojeru_san.RSButton minimize;
    public javax.swing.JPanel panel2;
    private javax.swing.JPanel panelmenu;
    // End of variables declaration//GEN-END:variables
}
