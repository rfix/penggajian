package com.penggajian.view;

import com.penggajian.control.CntlGajiHarian;
import com.penggajian.control.CntlJabatan;
import com.penggajian.control.CntlKaryawanHarian;
import com.penggajian.model.GajiHarian;
import com.penggajian.model.Jabatan;
import com.penggajian.model.KaryawanHarian;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rofiq
 */
public class FrmEditGajiHarian extends javax.swing.JFrame {

    private GajiHarian gajiHarian;
    private CntlGajiHarian cntlGaji = new CntlGajiHarian();
    private CntlKaryawanHarian cntlKaryawanHarian = new CntlKaryawanHarian();
    private CntlJabatan cntlJabatan = new CntlJabatan();
    private List<KaryawanHarian> lstKaryawan;
    private List<Jabatan> lstjabatan;

    LinkedHashMap<String, Jabatan> mapKaryawanJabatan = new LinkedHashMap<String, Jabatan>();
    LinkedHashMap<String, String> mapKaryawanGolongan = new LinkedHashMap<String, String>();

    /**
     * Creates new form FrmEditGajiHarian
     */
    public FrmEditGajiHarian() {
        initComponents();
        initcombobox(); // init combobox 
        init();
    }

    private void init() {
        /**
         * ini adalah listener untuk comboboxkaryawan listener yang berarti
         * mendengarkan mendengarkan perubahan value dari cmbKaryawan ketika
         * berubah valuenya, maka akan menjalankan kode dibawah ini
         *
         * ===== akan mengambil vaalue saat ini yang berarti mengambil nama
         * kemudian panggil setJabatan
         */
        cmbKaryawan.addItemListener((ItemEvent arg0) -> {
            String selectedValue = cmbKaryawan.getSelectedItem().toString(); // getkaryawayan yg dipilih(key)

            txtJabatan.setText(mapKaryawanJabatan.get(selectedValue).getNamaJabatan());
            txtTunjangan.setText(mapKaryawanJabatan.get(selectedValue).getGaji().toString());
            txtGolongan.setText(mapKaryawanGolongan.get(selectedValue));
            int gaji = 0;
            if (null != mapKaryawanGolongan.get(selectedValue)) switch (mapKaryawanGolongan.get(selectedValue)) {
                case "GOL 1":
                    gaji = 40000;
                    break;
                case "GOL 2":
                    gaji = 50000;
                    break;
                case "GOL 3":
                    gaji = 60000;
                    break;
                case "GOL 4":
                    gaji = 70000;
            }
            txtGajiPerHari.setText(gaji + "");
//            cmbGolongan.setSelectedItem(mapKaryawanJabatan.get(selectedValue).getNamaJabatan());

        });
    }

    private void hitungGaji() {
        int tunjangan;
        int gajiPerHari;
        int kuantity;
        int hasil;
        String total;

        tunjangan = Integer.valueOf(txtTunjangan.getText());
        gajiPerHari = Integer.valueOf(txtGajiPerHari.getText());
        kuantity = Integer.valueOf(txtKuantity.getText());
        hasil = gajiPerHari * kuantity + tunjangan;

        total = String.valueOf(hasil);
        txtTotal.setText(total);
    }

