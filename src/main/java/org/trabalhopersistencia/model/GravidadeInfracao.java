package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gravidade_infracao")
public class GravidadeInfracao {

	@Id
	@Column(name = "id_gravidade_infracao")
	private int idGravidadeInfracao;
	
	@Column(name = "qtd_pontos")
	private String qtdPontos;
	
	@Column(name = "gravidade")
	private int gravidade;
	
	public GravidadeInfracao() {
		
	}
	
	public GravidadeInfracao(int idGravidadeInfracao) {
		this.idGravidadeInfracao = idGravidadeInfracao;
	}

	public int getIdGravidadeInfracao() {
		return idGravidadeInfracao;
	}

	public void setIdGravidadeInfracao(int idGravidadeInfracao) {
		this.idGravidadeInfracao = idGravidadeInfracao;
	}

	public String getQtdPontos() {
		return qtdPontos;
	}

	public void setQtdPontos(String qtdPontos) {
		this.qtdPontos = qtdPontos;
	}

	public int getGravidade() {
		return gravidade;
	}

	public void setGravidade(int gravidade) {
		this.gravidade = gravidade;
	}
	
}
