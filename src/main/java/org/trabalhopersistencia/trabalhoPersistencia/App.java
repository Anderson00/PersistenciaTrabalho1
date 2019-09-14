package org.trabalhopersistencia.trabalhoPersistencia;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.trabalhopersistencia.model.Infracao;
import org.trabalhopersistencia.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Infracao inf1 = new Infracao(1);
    	Infracao inf2 = new Infracao(2);
    	Infracao inf3 = new Infracao(3);
    	
    	
    	try {
    		Session session = HibernateUtil.getSessionFactory().openSession();
    		
    		Transaction transaction = session.beginTransaction();
    		
    		session.save(inf1);
    		session.save(inf2);
    		session.save(inf3);
    		
    		transaction.commit();
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
