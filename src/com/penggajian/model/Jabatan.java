package com.penggajian.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rofiq
 */
@Entity
@Table(name = "jabatan")
public class Jabatan implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 4)
    private int id;
    @Column(name = "nama_jabatan", length = 30)
    private String namaJabatan;
    @Column(name = "gaji", length = 10)
    private Integer gaji;
    @OneToMany(mappedBy = "jabatan")
    private List<GajiBorong> gajiborong;
    @OneToMany(mappedBy = "jabatan")
    private List<GajiHarian> GajiHarian;
    @OneToMany(mappedBy = "jabatan")
    private List<KaryawanHarian> karyawanHarian;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }

    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }

    public List<KaryawanHarian> getKaryawanHarian() {
        return karyawanHarian;
    }

    public void setKaryawanHarian(List<KaryawanHarian> karyawanHarian) {
        this.karyawanHarian = karyawanHarian;
    }

    public List<GajiHarian> getGajiHarian() {
        return GajiHarian;
    }

    public void setGajiHarian(List<GajiHarian> GajiHarian) {
        this.GajiHarian = GajiHarian;
    }

    public List<GajiBorong> getGajiborong() {
        return gajiborong;
    }

    public void setGajiborong(List<GajiBorong> gajiborong) {
        this.gajiborong = gajiborong;
    }
    
}
