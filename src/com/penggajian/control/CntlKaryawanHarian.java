package com.penggajian.control;

import com.penggajian.util.HibtUtil;
import com.penggajian.model.Jabatan;
import com.penggajian.model.KaryawanHarian;
import java.util.ArrayList;
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
public class CntlKaryawanHarian {

    private SessionFactory sessFact = HibtUtil.getSessionFactory();
    private Session session;
    private Transaction tr;

    public void Insert(KaryawanHarian karyawanHarian, Integer idJabatan) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, idJabatan);
        karyawanHarian.setJabatan(jabatan);
        session.save(karyawanHarian);
        tr.commit();
        session.close();
    }

    public void update(KaryawanHarian karyawanHarian, Integer idJabatan) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        KaryawanHarian record = (KaryawanHarian) session.load(KaryawanHarian.class, karyawanHarian.getId());
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, idJabatan);
        record.setJabatan(jabatan);
        record.setNama(karyawanHarian.getNama());
        record.setJenisKelamin(karyawanHarian.getJenisKelamin());
        record.setTanggalLahir(karyawanHarian.getTanggalLahir());
        record.setNoTelp(karyawanHarian.getNoTelp());
        record.setPendidikan(karyawanHarian.getPendidikan());
        record.setAlamat(karyawanHarian.getAlamat());
        record.setAgama(karyawanHarian.getAgama());
        record.setGolongan(karyawanHarian.getGolongan());
        record.setGajiPerHari(karyawanHarian.getGajiPerHari());
        record.setTanggalMasuk(karyawanHarian.getTanggalMasuk());
        tr.commit();
        session.close();
    }

    public void delete(Integer id) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        KaryawanHarian karyawanHarian = (KaryawanHarian) session.load(KaryawanHarian.class, id);
        session.delete(karyawanHarian);
        tr.commit();
        session.close();
    }

    public List<KaryawanHarian> retrieve() {
        ArrayList<KaryawanHarian> listHarian = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from KaryawanHarian n JOIN FETCH n.jabatan");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            KaryawanHarian harian = (KaryawanHarian) it.next();
            listHarian.add(harian);
        }

        session.close(); //tutup session
        return listHarian;
    }
    
    public List<KaryawanHarian> getByNama(String paramNama) {
        ArrayList<KaryawanHarian> listHarian = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from KaryawanHarian n JOIN FETCH n.jabatan where n.nama LIKE :paramNama");
        query.setParameter("paramNama", "%"+ paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            KaryawanHarian harian = (KaryawanHarian) it.next();
            listHarian.add(harian);
        }

        session.close(); //tutup session
        return listHarian;
    }
}
