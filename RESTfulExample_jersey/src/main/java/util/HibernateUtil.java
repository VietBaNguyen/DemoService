package util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	 private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	   private static SessionFactory buildSessionFactory() {
	       // Tạo đối tượng cấu hình.
	       Configuration configuration = new Configuration().configure();
	       // Mặc định nó sẽ đọc cấu hình trong file hibernate.cfg.xml
	       // Bạn có thể chỉ định rõ file nếu muốn:
//	        configuration.configure("hiberante.cfg.xml");
//	       configuration.configure("./config/hibernate.cfg.xml");
	 
	       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	               .applySettings(configuration.getProperties()).build();
	 
	       // Tạo đối tượng SessionFactory
	       SessionFactory sessionFactory = configuration
	               .buildSessionFactory(serviceRegistry);
//	       EntityManagerFactory factory = configuration.getE
	       return sessionFactory;
	   }
	 
	   public static SessionFactory getSessionFactory() {
	       return sessionFactory;
	   }
	 
	   public static void shutdown() {
	       // Close caches and connection pools
	       // Giải phóng cache và Connection Pools.
	       getSessionFactory().close();
	   }
}
