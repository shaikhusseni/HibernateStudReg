package com.tut.hbMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "projected created" );
        Configuration cfg=new Configuration(); 
        cfg.configure("com/tut/hbMaven/Hibernate.config.xml");
        
        SessionFactory factory =cfg.buildSessionFactory();
        
//        creating student
        StudentReg st=new StudentReg();
        st.setId(2); 
        st.setName("Hussen");
        st.setCity("donabanda");
        
        System.out.println(st);
        
//       Session session=factory.getCurrentSession();
        Session session=factory.openSession();
        
            Transaction txt=session.beginTransaction();
            session.save(txt);
            txt.commit();
            session.close();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
       }
}
