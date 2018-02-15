package com.penggajian.control;

import com.penggajian.util.HibtUtil;
import com.penggajian.model.GajiBorong;
import com.penggajian.model.Jabatan;
import com.penggajian.model.JenisBarang;
import com.penggajian.model.KaryawanBorong;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rofiq
 */
public class CntlGajiBorong {

    private SessionFactory sessFact = HibtUtil.getSessionFactory();
    private Session session;
    private Transaction tr;

    /**
     * simpan gajiBorong ke database
     *
     * @param gajiBorong
     */
    public void insert(GajiBorong gajiBorong, Integer IdKaryawan, Integer IdJabatan, Integer IdJenisBarang) {
        session = sessFact.openSession(); //buka session
        tr = session.beginTransaction(); //mulai transaksi
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, IdJabatan); // cari gajiBorong di database berdasarkan idJabatan
        JenisBarang jenisBarang = (JenisBarang) session.load(JenisBarang.class, IdJenisBarang); // cari gajiBorong di database berdasarkan idJenisBarang
        KaryawanBorong karyawanBorong = (KaryawanBorong) session.load(KaryawanBorong.class, IdKaryawan); // cari gajiBorong di database berdasarkan idKaryawan
        gajiBorong.setKaryawanBorong(karyawanBorong);
        gajiBorong.setJabatan(jabatan);
        gajiBorong.setJenisBarang(jenisBarang);
        session.save(gajiBorong);  // simpan objek gajiBorong ke database
        tr.commit(); //commit/save
        session.close(); // tutup session
    }

    public void update(GajiBorong gajiBorong, Integer IdKaryawan, Integer IdJabatan, Integer IdJenisBarang) {
        session = sessFact.openSession(); // buka session database
        tr = session.beginTransaction(); //mulai transaction
        GajiBorong record = (GajiBorong) session.load(GajiBorong.class, gajiBorong.getId()); // cari gajiBorong di database berdasarkan idGajiBorong
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, IdJabatan);
        JenisBarang jenisBarang = (JenisBarang) session.load(JenisBarang.class, IdJenisBarang);
        KaryawanBorong karyawanBorong = (KaryawanBorong) session.load(KaryawanBorong.class, IdKaryawan);
        gajiBorong.setJabatan(jabatan);
        gajiBorong.setJenisBarang(jenisBarang);
        gajiBorong.setKaryawanBorong(karyawanBorong);
        gajiBorong.setTunjangan(gajiBorong.getTunjangan());
        gajiBorong.setUpahBarang(gajiBorong.getUpahBarang());
        gajiBorong.setTotal(gajiBorong.getTotal());
        gajiBorong.setTanggal(gajiBorong.getTanggal());
        gajiBorong.setKuantity(gajiBorong.getKuantity());
        tr.commit();
        session.close();
    }

    public void delete(Integer id) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        GajiBorong gajiBorong = (GajiBorong) session.load(GajiBorong.class, id);// cari di database berdasarkan id gaji borong
        session.delete(gajiBorong);
        tr.commit();
        session.close();
    }

    /**
     * retrieve data Gaji Borong dari database
     *
     * @return List<GajiBorong>
     */
    public List<GajiBorong> retrieve() {
        ArrayList<GajiBorong> listGajiBorong = new ArrayList<>(); // inisialisasi listGajiBorong
        session = sessFact.getCurrentSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from GajiBorong n JOIN FETCH n.karyawanBorong JOIN FETCH n.jabatan JOIN FETCH n.jenisBarang"); // ambil data gajiBorong dari database
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            GajiBorong gaji = (GajiBorong) it.next();
            listGajiBorong.add(gaji);
        }

        session.close(); //tutup session

        return listGajiBorong;
    }
    
    public List<GajiBorong> getByNamaAwalAkhir(String paramNama, Date awal, Date akhir) {
        ArrayList<GajiBorong> listGajiBorong = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String frmDate = format.parse(awal);
//        String enDate = format.parse(akhir);
        Query query = session.createQuery("from GajiBorong n JOIN FETCH n.karyawanBorong JOIN FETCH n.jabatan JOIN FETCH n.jenisBarang "
                + "where n.karyawanBorong.nama LIKE :paramNama "
                + "AND n.tanggal BETWEEN :awal AND :akhir");
        query.setParameter("paramNama", "%" + paramNama + "%");
        query.setParameter("awal", awal);
        query.setParameter("akhir", akhir);
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            GajiBorong gajiBorong = (GajiBorong) it.next();
            listGajiBorong.add(gajiBorong);
        }

        session.close(); //tutup session
        return listGajiBorong;
    }
    
    
}
