package com.penggajian.view;

import com.penggajian.control.CntlKaryawanHarian;
import com.penggajian.model.KaryawanHarian;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
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
public class FrmKaryawanHarian extends javax.swing.JPanel {
    
    CntlKaryawanHarian cntlKaryawanHarian = new CntlKaryawanHarian();
    private List<KaryawanHarian> lstHarian;
    private DefaultTableModel dtm;
    private int baris;
    private String proses;
    
    // <editor-fold defaultstate="collapsed" desc="Variable Print">
    koneksi koneksi = new koneksi();
    JasperDesign jasperDesign;
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    HashMap<String, Object> param = new HashMap<String, Object>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // </editor-fold>

    private void refresTabel(){
        dtm = (DefaultTableModel) tblKaryawan.getModel();
        dtm.setRowCount(0);
        for(KaryawanHarian harian : lstHarian){
            dtm.addRow(new Object[]{
                harian.getId(),
                harian.getNama(),
                harian.getJenisKelamin(),
                harian.getAgama(),
                harian.getNoTelp(),
                harian.getPendidikan(),
                harian.getAlamat(),
                harian.getJabatan().getNamaJabatan(),
                harian.getTanggalMasuk(),
                harian.getGolongan(),
                harian.getGajiPerHari()
            });
        }
        if (tblKaryawan.getRowCount() > 0){
            baris = tblKaryawan.getRowCount() - 1;
            tblKaryawan.setRowSelectionInterval(baris, baris);
            proses = "";
        }
    }
    /**
     * Creates new form FrmKaryawanHarian
     */
    public FrmKaryawanHarian() {
        initComponents();
        initTable();
    }

