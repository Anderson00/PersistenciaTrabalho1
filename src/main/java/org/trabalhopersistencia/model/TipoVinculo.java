package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_tipovinculo")
public class TipoVinculo {
	
	@Id
	@Column(name = "id_tipovinculo")
	int idTipoVinculo;
	
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
	
	
}
