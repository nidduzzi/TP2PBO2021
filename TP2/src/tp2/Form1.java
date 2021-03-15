/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
    
    public Form1() {
        initComponents();
        this.formPanel = new FormPanel();
        this.tablePanel = new TablePanel();
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
        tb_info = new javax.swing.JButton();
        bt_table = new javax.swing.JButton();
        dynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(375, 520));
        setMinimumSize(new java.awt.Dimension(375, 500));
        setPreferredSize(new java.awt.Dimension(375, 500));
        setResizable(false);

        navbar.setMaximumSize(new java.awt.Dimension(375, 100));
        navbar.setPreferredSize(new java.awt.Dimension(375, 100));

        bt_form.setText("Form");
        bt_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_formMouseClicked(evt);
            }
        });

        tb_info.setText("Info");
        tb_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_infoMouseClicked(evt);
            }
        });

        bt_table.setText("Table");
        bt_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_tableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(bt_form)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_table)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tb_info)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_form)
                    .addComponent(bt_table)
                    .addComponent(tb_info))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dynamicPanel.setMaximumSize(new java.awt.Dimension(375, 400));
        dynamicPanel.setPreferredSize(new java.awt.Dimension(375, 400));

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
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
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_formMouseClicked
        // TODO add your handling code here:
        this.formPanel.setVisible(true);
        this.tablePanel.setVisible(false);
        this.infoPanel.setVisible(false);
    }//GEN-LAST:event_bt_formMouseClicked

    private void bt_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_tableMouseClicked
        // TODO add your handling code here:
        this.formPanel.setVisible(false);
        this.tablePanel.setVisible(true);
        this.infoPanel.setVisible(false);
    }//GEN-LAST:event_bt_tableMouseClicked

    private void tb_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_infoMouseClicked
        // TODO add your handling code here:
        this.formPanel.setVisible(false);
        this.tablePanel.setVisible(false);
        this.infoPanel.setVisible(true);
    }//GEN-LAST:event_tb_infoMouseClicked

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
    private javax.swing.JButton bt_form;
    private javax.swing.JButton bt_table;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JPanel navbar;
    private javax.swing.JButton tb_info;
    // End of variables declaration//GEN-END:variables
}