    private void initcombobox() {

        txtGajiPerHari.setText("");
        txtGajiPerHari.setEnabled(false);

        txtJabatan.setText("");
        txtJabatan.setEnabled(false);
        cmbKaryawan.requestFocus();
        lstjabatan = cntlJabatan.retrieve();
        for (Jabatan jabatan : lstjabatan) {
            txtJabatan.setText(jabatan.getNamaJabatan());
        }
        lstKaryawan = cntlKaryawanHarian.retrieve();
        for (KaryawanHarian karyawanHarian : lstKaryawan) {
            cmbKaryawan.addItem(karyawanHarian.getNama());
            mapKaryawanJabatan.put(karyawanHarian.getNama(), karyawanHarian.getJabatan());
            mapKaryawanGolongan.put(karyawanHarian.getNama(), karyawanHarian.getGolongan());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTunjangan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGajiPerHari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        cmbKaryawan = new javax.swing.JComboBox();
        txtJabatan = new javax.swing.JTextField();
        txtGolongan = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kuantity");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel5.setText("Karyawan");

        jLabel7.setText("Tanggal");

        jLabel2.setText("Jabatan");

        jLabel3.setText("Tunjangan ");

        jLabel6.setText("Gol");

        txtKuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKuantityKeyTyped(evt);
            }
        });

        jLabel8.setText("Gaji / Hari");

        jLabel9.setText("Total");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        cmbKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKaryawanActionPerformed(evt);
            }
        });

        txtGolongan.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtGolongan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtGajiPerHari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(69, 69, 69)
                .addComponent(btnHitung)
                .addGap(108, 108, 108))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 298, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 298, Short.MAX_VALUE)))
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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGajiPerHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHitung))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 187, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 188, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (gajiHarian == null) { // jika objek GajiHarian null, maka bikin baru (tambah)
            gajiHarian = new GajiHarian(); // inisialisasi GajiHarian
            gajiHarian.setKuantity(Integer.parseInt(txtKuantity.getText())); // set nama Kuantity dengan isi txtNama
            gajiHarian.setTanggal(txtTanggal.getDate());
            gajiHarian.setTotal(Integer.parseInt(txtTotal.getText()));
            gajiHarian.setTunjangan(Integer.parseInt(txtTunjangan.getText()));
            gajiHarian.setGolongan(txtGolongan.getText());
            gajiHarian.setGaji(Integer.parseInt(txtGajiPerHari.getText()));
            int idJabatan = 0;
            int idKaryawan = 0;

            for (Jabatan jabatan : lstjabatan) {
                if (jabatan.getNamaJabatan().equals(txtJabatan.getText())) {
                    idJabatan = jabatan.getId();
                    break;
                }
            }
            for (KaryawanHarian karyawanHarian : lstKaryawan) {
                if (karyawanHarian.getNama().equals(cmbKaryawan.getSelectedItem().toString())) {
                    idKaryawan = karyawanHarian.getId();

                    break;
                }
            } JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            cntlGaji.insert(gajiHarian,  idKaryawan,idJabatan );
        } else {
            gajiHarian.setKuantity(Integer.parseInt(txtKuantity.getText()));
            gajiHarian.setTanggal(txtTanggal.getDate());
            gajiHarian.setTotal(Integer.parseInt(txtTotal.getText()));
            gajiHarian.setTunjangan(Integer.parseInt(txtTunjangan.getText()));
            gajiHarian.setGolongan(txtGolongan.getText());
            gajiHarian.setGaji(Integer.parseInt(txtGajiPerHari.getText()));
            int idJabatan = 0;
            int idKaryawan = 0;
            for (Jabatan jabatan : lstjabatan) {
                if (jabatan.getNamaJabatan().equals(txtJabatan.getText())) {
                    idJabatan = jabatan.getId();
                    break;
                }
            }
            for (KaryawanHarian karyawanHarian : lstKaryawan) {
                if (karyawanHarian.getNama().equals(cmbKaryawan.getSelectedItem().toString())) {
                    idKaryawan = karyawanHarian.getId();
                    break;
                }
            } JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            cntlGaji.update(gajiHarian, idKaryawan, idJabatan);
        }

        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungGaji();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void txtKuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKuantityKeyTyped
        if (txtKuantity.getText().length() == 13) {
            evt.consume();
        }
        int karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtKuantityKeyTyped

    private void cmbKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKaryawanActionPerformed

    public void setGajiHarian(GajiHarian gaji) {
        this.gajiHarian = gaji; //inisialisasi objek gajiHarian dg parameter GajiHarian
        txtKuantity.setText(gaji.getKuantity().toString());
        txtTanggal.setDate(gaji.getTanggal());
        txtTunjangan.setText(gaji.getTunjangan().toString());
        txtGajiPerHari.setText(gaji.getGaji().toString());
        txtTotal.setText(gaji.getTotal().toString());
        txtGolongan.setText(gaji.getGolongan());
//        for (int i = 0; i < cmbGolongan.getItemCount(); i++) { //looping item dari cmbGolongan
//            if (cmbGolongan.getItemAt(i).equals(gaji.getGolongan())) {
//                cmbGolongan.setSelectedIndex(i); 
//                break;
//            }
//        }
        for (int i = 0; i < cmbKaryawan.getItemCount(); i++) { //looping item dari cmbKaryawanHarian
            if (cmbKaryawan.getItemAt(i).equals(gaji.getKaryawanHarian().getNama())) {
                cmbKaryawan.setSelectedIndex(i);
                break;
            }
        }
//        for (int i = 0; i < cmbJabatan.getItemCount(); i++) { //looping item dari cmbJabatan
//            if (cmbJabatan.getItemAt(i).equals(gaji.getJabatan().getNamaJabatan())) {
//                cmbJabatan.setSelectedIndex(i); 
//                break;
//            }
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cmbKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtGajiPerHari;
    private javax.swing.JTextField txtGolongan;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtKuantity;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTunjangan;
    // End of variables declaration//GEN-END:variables

}
