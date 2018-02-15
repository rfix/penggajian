package com.penggajian.view;

import com.penggajian.control.CntlGajiHarian;
import com.penggajian.model.GajiHarian;
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
public class FrmGajiHarian extends javax.swing.JPanel {
    
//    CntlGajiHarian cntlGajiHarian = new CntlGajiHarian();
    private List<GajiHarian> lstGajiHarian;
    
       
    // <editor-fold defaultstate="collapsed" desc="Variable Print">
    koneksi koneksi = new koneksi();
    JasperDesign jasperDesign;
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    HashMap<String, Object> param = new HashMap<String, Object>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // </editor-fold>
    
	/**
	 * Creates new form FrmGajiHarian
	 */
	public FrmGajiHarian() {
            initComponents();
            initTable();
	}

    private void initTable() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Tanggal", "Jabatan", "Golongan", 
            "Tunjangan", "Kuantity", "Gaji/hari", "Total"};
        model.setColumnIdentifiers(columnNames);
        tblDetailGaji.setModel(model);
        CntlGajiHarian cntlGajiHarian = new CntlGajiHarian();
        lstGajiHarian = cntlGajiHarian.retrieve(); // panggil fungsi retrieve
        txtTotalOrang.setText(lstGajiHarian.size() + "");
        int totalGaji = 0;
        for (GajiHarian gajiHarian : lstGajiHarian) {
            totalGaji = totalGaji + gajiHarian.getTotal();
            model.addRow(new Object[]{
                gajiHarian.getId(),
                gajiHarian.getKaryawanHarian().getNama(),
                gajiHarian.getTanggal(),
                gajiHarian.getJabatan().getNamaJabatan(),
                gajiHarian.getGolongan(),
                gajiHarian.getTunjangan(),
                gajiHarian.getKuantity(),
                gajiHarian.getGaji(),
                gajiHarian.getTotal()
            });
        }

        txtTotalGaji.setText(totalGaji + "");
    }
        
    private void searchByNama() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Tanggal", "Jabatan", "Golongan", 
            "Tunjangan", "Kuantity", "Gaji/hari", "Total"};
        model.setColumnIdentifiers(columnNames);
        tblDetailGaji.setModel(model);
        CntlGajiHarian cntlGajiHarian = new CntlGajiHarian();
        Date awal = dateAwal.getDate();
        Date akhir = dateAkhir.getDate();
        lstGajiHarian = cntlGajiHarian.getByNamaAwalAkhir(txtSearch.getText(), awal, akhir); // panggil fungsi retrieve
        txtTotalOrang.setText(lstGajiHarian.size() + "");
        int totalGaji = 0;
        for (GajiHarian gajiHarian : lstGajiHarian) {
            totalGaji = totalGaji + gajiHarian.getTotal();
            model.addRow(new Object[]{
                gajiHarian.getId(),
                gajiHarian.getKaryawanHarian().getNama(),
                gajiHarian.getTanggal(),
                gajiHarian.getJabatan().getNamaJabatan(),
                gajiHarian.getGolongan(),
                gajiHarian.getTunjangan(),
                gajiHarian.getKuantity(),
                gajiHarian.getGaji(),
                gajiHarian.getTotal()
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetailGaji = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnCariKaryawan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotalOrang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalGaji = new javax.swing.JLabel();
        dateAwal = new com.toedter.calendar.JDateChooser();
        dateAkhir = new com.toedter.calendar.JDateChooser();
        btnReload = new javax.swing.JButton();
        CetakSlip = new javax.swing.JButton();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel9 = new javax.swing.JLabel();
        btnPrintReport = new javax.swing.JButton();
        txtAkhir = new javax.swing.JTextField();
        txtAwal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1001, 200));

        tblDetailGaji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDetailGaji);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 910, 160));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, -1));

        btnCariKaryawan.setText("Cari");
        btnCariKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKaryawanActionPerformed(evt);
            }
        });
        add(btnCariKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel2.setText("Total Orang");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtTotalOrang.setText("0");
        add(txtTotalOrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 60, 10));

        jLabel3.setText("Total Gaji");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtTotalGaji.setText("0");
        add(txtTotalGaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 80, -1));
        add(dateAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));
        add(dateAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        CetakSlip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lporan.png"))); // NOI18N
        CetakSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakSlipActionPerformed(evt);
            }
        });
        add(CetakSlip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Contoh: 2017/12/01");

        btnPrintReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jasper.png"))); // NOI18N
        btnPrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReportActionPerformed(evt);
            }
        });

        jLabel4.setText("Tgl Akhir");

        jLabel5.setText("Tgl Awal");

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                        .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAkhir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 310, 200));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		// TODO add your handling code here:
		FrmEditGajiHarian frmEditDetailGaji = new FrmEditGajiHarian(); // inisialisasi FrmEditGajiHarian
		frmEditDetailGaji.setTitle("Tambah Gaji"); // set Title FrmEditGajiHarian
		frmEditDetailGaji.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				initTable(); // ketika frmEditNilai di tutup, refresh tabel
			}
		});
		frmEditDetailGaji.setVisible(true); // Menampilkan FrmEditGajiHarian

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		if (tblDetailGaji.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih Nilai terlebih dahulu");
		} else {
			GajiHarian detailGaji = lstGajiHarian.get(tblDetailGaji.getSelectedRow());
			FrmEditGajiHarian frmEditDetailGaji = new FrmEditGajiHarian(); // insialisasi FrmEditGajiHarian
			frmEditDetailGaji.setTitle("Edit Data"); // set title frmEditGajiHarian
			frmEditDetailGaji.setGajiHarian(detailGaji);
			frmEditDetailGaji.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosed(WindowEvent e) {
					initTable(); // ketika frmEditGajiHarian di tutup, refresh tabel
				}
			});
			frmEditDetailGaji.setVisible(true);
		}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tblDetailGaji.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih Nilai terlebih dahulu");
		} else {
			GajiHarian detailGaji = lstGajiHarian.get(tblDetailGaji.getSelectedRow()); // mengambil data GajiHarian yang di select
			// memunculkan option dialog
			if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ini?", "Hapus Gaji", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				CntlGajiHarian cntlDetailGaji = new CntlGajiHarian(); // inisialisasi CntlGajiHarian
				cntlDetailGaji.delete(detailGaji.getId()); // panggil fungsi hapus
				initTable(); // refresh tabel
			}
		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCariKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKaryawanActionPerformed
        searchByNama();
    }//GEN-LAST:event_btnCariKaryawanActionPerformed

    private void btnPrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReportActionPerformed
        try {
            File file = new File("./src/report/RptGajiHarian.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.put("TglAwal", txtAwal.getText().trim());
            param.put("TglAkhir", txtAkhir.getText().trim());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.getKoneksi());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnPrintReportActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CetakSlip;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCariKaryawan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.JButton btnReload;
    private com.toedter.calendar.JDateChooser dateAkhir;
    private com.toedter.calendar.JDateChooser dateAwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private javax.swing.JTable tblDetailGaji;
    private javax.swing.JTextField txtAkhir;
    private javax.swing.JTextField txtAwal;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTotalGaji;
    private javax.swing.JLabel txtTotalOrang;
    // End of variables declaration//GEN-END:variables
}
