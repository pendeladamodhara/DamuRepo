package com.damu.hibernate.model;

import java.io.FileInputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.LobCreator;

public class Insert {

	
	public static void main(String[] args)throws Exception {
		Configuration conf=new Configuration();
		conf.configure("com/damu/hibernate/model/hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Emp e=new Emp();
		e.setStudentNo(1234);
		FileInputStream fis=new FileInputStream("F:\\java.jpg");
		int length=fis.available();
		System.out.println("file size:"+length);
		byte[] b=new byte[length];
		fis.read(b);
		LobCreator cre=Hibernate.getLobCreator(session);
	Blob blob=cre.createBlob(b);
	e.setImage(blob);
	Transaction tx=session.beginTransaction();
	session.save(e);
	tx.commit();
	fis.close();
	session.close();
	factory.close();
	

	}

}
