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
@Table(name = "gaji_harian")
public class GajiHarian implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "kuantity")
    private Integer kuantity;
//    @Column(name = "jabatan")
//    private String jabatan;
    @Column(name = "tunjangan")
    private Integer tunjangan;
    @Column(name = "gaji")
    private Integer gaji;
    @Column(name = "golongan")
    private String golongan;
    @Column(name = "total")
    private Integer total;
    @Column(name = "tanggal")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jabatan")
    private Jabatan jabatan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_harian")
    private KaryawanHarian karyawanHarian;

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

    public KaryawanHarian getKaryawanHarian() {
        return karyawanHarian;
    }

    public void setKaryawanHarian(KaryawanHarian karyawanHarian) {
        this.karyawanHarian = karyawanHarian;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public Integer getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Integer tunjangan) {
        this.tunjangan = tunjangan;
    }


    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
}
