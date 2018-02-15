package com.penggajian.control;

import com.penggajian.util.HibtUtil;
import com.penggajian.model.GajiHarian;
import com.penggajian.model.Jabatan;
import com.penggajian.model.KaryawanHarian;
import java.text.SimpleDateFormat;
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
public class CntlGajiHarian {

    private SessionFactory sessFact = HibtUtil.getSessionFactory();
    private Session session;
    private Transaction tr;

    /**
     * simpan gajiHarian ke database
     *
     * @param gajiHarian
     */
    public void insert(GajiHarian gajiHarian, Integer idKaryawan, Integer idJabatan) {
        session = sessFact.openSession(); //buka session
        tr = session.beginTransaction(); //mulai transaksi
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, idJabatan); // cari gajiHarian di database berdasarkan idJabatan
        KaryawanHarian karyawanHarian = (KaryawanHarian) session.load(KaryawanHarian.class, idKaryawan); //cari gajiHarian di database berdasarkan idKaryawan
        gajiHarian.setKaryawanHarian(karyawanHarian);
        gajiHarian.setJabatan(jabatan);
        session.save(gajiHarian);  // simpan objek gajiHarian ke database
        tr.commit(); //commit/save
        session.close(); // tutup session
    }

    public void update(GajiHarian gajiHarian, Integer idKaryawan, Integer idJabatan) {
        session = sessFact.openSession(); // buka session database
        tr = session.beginTransaction(); //mulai transaction
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, idJabatan);
        KaryawanHarian karyawanHarian = (KaryawanHarian) session.load(KaryawanHarian.class, idKaryawan);
        GajiHarian record = (GajiHarian) session.load(GajiHarian.class, gajiHarian.getId());
        record.setKaryawanHarian(karyawanHarian);
        record.setJabatan(jabatan);
        record.setTunjangan(gajiHarian.getTunjangan());
        record.setKuantity(gajiHarian.getKuantity());
        record.setTanggal(gajiHarian.getTanggal());
        record.setGolongan(gajiHarian.getGolongan());
        record.setTotal(gajiHarian.getTotal());
        record.setGaji(gajiHarian.getGaji());
        tr.commit();
        session.close();
    }

    public void delete(Integer id) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        GajiHarian gajiHarian = (GajiHarian) session.load(GajiHarian.class, id); // cari di database berdasarkan id guru
        session.delete(gajiHarian);
        tr.commit();
        session.close();
    }

    /**
     * retrieve data Gaji Harian dari database
     *
     * @return List<GajiHarian>
     */
    public List<GajiHarian> retrieve() {
        ArrayList<GajiHarian> listGajiHarian = new ArrayList<>(); // inisialisasi listKaryawan
        session = sessFact.getCurrentSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from GajiHarian n JOIN FETCH n.karyawanHarian JOIN FETCH n.jabatan"); // ambil data gajiHarian dari database
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            GajiHarian detailGaji = (GajiHarian) it.next();
            listGajiHarian.add(detailGaji);
        }

        session.close(); //tutup session

        return listGajiHarian;
    }

    public List<GajiHarian> getByNamaAwalAkhir(String paramNama, Date awal, Date akhir) {
        ArrayList<GajiHarian> listGajiHarian = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String frmDate = format.parse(awal);
//        String enDate = format.parse(akhir);
        Query query = session.createQuery("from GajiHarian n JOIN FETCH n.karyawanHarian JOIN FETCH n.jabatan "
                + "where n.karyawanHarian.nama LIKE :paramNama "
                + "AND n.tanggal BETWEEN :awal AND :akhir");
        query.setParameter("paramNama", "%" + paramNama + "%");
        query.setParameter("awal", awal);
        query.setParameter("akhir", akhir);
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            GajiHarian gajiHarian = (GajiHarian) it.next();
            listGajiHarian.add(gajiHarian);
        }

        session.close(); //tutup session
        return listGajiHarian;
    }
    
    public List<GajiHarian> getByNama(String paramNama) {
        ArrayList<GajiHarian> listGajiHarian = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from GajiHarian n JOIN FETCH n.karyawanHarian JOIN FETCH n.jabatan "
                + "where n.karyawanHarian.nama LIKE :paramNama");
//                + "AND n.tanggal BETWEEN :awal AND :akhir");
        query.setParameter("paramNama", "%" + paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            GajiHarian gajiHarian = (GajiHarian) it.next();
            listGajiHarian.add(gajiHarian);
        }

        session.close(); //tutup session
        return listGajiHarian;
    }
}
