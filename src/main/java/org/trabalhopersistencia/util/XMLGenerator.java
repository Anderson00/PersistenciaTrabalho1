package org.trabalhopersistencia.util;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.trabalhopersistencia.model.Infracao;
import org.trabalhopersistencia.model.MarcaAuto;
import org.trabalhopersistencia.model.Multa;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLGenerator {
	
	private Session session;
	private File file;
	
	public XMLGenerator(Session session, File file) {
		this.session = session;
		this.file = file;
	}
	
	public void genXML() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
		 
        Document document = documentBuilder.newDocument();
        Element root = document.createElement("DicionarioMultas");
        document.appendChild(root);
               
        root.appendChild(tblInfracao(document));
        root.appendChild(marcaAuto(document));
        root.appendChild(tblMulta(document));
        
        // create the xml file
        //transform the DOM Object to an XML File
        TransformerFactory transformerFactory = TransformerFactory.newInstance();        
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(this.file);

        // If you use
        // StreamResult result = new StreamResult(System.out);
        // the output will be pushed to the standard output ...
        // You can use that for debugging 

        transformer.transform(domSource, streamResult);
        System.out.println("Done creating XML File");        
	}
	
	private Element tblInfracao(Document doc) {
		Element	tblinfracao = doc.createElement("TblInfracoes");		
		
		Query query = session.createQuery("from Infracao");
		List<Infracao> list =  (List<Infracao>)query.list();
		tblinfracao.setAttribute("qtd_elementos", list.size()+"");
		
		for(Infracao inf : list) {
			Element infracao = doc.createElement("Infracao");
			
			Attr codInfracao = doc.createAttribute("cod_infracao");
			codInfracao.setValue(inf.getId());
			infracao.setAttributeNode(codInfracao);
			
			Element datFimVigencia = doc.createElement("DatFimVigencia");
			Element datInicioVigencia = doc.createElement("DatInicioVigencia");
			Element desAbreviada = doc.createElement("DesAbreviada");
			Element desInfracao = doc.createElement("DesInfracao");
			Element enquadramento = doc.createElement("Enquadramento");
			Element fracao = doc.createElement("Fracao");
			Element qtdPontos = doc.createElement("QtdPontos");
			Element responsavel = doc.createElement("Responsavel");
			Element tipoMedicao = doc.createElement("TipoMedicao");
			Element valor = doc.createElement("Valor");
			Element valorAdicional = doc.createElement("ValorAdicional");
			Element fkIdObservacaoinfracao = doc.createElement("FkIdObservacaoinfracao");
			
			String datFim = (inf.getDatFimVigencia() == null)? "" : inf.getDatFimVigencia().toString();
			String datIni = (inf.getDatInicioVigencia() == null)? "" : inf.getDatInicioVigencia().toString();
			datFimVigencia.appendChild(doc.createTextNode(datFim));
			datInicioVigencia.appendChild(doc.createTextNode(datIni));
			desAbreviada.appendChild(doc.createTextNode(inf.getDesAbreviada()));
			desInfracao.appendChild(doc.createTextNode(inf.getDesInfracao()));
			enquadramento.appendChild(doc.createTextNode(inf.getEnquadramento()));
			fracao.appendChild(doc.createTextNode(inf.getFracao()+""));
			qtdPontos.appendChild(doc.createTextNode(inf.getQtdPontos()+""));
			responsavel.appendChild(doc.createTextNode(inf.getResponsavel()));
			tipoMedicao.appendChild(doc.createTextNode(inf.getTipoMediacao()));
			valor.appendChild(doc.createTextNode(inf.getValor()+""));
			valorAdicional.appendChild(doc.createTextNode(inf.getValorAdicional()+""));
			
			if(inf.getFkIdObservacaoInfracao() != null) {
				Element observacaoInfracao = doc.createElement("ObservacaoInfracao");
				Element id = doc.createElement("Id");
				Element desc = doc.createElement("Desc");
				
				id.appendChild(doc.createTextNode(inf.getFkIdObservacaoInfracao().getIdObservacaoInfracao()+""));
				desc.appendChild(doc.createTextNode(inf.getFkIdObservacaoInfracao().getDescricao()));
				
				observacaoInfracao.appendChild(id);
				observacaoInfracao.appendChild(desc);
				
				fkIdObservacaoinfracao.appendChild(observacaoInfracao);
			}
			
			infracao.appendChild(datFimVigencia);
			infracao.appendChild(datInicioVigencia);
			infracao.appendChild(desAbreviada);
			infracao.appendChild(desInfracao);
			infracao.appendChild(enquadramento);
			infracao.appendChild(fracao);
			infracao.appendChild(qtdPontos);
			infracao.appendChild(responsavel);
			infracao.appendChild(tipoMedicao);
			infracao.appendChild(valor);
			infracao.appendChild(valorAdicional);
			infracao.appendChild(fkIdObservacaoinfracao);
			tblinfracao.appendChild(infracao);
		}
		
		return tblinfracao;
	}

	private Element marcaAuto(Document doc) {
		Element marcaAuto = doc.createElement("MarcaAuto");
		
		Query query = session.createQuery("from MarcaAuto");
		List<MarcaAuto> list =  (List<MarcaAuto>)query.list();
		marcaAuto.setAttribute("qtd_elementos", list.size()+"");
		
		for(MarcaAuto at : list) {
			Element auto = doc.createElement("Auto");
			Element nomeMarca = doc.createElement("NomeMarca");
			Element codVeiculoMarca = doc.createElement("VeiculoMarca");
			
			auto.setAttribute("num_auto", at.getNumAuto());
			
			nomeMarca.appendChild(doc.createTextNode(at.getNomeMarca()));
						
			Element marca = doc.createElement("Marca");
			marca.appendChild(doc.createTextNode(at.getCodVeiculoMarca().getMarca()));			
			codVeiculoMarca.setAttribute("cod_marca", at.getCodVeiculoMarca().getPkCodVeiculoMarca()+"");
			codVeiculoMarca.appendChild(marca);
			
			auto.appendChild(nomeMarca);
			auto.appendChild(codVeiculoMarca);
			marcaAuto.appendChild(auto);
		}
		
		return marcaAuto;
	}

	private Element tblMulta(Document doc) {
		Element multas = doc.createElement("TblMultas");
		
		Query query = session.createQuery("from Multa").setMaxResults(200000);
		List<Multa> list =  (List<Multa>)query.list();
		multas.setAttribute("qtd_elementos", list.size()+"");
		
		for(Multa ml : list) {
			Element multa = doc.createElement("Multa");
			multa.setAttribute("cod_multa", ml.getCodMulta()+"");
			
			Element caminhoImgAuto = doc.createElement("CaminhoImgAuto");
			Element codInfracao = doc.createElement("CodInfracao");
			Element codStatusDetran = doc.createElement("CodStatusDetran");
			Element datPagamento = doc.createElement("DatPagamento");
			Element fkIdInfracao = doc.createElement("FkIdInfracao");
			Element numAuto = doc.createElement("NumAuto");
			Element valMulta = doc.createElement("ValMulta");
			Element valPago = doc.createElement("ValPago");
			Element codTipoVinculo = doc.createElement("CodTipoVinculo");
			
			caminhoImgAuto.appendChild(doc.createTextNode(ml.getCaminhoImgAuto()));
			codInfracao.appendChild(doc.createTextNode(ml.getCodInfracao()));
			codStatusDetran.appendChild(doc.createTextNode(ml.getCodStatusDetran() + ""));
			datPagamento.appendChild(doc.createTextNode( (ml.getDatPagamento() == null)? "" : ml.getDatPagamento().toString()));
			fkIdInfracao.appendChild(doc.createTextNode(ml.getFkIdInfracao() + ""));
			numAuto.appendChild(doc.createTextNode(ml.getNumAuto()));
			valMulta.appendChild(doc.createTextNode(ml.getValMulta() + ""));
			valPago.appendChild(doc.createTextNode(ml.getValPago() + ""));
			
			if(ml.getCodTipoVinculo() != null) {
				codTipoVinculo.setAttribute("id_tipovinculo", ml.getCodTipoVinculo().getIdTipovinculo() + "");
				Element desTipoVinculo = doc.createElement("DesTipoVinculo");
				desTipoVinculo.appendChild(doc.createTextNode(ml.getCodTipoVinculo().getDesTipoVinculo()));
				codTipoVinculo.appendChild(desTipoVinculo);
			}
		
			multa.appendChild(codInfracao);
			multa.appendChild(codStatusDetran);
			multa.appendChild(datPagamento);
			multa.appendChild(fkIdInfracao);
			multa.appendChild(numAuto);
			multa.appendChild(valMulta);
			multa.appendChild(valPago);
			multa.appendChild(codTipoVinculo);
			multa.appendChild(caminhoImgAuto);
			multas.appendChild(multa);
		}
		
		return multas;
	}
}
