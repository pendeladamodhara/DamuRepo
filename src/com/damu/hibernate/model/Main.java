package com.damu.hibernate.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/damu/hibernate/model/hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
      /*  Student s=(Student)session.get(Student.class, 100);
        System.out.println(s.getSname());
        session.clear();
        try
        {
        	Thread.sleep(10000); 
                 System.out.println("");
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }*/
        Session session2=factory.openSession();
       // Student s1=(Student)session2.get(Student.class, 100);
       //System.out.println( s1.getSname());
        Query query=session.createQuery("from Student s where s.sno=?");
        query.setParameter(0, 100);
        List l=query.list();
        Query query1=session2.createQuery("from Student s where s.sno=?");
        query.setParameter(0, 100);
        List l1=query.list();
        
	}

}
