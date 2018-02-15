package com.penggajian.view;


import com.penggajian.control.CntlGajiBorong;
import com.penggajian.control.CntlJabatan;
import com.penggajian.control.CntlJenisBarang;
import com.penggajian.model.GajiBorong;
import com.penggajian.model.KaryawanBorong;
import com.penggajian.control.CntlKaryawanBorong;
import com.penggajian.model.Jabatan;
import com.penggajian.model.JenisBarang;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author rofiq
 */
public class FrmEditGajiBorong extends javax.swing.JFrame {
        
    
	private GajiBorong gajiBorong;
        private CntlGajiBorong cntlGajiBorong = new CntlGajiBorong();
        private CntlKaryawanBorong cntlKaryawan = new CntlKaryawanBorong();
        private CntlJabatan cntlJabatan = new CntlJabatan();
        private CntlJenisBarang cntlJenisBarang = new CntlJenisBarang();
        private List<Jabatan> lstJabatan;
        private List<JenisBarang> lstJenisBarang;
        private List<KaryawanBorong> lstKaryawan;

        LinkedHashMap<String, Jabatan> mapKaryawanJabatan = new LinkedHashMap<String, Jabatan>();
        LinkedHashMap<String, JenisBarang> mapKaryawanJenisBarang = new LinkedHashMap<String, JenisBarang>();
	/**
	 * Creates new form FrmEditGajiBorong
	 */
	public FrmEditGajiBorong() {
		initComponents();
		initcombobox();
                init();
	}
        
        private void init() {
        /**
         * ini adalah listener untuk comboboxkaryawan
         * listener yang berarti mendengarkan
         * mendengarkan perubahan value dari cmbKaryawan
         * ketika berubah valuenya, maka akan menjalankan kode dibawah ini
         * 
         * =====
         * akan mengambil vaalue saat ini yang berarti mengambil nama
         * kemudian panggil setJabatan
         */
        cmbKaryawan.addItemListener((ItemEvent arg0) -> {
        String selectedValue = cmbKaryawan.getSelectedItem().toString(); // getkaryawayan yg dipilih(key)   
        
        cmbJabatan.setSelectedItem(mapKaryawanJabatan.get(selectedValue).getNamaJabatan());
        cmbJenisBarang.setSelectedItem(mapKaryawanJenisBarang.get(selectedValue).getNamaBarang());
        
        txtTunjangan.setText(mapKaryawanJabatan.get(selectedValue).getGaji().toString());
        
//        cmbJenisBarang.setSelectedItem(mapKaryawanJenisBarang.get(selectedValue).getNamaBarang());
        txtUpahBarang.setText(mapKaryawanJenisBarang.get(selectedValue).getGaji().toString());
            
        });
    }
        
        private void hitungGaji(){
            int tunjangan;
            int upahPerBarang;
            int kuantity;
            int hasil;
            String total;

            tunjangan = Integer.valueOf(txtTunjangan.getText());
            upahPerBarang = Integer.valueOf(txtUpahBarang.getText());
            kuantity = Integer.valueOf(txtKuantity.getText());
            hasil = upahPerBarang * kuantity + tunjangan;

            total = String.valueOf(hasil);
            txtTotalGaji.setText(total);
        }
	private void initcombobox() {
		
            lstJabatan = cntlJabatan.retrieve();
            for (Jabatan jabatan : lstJabatan) {
                cmbJabatan.addItem(jabatan.getNamaJabatan());
            }
            lstJenisBarang = cntlJenisBarang.retrieve();
            for (JenisBarang jenisBarang : lstJenisBarang) {
                cmbJenisBarang.addItem(jenisBarang.getNamaBarang());
            }
            lstKaryawan = cntlKaryawan.retrieve();
            for (KaryawanBorong karyawanBorong : lstKaryawan) {
                cmbKaryawan.addItem(karyawanBorong.getNama());
                mapKaryawanJabatan.put(karyawanBorong.getNama(), karyawanBorong.getJabatan());
                mapKaryawanJenisBarang.put(karyawanBorong.getNama(), karyawanBorong.getJenisBarang());
            }
            
	}
        
        
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKuantity = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbKaryawan = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cmbJabatan = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtTunjangan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbJenisBarang = new javax.swing.JComboBox();
        txtUpahBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalGaji = new javax.swing.JTextField();
        cmbHitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kuantity");

        txtKuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKuantityKeyTyped(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel5.setText("Karyawan");

        jLabel7.setText("Tanggal");

        jLabel6.setText("Jabatan");

        jLabel8.setText("Tunjangan ");

        jLabel9.setText("Upah / barang");

        jLabel10.setText("Jenis Barang");

        jLabel2.setText("Total Gaji");

        cmbHitung.setText("Hitung");
        cmbHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotalGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtKuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(40, 40, 40)
                                .addComponent(txtTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUpahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(63, 63, 63)
                .addComponent(cmbHitung)
                .addGap(212, 212, 212))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 276, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 276, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cmbKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtUpahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTotalGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbHitung)
                            .addComponent(btnSimpan))
                        .addContainerGap(47, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 213, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 212, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (gajiBorong == null) { // jika objek nilai null, maka bikin baru (tambah)
            gajiBorong = new GajiBorong(); // inisialisasi GajiBorong
            gajiBorong.setTanggal(txtTanggal.getDate());
            gajiBorong.setKuantity(Integer.parseInt(txtKuantity.getText()));
            gajiBorong.setTunjangan(Integer.parseInt(txtTunjangan.getText()));
            gajiBorong.setUpahBarang(Integer.parseInt(txtUpahBarang.getText()));
            gajiBorong.setTotal(Integer.parseInt(txtTotalGaji.getText()));
            int idKaryawan = 0;
            int idJabatan = 0;
            int idJenisBarang = 0;
            for (KaryawanBorong karyawan : lstKaryawan) {
                if (karyawan.getNama().equals(cmbKaryawan.getSelectedItem().toString())) {
                    idKaryawan = karyawan.getId();
                    break;
                }
            }
            for (Jabatan jabatan : lstJabatan) {
                if (jabatan.getNamaJabatan().equals(cmbJabatan.getSelectedItem().toString())) {
                    idJabatan = jabatan.getId();
                    break;
                }
            }
            for (JenisBarang jenisBarang : lstJenisBarang) {
                if (jenisBarang.getNamaBarang().equals(cmbJenisBarang.getSelectedItem().toString())) {
                    idJenisBarang = jenisBarang.getId();
                    break;
                }
            }
            cntlGajiBorong.insert(gajiBorong, idKaryawan, idJabatan, idJenisBarang);
        } else {
            gajiBorong.setTanggal(txtTanggal.getDate());
            gajiBorong.setKuantity(Integer.parseInt(txtKuantity.getText()));
            gajiBorong.setTunjangan(Integer.parseInt(txtTunjangan.getText()));
            gajiBorong.setUpahBarang(Integer.parseInt(txtUpahBarang.getText()));
            gajiBorong.setTotal(Integer.parseInt(txtTotalGaji.getText()));
            int idKaryawan = 0;
            int idJabatan = 0;
            int idJenisBarang = 0;
            for (KaryawanBorong karyawan : lstKaryawan) {
                if (karyawan.getNama().equals(cmbKaryawan.getSelectedItem().toString())) {
                    idKaryawan = karyawan.getId();
                    break;
                }
            }
            for (Jabatan jabatan : lstJabatan) {
                if (jabatan.getNamaJabatan().equals(cmbJabatan.getSelectedItem().toString())) {
                    idJabatan = jabatan.getId();
                    break;
                }
            }
            for (JenisBarang jenisBarang : lstJenisBarang) {
                if (jenisBarang.getNamaBarang().equals(cmbJenisBarang.getSelectedItem().toString())) {
                    idJenisBarang = jenisBarang.getId();
                    break;
                }
            }
            cntlGajiBorong.update(gajiBorong, idKaryawan, idJabatan, idJenisBarang);
        }
        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cmbHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHitungActionPerformed
        hitungGaji();
    }//GEN-LAST:event_cmbHitungActionPerformed

    private void txtKuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKuantityKeyTyped
        if(txtKuantity.getText().length()==13){
            evt.consume();
        }
        int karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtKuantityKeyTyped

	public void setGajiBorong(GajiBorong gaji) {
		this.gajiBorong = gaji; //inisialisasi objek GajiBorong dg parameter GajiBorong
                txtKuantity.setText(gaji.getKuantity().toString());
                txtTanggal.setDate(gaji.getTanggal());
                txtTunjangan.setText(gaji.getTunjangan().toString());
                txtUpahBarang.setText(gaji.getUpahBarang().toString());
                txtTotalGaji.setText(gaji.getTotal().toString());
		for (int i = 0; i < cmbKaryawan.getItemCount(); i++) { //looping item dari cmbKaryawanHarian
			if (cmbKaryawan.getItemAt(i).equals(gaji.getKaryawanBorong().getNama())) {
				cmbKaryawan.setSelectedIndex(i); 
				break;
			}
		}
                for (int i = 0; i < cmbJabatan.getItemCount(); i++) { //looping item dari cmbJabatan
			if (cmbJabatan.getItemAt(i).equals(gaji.getJabatan().getNamaJabatan())) {
				cmbJabatan.setSelectedIndex(i); 
				break;
			}
		}
                for (int i = 0; i < cmbJenisBarang.getItemCount(); i++) { //looping item dari cmbJenisBarang
			if (cmbJenisBarang.getItemAt(i).equals(gaji.getJenisBarang().getNamaBarang())) {
				cmbJenisBarang.setSelectedIndex(i); 
				break;
			}
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton cmbHitung;
    private javax.swing.JComboBox cmbJabatan;
    private javax.swing.JComboBox cmbJenisBarang;
    private javax.swing.JComboBox cmbKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtKuantity;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtTotalGaji;
    private javax.swing.JTextField txtTunjangan;
    private javax.swing.JTextField txtUpahBarang;
    // End of variables declaration//GEN-END:variables

}
