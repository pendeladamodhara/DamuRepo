package com.pack;

import javax.swing.JOptionPane;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("com/pack/hibernate.cfg.xml");
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory factory=conf.buildSessionFactory(registry);
        Session session=factory.openSession();
        Student s=(Student)session.get(Student.class,100,LockOptions.UPGRADE);
        System.out.println("h");
        try
        {
        	Thread.sleep(1000);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

        s.setMarks(300);
        Transaction tx=session.beginTransaction();
        session.update(s);
        tx.commit();
        }

}