/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objects.Admin;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmet
 */
public class AdminGUI extends javax.swing.JFrame {
    
    static Admin admin = new Admin();
    private DefaultTableModel userModel = null;
    private Object[] userData = null;
    private DefaultTableModel songModel = null;
    private Object[] songData = null;
    private DefaultTableModel albumModel = null;
    private Object[] albumData = null;
    private DefaultTableModel artistModel = null;
    private Object[] artistData = null;
    UserInsertionGUI userInsertionGUI = new UserInsertionGUI(this);
    ArtistInsertionGUI artistInsertionGUI = new ArtistInsertionGUI(this);
    SongInsertionGUI songInsertionGUI = new SongInsertionGUI(this);
    AlbumInsertionGUI albumInsertionGUI = new AlbumInsertionGUI(this);
    
    /**
     * Creates new form AdminGUI
     */
    public AdminGUI() {
        initComponents();
        setUserModel();
        setArtistModel();
        setSongModel();
        setAlbumModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdmin = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlUsers = new javax.swing.JPanel();
        scrllUsers = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblLogo = new javax.swing.JLabel();
        btnInsertUser = new javax.swing.JButton();
        fldID = new javax.swing.JTextField();
        btnDeleteUser = new javax.swing.JButton();
        lblIDUser = new javax.swing.JLabel();
        pnlSongs = new javax.swing.JPanel();
        scrllSongs = new javax.swing.JScrollPane();
        tblSongs = new javax.swing.JTable();
        lblLogo1 = new javax.swing.JLabel();
        btnInsertSong = new javax.swing.JButton();
        fldIDSong = new javax.swing.JTextField();
        btnDeleteSong = new javax.swing.JButton();
        lblIDSong = new javax.swing.JLabel();
        pnlArtists = new javax.swing.JPanel();
        scrllArtists = new javax.swing.JScrollPane();
        tblArtists = new javax.swing.JTable();
        lblLogoArtist = new javax.swing.JLabel();
        btnInsertArtist = new javax.swing.JButton();
        fldIDArtist = new javax.swing.JTextField();
        btnDeleteArtist = new javax.swing.JButton();
        lblIDArtist = new javax.swing.JLabel();
        pnlAlbums = new javax.swing.JPanel();
        scrllAlbums = new javax.swing.JScrollPane();
        tblAlbums = new javax.swing.JTable();
        lblLogoAlbum = new javax.swing.JLabel();
        btnInsertAlbum = new javax.swing.JButton();
        fldIDAlbum = new javax.swing.JTextField();
        btnDeleteAlbum = new javax.swing.JButton();
        lblIDAlbum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soundguin  Admin");
        setLocation(new java.awt.Point(275, 75));
        setResizable(false);

        pnlAdmin.setBackground(new java.awt.Color(204, 0, 204));

        pnlUsers.setBackground(new java.awt.Color(153, 0, 153));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        scrllUsers.setViewportView(tblUsers);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmall.png"))); // NOI18N

        btnInsertUser.setText("Yeni Ekle");
        btnInsertUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertUserActionPerformed(evt);
            }
        });

        fldID.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        fldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDeleteUser.setText("Sil");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        lblIDUser.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblIDUser.setForeground(new java.awt.Color(255, 255, 255));
        lblIDUser.setText("ID:");

        javax.swing.GroupLayout pnlUsersLayout = new javax.swing.GroupLayout(pnlUsers);
        pnlUsers.setLayout(pnlUsersLayout);
        pnlUsersLayout.setHorizontalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrllUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGroup(pnlUsersLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertUser)))
                .addContainerGap())
        );
        pnlUsersLayout.setVerticalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLogo)
                        .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertUser)
                            .addComponent(fldID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteUser)))
                    .addComponent(lblIDUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrllUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kullanıcılar", pnlUsers);

        pnlSongs.setBackground(new java.awt.Color(153, 0, 153));

        tblSongs.setModel(new javax.swing.table.DefaultTableModel(
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
        scrllSongs.setViewportView(tblSongs);

        lblLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmall.png"))); // NOI18N

        btnInsertSong.setText("Yeni Ekle");
        btnInsertSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertSongActionPerformed(evt);
            }
        });

        fldIDSong.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        fldIDSong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDeleteSong.setText("Sil");
        btnDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSongActionPerformed(evt);
            }
        });

        lblIDSong.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblIDSong.setForeground(new java.awt.Color(255, 255, 255));
        lblIDSong.setText("ID:");

        javax.swing.GroupLayout pnlSongsLayout = new javax.swing.GroupLayout(pnlSongs);
        pnlSongs.setLayout(pnlSongsLayout);
        pnlSongsLayout.setHorizontalGroup(
            pnlSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSongsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrllSongs, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGroup(pnlSongsLayout.createSequentialGroup()
                        .addComponent(lblLogo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldIDSong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertSong)))
                .addContainerGap())
        );
        pnlSongsLayout.setVerticalGroup(
            pnlSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSongsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLogo1)
                        .addGroup(pnlSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertSong)
                            .addComponent(fldIDSong, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteSong)))
                    .addComponent(lblIDSong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrllSongs, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Şarkılar", pnlSongs);

        pnlArtists.setBackground(new java.awt.Color(153, 0, 153));

        tblArtists.setModel(new javax.swing.table.DefaultTableModel(
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
        scrllArtists.setViewportView(tblArtists);

        lblLogoArtist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmall.png"))); // NOI18N

        btnInsertArtist.setText("Yeni Ekle");
        btnInsertArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertArtistActionPerformed(evt);
            }
        });

        fldIDArtist.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        fldIDArtist.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDeleteArtist.setText("Sil");
        btnDeleteArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteArtistActionPerformed(evt);
            }
        });

        lblIDArtist.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblIDArtist.setForeground(new java.awt.Color(255, 255, 255));
        lblIDArtist.setText("ID:");

        javax.swing.GroupLayout pnlArtistsLayout = new javax.swing.GroupLayout(pnlArtists);
        pnlArtists.setLayout(pnlArtistsLayout);
        pnlArtistsLayout.setHorizontalGroup(
            pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrllArtists, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGroup(pnlArtistsLayout.createSequentialGroup()
                        .addComponent(lblLogoArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldIDArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertArtist)))
                .addContainerGap())
        );
        pnlArtistsLayout.setVerticalGroup(
            pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLogoArtist)
                        .addGroup(pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertArtist)
                            .addComponent(fldIDArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteArtist)))
                    .addComponent(lblIDArtist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrllArtists, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sanatçılar", pnlArtists);

        pnlAlbums.setBackground(new java.awt.Color(153, 0, 153));

        tblAlbums.setModel(new javax.swing.table.DefaultTableModel(
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
        scrllAlbums.setViewportView(tblAlbums);

        lblLogoAlbum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmall.png"))); // NOI18N

        btnInsertAlbum.setText("Yeni Ekle");
        btnInsertAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAlbumActionPerformed(evt);
            }
        });

        fldIDAlbum.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        fldIDAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDeleteAlbum.setText("Sil");
        btnDeleteAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAlbumActionPerformed(evt);
            }
        });

        lblIDAlbum.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblIDAlbum.setForeground(new java.awt.Color(255, 255, 255));
        lblIDAlbum.setText("ID:");

        javax.swing.GroupLayout pnlAlbumsLayout = new javax.swing.GroupLayout(pnlAlbums);
        pnlAlbums.setLayout(pnlAlbumsLayout);
        pnlAlbumsLayout.setHorizontalGroup(
            pnlAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlbumsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrllAlbums, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGroup(pnlAlbumsLayout.createSequentialGroup()
                        .addComponent(lblLogoAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fldIDAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertAlbum)))
                .addContainerGap())
        );
        pnlAlbumsLayout.setVerticalGroup(
            pnlAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlbumsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLogoAlbum)
                        .addGroup(pnlAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertAlbum)
                            .addComponent(fldIDAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteAlbum)))
                    .addComponent(lblIDAlbum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrllAlbums, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Albümler", pnlAlbums);

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertUserActionPerformed
        userInsertionGUI.setVisible(true);
    }//GEN-LAST:event_btnInsertUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        boolean control = admin.deleteUser(Integer.parseInt(fldID.getText()));
        updateUser();
        
        if(control) {
            fldID.setText(null);
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnInsertSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertSongActionPerformed
        songInsertionGUI.setVisible(true);
    }//GEN-LAST:event_btnInsertSongActionPerformed

    private void btnDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSongActionPerformed
        boolean control = admin.deleteSong(Integer.parseInt(fldIDSong.getText()));
        updateSong();
        
        if(control) {
            fldIDSong.setText(null);
        }
    }//GEN-LAST:event_btnDeleteSongActionPerformed

    private void btnInsertArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertArtistActionPerformed
        artistInsertionGUI.setVisible(true);
    }//GEN-LAST:event_btnInsertArtistActionPerformed

    private void btnDeleteArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteArtistActionPerformed
        boolean control = admin.deleteArtist(Integer.parseInt(fldIDArtist.getText()));
        updateArtist();
        
        if(control) {
            fldIDArtist.setText(null);
        }
    }//GEN-LAST:event_btnDeleteArtistActionPerformed

    private void btnInsertAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAlbumActionPerformed
        albumInsertionGUI.setVisible(true);
    }//GEN-LAST:event_btnInsertAlbumActionPerformed

    private void btnDeleteAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAlbumActionPerformed
        boolean control = admin.deleteAlbum(Integer.parseInt(fldIDAlbum.getText()));
        updateAlbum();
        
        if(control) {
            fldIDAlbum.setText(null);
        }
    }//GEN-LAST:event_btnDeleteAlbumActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }
    
    public void setUserModel() {
        userModel = new DefaultTableModel();
        Object[] colUser = new Object[7];
        colUser[0] = "ID";
        colUser[1] = "Ad";
        colUser[2] = "Soyad";
        colUser[3] = "E-mail";
        colUser[4] = "Parola";
        colUser[5] = "Abonelik";
        colUser[6] = "Ülke";
        
        userModel.setColumnIdentifiers(colUser);
        userData = new Object[7];
        for(int i=0; i<admin.getUserList().size(); i++) {
            userData[0] = admin.getUserList().get(i).getId();
            userData[1] = admin.getUserList().get(i).getName();
            userData[2] = admin.getUserList().get(i).getSname();
            userData[3] = admin.getUserList().get(i).getEmail();
            userData[4] = admin.getUserList().get(i).getPassword();
            for(int j=0; j<admin.getSubsTypeList().size(); j++) {
                if(admin.getSubsTypeList().get(j).getId() == admin.getUserList().get(i).getSubscription()) {
                    userData[5] = admin.getSubsTypeList().get(j).getName();
                }
            }
            userData[6] = admin.getUserList().get(i).getCountry();
            userModel.addRow(userData);
        }
            
        tblUsers.setModel(userModel);
    }
    
    public void setSongModel() {
        songModel = new DefaultTableModel();
        Object[] colSong = new Object[8];
        colSong[0] = "ID";
        colSong[1] = "Ad";
        colSong[2] = "Tarih";
        colSong[3] = "Sanatçı";
        colSong[4] = "Albüm";
        colSong[5] = "Tür";
        colSong[6] = "Süre";
        colSong[7] = "Dinleme";
        
        songModel.setColumnIdentifiers(colSong);
        songData = new Object[8];
        for(int i=0; i<admin.getSongList().size(); i++) {
            songData[0] = admin.getSongList().get(i).getId();
            songData[1] = admin.getSongList().get(i).getName();
            songData[2] = admin.getSongList().get(i).getDate();
            songData[3] = admin.getSongList().get(i).getArtistID();
            songData[4] = admin.getSongList().get(i).getAlbumID();
            songData[5] = admin.getSongList().get(i).getGenreID();
            songData[6] = admin.getSongList().get(i).getDuration();
            songData[7] = admin.getSongList().get(i).getPlays();

            songModel.addRow(songData);
        }
            
        tblSongs.setModel(songModel);
    }
    
    public void setAlbumModel() {
        albumModel = new DefaultTableModel();
        Object[] colAlbum = new Object[6];
        colAlbum[0] = "ID";
        colAlbum[1] = "Ad";
        colAlbum[2] = "Tarih";
        colAlbum[3] = "Şarkı";
        colAlbum[4] = "Sanatçı";
        colAlbum[5] = "Tür";
        
        albumModel.setColumnIdentifiers(colAlbum);
        albumData = new Object[6];
        for(int i=0; i<admin.getAlbumList().size(); i++) {
            albumData[0] = admin.getAlbumList().get(i).getId();
            albumData[1] = admin.getAlbumList().get(i).getName();
            albumData[2] = admin.getAlbumList().get(i).getDate();
            albumData[3] = admin.getAlbumList().get(i).getSongID();
            albumData[4] = admin.getAlbumList().get(i).getArtistID();
            albumData[5] = admin.getAlbumList().get(i).getGenreID();


            albumModel.addRow(albumData);
        }
            
        tblAlbums.setModel(albumModel);
    }
    
    public void setArtistModel() {
        artistModel = new DefaultTableModel();
        Object[] colArtist = new Object[4];
        colArtist[0] = "ID";
        colArtist[1] = "Ad";
        colArtist[2] = "Soyad";
        colArtist[3] = "Ülke";
        
        artistModel.setColumnIdentifiers(colArtist);
        artistData = new Object[4];
        for(int i=0; i<admin.getArtistList().size(); i++) {
            artistData[0] = admin.getArtistList().get(i).getId();
            artistData[1] = admin.getArtistList().get(i).getName();
            artistData[2] = admin.getArtistList().get(i).getSname();
            artistData[3] = admin.getArtistList().get(i).getCountry();
        
            artistModel.addRow(artistData);
        }
            
        tblArtists.setModel(artistModel);
    }
    
    public void updateUser() {
        DefaultTableModel clearModel = (DefaultTableModel)tblUsers.getModel();
        clearModel.setRowCount(0);
        
        for(int i=0; i<admin.getUserList().size(); i++) {
            userData[0] = admin.getUserList().get(i).getId();
            userData[1] = admin.getUserList().get(i).getName();
            userData[2] = admin.getUserList().get(i).getSname();
            userData[3] = admin.getUserList().get(i).getEmail();
            userData[4] = admin.getUserList().get(i).getPassword();
            userData[5] = admin.getUserList().get(i).getSubscription();
            userData[6] = admin.getUserList().get(i).getCountry();
            userModel.addRow(userData);
        }
    }
    
    public void updateArtist() {
        DefaultTableModel clearModel = (DefaultTableModel)tblArtists.getModel();
        clearModel.setRowCount(0);
        
        for(int i=0; i<admin.getArtistList().size(); i++) {
            artistData[0] = admin.getArtistList().get(i).getId();
            artistData[1] = admin.getArtistList().get(i).getName();
            artistData[2] = admin.getArtistList().get(i).getSname();
            artistData[3] = admin.getArtistList().get(i).getCountry();
            artistModel.addRow(artistData);
        }
    }
    
    public void updateSong() {
        DefaultTableModel clearModel = (DefaultTableModel)tblSongs.getModel();
        clearModel.setRowCount(0);
        
        for(int i=0; i<admin.getSongList().size(); i++) {
            songData[0] = admin.getSongList().get(i).getId();
            songData[1] = admin.getSongList().get(i).getName();
            songData[2] = admin.getSongList().get(i).getDate();
            songData[3] = admin.getSongList().get(i).getArtistID();
            songData[4] = admin.getSongList().get(i).getAlbumID();
            songData[5] = admin.getSongList().get(i).getGenreID();
            songData[6] = admin.getSongList().get(i).getDuration();
            songData[7] = admin.getSongList().get(i).getPlays();
            songModel.addRow(songData);
        }
    }
    
    public void updateAlbum() {
        DefaultTableModel clearModel = (DefaultTableModel)tblSongs.getModel();
        clearModel.setRowCount(0);
        
        for(int i=0; i<admin.getAlbumList().size(); i++) {
            albumData[0] = admin.getAlbumList().get(i).getId();
            albumData[1] = admin.getAlbumList().get(i).getName();
            albumData[2] = admin.getAlbumList().get(i).getDate();
            albumData[3] = admin.getAlbumList().get(i).getSongID();
            albumData[4] = admin.getAlbumList().get(i).getArtistID();
            albumData[5] = admin.getAlbumList().get(i).getGenreID();
            albumModel.addRow(albumData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAlbum;
    private javax.swing.JButton btnDeleteArtist;
    private javax.swing.JButton btnDeleteSong;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnInsertAlbum;
    private javax.swing.JButton btnInsertArtist;
    private javax.swing.JButton btnInsertSong;
    private javax.swing.JButton btnInsertUser;
    private javax.swing.JTextField fldID;
    private javax.swing.JTextField fldIDAlbum;
    private javax.swing.JTextField fldIDArtist;
    private javax.swing.JTextField fldIDSong;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIDAlbum;
    private javax.swing.JLabel lblIDArtist;
    private javax.swing.JLabel lblIDSong;
    private javax.swing.JLabel lblIDUser;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogoAlbum;
    private javax.swing.JLabel lblLogoArtist;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlAlbums;
    private javax.swing.JPanel pnlArtists;
    private javax.swing.JPanel pnlSongs;
    private javax.swing.JPanel pnlUsers;
    private javax.swing.JScrollPane scrllAlbums;
    private javax.swing.JScrollPane scrllArtists;
    private javax.swing.JScrollPane scrllSongs;
    private javax.swing.JScrollPane scrllUsers;
    private javax.swing.JTable tblAlbums;
    private javax.swing.JTable tblArtists;
    private javax.swing.JTable tblSongs;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}
