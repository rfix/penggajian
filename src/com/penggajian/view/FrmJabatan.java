package com.penggajian.view;

import com.penggajian.control.CntlJabatan;
import com.penggajian.model.Jabatan;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksiReport.koneksi;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rofiq
 */
public class FrmJabatan extends javax.swing.JPanel {

	private List<Jabatan> lstjabatan;

        // <editor-fold defaultstate="collapsed" desc="Variable Print">
    CntlJabatan cntlJabatan = new CntlJabatan();
    koneksi koneksi = new koneksi();
    JasperDesign jasperDesign;
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    HashMap<String, Object> param = new HashMap<String, Object>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // </editor-fold>
	/**
	 * Creates new form FrmJabatan
	 */
	public FrmJabatan() {
		initComponents();
		initTable();
	}
        
    private void searchByNama() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Tunjangan"};
        model.setColumnIdentifiers(columnNames);
        tblJabatan.setModel(model);
        CntlJabatan cntlJabatan = new CntlJabatan();
        lstjabatan = cntlJabatan.getByNama(txtSearch.getText()); // panggil fungsi retrieve
        for (Jabatan jabatan : lstjabatan) {
            model.addRow(new Object[]{
                jabatan.getId(),
                jabatan.getNamaJabatan(),
                jabatan.getGaji()
            });
        }
    }
        
	private void initTable() {
		DefaultTableModel model = new DefaultTableModel();  //bikin tabel model tblJabatan
		String[] columnNames = {"Id" ,"nama", "Tunjangan"}; // kolom2nya
		model.setColumnIdentifiers(columnNames);
		tblJabatan.setModel(model); // set tabel model
		CntlJabatan cntlJabatan = new CntlJabatan();
		lstjabatan = cntlJabatan.retrieve(); // panggil fungsi retrieve
		for (Jabatan jabatan : lstjabatan) {
			model.addRow(new Object[]{
                            jabatan.getId(),
                            jabatan.getNamaJabatan(),
                            jabatan.getGaji()
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJabatan = new javax.swing.JTable();
        CetakSlip = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnCariKaryawan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(911, 731));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 40, -1));

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 40, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblJabatan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblJabatan);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 130));

        CetakSlip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lporan.png"))); // NOI18N
        CetakSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakSlipActionPerformed(evt);
            }
        });
        add(CetakSlip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 50, 30));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 90, -1));

        btnCariKaryawan.setText("Cari");
        btnCariKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKaryawanActionPerformed(evt);
            }
        });
        add(btnCariKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		FrmEditJabatan frmjabEditJabatan = new FrmEditJabatan(); // inisialisasi FrmEditJabatan
		frmjabEditJabatan.setTitle("Tambah Data Gaji"); // set Title FrmEditJabatan
		//listener frmEditJabatan
		frmjabEditJabatan.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				initTable(); // ketika frmEditJabatan di tutup, refresh tabel
			}
		});
		frmjabEditJabatan.setVisible(true); // Menampilkan FrmEditJabatan

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		if (tblJabatan.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih terlebih dahulu");
		} else {
			Jabatan jabatan= lstjabatan.get(tblJabatan.getSelectedRow()); // ambil data jabatan yang di select
			FrmEditJabatan frmEditJabatan = new FrmEditJabatan(); // insialisasi FrmEditJabatan
			frmEditJabatan.setTitle("Edit Data " + jabatan.getId()); // set title frmEditJabatan
			frmEditJabatan.setJabatan(jabatan); //set jabatan
			frmEditJabatan.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosed(WindowEvent e) {
					initTable(); // ketika frmEditJabatan di tutup, refresh tabel
				}
			});
			frmEditJabatan.setVisible(true);
		}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tblJabatan.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
		} else {
			Jabatan jabatan = lstjabatan.get(tblJabatan.getSelectedRow()); // mengambil data jabatan yang di select
			// memunculkan option dialog
			if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ?" + jabatan.getNamaJabatan(), "Hapus Jabatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				CntlJabatan cntlJabatan = new CntlJabatan(); // inisialisasi CntlJabatan
				cntlJabatan.delete(jabatan.getId()); // panggil funsi hapus
				initTable(); // refresh tabel
			}
		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
		initTable();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void CetakSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakSlipActionPerformed
        try {
            File file = new File("./src/report/RptSlipGajiHarian.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.put("nama", txtSearch.getText().trim());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.getKoneksi());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_CetakSlipActionPerformed

    private void btnCariKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKaryawanActionPerformed
        searchByNama();
    }//GEN-LAST:event_btnCariKaryawanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CetakSlip;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCariKaryawan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblJabatan;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
