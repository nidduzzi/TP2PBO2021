/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author ahmad
 */
public class Form1 extends javax.swing.JFrame {

    FormPanel formPanel;
    TablePanel tablePanel;
    InfoPanel infoPanel;
    GridBagLayout layout = new GridBagLayout();
    /**
     * Creates new form Form1
     */
    private DatasourceFactory DSF;
    private DataSource ds;
    private Connection con;

    public Form1() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        this.DSF = new DatasourceFactory();
        this.ds = DSF.getMySQLDataSource();
        try {
            this.con = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.formPanel = new FormPanel(this.con, this);
        this.tablePanel = new TablePanel(this.con, this);
        this.infoPanel = new InfoPanel();
        this.dynamicPanel.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        this.dynamicPanel.add(this.formPanel, c);
        c.gridx = 0;
        c.gridy = 0;
        this.dynamicPanel.add(this.tablePanel, c);
        c.gridx = 0;
        c.gridy = 0;
        this.dynamicPanel.add(this.infoPanel, c);
        this.formPanel.setVisible(false);
        this.tablePanel.setVisible(false);
        this.infoPanel.setVisible(false);
        this.bt_table.setVisible(false);
        this.bt_info.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new javax.swing.JPanel();
        bt_form = new javax.swing.JButton();
        bt_info = new javax.swing.JButton();
        bt_table = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dynamicPanel = new javax.swing.JPanel();
        lb_welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 506));
        setResizable(false);

        navbar.setMaximumSize(new java.awt.Dimension(375, 100));
        navbar.setPreferredSize(new java.awt.Dimension(375, 100));

        bt_form.setText("Form");
        bt_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_formMouseClicked(evt);
            }
        });

        bt_info.setText("Info");
        bt_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_infoMouseClicked(evt);
            }
        });

        bt_table.setText("Table");
        bt_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_tableMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Code Pro Light", 0, 18)); // NOI18N
        jLabel1.setText("SISTEM PENDATAAN MOBIL BARBAR.CO");

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(bt_form)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_table)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_info))
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_form)
                    .addComponent(bt_table)
                    .addComponent(bt_info))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dynamicPanel.setMaximumSize(new java.awt.Dimension(375, 400));
        dynamicPanel.setPreferredSize(new java.awt.Dimension(375, 400));

        lb_welcome.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lb_welcome.setText("Welcome!");

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dynamicPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lb_welcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dynamicPanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(lb_welcome)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_formMouseClicked
        // TODO add your handling code here:
        this.lb_welcome.setVisible(false);
        this.formPanel.setVisible(true);
        this.tablePanel.setVisible(false);
        this.infoPanel.setVisible(false);
    }//GEN-LAST:event_bt_formMouseClicked

    private void bt_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_tableMouseClicked
        // TODO add your handling code here:
        this.tablePanel.refreshData();
        this.formPanel.setVisible(false);
        this.tablePanel.setVisible(true);
        this.infoPanel.setVisible(false);
    }//GEN-LAST:event_bt_tableMouseClicked

    private void bt_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_infoMouseClicked
        // TODO add your handling code here:
        this.formPanel.setVisible(false);
        this.tablePanel.setVisible(false);
        this.infoPanel.setVisible(true);
    }//GEN-LAST:event_bt_infoMouseClicked

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt_form;
    public javax.swing.JButton bt_info;
    public javax.swing.JButton bt_table;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_welcome;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables
}
