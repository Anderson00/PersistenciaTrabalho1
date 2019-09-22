package org.trabalhopersistencia.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "tbl_infracao")
public class Infracao {
	@Id
	@Column(name = "cod_infracao")
	private String codInfracao;
	
	@Column(name = "des_infracao")
	@Type(type = "text")
	private String desInfracao;
	
	@Column(name = "des_abreviada")
	private String desAbreviada;
	
	@Column(name = "enquadramento")
	private String enquadramento;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "qtd_pontos")
	private int qtdPontos;
	
	@Column(name = "tipo_medicao")
	private String tipoMediacao;
	
	@Column(name = "responsavel")
	private String responsavel;
	
	@Column(name = "fracao")
	private double fracao;
	
	@Column(name = "valor_adicional")
	private double valorAdicional;
	
	@Column(name = "dat_fimvigencia")
	private Date datFimVigencia;
	
	@Column(name = "dat_iniciovigencia")
	private Date datInicioVigencia;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_observacaoinfracao")
	private ObservacaoInfracao fkIdObservacaoInfracao;
	
	public Infracao() {
		
	}
	
	public Infracao(String id) {
		this.codInfracao = id;
	}

	public String getId() {
		return codInfracao;
	}

	public void setId(String id) {
		this.codInfracao = id;
	}

	public String getDesInfracao() {
		return desInfracao;
	}

	public void setDesInfracao(String desInfracao) {
		this.desInfracao = desInfracao;
	}

	public String getDesAbreviada() {
		return desAbreviada;
	}

	public void setDesAbreviada(String desAbreviada) {
		this.desAbreviada = desAbreviada;
	}

	public String getEnquadramento() {
		return enquadramento;
	}

	public void setEnquadramento(String enquadramento) {
		this.enquadramento = enquadramento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdPontos() {
		return qtdPontos;
	}

	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}

	public String getTipoMediacao() {
		return tipoMediacao;
	}

	public void setTipoMediacao(String tipoMediacao) {
		this.tipoMediacao = tipoMediacao;
	}

	public double getFracao() {
		return fracao;
	}

	public void setFracao(double fracao) {
		this.fracao = fracao;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public Date getDatFimVigencia() {
		return datFimVigencia;
	}

	public void setDatFimVigencia(Date datFimVigencia) {
		this.datFimVigencia = datFimVigencia;
	}

	public Date getDatInicioVigencia() {
		return datInicioVigencia;
	}

	public void setDatInicioVigencia(Date datInicioVigencia) {
		this.datInicioVigencia = datInicioVigencia;
	}

	public ObservacaoInfracao getFkIdObservacaoInfracao() {
		return fkIdObservacaoInfracao;
	}

	public void setFkIdObservacaoInfracao(ObservacaoInfracao fkIdObservacaoInfracao) {
		this.fkIdObservacaoInfracao = fkIdObservacaoInfracao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
}
