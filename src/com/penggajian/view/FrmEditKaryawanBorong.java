package com.penggajian.view;

import com.penggajian.control.CntlJenisBarang;
import com.penggajian.control.CntlKaryawanBorong;
import com.penggajian.control.CntlJabatan;
import com.penggajian.model.KaryawanBorong;
import com.penggajian.model.Jabatan;
import com.penggajian.model.JenisBarang;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rofiq
 */

public class FrmEditKaryawanBorong extends javax.swing.JFrame {

	private KaryawanBorong karyawanBorong;
        private List<Jabatan> lstJabatan;
        private List<JenisBarang> lstBarang;
        private CntlJenisBarang cntlBarang = new CntlJenisBarang();
        private CntlJabatan cntlJabatan = new CntlJabatan();
        private CntlKaryawanBorong cntlKaryawanBorong = new CntlKaryawanBorong();
        
        
	/**
	 * Creates new form FrmKaryawanBorong
	 */
	public FrmEditKaryawanBorong() {
		initComponents();
                initcombobox();
	}

        private void initcombobox(){
           
            
            lstJabatan = cntlJabatan.retrieve();
                for(Jabatan jabatan : lstJabatan){
                    cmbJabatan.addItem(jabatan.getNamaJabatan());
                } 
                
            lstBarang = cntlBarang.retrieve();
                for(JenisBarang barang : lstBarang){
                    cmbBarang.addItem(barang.getNamaBarang());
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
        cmbBarang = new javax.swing.JComboBox();
        txtNama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
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

        jLabel3.setText("Barang");

        jLabel13.setText("pedidikan");

        txtTanggal.setToolTipText("yyyy-mm-dd");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(91, 91, 91)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPenidikan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbAgama, 0, 95, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(btnSimpan)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 353, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 351, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmbJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(cmbPenidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cmbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cmbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(btnSimpan)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 247, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 247, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
		if (karyawanBorong == null) { // jika objek karyawanBorong null, maka bikin baru (tambah)
			karyawanBorong = new KaryawanBorong(); // inisialisasi KaryawanBorong
                    if (txtNama.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong!", "Peringatan", JOptionPane.ERROR_MESSAGE);
                        txtNama.requestFocus();
                        karyawanBorong = null;
                        return;
                    } else {
                        karyawanBorong.setNama(txtNama.getText());
                    }
                    if (txtNoTelp.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "No telpon tidak boleh kosong!", "Peringatan", JOptionPane.ERROR_MESSAGE);
                        txtNoTelp.requestFocus();
                        karyawanBorong = null;
                        return;
                    } else {
                        karyawanBorong.setNoTelp(txtNoTelp.getText());
                    }
                    if (txtAlamat.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong!", "Peringatan", JOptionPane.ERROR_MESSAGE);
                        txtAlamat.requestFocus();
                        karyawanBorong = null;
                        return;
                    } else {
                        karyawanBorong.setAlamat(txtAlamat.getText());
                    }
                        karyawanBorong.setJenisKelamin(cmbJenkel.getSelectedItem().toString());
                        karyawanBorong.setAgama(cmbAgama.getSelectedItem().toString());
                        karyawanBorong.setPendidikan(cmbPenidikan.getSelectedItem().toString());
//                        karyawanBorong.setNoTelp(Integer.parseInt(txtNoTelp.getText()));
//                        karyawanBorong.setAlamat(txtAlamat.getText());
                        karyawanBorong.setTanggalLahir(txtTanggal.getDate());
                        int idJabatan = 0;
                        int idBarang = 0;
                        for(JenisBarang barang : lstBarang){
                            if(barang.getNamaBarang().equals(cmbBarang.getSelectedItem().toString())){
                               idBarang = barang.getId();
                                break;
                            }
                        }
                        for(Jabatan jabatan : lstJabatan){
                            if(jabatan.getNamaJabatan().equals(cmbJabatan.getSelectedItem().toString())){
                                idJabatan = jabatan.getId();
                                
                                break;
                            }
                        }
                        cntlKaryawanBorong.insert(karyawanBorong, idJabatan, idBarang);
                        
		} else {
                    karyawanBorong.setNama(txtNama.getText());
                        karyawanBorong.setJenisKelamin(cmbJenkel.getSelectedItem().toString());
                        karyawanBorong.setAgama(cmbAgama.getSelectedItem().toString());
                        karyawanBorong.setPendidikan(cmbPenidikan.getSelectedItem().toString());
                        karyawanBorong.setNoTelp(txtNoTelp.getText());
                        karyawanBorong.setAlamat(txtAlamat.getText());
                        karyawanBorong.setTanggalLahir(txtTanggal.getDate());
                        int idJabatan = 0;
                        int idBarang = 0;
                        for(JenisBarang barang : lstBarang){
                            if(barang.getNamaBarang().equals(cmbBarang.getSelectedItem().toString())){
                               idBarang = barang.getId();
                                break;
                            }
                        }
                        for(Jabatan jabatan : lstJabatan){
                            if(jabatan.getNamaJabatan().equals(cmbJabatan.getSelectedItem().toString())){
                                idJabatan = jabatan.getId();
                                
                                break;
                            }
                        }
                        cntlKaryawanBorong.update(karyawanBorong, idJabatan, idBarang);
                        
		}
                
		this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNoTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelpKeyTyped
        if(txtNoTelp.getText().length()==13){
            evt.consume();
        }
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoTelpKeyTyped

	public void setKaryawanBorong(KaryawanBorong karyawanBorong) {
		this.karyawanBorong = karyawanBorong; //inisialisasi objek karyawan dg parameter 'karyawanBorong'
		txtNama.setText(karyawanBorong.getNama());
                txtTanggal.setDate(karyawanBorong.getTanggalLahir());
                txtAlamat.setText(karyawanBorong.getAlamat());
                txtNoTelp.setText(karyawanBorong.getNoTelp());
                for (int i = 0; i < cmbJenkel.getItemCount(); i++) {
                    if (cmbJenkel.getItemAt(i).equals(karyawanBorong.getJenisKelamin())) {
                        cmbJenkel.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbAgama.getItemCount(); i++) {
                    if (cmbAgama.getItemAt(i).equals(karyawanBorong.getAgama())) {
                        cmbAgama.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbPenidikan.getItemCount(); i++) {
                    if (cmbPenidikan.getItemAt(i).equals(karyawanBorong.getPendidikan())) {
                        cmbPenidikan.setSelectedIndex(i);
                    break;
                    }
                }  
                for (int i = 0; i < cmbJabatan.getItemCount(); i++){
                    if (cmbJabatan.getItemAt(i).equals(karyawanBorong.getJabatan().getNamaJabatan())){
                        cmbJabatan.setSelectedIndex(i);
                        break;
                    }
                }
                for (int i = 0; i < cmbBarang.getItemCount(); i++){
                    if (cmbBarang.getItemAt(i).equals(karyawanBorong.getJenisBarang().getNamaBarang())){
                        cmbBarang.setSelectedIndex(i);
                        break;
                    }
                }
                
                
  
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbAgama;
    private javax.swing.JComboBox cmbBarang;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables

    
}
