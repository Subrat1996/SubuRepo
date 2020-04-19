package com.nt.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf=null;
	static {
		sf= new Configuration().configure().buildSessionFactory();
		
	}
	 public static SessionFactory getFactory() {
		 
		 return sf;
	 }
}