    private void initTable() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Jenis Kelamin", "Tanggal Lahir", 
            "Agama", "No Telp", "Pendidikan", "Alamat", "Jabatan", "Tanggal Masuk",
            "Golongan", "Gaji"};
        model.setColumnIdentifiers(columnNames);
        tblKaryawan.setModel(model);
        CntlKaryawanHarian cntlKaryawanHarian = new CntlKaryawanHarian();
        lstHarian = cntlKaryawanHarian.retrieve(); // panggil fungsi retrieve
        for (KaryawanHarian harian : lstHarian) {
            model.addRow(new Object[]{
                harian.getId(),
                harian.getNama(),
                harian.getJenisKelamin(),
                harian.getTanggalLahir(),
                harian.getAgama(),
                harian.getNoTelp(),
                harian.getPendidikan(),
                harian.getAlamat(),
                harian.getJabatan().getNamaJabatan(),
                harian.getTanggalMasuk(),
                harian.getGolongan(),
                harian.getGajiPerHari()
            });
        }
    }

    private void searchByNama() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Id", "Nama", "Jenis Kelamin", "Tanggal Lahir", 
            "Agama", "No Telp", "Pendidikan", "Alamat", "Jabatan", "Tanggal Masuk", 
            "Golongan", "Gaji"};
        model.setColumnIdentifiers(columnNames);
        tblKaryawan.setModel(model);
        CntlKaryawanHarian cntlKaryawanHarian = new CntlKaryawanHarian();
        lstHarian = cntlKaryawanHarian.getByNama(txtSearchNama.getText()); // panggil fungsi retrieve
        for (KaryawanHarian harian : lstHarian) {
            model.addRow(new Object[]{
                harian.getId(),
                harian.getNama(),
                harian.getJenisKelamin(),
                harian.getTanggalLahir(),
                harian.getAgama(),
                harian.getNoTelp(),
                harian.getPendidikan(),
                harian.getAlamat(),
                harian.getJabatan().getNamaJabatan(),
                harian.getTanggalMasuk(),
                harian.getGolongan(),
                harian.getGajiPerHari()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReload1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        txtSearchNama = new javax.swing.JTextField();
        btnSearchByNama = new javax.swing.JButton();
        btnPrintReport = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(911, 731));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 30));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 30));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, 30));

        btnReload1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnReload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReload1ActionPerformed(evt);
            }
        });
        add(btnReload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblKaryawan);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1010, 160));

        txtSearchNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchNamaFocusLost(evt);
            }
        });
        txtSearchNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchNamaKeyTyped(evt);
            }
        });
        add(txtSearchNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, -1));

        btnSearchByNama.setText("Cari");
        btnSearchByNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNamaActionPerformed(evt);
            }
        });
        add(btnSearchByNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        btnPrintReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jasper.png"))); // NOI18N
        btnPrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReportActionPerformed(evt);
            }
        });
        add(btnPrintReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1290, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        FrmEditKaryawanHarian frmEditKaryawanHarian = new FrmEditKaryawanHarian(); // inisialisasi FrmEditKaryawan
        frmEditKaryawanHarian.setTitle("Tambah Data Karyawan Harian"); // set Title FrmEditKaryawan
        frmEditKaryawanHarian.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                initTable(); // ketika frmEditKaryawan di tutup, refresh tabel
            }
        });
        frmEditKaryawanHarian.setVisible(true); // Menampilkan FrmEditKaryawanHarian

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (tblKaryawan.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
            JOptionPane.showMessageDialog(this, "Silahkan pilih Karyawan terlebih dahulu");
        } else {
            KaryawanHarian karyawanHarian = lstHarian.get(tblKaryawan.getSelectedRow()); // ambil data karyawanHarian yang di select
            FrmEditKaryawanHarian frmEditKaryawanHarian = new FrmEditKaryawanHarian(); // insialisasi FrmEditKaryawanHarian
            frmEditKaryawanHarian.setTitle("Edit Data " + karyawanHarian.getNama()); // set title frmEditKaryawanHarian

            frmEditKaryawanHarian.setKaryawanHarian(karyawanHarian); // set karyawan yang mau diedit
            frmEditKaryawanHarian.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    initTable(); // ketika frmEditKaryawan di tutup, refresh tabel
                }
            });
            frmEditKaryawanHarian.setVisible(true); //menampilkan frmEditKaryawanHarian
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tblKaryawan.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
            JOptionPane.showMessageDialog(this, "Silahkan pilih Karyawan terlebih dahulu");
        } else {
            KaryawanHarian karyawanHarian = lstHarian.get(tblKaryawan.getSelectedRow()); // mengambil data KaryawanHarian yang di select
            // memunculkan option dialog
            if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ?" + karyawanHarian.getNama(), "Hapus Karyawan", 
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                CntlKaryawanHarian cntlKaryawanHarian = new CntlKaryawanHarian(); // inisialisasi CntlKaryawanHarian
                cntlKaryawanHarian.delete(karyawanHarian.getId()); // panggil funsi hapus
                initTable(); // refresh tabel
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReload1ActionPerformed
        initTable();
    }//GEN-LAST:event_btnReload1ActionPerformed

    private void btnSearchByNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNamaActionPerformed
        lstHarian = cntlKaryawanHarian.getByNama(txtSearchNama.getText().trim());
        searchByNama();
    }//GEN-LAST:event_btnSearchByNamaActionPerformed

    private void btnPrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReportActionPerformed
        try {
            File file = new File("./src/report/RptKaryawanHarian.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.put("nama", txtSearchNama.getText().trim());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.getKoneksi());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnPrintReportActionPerformed

    private void txtSearchNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNamaFocusGained
       String s = txtSearchNama.getText();
       if (s.equalsIgnoreCase("Cari....")){
           txtSearchNama.setText("");
        }
    }//GEN-LAST:event_txtSearchNamaFocusGained

    private void txtSearchNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNamaFocusLost
        if (txtSearchNama.getText().equalsIgnoreCase("")){
           txtSearchNama.setText("Cari....");
           txtSearchNama.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtSearchNamaFocusLost

    private void txtSearchNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNamaKeyTyped
        lstHarian = cntlKaryawanHarian.getByNama(txtSearchNama.getText().trim());
        searchByNama();
    }//GEN-LAST:event_txtSearchNamaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.JButton btnReload1;
    private javax.swing.JButton btnSearchByNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTextField txtSearchNama;
    // End of variables declaration//GEN-END:variables
}
