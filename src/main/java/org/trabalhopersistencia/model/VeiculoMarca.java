package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_veiculo_marca")
public class VeiculoMarca {
	
	@Id
	@Column(name = "pk_cod_veiculo_marca")
	private int pkCodVeiculoMarca;
	
	@Column(name = "marca")
	private String marca;
	
	public VeiculoMarca() {
		
	}
	
	public VeiculoMarca(int pkCodVeiculoMarca) {
		this.pkCodVeiculoMarca = pkCodVeiculoMarca;
	}

	public int getPkCodVeiculoMarca() {
		return pkCodVeiculoMarca;
	}

	public void setPkCodVeiculoMarca(int pkCodVeiculoMarca) {
		this.pkCodVeiculoMarca = pkCodVeiculoMarca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
