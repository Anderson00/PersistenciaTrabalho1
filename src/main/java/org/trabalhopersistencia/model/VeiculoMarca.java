package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "tbl_veiculo_marca")
public class VeiculoMarca {
	
	@Id
	@Column(name = "pk_cod_veiculo_marca")
	private int pkCodVeiculoMarca;
	
	@Column(name = "marca")
	private String marca;
	
	@OneToMany(mappedBy = "codVeiculoMarca")
	private List<MarcaAuto> marcaAuto;
	
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
