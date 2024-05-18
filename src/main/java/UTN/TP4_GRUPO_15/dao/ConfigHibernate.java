package UTN.TP4_GRUPO_15.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ConfigHibernate {

	private SessionFactory sessionFactory;
	private Session session;
	
	public ConfigHibernate(Class<?> entityClass) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegitry = new StandardServiceRegistryBuilder()
											.applySettings(configuration.getProperties())
											.build();
		
		sessionFactory = configuration.addAnnotatedClass(entityClass).buildSessionFactory(serviceRegitry);
	}
	
	public Session openSession() {
		session = sessionFactory.openSession();
		return session;
	}
	
	public void closeSession() {
		session.close();
		closeSessionFactory();
	}
	
	public void closeSessionFactory() {
		sessionFactory.close();
	}
		
}
