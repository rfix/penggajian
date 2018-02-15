package com.penggajian.view;

import com.penggajian.control.CntlJenisBarang;
import com.penggajian.model.JenisBarang;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rofiq
 */
public class FrmJenisBarang extends javax.swing.JPanel {

	private List<JenisBarang> lstBarang;

	/**
	 * Creates new form FrmJenisBarang
	 */
	public FrmJenisBarang() {
		initComponents();
		initTable();
	}

        private void searchByNama() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Gaji"};
        model.setColumnIdentifiers(columnNames);
        tblJenisBarang.setModel(model);
        CntlJenisBarang cntlJenisBarang = new CntlJenisBarang();
        lstBarang = cntlJenisBarang.getByNama(txtSearch.getText()); // panggil fungsi retrieve
        for (JenisBarang jenisBarang : lstBarang) {
            model.addRow(new Object[]{
                jenisBarang.getId(),
                jenisBarang.getNamaBarang(),
                jenisBarang.getGaji(),
            });
        }
    }
        
	private void initTable() {
		DefaultTableModel model = new DefaultTableModel();  //bikin tabel model tblJenisBarang
		String[] columnNames = {"Id", "Nama", "Upah / Item"}; // kolom2nya
		model.setColumnIdentifiers(columnNames);
		tblJenisBarang.setModel(model); // set tabel model
		CntlJenisBarang cntlPekerjaan = new CntlJenisBarang(); // inisialisasi cntlJenisBarang
		lstBarang = cntlPekerjaan.retrieve(); // panggil fungsi retrieve
		for (JenisBarang jenisBarang : lstBarang) {
			model.addRow(new Object[]{
                           jenisBarang.getId(),
                           jenisBarang.getNamaBarang(),
                           jenisBarang.getGaji(),
                            
			});
		}
	}
        
       
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJenisBarang = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnCariKaryawan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(911, 731));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, -1));

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblJenisBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblJenisBarang);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 560, 110));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 90, -1));

        btnCariKaryawan.setText("Cari");
        btnCariKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKaryawanActionPerformed(evt);
            }
        });
        add(btnCariKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		FrmEditJenisBarang frmEditPekerjaan = new FrmEditJenisBarang(); // inisialisasi FrmEditJenisBarang
		frmEditPekerjaan.setTitle("Tambah Data JenisBarang"); // set Title FrmEditJenisBarang
		//listener frmEditGuru
		frmEditPekerjaan.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				initTable(); // ketika frmEditJenisBarang di tutup, refresh tabel
			}
		});
		frmEditPekerjaan.setVisible(true); // Menampilkan FrmEditJenisBarang

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		if (tblJenisBarang.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih terlebih dahulu");
		} else {
			JenisBarang jenis = lstBarang.get(tblJenisBarang.getSelectedRow()); // ambil data JenisBarang yang di select
			FrmEditJenisBarang frmEditJenisBarang = new FrmEditJenisBarang(); // insialisasi FrmEditJenisBarang
			frmEditJenisBarang.setTitle("Edit Data " + jenis.getId()); // set title frmEditJenisBarang
			frmEditJenisBarang.setJenisBarang(jenis); //set JenisBarang
			frmEditJenisBarang.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosed(WindowEvent e) {
					initTable(); // ketika frmEditJenisBarang di tutup, refresh tabel
				}
			});
			frmEditJenisBarang.setVisible(true);
		}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tblJenisBarang.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
		} else {
			JenisBarang jenis = lstBarang.get(tblJenisBarang.getSelectedRow()); // mengambil data JenisBarang yang di select
			// memunculkan option dialog
			if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ?" + jenis.getNamaBarang(), "Hapus Barang", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				CntlJenisBarang cntlPekerjaan = new CntlJenisBarang(); // inisialisasi CntlJenisBarang
				cntlPekerjaan.delete(jenis.getId()); // panggil funsi hapus
				initTable(); // refresh tabel
			}
		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
		initTable();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnCariKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKaryawanActionPerformed
        searchByNama();
    }//GEN-LAST:event_btnCariKaryawanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCariKaryawan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblJenisBarang;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
