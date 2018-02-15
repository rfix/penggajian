package com.penggajian.control;

import com.penggajian.util.HibtUtil;
import com.penggajian.model.Jabatan;
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
public class CntlJabatan {

    private SessionFactory sessFact = HibtUtil.getSessionFactory();
    private Session session;
    private Transaction tr;

    /**
     * simpan data jabatan into database
     *
     * @param jabatan
     */
    public void Insert(Jabatan jabatan) {
        session = sessFact.openSession(); //buka session
        tr = session.beginTransaction(); //mulai transaksi
        session.save(jabatan);  // simpan objek jabatan ke database
        tr.commit(); //commit/save
        session.close(); // tutup session
    }

    public void update(Jabatan jabatan) {
        session = sessFact.openSession(); // buka session database
        tr = session.beginTransaction(); //mulai transaction
        Jabatan record = (Jabatan) session.load(Jabatan.class, jabatan.getId()); // cari jabatan di database berdasarkan id jabatan
        record.setNamaJabatan(jabatan.getNamaJabatan()); // set jabatan
        record.setGaji(jabatan.getGaji()); // set gaji
        tr.commit();
        session.close();
    }

    public void delete(Integer id) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        Jabatan jabatan = (Jabatan) session.load(Jabatan.class, id); // cari di database berdasarkan id jabatan
        session.delete(jabatan);
        tr.commit();
        session.close();
    }

    /**
     * retrieve data jabatan dari database
     *
     * @return List<Jabatan>
     */
    public List<Jabatan> retrieve() {
        ArrayList<Jabatan> listJabatan = new ArrayList<>(); // inisialisasi listJabatan
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from Jabatan"); // ambil data jabatan dari database
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            Jabatan jabatan = (Jabatan) it.next();
            listJabatan.add(jabatan);
        }

        session.close(); //tutup session

        return listJabatan;
    }

    public List<Jabatan> getByNama(String paramNama) {
        ArrayList<Jabatan> listjabatan = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from Jabatan where namaJabatan LIKE :paramNama");
        query.setParameter("paramNama", "%" + paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            Jabatan jabatan = (Jabatan) it.next();
            listjabatan.add(jabatan);
        }

        session.close(); //tutup session
        return listjabatan;
    }
}
