package com.penggajian.control;

import com.penggajian.util.HibtUtil;
import com.penggajian.model.User;
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
public class CntlUser {
    private SessionFactory sessfact = new HibtUtil().getSessionFactory();
    private Session session;
    private Transaction tr;
    
    public void insert(User user){
        session = sessfact.openSession(); //buka session
	tr = session.beginTransaction(); //mulai transaksi
	session.save(user);  // simpan objek guru ke database
	tr.commit(); //commit/save
	session.close(); // tutup session
    }
    
    public void update(User user){
        session = sessfact.openSession();
        tr = session.beginTransaction();
        User record = (User)session.load(User.class, user.getId());
        record.setNama(user.getNama());
        record.setUsername(user.getUsername());
        record.setPassword(user.getPassword());
        record.setPeran(user.getPeran());
        session.close();
        tr.commit();
        session.close();
    }
    
    public void delete(Integer id){
        session = sessfact.openSession();
        tr = session.beginTransaction();
        User user = (User)session.load(User.class, id);
        session.delete(id);
        tr.commit();
        session.close();
    }
    
    public List<User> retrieve(){
        ArrayList<User> listUser = new ArrayList<>();
        session = sessfact.openSession();
        tr = session.beginTransaction();
        Query query = session.createQuery("from User");
        List result = query.list();
        Iterator it = result.iterator();
        while(it.hasNext()){
            User lstUser = (User) it.next();
            listUser.add(lstUser);
        }
        session.close();
        return listUser;
    }
    
    public User ValidasiLogin(String username, String password) {
		session = sessfact.openSession();
		tr = session.beginTransaction();
		Query query = session.createQuery("from User where username= :username and password = :password");

		query.setParameter("username", username);  //set parameter username
		query.setParameter("password", password); //set parameter password

		List<User> list = query.list();
		if (list.isEmpty()) {
			return null;
		}

		User user = (User) list.get(0);

		session.close();

		return user;
	}
}
