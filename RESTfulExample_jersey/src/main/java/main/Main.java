package main;

import java.util.List;

import model.Account;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtil;
import dao.AccountHome;

public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		List<Account> list = null;
		Account account = new Account();
//		SessionFactory factory = HibernateUtil.getSessionFactory();
//		Session session = factory.getCurrentSession();
		try{
//			session.getTransaction().begin();
			AccountHome home = new AccountHome();
//			account =   home.findById(1, session);
			List<Account> accounts = home.getAllAccount();
			System.out.println("list account: "+ account.toString());
//			session.getTransaction().commit();
//			session.close();
		}catch(Exception ex){
			
		}
//			System.out.println("password "+ account.getPassword());
//			System.out.println("username "+ account.getUsername());
//			System.out.println("id "+ account.getId());
	}
}
