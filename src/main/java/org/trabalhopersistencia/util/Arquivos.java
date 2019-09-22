package org.trabalhopersistencia.util;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.TextType;
import org.trabalhopersistencia.model.GravidadeInfracao;
import org.trabalhopersistencia.model.Infracao;
import org.trabalhopersistencia.model.MarcaAuto;
import org.trabalhopersistencia.model.Multa;
import org.trabalhopersistencia.model.ObservacaoInfracao;
import org.trabalhopersistencia.model.StatusDetran;
import org.trabalhopersistencia.model.TipoVinculo;
import org.trabalhopersistencia.model.VeiculoMarca;

public class Arquivos {
	public static final String observacaoInfracao = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/observacao_infracao.csv";
	public static final String tblInfracao = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/tbl_infracao.csv";
	public static final String tblStatusDetran = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/tbl_status_detran.csv";
	public static final String gravidadeInfracao = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/gravidade_infracao.csv";
	public static final String tblVeiculoMarca = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/tbl_veiculo_marca.csv";
	public static final String marcaAuto = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/marca_auto.csv";
	public static final String tblTipoVinculo = "/media/urukhai/USB-9393/Trabalho Persistencia/dominio/tbl_tipovinculo.csv";

	public static final String multa = "/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2012 2 semestre.csv";
	public static final String multas[][] =
			{
				//{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2007 1 semestre.csv", ";"},
				//{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2007 2 semestre.csv", "\\|"},
				//{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2008 1 semestre.csv", "\\|"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2008 2 semestre.csv", "\\|"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2009 1 semestre.csv", "\\|"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2009 2 semestre.csv", "\\|"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2010 1 semestre.csv", ";"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2011 1 semestre.csv", "\\|"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2011 2 semestre.csv", "\\|"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2012 1 semestre.csv", ";"},
				{"/media/urukhai/USB-9393/Trabalho Persistencia/tbl_multa 2007 a 2013/2012 2 semestre.csv", ";"}
			};//[arquivo, separador]
	
	public static final String XMLFile = "/media/urukhai/USB-9393/Trabalho Persistencia/XMLFile.xml";
	
