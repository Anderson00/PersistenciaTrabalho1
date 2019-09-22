package org.trabalhopersistencia.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_tipovinculo")
public class TipoVinculo {
	
	@Id
	@Column(name = "id_tipovinculo")
	private int idTipoVinculo;
	
	@Column(name = "des_tipovinculo")
	private String desTipoVinculo;
	
	@OneToMany(mappedBy = "codTipoVinculo")
	private List<Multa> multas;
	
	public TipoVinculo() {
		
	}
	
	public TipoVinculo(int idTipoVinculo) {
		this.idTipoVinculo = idTipoVinculo;
	}

	public int getIdTipovinculo() {
		return idTipoVinculo;
	}

	public void setIdTipovinculo(int idTipoVinculo) {
		this.idTipoVinculo = idTipoVinculo;
	}
	
	public void setDesTipoVinculo(String desTipoVinculo) {
		this.desTipoVinculo = desTipoVinculo;
	}
	
	public String getDesTipoVinculo() {
		return this.desTipoVinculo;
	}
	
}
