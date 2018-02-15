package com.penggajian.view;

import com.penggajian.control.CntlJenisBarang;
import com.penggajian.model.JenisBarang;
import java.util.List;


/**
 *
 * @author rofiq
 */
public class FrmEditJenisBarang extends javax.swing.JFrame {

	private CntlJenisBarang cntlPekerjaan = new CntlJenisBarang();
        private JenisBarang jenisBarang;

	/**
	 * Creates new form FrmEditJenisBarang
	 */
	public FrmEditJenisBarang() {
		initComponents();

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUpah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Jenis_Pekerjaan");

        jLabel3.setText("Gaji / barang");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSimpan)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUpah, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtNama))
                                .addGap(46, 46, 46))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 172, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 173, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUpah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
		if (jenisBarang == null) { // jika objek jenis Barang null, maka bikin baru (tambah)
			jenisBarang = new JenisBarang(); // inisialisasi JenisBarang
			jenisBarang.setNamaBarang(txtNama.getText()); // set nama Barang dengan isi txtNama
			jenisBarang.setGaji(Integer.parseInt(txtUpah.getText()));
			cntlPekerjaan.insert(jenisBarang);
		} else {
			jenisBarang.setNamaBarang(txtNama.getText()); // set nama barang dengan isi txtNama
			jenisBarang.setGaji(Integer.parseInt(txtUpah.getText()));
			cntlPekerjaan.update(jenisBarang);
		}

		this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

	public void setJenisBarang(JenisBarang barang) {
		this.jenisBarang = barang; //inisialisasi objek JenisBarang dg parameter jenisBarang
                txtUpah.setText(barang.getGaji().toString());
		txtNama.setText(barang.getNamaBarang()); //set txtNama
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtUpah;
    // End of variables declaration//GEN-END:variables
}
