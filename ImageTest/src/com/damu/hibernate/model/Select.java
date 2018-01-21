package com.damu.hibernate.model;

import java.io.FileOutputStream;
import java.sql.Blob;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Select {

	public static void main(String[] args)throws Exception {
		Configuration conf=new Configuration();
		conf.configure("com/damu/hibernate/model/hibernate.cfg.xml");
		ServiceRegistry registry=new  StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
	    SessionFactory factory=conf.buildSessionFactory(registry);
	    Session session=factory.openSession();
	    Emp e=(Emp)session.get(Emp.class, 1234);
	    Blob blob=e.getImage();
	    int length=(int)blob.length();
	   byte[] b1= blob.getBytes(1, length);
	    FileOutputStream fos=new FileOutputStream("d://a.jpeg");
	    fos.write(b1);
	    session.close();
	   
	}

}
