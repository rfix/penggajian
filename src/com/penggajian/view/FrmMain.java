/*
 * Intelectual Property of Panemu
 * http://panemu.com
 */
package com.penggajian.view;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rofiq
 */
public class FrmMain extends javax.swing.JFrame {
    private String peran ;

    /**
     * Creates new form FrmMain
     */
    public FrmMain(String peran) {
        initComponents();
        this.peran = peran;
        if (peran.equals("Keuangan")) {
            btnUser.setVisible(false);
            btnKaryawanHarian.setVisible(false);
            btnKaryawanBorong.setVisible(false);
        }


    }
    
    public void setBtnVisibility(){
         if (peran.equals("Keuangan")) {
            btnUser.setVisible(false);
            btnKaryawanHarian.setVisible(false);
            btnKaryawanBorong.setVisible(false);
        }else{
//              btnUser.setVisible(true);
            btnGajiHarian.setVisible(true);
            btnGajiBorong.setVisible(true);
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnKaryawanHarian = new usu.widget.ButtonGlass();
        btnJenisBarang = new usu.widget.ButtonGlass();
        btnKaryawanBorong = new usu.widget.ButtonGlass();
        btnGajiHarian = new usu.widget.ButtonGlass();
        btnJabatan = new usu.widget.ButtonGlass();
        btnGajiBorong = new usu.widget.ButtonGlass();
        btnUser = new usu.widget.ButtonGlass();
        btnLogout = new usu.widget.ButtonGlass();
        tabPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Sistem Informasi Penggajian\n");
        setBackground(new java.awt.Color(51, 0, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background2.png"))); // NOI18N

        btnKaryawanHarian.setText("Karyawan Harian");
        btnKaryawanHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaryawanHarianActionPerformed(evt);
            }
        });

        btnJenisBarang.setText("Jenis Barang");
        btnJenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJenisBarangActionPerformed(evt);
            }
        });

        btnKaryawanBorong.setText("Karyawan Borong");
        btnKaryawanBorong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaryawanBorongActionPerformed(evt);
            }
        });

        btnGajiHarian.setText("Gaji Harian");
        btnGajiHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGajiHarianActionPerformed(evt);
            }
        });

        btnJabatan.setText("Jabatan");
        btnJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJabatanActionPerformed(evt);
            }
        });

        btnGajiBorong.setText("Gaji Borong");
        btnGajiBorong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGajiBorongActionPerformed(evt);
            }
        });

        btnUser.setText("User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKaryawanHarian, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKaryawanBorong, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGajiHarian, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGajiBorong, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnKaryawanHarian, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnKaryawanBorong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnGajiHarian, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnGajiBorong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaryawanHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaryawanHarianActionPerformed
        JButton closeButton = new JButton("x");
        FrmKaryawanHarian frmKaryawanHarian = new FrmKaryawanHarian(); // inisialisasi FrmKaryawanHarian
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Karyawan Harian")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmKaryawanHarian); //masukkan ke tab
        tabPane.setSelectedComponent(frmKaryawanHarian);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmKaryawanHarian), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmKaryawanHarian);
            }
        });
    }//GEN-LAST:event_btnKaryawanHarianActionPerformed

    private void btnJenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJenisBarangActionPerformed
        JButton closeButton = new JButton("x");
        FrmJenisBarang frmJenisBarang = new FrmJenisBarang(); // inisialisasi FrmJenisBarang
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Jenis Barang")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmJenisBarang); //masukkan ke tab
        tabPane.setSelectedComponent(frmJenisBarang);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmJenisBarang), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmJenisBarang);
            }
        });
    }//GEN-LAST:event_btnJenisBarangActionPerformed

    private void btnKaryawanBorongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaryawanBorongActionPerformed
        JButton closeButton = new JButton("x");
        FrmKaryawanBorong frmKaryawanBorong = new FrmKaryawanBorong(); // inisialisasi FrmKaryawanBorong
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Karyawan Borong")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmKaryawanBorong); //masukkan ke tab
        tabPane.setSelectedComponent(frmKaryawanBorong);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmKaryawanBorong), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmKaryawanBorong);
            }
        });
    }//GEN-LAST:event_btnKaryawanBorongActionPerformed

    private void btnGajiHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGajiHarianActionPerformed
        JButton closeButton = new JButton("x");
        FrmGajiHarian frmGajiHarian = new FrmGajiHarian(); // inisialisasi FrmGajiHarian
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Gaji Harian")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmGajiHarian); //masukkan ke tab
        tabPane.setSelectedComponent(frmGajiHarian);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmGajiHarian), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmGajiHarian);
            }
        });
    }//GEN-LAST:event_btnGajiHarianActionPerformed

    private void btnJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJabatanActionPerformed
        JButton closeButton = new JButton("x");
        FrmJabatan frmJabatan = new FrmJabatan(); // inisialisasi FrmJabatan
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Jabatan")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmJabatan); //masukkan ke tab
        tabPane.setSelectedComponent(frmJabatan);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmJabatan), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmJabatan);
            }
        });
    }//GEN-LAST:event_btnJabatanActionPerformed

    private void btnGajiBorongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGajiBorongActionPerformed
        JButton closeButton = new JButton("x");
        FrmGajiBorong frmGajiBorong = new FrmGajiBorong(); // inisialisasi FrmGajiBorong
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Gaji Borong")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmGajiBorong); //masukkan ke tab
        tabPane.setSelectedComponent(frmGajiBorong);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmGajiBorong), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmGajiBorong);
            }
        });
    }//GEN-LAST:event_btnGajiBorongActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        JButton closeButton = new JButton("x");
        FrmUser frmUser = new FrmUser(); // inisialisasi FrmUser
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("User")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmUser); //masukkan ke tab
        tabPane.setSelectedComponent(frmUser);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmUser), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmUser);
            }
        });
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        FrmLogin frmLogin = new FrmLogin(this);
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {

            frmLogin.setVisible(true);
            btnKaryawanBorong.setVisible(false);
            btnKaryawanHarian.setVisible(false);
            btnJabatan.setVisible(false);
            btnJenisBarang.setVisible(false);
            btnGajiBorong.setVisible(false);
            btnGajiHarian.setVisible(false);
            btnUser.setVisible(false);

        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btnGajiBorong;
    private usu.widget.ButtonGlass btnGajiHarian;
    private usu.widget.ButtonGlass btnJabatan;
    private usu.widget.ButtonGlass btnJenisBarang;
    private usu.widget.ButtonGlass btnKaryawanBorong;
    private usu.widget.ButtonGlass btnKaryawanHarian;
    private usu.widget.ButtonGlass btnLogout;
    private usu.widget.ButtonGlass btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables
}
