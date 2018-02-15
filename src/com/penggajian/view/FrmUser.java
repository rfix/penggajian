package com.penggajian.view;

import com.penggajian.control.CntlUser;
import com.penggajian.model.User;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rofiq
 */
public class FrmUser extends javax.swing.JPanel {

	private List<User> lstUser;

	/**
	 * Creates new form FrmUser
	 */
	public FrmUser() {
		initComponents();
		initTable();
	}

    private void initTable() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Username", "Peran"};
        model.setColumnIdentifiers(columnNames);
        tblUser.setModel(model);
        CntlUser cntlUser = new CntlUser();
        lstUser = cntlUser.retrieve(); // panggil fungsi retrieve
        for (User user : lstUser) {
            model.addRow(new Object[]{
                user.getId(),
                user.getNama(),
                user.getUsername(),
                user.getPeran()
            });
        }
    }

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(911, 731));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1001, 200));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Kelas", "Grade"
            }
        ));
        jScrollPane1.setViewportView(tblUser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		// TODO add your handling code here:
		FrmEditUser frmEditUser = new FrmEditUser(); // inisialisasi FrmEditUser
		frmEditUser.setTitle("Tambah Data User"); // set Title FrmEditUser
		frmEditUser.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				initTable(); // ketika frmEditUser di tutup, refresh tabel
			}
		});
		frmEditUser.setVisible(true); // Menampilkan FrmEditUser

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		if (tblUser.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih User terlebih dahulu");
		} else {
			User user = lstUser.get(tblUser.getSelectedRow());
			FrmEditUser frmEditUser = new FrmEditUser(); // insialisasi FrmEditUser
			frmEditUser.setTitle("Edit Data " + user.getNama()); // set title frmEditUser
			frmEditUser.setUser(user);
			frmEditUser.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosed(WindowEvent e) {
					initTable(); // ketika frmEditUser di tutup, refresh tabel
				}
			});
			frmEditUser.setVisible(true);
		}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tblUser.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih User terlebih dahulu");
		} else {
			User user = lstUser.get(tblUser.getSelectedRow()); // mengambil data User yang di select
			// memunculkan option dialog
			if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ?" + user.getNama(), "Hapus User", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				CntlUser cntluser = new CntlUser(); // inisialisasi CntlUser
				cntluser.delete(user.getId()); // panggil funsi hapus
				initTable(); // refresh tabel
			}
		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
		initTable();
    }//GEN-LAST:event_btnReloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
