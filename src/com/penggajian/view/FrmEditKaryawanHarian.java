package com.penggajian.view;

import com.penggajian.control.CntlJabatan;
import com.penggajian.control.CntlKaryawanHarian;
import com.penggajian.model.Jabatan;
import com.penggajian.model.KaryawanHarian;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rofiq
 */

public class FrmEditKaryawanHarian extends javax.swing.JFrame {

	private KaryawanHarian karyawanHarian;
        private List<Jabatan> lstJabatan;
        private CntlJabatan cntlJabatan = new CntlJabatan();
        private CntlKaryawanHarian cntlKaryawanHarian = new CntlKaryawanHarian();
        
        
	/**
	 * Creates new form FrmKaryawanHarian
	 */
	public FrmEditKaryawanHarian() {
		initComponents();
                initcombobox();
	}

        private void initcombobox(){
           
            txtGaji.setText("");
            txtGaji.setEnabled(false);
            cmbGolongan.requestFocus();
            lstJabatan = cntlJabatan.retrieve();
                for(Jabatan jabatan : lstJabatan){
                    cmbJabatan.addItem(jabatan.getNamaJabatan());
                } 
        }
                
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbJabatan = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbGolongan = new javax.swing.JComboBox();
        txtNama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbJenkel = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cmbPenidikan = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cmbAgama = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtGaji = new javax.swing.JTextField();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtTanggalMasuk = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nama");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel9.setText("Form Karyawan");

        jLabel2.setText("Jabatan");

        jLabel3.setText("Golongan");

