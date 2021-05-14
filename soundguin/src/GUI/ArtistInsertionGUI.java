/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objects.Admin;

/**
 *
 * @author ahmet
 */
public class ArtistInsertionGUI extends javax.swing.JFrame {

    Admin admin = new Admin();
    AdminGUI adminGUI;
    
    /**
     * Creates new form ArtistInsertionGUI
     */
    public ArtistInsertionGUI(AdminGUI adminGUI) {
        this.adminGUI = adminGUI;
        initComponents();
    }
    
    public ArtistInsertionGUI() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlArtistInsertion = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblSname = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        fldSname = new javax.swing.JTextField();
        fldCountry = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setTitle("Sanatçı Ekle");
        setLocation(new java.awt.Point(575, 250));
        setPreferredSize(new java.awt.Dimension(363, 323));
        setResizable(false);

        pnlArtistInsertion.setBackground(new java.awt.Color(153, 0, 153));

        lblName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Ad:");

        lblSname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSname.setForeground(new java.awt.Color(255, 255, 255));
        lblSname.setText("Soyad:");

        lblCountry.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblCountry.setForeground(new java.awt.Color(255, 255, 255));
        lblCountry.setText("Ülke:");

        fldName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fldSname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldSname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fldCountry.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldCountry.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAdd.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnAdd.setText("Ekle");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmall.png"))); // NOI18N

        javax.swing.GroupLayout pnlArtistInsertionLayout = new javax.swing.GroupLayout(pnlArtistInsertion);
        pnlArtistInsertion.setLayout(pnlArtistInsertionLayout);
        pnlArtistInsertionLayout.setHorizontalGroup(
            pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistInsertionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlArtistInsertionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArtistInsertionLayout.createSequentialGroup()
                        .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlArtistInsertionLayout.createSequentialGroup()
                        .addComponent(lblSname, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fldSname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(fldName, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlArtistInsertionLayout.setVerticalGroup(
            pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistInsertionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSname)
                    .addComponent(fldSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArtistInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addGap(63, 63, 63)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlArtistInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlArtistInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        boolean control = admin.insertArtist(
            fldName.getText(),
            fldSname.getText(),
            fldCountry.getText());

        if(control) {
            fldName.setText(null);
            fldSname.setText(null);
            fldCountry.setText(null);
        }

        adminGUI.updateArtistTable();
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(ArtistInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArtistInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArtistInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArtistInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArtistInsertionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField fldCountry;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldSname;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSname;
    private javax.swing.JPanel pnlArtistInsertion;
    // End of variables declaration//GEN-END:variables
}
