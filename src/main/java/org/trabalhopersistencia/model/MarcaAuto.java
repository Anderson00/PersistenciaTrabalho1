package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "marca_auto")
public class MarcaAuto {

	//FK tbl_ai_valido/tbl_ai_pendente/tbl_ai_cancelado
	@Column(name = "num_auto")
	String numAuto;
	
	//FK tbl_veiculo_marca
	@Column(name = "cod_veiculo_marca")
	int codVeiculoMarca;
	
	@Column(name = "nome_marca")
	String nomeMarca;

	public String getNumAuto() {
		return numAuto;
	}

	public void setNumAuto(String numAuto) {
		this.numAuto = numAuto;
	}

	public int getCodVeiculoMarca() {
		return codVeiculoMarca;
	}

	public void setCodVeiculoMarca(int codVeiculoMarca) {
		this.codVeiculoMarca = codVeiculoMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	
	
}
