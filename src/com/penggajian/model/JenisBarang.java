package com.penggajian.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "jenisBarang")
public class JenisBarang implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 4)
    private int id;
    @Column(name = "nama_barang", length = 30)
    private String namaBarang;
    @Column(name = "gaji", length = 10)
    private Integer gaji;
    @OneToMany(mappedBy = "jenisBarang")
    private List<GajiBorong> gajiBorong;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jenisBarang")
    private List<KaryawanBorong> karyawanBorong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }

    public List<GajiBorong> getGajiBorong() {
        return gajiBorong;
    }

    public void setGajiBorong(List<GajiBorong> gajiBorong) {
        this.gajiBorong = gajiBorong;
    }

    public List<KaryawanBorong> getKaryawanBorong() {
        return karyawanBorong;
    }

    public void setKaryawanBorong(List<KaryawanBorong> karyawanBorong) {
        this.karyawanBorong = karyawanBorong;
    }
    
}
