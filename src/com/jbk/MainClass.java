package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Vehicle v = new Vehicle();
		v.setVehicle_id(12-12-34);
		v.setMake("Mahindra");
		v.setModel("Thar");
		v.setType("SUV");
		v.setColor("Black");
		ss.persist(v);
		tr.commit();
		ss.close();
		
		System.out.println(v);
	}

}
