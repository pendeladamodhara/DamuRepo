package com.pack;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	 Configuration conf=new Configuration();
	  conf.configure("hibernate.cfg.xml");
	  Session session=conf.buildSessionFactory().openSession();
	  Query query=session.createQuery("from Flight f");
	Filter filter= session.enableFilter("filter1");
  Scanner scan=new Scanner(System.in);
	  System.out.println("enter status to check");
	  String str=scan.next();
  filter.setParameter("status",str);
	  List list=query.list();
	  Iterator itr=list.iterator();
	  while(itr.hasNext())
	  {
		  Flight flight=(Flight)itr.next();
		  System.out.println(flight);
	  }
 
	}

}
