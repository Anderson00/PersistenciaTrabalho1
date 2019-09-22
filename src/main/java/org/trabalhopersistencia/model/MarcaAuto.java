package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marca_auto")
public class MarcaAuto {

	//FK tbl_ai_valido/tbl_ai_pendente/tbl_ai_cancelado
	@Id
	@Column(name = "num_auto")
	private String numAuto;
	
	//FK tbl_veiculo_marca
	@ManyToOne
	@JoinColumn(name = "cod_veiculo_marca")
	private VeiculoMarca codVeiculoMarca;
	
	@Column(name = "nome_marca")
	private String nomeMarca;

	public String getNumAuto() {
		return numAuto;
	}

	public void setNumAuto(String numAuto) {
		this.numAuto = numAuto;
	}

	public VeiculoMarca getCodVeiculoMarca() {
		return codVeiculoMarca;
	}

	public void setCodVeiculoMarca(VeiculoMarca codVeiculoMarca) {
		this.codVeiculoMarca = codVeiculoMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	
	
}
