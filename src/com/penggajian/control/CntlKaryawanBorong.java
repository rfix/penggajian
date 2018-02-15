package com.penggajian.control;

import com.penggajian.model.KaryawanBorong;
import com.penggajian.model.Jabatan;
import com.penggajian.model.JenisBarang;
import com.penggajian.model.KaryawanHarian;
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
public class CntlKaryawanBorong {
    
    private SessionFactory sessFact = HibtUtil.getSessionFactory();
	private Session session;
	private Transaction tr;
        
        public void insert(KaryawanBorong daftarPekerjaan, Integer idJabatan, Integer idBarang) {
		session = sessFact.openSession(); //buka session
		tr = session.beginTransaction(); //mulai transaksi
                Jabatan jabatan = (Jabatan)session.load(Jabatan.class, idJabatan);
                JenisBarang jenisBarang = (JenisBarang)session.load(JenisBarang.class, idBarang);
                daftarPekerjaan.setJenisBarang(jenisBarang);
                daftarPekerjaan.setJabatan(jabatan);
		session.save(daftarPekerjaan);  // simpan objek karyawan ke database
		tr.commit(); //commit/save
		session.close(); // tutup session
	}
	
	public void update(KaryawanBorong karyawanBorong, Integer idJabatan, Integer idBarang) {
		session = sessFact.openSession(); // buka session database
		tr = session.beginTransaction(); //mulai transaction
		KaryawanBorong record = (KaryawanBorong)session.load(KaryawanBorong.class, karyawanBorong.getId()); 
                Jabatan jabatan = (Jabatan)session.load(Jabatan.class, idJabatan);
                JenisBarang jenisBarang = (JenisBarang)session.load(JenisBarang.class, idBarang);
                record.setJenisBarang(jenisBarang);
                record.setJabatan(jabatan);
                record.setNama(karyawanBorong.getNama());
                record.setJenisKelamin(karyawanBorong.getJenisKelamin());
                record.setTanggalLahir(karyawanBorong.getTanggalLahir());
                record.setAgama(karyawanBorong.getAgama());
                record.setNoTelp(karyawanBorong.getNoTelp());
                record.setPendidikan(karyawanBorong.getAlamat());
                record.setAlamat(karyawanBorong.getAlamat());
                tr.commit();
		session.close();
	}
	
	public void hapus(Integer id) {
		session = sessFact.openSession();
		tr = session.beginTransaction();
		KaryawanBorong daftarPekerjaan = (KaryawanBorong)session.load(KaryawanBorong.class, id); // cari di database berdasarkan id karyawan
		session.delete(daftarPekerjaan);
		tr.commit();
		session.close();
	}

	/**
	 * retrieve data karyawan dari database
	 *
	 * @return List<DaftarPekerjaan>
	 */
	public List<KaryawanBorong> retrieve() {
		ArrayList<KaryawanBorong> listDaftarPekerjaan = new ArrayList<>(); // inisialisasi listKaryawan
		session = sessFact.openSession(); // buka session
		tr = session.beginTransaction(); // mulai transaksi
		Query query = session.createQuery("from KaryawanBorong n JOIN FETCH n.jabatan JOIN FETCH n.jenisBarang"); // ambil data karyawan dari database
		List result = query.list();
		Iterator it = result.iterator();
		while (it.hasNext()) {
			KaryawanBorong daftarPekerjaan = (KaryawanBorong) it.next();
			listDaftarPekerjaan.add(daftarPekerjaan);
		}
		
		session.close(); //tutup session

		return listDaftarPekerjaan;
	}
        
        public List<KaryawanBorong> getByNama(String paramNama) {
        ArrayList<KaryawanBorong> listBorong = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from KaryawanBorong n JOIN FETCH n.jabatan where n.nama LIKE :paramNama");
        query.setParameter("paramNama", "%"+ paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            KaryawanBorong karyawanBorong = (KaryawanBorong) it.next();
            listBorong.add(karyawanBorong);
        }

        session.close(); //tutup session
        return listBorong;
    }
//    public KaryawanBorong getByNama(String nama) {
//        ArrayList<KaryawanBorong> listBorong = new ArrayList<>(); // inisialisasi listKaryawanHarian
//        session = sessFact.openSession(); // buka session
//        tr = session.beginTransaction(); // mulai transaksi
//        Query query = session.createQuery("from KaryawanBorong n JOIN FETCH n.jabatan where n.nama = " + nama);
//        KaryawanBorong borong = (KaryawanBorong) query.uniqueResult();
//
//        session.close(); //tutup session
//        return borong;
//    }
    
    
}
