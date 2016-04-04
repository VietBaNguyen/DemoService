package dao;
// Generated Apr 2, 2016 11:20:16 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import model.Account;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import util.HibernateUtil;

/**
 * Home object for domain model class Account.
 * @see .Account
 * @author Hibernate Tools
 */
public class AccountHome {

	private static final Log log = LogFactory.getLog(AccountHome.class);

	Session session = HibernateUtil.getSessionFactory().getCurrentSession();

	public void persist(Account transientInstance) {
		log.debug("persisting Account instance");
		try {
			session.getTransaction().begin();
			session.persist(transientInstance);
			session.getTransaction().commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Account persistentInstance) {
		log.debug("removing Account instance");
		try {
			session.getTransaction().begin();
			session.delete(persistentInstance);
			session.getTransaction().commit();
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public boolean merge(Account detachedInstance) {
		log.debug("merging Account instance");
		try {
			session.getTransaction().begin();
			/*Account result = (Account) */session.merge(detachedInstance);
			session.getTransaction().commit();
			log.debug("merge successful");
			return true;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Account findById(int id) {
		log.debug("getting Account instance with id: " + id);
		try {
			session.getTransaction().begin();
			Account instance = (Account) session.get(Account.class, id);
			session.getTransaction().commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
		}
	}
	
	public List<Account> getAllAccount(){
		List<Account> accounts = null;
		log.debug("getting list Accounts instance with ");
		try {
			session.getTransaction().begin();
//			System.out.println((Account) session.get(Account.class, id));
			 accounts = session.createCriteria(Account.class).list();
			session.getTransaction().commit();
//			log.debug("get successful");
			return accounts;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
//			session.close();
		}
	}
}
