package com;

import org.hibernate.Session;

public class TestUpdate {
	public static void main (String [] args)
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		    Student s = session.get(Student.class, 1); //select table from student where rollno=1
	     s.setName("Ankit");
	      //s.setRollno(1);
	     session.update(s);
	     session.beginTransaction().commit();
	     session.close();
	}
}
