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
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Proxy;

/**
 *
 * @author rofiq
 */
@Entity
@Table(name = "karyawanHarian")
@Proxy
public class KaryawanHarian implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
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
    @Column(name = "golongan")
    private String golongan;
    @Column(name = "gaji_harian")
    private Integer gajiPerHari;
    @Column(name = "tanggal_masuk")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalMasuk;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jabatan", referencedColumnName = "id")
    private Jabatan jabatan;
    @OneToMany(mappedBy = "karyawanHarian")
    private List<GajiHarian> gajiHarian;
    

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

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public Integer getGajiPerHari() {
        return gajiPerHari;
    }

    public void setGajiPerHari(Integer gajiPerHari) {
        this.gajiPerHari = gajiPerHari;
    }

    public List<GajiHarian> getGajiHarian() {
        return gajiHarian;
    }

    public void setGajiHarian(List<GajiHarian> gajiHarian) {
        this.gajiHarian = gajiHarian;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }
    
}
