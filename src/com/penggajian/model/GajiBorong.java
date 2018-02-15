package com.penggajian.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author rofiq
 */
@Entity
@Table(name = "gaji_borong")
public class GajiBorong implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 4)
    private int id;
    @Column(name = "kuantity", length = 7)
    private Integer kuantity;
    @Column(name = "tunjangan")
    private Integer tunjangan;
    @Column(name = "upah_barang")
    private Integer upahBarang;
    @Column(name = "total")
    private Integer total;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jabatan")
    private Jabatan jabatan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_barang")
    private JenisBarang jenisBarang;
    @Column(name = "tanggal")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_borong", referencedColumnName = "id")
    private KaryawanBorong karyawanBorong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getKuantity() {
        return kuantity;
    }

    public void setKuantity(Integer kuantity) {
        this.kuantity = kuantity;
    }


    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public KaryawanBorong getKaryawanBorong() {
        return karyawanBorong;
    }

    public void setKaryawanBorong(KaryawanBorong karyawanBorong) {
        this.karyawanBorong = karyawanBorong;
    }

    public Integer getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Integer tunjangan) {
        this.tunjangan = tunjangan;
    }

    public Integer getUpahBarang() {
        return upahBarang;
    }

    public void setUpahBarang(Integer upahBarang) {
        this.upahBarang = upahBarang;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
    
}
