package com.penggajian.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Proxy;

/**
 *
 * @author rofiq
 */
@Entity
@Table(name = "karyawanBorong")
@Proxy(lazy = true)
public class KaryawanBorong implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "tanggal_lahir")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalLahir;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "agama")
    private String agama;
    @Column(name = "no_telp")
    private String noTelp;
    @Column(name = "pendidikan")
    private String pendidikan;
    @Column(name = "alamat")
    private String alamat;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jabatan", referencedColumnName = "id")
    private Jabatan jabatan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_barang", referencedColumnName = "id")
    private JenisBarang jenisBarang;
    @OneToMany(mappedBy = "karyawanBorong")
    private List<GajiBorong> gajiBorong;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public JenisBarang getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(JenisBarang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

   

    public List<GajiBorong> getGajiBorong() {
        return gajiBorong;
    }

    public void setGajiBorong(List<GajiBorong> gajiBorong) {
        this.gajiBorong = gajiBorong;
    }
    
}
