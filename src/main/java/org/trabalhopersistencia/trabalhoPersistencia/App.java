package org.trabalhopersistencia.trabalhoPersistencia;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.trabalhopersistencia.model.Infracao;
import org.trabalhopersistencia.model.ObservacaoInfracao;
import org.trabalhopersistencia.util.Arquivos;
import org.trabalhopersistencia.util.CSVFileReader;
import org.trabalhopersistencia.util.HibernateUtil;
import org.trabalhopersistencia.util.XMLGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 	
    	
    	try {
    		Session session = HibernateUtil.getSessionFactory().openSession();
    		
    		//Domain
    		//Arquivos.tblVeiculoMarca(session);
    		//Arquivos.marcaAuto(session);
    		
    		//Arquivos.tblTipoVinculo(session);
    		//Arquivos.gravidadeInfracao(session);
    		//Arquivos.tblStatusDetran(session);
    		//Arquivos.observacaoInfracao(session);
    		//Arquivos.tblInfracao(session);
    		
    		//Multa
    		//Arquivos.multa(session);
    		
    		XMLGenerator gen = new XMLGenerator(session,new File(Arquivos.XMLFile));
    		gen.genXML();
    		
    		
    		/*
    		Transaction transaction = session.beginTransaction();
    		
    		Infracao inf = new Infracao();
    		inf.setId("23");
			inf.setDesInfracao("erferferfe re erferf");
			inf.setDesAbreviada("qweqweqwe");
			inf.setEnquadramento("C");
			inf.setValor(0.0);
			inf.setQtdPontos(3);
			inf.setTipoMediacao("ME");
			inf.setResponsavel("wefwef");
			inf.setFracao(4.3);
			inf.setDatFimVigencia(null);
			inf.setDatInicioVigencia(null);
			inf.setFkIdObservacaoInfracao(new ObservacaoInfracao(1,""));
			
			Infracao inf2 = new Infracao();
    		inf2.setId("23234");
			inf2.setDesInfracao("erferferfe re erferf");
			inf2.setDesAbreviada("qweqweqwe");
			inf2.setEnquadramento("C");
			inf2.setValor(0.0);
			inf2.setQtdPontos(3);
			inf2.setTipoMediacao("ME");
			inf2.setResponsavel("wefwef");
			inf2.setFracao(4.3);
			inf2.setDatFimVigencia(null);
			inf2.setDatInicioVigencia(null);
			inf2.setFkIdObservacaoInfracao(new ObservacaoInfracao(1,""));
			
    		session.save(inf);
    		session.save(inf2);
    		
    		transaction.commit();
    		*/
    		
    		session.close();
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