	public static void observacaoInfracao(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();
		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.observacaoInfracao));
		
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			int id = Integer.parseInt(line.get(0));
			String desc = line.get(1).substring(1, line.get(1).length() - 2);
			
			session.save(new ObservacaoInfracao(id, desc));
		}
		
		reader.close();		
		transaction.commit();
	}
	
	public static void tblInfracao(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();
		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.tblInfracao));
		
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			Infracao infracao = new Infracao();
			infracao.setId(line.get(0).replaceAll("\"", ""));
			infracao.setDesInfracao(line.get(1).replaceAll("\"", "").trim());
			infracao.setDesAbreviada(line.get(2).replaceAll("\"", "").trim());
			infracao.setEnquadramento(line.get(3).replaceAll("\"", "").trim());
			try {
				infracao.setValor(Double.parseDouble(line.get(4)));
			}catch(Exception e) {
				infracao.setValor(0.0);
			}
			infracao.setQtdPontos(Integer.parseInt(line.get(5)));
			infracao.setTipoMediacao(line.get(6).replaceAll("\"", ""));
			infracao.setResponsavel(line.get(7).replace("\"", ""));
			try {
				infracao.setFracao(Double.parseDouble(line.get(8)));	
			}catch(Exception e) {
				infracao.setFracao(0.0);
			}
			try {
				infracao.setValorAdicional(Double.parseDouble(line.get(9)));	
			}catch(Exception e) {
				infracao.setValorAdicional(0.0);
			}
			
			String datStr = line.get(10).replaceAll("\"", "");
			String datFimStr = line.get(11).replaceAll("\"", "");			
			try {
				infracao.setDatFimVigencia(new SimpleDateFormat("yyyy-MM-dd").parse(datStr));
			} catch (ParseException e) {
				infracao.setDatFimVigencia(null);
			}
			
			try {
				infracao.setDatInicioVigencia(new SimpleDateFormat("yyyy-MM-dd").parse(datFimStr));
			} catch (ParseException e) {
				infracao.setDatInicioVigencia(null);
			}
			infracao.setFkIdObservacaoInfracao( (!line.get(12).equals("(null)")? new ObservacaoInfracao(Integer.parseInt(line.get(12)), "ekrfokeorkf"): null) );
			//infracao.setFkIdObservacaoInfracao(null);
			
			session.save(infracao);
		}
		
		reader.close();		
		transaction.commit();
	}
	
	public static void tblStatusDetran(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.tblStatusDetran));
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			
			StatusDetran statusDetran = new StatusDetran(Integer.parseInt(line.get(0)), line.get(1).replace("\"", ""));
			
			session.save(statusDetran);
		}
		
		reader.close();
		transaction.commit();
	}
	
	public static void gravidadeInfracao(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.gravidadeInfracao));
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			
			GravidadeInfracao gravidade = new GravidadeInfracao();
			gravidade.setIdGravidadeInfracao(Integer.parseInt(line.get(0)));
			gravidade.setQtdPontos(Integer.parseInt(line.get(1)));
			gravidade.setGravidade(line.get(2).replace("\"", ""));

			session.save(gravidade);
		}
		
		reader.close();
		transaction.commit();
	}
	
	public static void tblVeiculoMarca(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.tblVeiculoMarca));
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			
			VeiculoMarca veiculoMarca = new VeiculoMarca();
			veiculoMarca.setPkCodVeiculoMarca(Integer.parseInt(line.get(0)));
			veiculoMarca.setMarca(line.get(1));
			
			session.save(veiculoMarca);
		}
		
		reader.close();
		transaction.commit();
	}
	
	public static void marcaAuto(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.marcaAuto));
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			
			MarcaAuto marcaAuto = new MarcaAuto();
			marcaAuto.setNumAuto(line.get(0).replace("\"", ""));
			marcaAuto.setCodVeiculoMarca(new VeiculoMarca(Integer.parseInt(line.get(1))));
			marcaAuto.setNomeMarca(line.get(2).replace("\"", ""));
			
			session.save(marcaAuto);
		}
		
		reader.close();
		transaction.commit();
	}
	
	public static void tblTipoVinculo(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();		
		
		CSVFileReader reader = new CSVFileReader(new File(Arquivos.tblTipoVinculo));
		while(reader.ready()) {
			List<String> line = reader.readCSVLine();
			
			TipoVinculo tipoVinculo = new TipoVinculo();
			tipoVinculo.setIdTipovinculo(Integer.parseInt(line.get(0)));
			tipoVinculo.setDesTipoVinculo(line.get(1).replace("\"",""));
			
			session.save(tipoVinculo);
		}
		
		reader.close();
		transaction.commit();
	}
	
	public static void multa(Session session) throws IOException{
		Transaction transaction = session.beginTransaction();		
				
		for(String m[] : multas) {
			CSVFileReader reader = new CSVFileReader(new File(m[0]), m[1]);
			System.out.println("["+m[0]+", "+ m[1]+"]");
			while(reader.ready()) {
				List<String> line = reader.readCSVLine();
				
				Multa multa = new Multa();
				multa.setCodMulta(Integer.parseInt(line.get(0)));
				try {
					multa.setValMulta(Double.parseDouble(line.get(1)));
				}catch(Exception e) {
					multa.setValMulta(0.0);
				}
				try {
					multa.setDatPagamento(new SimpleDateFormat("yyyy-MM-dd").parse(line.get(2)));
				}catch(Exception e) {
					multa.setDatPagamento(null);
				}
				multa.setNumAuto(line.get(3).replace("\"", ""));
				multa.setFkIdInfracao(Integer.parseInt(line.get(4)));
				multa.setCodInfracao(line.get(5).replace("\"", ""));
				try {
					multa.setCodStatusDetran(Integer.parseInt(line.get(6)));
				}catch(Exception e) {
					multa.setCodStatusDetran(0);
				}
				try {
					multa.setValPago(Double.parseDouble(line.get(7)));
				}catch(Exception e) {
					multa.setValPago(0.0);
				}
				multa.setCodTipoVinculo(new TipoVinculo(Integer.parseInt(line.get(8))));
				
				if(line.size() > 9)
					multa.setCaminhoImgAuto(line.get(9));
				else
					multa.setCaminhoImgAuto(null);
				
				session.save(multa);
			}
			reader.close();
			transaction.commit();
		}
	}
}
