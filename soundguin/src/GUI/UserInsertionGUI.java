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
public class UserInsertionGUI extends javax.swing.JFrame {
    
    Admin admin = new Admin();
    AdminGUI adminGUI;
    private int id;
    private int status;
    
    /**
     * Creates new form UserInsertionGUI
     */
    public UserInsertionGUI(AdminGUI adminGUI, int id, int status) {
        this.adminGUI = adminGUI;
        this.id = id;
        this.status = status;
        initComponents();
        
        if(status==1) {
            btnAdd.setText("Güncelle");
            setTitle("Kullanıcı Güncelle");
        }
    }
    
    public UserInsertionGUI() {
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUserInsertion = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblSname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblSubscription = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        fldSname = new javax.swing.JTextField();
        fldEmail = new javax.swing.JTextField();
        fldPassword = new javax.swing.JTextField();
        fldSubscription = new javax.swing.JTextField();
        fldCountry = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setTitle("Kullanıcı Ekle");
        setLocation(new java.awt.Point(575, 250));
        setResizable(false);

        pnlUserInsertion.setBackground(new java.awt.Color(153, 0, 153));

        lblName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Ad:");

        lblSname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSname.setForeground(new java.awt.Color(255, 255, 255));
        lblSname.setText("Soyad:");

        lblEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail:");

        lblPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Parola:");

        lblSubscription.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSubscription.setForeground(new java.awt.Color(255, 255, 255));
        lblSubscription.setText("Abonelik:");

        lblCountry.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblCountry.setForeground(new java.awt.Color(255, 255, 255));
        lblCountry.setText("Ülke:");

        fldName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fldSname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldSname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fldEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fldPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fldSubscription.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fldSubscription.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        javax.swing.GroupLayout pnlUserInsertionLayout = new javax.swing.GroupLayout(pnlUserInsertion);
        pnlUserInsertion.setLayout(pnlUserInsertionLayout);
        pnlUserInsertionLayout.setHorizontalGroup(
            pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInsertionLayout.createSequentialGroup()
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserInsertionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlUserInsertionLayout.createSequentialGroup()
                        .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserInsertionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSubscription, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlUserInsertionLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fldCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(fldSubscription, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldSname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldEmail))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserInsertionLayout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        pnlUserInsertionLayout.setVerticalGroup(
            pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInsertionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSname)
                    .addComponent(fldSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubscription)
                    .addComponent(fldSubscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInsertionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(fldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUserInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUserInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(status == 0) {
            boolean control = admin.insertUser(
                fldName.getText(), 
                fldSname.getText(), 
                fldEmail.getText(), 
                fldPassword.getText(), 
                Integer.parseInt(fldSubscription.getText()), 
                fldCountry.getText());
        
            if(control) {
                fldName.setText(null);
                fldSname.setText(null);
                fldEmail.setText(null);
                fldPassword.setText(null);
                fldSubscription.setText(null);
                fldCountry.setText(null);
            }
        } else if(status==1) {
            boolean control = admin.updateUser(
                id,
                fldName.getText(), 
                fldSname.getText(), 
                fldEmail.getText(), 
                fldPassword.getText(), 
                Integer.parseInt(fldSubscription.getText()), 
                fldCountry.getText());
        
            if(control) {
                fldName.setText(null);
                fldSname.setText(null);
                fldEmail.setText(null);
                fldPassword.setText(null);
                fldSubscription.setText(null);
                fldCountry.setText(null);
            }
        }
        
        
        adminGUI.updateUserTable();
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
            java.util.logging.Logger.getLogger(UserInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInsertionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInsertionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField fldCountry;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldPassword;
    private javax.swing.JTextField fldSname;
    private javax.swing.JTextField fldSubscription;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSname;
    private javax.swing.JLabel lblSubscription;
    private javax.swing.JPanel pnlUserInsertion;
    // End of variables declaration//GEN-END:variables
}
