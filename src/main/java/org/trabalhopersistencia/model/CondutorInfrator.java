package org.trabalhopersistencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_condutorinfrator")
public class CondutorInfrator {
	
	@Id
	@Column(name = "id_condutorinfrator")
	int idCondutorInfrator;
	
	@Column(name = "nom_municipio")
	String nomMunicipio;
	
	@Column(name = "cep_condutor")
	String cepCondutor;
	
	@Column(name = "dat_cadastro")
	Date datCadastro;
	
	@Column(name = "tipo_cnh")	
	char tipoCnh;
	
	public CondutorInfrator() {
		
	}
	
	public CondutorInfrator(int idCondutorInfrator) {
		this.idCondutorInfrator = idCondutorInfrator;
	}

	public int getIdCondutorInfrator() {
		return idCondutorInfrator;
	}

	public void setIdCondutorInfrator(int idCondutorInfrator) {
		this.idCondutorInfrator = idCondutorInfrator;
	}

	public String getNomMunicipio() {
		return nomMunicipio;
	}

	public void setNomMunicipio(String nomMunicipio) {
		this.nomMunicipio = nomMunicipio;
	}

	public String getCepCondutor() {
		return cepCondutor;
	}

	public void setCepCondutor(String cepCondutor) {
		this.cepCondutor = cepCondutor;
	}

	public Date getDatCadastro() {
		return datCadastro;
	}

	public void setDatCadastro(Date datCadastro) {
		this.datCadastro = datCadastro;
	}

	public char getTipoCnh() {
		return tipoCnh;
	}

	public void setTipoCnh(char tipoCnh) {
		this.tipoCnh = tipoCnh;
	}
	
}
