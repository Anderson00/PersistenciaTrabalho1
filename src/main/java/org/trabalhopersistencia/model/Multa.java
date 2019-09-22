package org.trabalhopersistencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_multa")
public class Multa {
	
	@Id
	@Column(name = "cod_multa")
	private int codMulta;
	
	@Column(name = "val_multa")
	private double valMulta;
	
	@Column(name = "dat_pagamento")
	private Date datPagamento;
	
	//FK tbl_ai_valido
	@Column(name = "num_auto")
	private String numAuto;
	
	@Column(name = "fk_id_infracao")
	private int fkIdInfracao;
	
	@Column(name = "cod_infracao")
	private String codInfracao;
	
	@Column(name = "cod_status_detran")
	private int codStatusDetran;
	
	@Column(name = "val_pago")
	private double valPago;
	
	//FK tbl_tipovinculo
	@ManyToOne
	@JoinColumn(name = "cod_tipovinculo")
	private TipoVinculo codTipoVinculo;
	
	@Column(name = "caminho_img_auto")
	private String caminhoImgAuto;
	
	public Multa() {
		
	}
	
	public Multa(int codMulta) {
		this.codMulta = codMulta;
	}

	public int getCodMulta() {
		return codMulta;
	}

	public void setCodMulta(int codMulta) {
		this.codMulta = codMulta;
	}

	public double getValMulta() {
		return valMulta;
	}

	public void setValMulta(double valMulta) {
		this.valMulta = valMulta;
	}

	public Date getDatPagamento() {
		return datPagamento;
	}

	public void setDatPagamento(Date datPagamento) {
		this.datPagamento = datPagamento;
	}

	public String getNumAuto() {
		return numAuto;
	}

	public void setNumAuto(String numAuto) {
		this.numAuto = numAuto;
	}

	public int getFkIdInfracao() {
		return fkIdInfracao;
	}

	public void setFkIdInfracao(int fkIdInfracao) {
		this.fkIdInfracao = fkIdInfracao;
	}

	public String getCodInfracao() {
		return codInfracao;
	}

	public void setCodInfracao(String codInfracao) {
		this.codInfracao = codInfracao;
	}

	public int getCodStatusDetran() {
		return codStatusDetran;
	}

	public void setCodStatusDetran(int codStatusDetran) {
		this.codStatusDetran = codStatusDetran;
	}

	public double getValPago() {
		return valPago;
	}

	public void setValPago(double valPago) {
		this.valPago = valPago;
	}

	public TipoVinculo getCodTipoVinculo() {
		return codTipoVinculo;
	}

	public void setCodTipoVinculo(TipoVinculo codTipoVinculo) {
		this.codTipoVinculo = codTipoVinculo;
	}

	public String getCaminhoImgAuto() {
		return caminhoImgAuto;
	}

	public void setCaminhoImgAuto(String caminhoImgAuto) {
		this.caminhoImgAuto = caminhoImgAuto;
	}
	
	
}
