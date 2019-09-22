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
	private int qtdPontos;
	
	@Column(name = "gravidade")
	private String gravidade;
	
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

	public int getQtdPontos() {
		return qtdPontos;
	}

	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}

	public String getGravidade() {
		return gravidade;
	}

	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}
	
}