        cmbGolongan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GOL 1", "GOL 2", "GOL 3", "GOL 4" }));
        cmbGolongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGolonganActionPerformed(evt);
            }
        });

        jLabel13.setText("pedidikan");

        jLabel14.setText("Tanggal_lahir");

        cmbJenkel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki - laki", "Perempuan" }));

        jLabel15.setText("Jenis_kelamin");

        cmbPenidikan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SD", "SMP", "SMK", "S1" }));

        jLabel16.setText("Agama");

        cmbAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Katolik" }));

        jLabel5.setText("No Telp");

        txtNoTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoTelpKeyTyped(evt);
            }
        });

        jLabel6.setText("Alamat");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jLabel7.setText("Gaji/Hari");

        jLabel8.setText("Tanggal Masuk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPenidikan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAgama, 0, 75, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addComponent(jLabel2))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 360, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 358, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmbJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cmbPenidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtTanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cmbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(btnSimpan)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 259, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 258, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
	if (karyawanHarian == null) { // jika objek karyawan null, maka bikin baru (tambah)
            karyawanHarian = new KaryawanHarian(); // inisialisasi Karyawan
            if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong!","Peringatan",
                JOptionPane.ERROR_MESSAGE);
                txtNama.requestFocus();
                karyawanHarian = null;
                return;
            } else {
                karyawanHarian.setNama(txtNama.getText());
            }
            if(txtNoTelp.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No telpon tidak boleh kosong!","Peringatan", 
                JOptionPane.ERROR_MESSAGE);
                txtNoTelp.requestFocus();
                karyawanHarian = null;
                return;
            } else {
                karyawanHarian.setNoTelp(txtNoTelp.getText());
            }
            if(txtAlamat.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong!","Peringatan",
                JOptionPane.ERROR_MESSAGE);
                txtAlamat.requestFocus();
                karyawanHarian = null;
                return;
            } else {
                karyawanHarian.setAlamat(txtAlamat.getText());
            }
            karyawanHarian.setTanggalMasuk(txtTanggalMasuk.getDate());
            karyawanHarian.setJenisKelamin(cmbJenkel.getSelectedItem().toString());
            karyawanHarian.setAgama(cmbAgama.getSelectedItem().toString());
            karyawanHarian.setPendidikan(cmbPenidikan.getSelectedItem().toString());
            karyawanHarian.setTanggalLahir(txtTanggal.getDate());
            karyawanHarian.setGolongan(cmbGolongan.getSelectedItem().toString());
            karyawanHarian.setGajiPerHari(Integer.parseInt(txtGaji.getText()));
            for (Jabatan jabatan : lstJabatan) {
                if (jabatan.getNamaJabatan().equals(cmbJabatan.getSelectedItem().toString())) {
                    cntlKaryawanHarian.Insert(karyawanHarian, jabatan.getId());
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        } else {
            karyawanHarian.setNama(txtNama.getText());
            karyawanHarian.setJenisKelamin(cmbJenkel.getSelectedItem().toString());
            karyawanHarian.setAgama(cmbAgama.getSelectedItem().toString());
            karyawanHarian.setPendidikan(cmbPenidikan.getSelectedItem().toString());
            karyawanHarian.setTanggalMasuk(txtTanggalMasuk.getDate());
            karyawanHarian.setNoTelp(txtNoTelp.getText());
            karyawanHarian.setAlamat(txtAlamat.getText());
            karyawanHarian.setTanggalLahir(txtTanggal.getDate());
            karyawanHarian.setGolongan(cmbGolongan.getSelectedItem().toString());
            karyawanHarian.setGajiPerHari(Integer.parseInt(txtGaji.getText()));
            for (Jabatan jabatan : lstJabatan) {
                if (jabatan.getNamaJabatan().equals(cmbJabatan.getSelectedItem().toString())) {
                    cntlKaryawanHarian.update(karyawanHarian, jabatan.getId());
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, "Data berhasil diedit!");
        }

        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cmbGolonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGolonganActionPerformed
        int gaji = 0;
        if(cmbGolongan.getSelectedItem()== ""){
            txtGaji.setText("");
            txtGaji.setEnabled(false);
            cmbGolongan.requestFocus();
        } else {
            txtGaji.setEnabled(true);
            if(cmbGolongan.getSelectedItem()== "GOL 1"){
                gaji = 40000;
            } else if(cmbGolongan.getSelectedItem()== "GOL 2"){
                gaji = 50000;
            } else if(cmbGolongan.getSelectedItem()== "GOL 3"){
                gaji = 60000;
            } else if(cmbGolongan.getSelectedItem()== "GOL 4")
                gaji = 70000;
            txtGaji.setText(Integer.valueOf(gaji).toString());
        }
    }//GEN-LAST:event_cmbGolonganActionPerformed

    private void txtNoTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelpKeyTyped
        if(txtNoTelp.getText().length()==13){
            evt.consume();
        }
        int karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoTelpKeyTyped

	public void setKaryawanHarian(KaryawanHarian karyawanHarian) {
		this.karyawanHarian = karyawanHarian; //inisialisasi objek karyawan dg parameter 'karyawanHarian'
		txtNama.setText(karyawanHarian.getNama());
                txtTanggal.setDate(karyawanHarian.getTanggalLahir());
                txtTanggalMasuk.setDate(karyawanHarian.getTanggalMasuk());
                txtAlamat.setText(karyawanHarian.getAlamat());
                txtNoTelp.setText(karyawanHarian.getNoTelp());
                txtGaji.setText(karyawanHarian.getGajiPerHari().toString());
                for (int i = 0; i < cmbJenkel.getItemCount(); i++) {
                    if (cmbJenkel.getItemAt(i).equals(karyawanHarian.getJenisKelamin())) {
                        cmbJenkel.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbAgama.getItemCount(); i++) {
                    if (cmbAgama.getItemAt(i).equals(karyawanHarian.getAgama())) {
                        cmbAgama.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbPenidikan.getItemCount(); i++) {
                    if (cmbPenidikan.getItemAt(i).equals(karyawanHarian.getPendidikan())) {
                        cmbPenidikan.setSelectedIndex(i);
                    break;
                    }
                }  
                for (int i = 0; i < cmbJabatan.getItemCount(); i++){
                    if (cmbJabatan.getItemAt(i).equals(karyawanHarian.getJabatan().getNamaJabatan())){
                        cmbJabatan.setSelectedIndex(i);
                        break;
                    }
                }
                for (int i = 0; i < cmbGolongan.getItemCount(); i++){
                    if (cmbGolongan.getItemAt(i).equals(karyawanHarian.getGolongan())){
                        cmbGolongan.setSelectedIndex(i);
                        break;
                    }
                }
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbAgama;
    private javax.swing.JComboBox cmbGolongan;
    private javax.swing.JComboBox cmbJabatan;
    private javax.swing.JComboBox cmbJenkel;
    private javax.swing.JComboBox cmbPenidikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private com.toedter.calendar.JDateChooser txtTanggalMasuk;
    // End of variables declaration//GEN-END:variables

    
}
