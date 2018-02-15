package com.penggajian.view;

import com.penggajian.control.CntlGajiBorong;
import com.penggajian.model.GajiBorong;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
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
public class FrmGajiBorong extends javax.swing.JPanel {
        
    
    private List<GajiBorong> lstGaji;
    

    // <editor-fold defaultstate="collapsed" desc="Variable Print">
    koneksi koneksi = new koneksi();
    JasperDesign jasperDesign;
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    HashMap<String, Object> param = new HashMap<String, Object>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // </editor-fold>
        
    
	/**
	 * Creates new form FrmGajiBorong
	 */
	public FrmGajiBorong() {
            initComponents();
            initTable();
	}
	

	private void initTable() {
		DefaultTableModel model = new DefaultTableModel();
		String[] columnNames = {"Id", "Nama","Tanggal","jabatan","Jenis Barang","Tunjangan","Upah / Barang", "kuantity","Total"};
		model.setColumnIdentifiers(columnNames);
		tblDetailGaji.setModel(model);
		CntlGajiBorong cntlGaji = new CntlGajiBorong();
		lstGaji = cntlGaji.retrieve(); // panggil fungsi retrieve
                txtTotalOrang.setText(lstGaji.size() + "");
                int totalGaji = 0;
		for (GajiBorong gajiBorong : lstGaji) {
                    totalGaji = totalGaji + gajiBorong.getTotal();
			model.addRow(new Object[]{
				gajiBorong.getId(),
				gajiBorong.getKaryawanBorong().getNama(),
                                gajiBorong.getTanggal(),
                                gajiBorong.getJabatan().getNamaJabatan(),
                                gajiBorong.getJenisBarang().getNamaBarang(),
                                gajiBorong.getTunjangan(),
                                gajiBorong.getUpahBarang(),
                                gajiBorong.getKuantity(),
                                gajiBorong.getTotal()
			});
		}
                txtTotalGaji.setText(totalGaji + "");
	}
        
        private void searchByNama() {
		DefaultTableModel model = new DefaultTableModel();
		String[] columnNames = {"Id", "Nama","Tanggal","jabatan","Jenis Barang","Tunjangan","Upah / Barang", "kuantity","Total"};
		model.setColumnIdentifiers(columnNames);
		tblDetailGaji.setModel(model);
		CntlGajiBorong cntlGajiBorong = new CntlGajiBorong();
                Date awal = dateAwal.getDate();
                Date akhir = dateAkhir.getDate();
		lstGaji = cntlGajiBorong.getByNamaAwalAkhir(txtSearch.getText(), awal, akhir); // panggil fungsi retrieve
		txtTotalOrang.setText(lstGaji.size() + "");
                int totalGaji = 0;
                for (GajiBorong gajiBorong : lstGaji) {
                    totalGaji = totalGaji + gajiBorong.getTotal();
			model.addRow(new Object[]{
                            gajiBorong.getId(),
				gajiBorong.getKaryawanBorong().getNama(),
                                gajiBorong.getTanggal(),
                                gajiBorong.getJabatan().getNamaJabatan(),
                                gajiBorong.getJenisBarang().getNamaBarang(),
                                gajiBorong.getTunjangan(),
                                gajiBorong.getUpahBarang(),
                                gajiBorong.getKuantity(),
                                gajiBorong.getTotal()
			});
		}
                txtTotalGaji.setText(totalGaji + "");
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetailGaji = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dateAwal = new com.toedter.calendar.JDateChooser();
        dateAkhir = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalOrang = new javax.swing.JLabel();
        txtTotalGaji = new javax.swing.JLabel();
        btnReload1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAwal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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

        tblDetailGaji.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetailGaji);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 160));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 100, -1));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));
        add(dateAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));
        add(dateAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel2.setText("Total Gaji");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel3.setText("Total Orang");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtTotalOrang.setText("0");
        add(txtTotalOrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        txtTotalGaji.setText("0");
        add(txtTotalGaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        btnReload1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lporan.png"))); // NOI18N
        btnReload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReload1ActionPerformed(evt);
            }
        });
        add(btnReload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        jLabel5.setText("Tanggal Awal");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));
        add(txtAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		// TODO add your handling code here:
		FrmEditGajiBorong frmEditDetailGaji = new FrmEditGajiBorong(); // inisialisasi FrmEditGajiBorong
		frmEditDetailGaji.setTitle("Tambah Gaji"); // set Title FrmEditGajiBorong
		frmEditDetailGaji.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				initTable(); // ketika frmEditGajiBorong di tutup, refresh tabel
			}
		});
		frmEditDetailGaji.setVisible(true); // Menampilkan FrmEditGajiBOrong

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		if (tblDetailGaji.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih terlebih dahulu!");
		} else {
			GajiBorong detailGaji = lstGaji.get(tblDetailGaji.getSelectedRow());
			FrmEditGajiBorong frmEditDetailGaji = new FrmEditGajiBorong(); // insialisasi FrmEditGajiBorong
			frmEditDetailGaji.setTitle("Edit Data"); // set title frmEditGajiBorong
			frmEditDetailGaji.setGajiBorong(detailGaji);
			frmEditDetailGaji.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosed(WindowEvent e) {
					initTable(); // ketika frmEditGajiBorong di tutup, refresh tabel
				}
			});
			frmEditDetailGaji.setVisible(true);
		}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tblDetailGaji.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih terlebih dahulu!");
		} else {
			GajiBorong detailGaji = lstGaji.get(tblDetailGaji.getSelectedRow()); // mengambil data GajiBorong yang di select
			// memunculkan option dialog
			if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ini?", "Hapus Gaji", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				CntlGajiBorong cntlDetailGaji = new CntlGajiBorong(); // inisialisasi CntlGajiBorong
				cntlDetailGaji.delete(detailGaji.getId()); // panggil funsi hapus
				initTable(); // refresh tabel
			}
		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
		initTable();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchByNama();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReload1ActionPerformed
        try {
            File file = new File("./src/report/RptSlipGajiBorong.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.put("nama", txtSearch.getText().trim());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.getKoneksi());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnReload1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnReload1;
    private com.toedter.calendar.JDateChooser dateAkhir;
    private com.toedter.calendar.JDateChooser dateAwal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetailGaji;
    private javax.swing.JTextField txtAwal;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTotalGaji;
    private javax.swing.JLabel txtTotalOrang;
    // End of variables declaration//GEN-END:variables
}
