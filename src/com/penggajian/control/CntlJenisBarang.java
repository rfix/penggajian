package com.penggajian.control;

import com.penggajian.model.JenisBarang;
import com.penggajian.util.HibtUtil;
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
public class CntlJenisBarang {

	private SessionFactory sessFact = HibtUtil.getSessionFactory();
	private Session session;
	private Transaction tr;

	/**
         * simpan data jenisBarang into database
         * 
         * @param jenisBarang 
         */
	public void insert(JenisBarang jenisBarang) {
		session = sessFact.openSession(); //buka session
		tr = session.beginTransaction(); //mulai transaksi
		session.save(jenisBarang);  // simpan objek guru ke database
		tr.commit(); //commit/save
		session.close(); // tutup session
	}
	
	public void update(JenisBarang jenisBarang) {
		session = sessFact.openSession(); // buka session database
		tr = session.beginTransaction(); //mulai transaction
                JenisBarang record = (JenisBarang)session.load(JenisBarang.class, jenisBarang.getId()); // set jenis Barang
                record.setNamaBarang(jenisBarang.getNamaBarang());
                record.setGaji(jenisBarang.getGaji());
		tr.commit();
		session.close();
	}
	
	public void delete(Integer id) {
		session = sessFact.openSession();
		tr = session.beginTransaction();
		JenisBarang jenisBarang = (JenisBarang)session.load(JenisBarang.class, id); // cari di database berdasarkan id jenisBarang
		session.delete(jenisBarang);
		tr.commit();
		session.close();
	}

	/**
	 * retrieve data jenisBarang dari database
	 *
	 * @return List<JenisBarang>
	 */
	public List<JenisBarang> retrieve() {
		ArrayList<JenisBarang> listBarang = new ArrayList<>(); // inisialisasi listJenisBarang
		session = sessFact.openSession(); // buka session
		tr = session.beginTransaction(); // mulai transaksi
		Query query = session.createQuery("from JenisBarang"); // ambil data jenisBarang dari database
		List result = query.list();
		Iterator it = result.iterator();
		while (it.hasNext()) {
			JenisBarang barang = (JenisBarang) it.next();
			listBarang.add(barang);
		}
		
		session.close(); //tutup session

		return listBarang;
	}

         public List<JenisBarang> getByNama(String paramNama) {
        ArrayList<JenisBarang> listjenBarang = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from JenisBarang where namaBarang LIKE :paramNama");
        query.setParameter("paramNama", "%" + paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            JenisBarang barang = (JenisBarang) it.next();
            listjenBarang.add(barang);
        }

        session.close(); //tutup session
        return listjenBarang;
    }
}
