package com.anandhu.hibernateproject;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;



public class EmployeeTest {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("employee.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();
		Employee employee = new Employee();
		employee.setEid(30);
		employee.setFirstName("raju");
		employee.setLastName("ryan");
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		System.out.println("updated");
		transaction.commit();
		session.close();
		factory.close();
		

	}

}
