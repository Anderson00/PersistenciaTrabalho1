package org.trabalhopersistencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_infracaocondutor")
public class InfracaoCondutor {

	//FK tbl_condutorInfrator
	@Id
	@Column(name = "cod_condutorinfrator")
	private int codCondutorInfrator;
	
	//FK tabela tbl_ai_valido.
	@Column(name = "num_auto")
	private String numAuto;
	
	//FK Processos
	@Column(name = "num_processo")
	private String numProcesso;
	
	@Column(name = "dat_apresentdoc")
	private Date datApresentDoc;
	
	@Column(name = "dat_entradasistema")
	private Date datEntradaSistema;
	
	public InfracaoCondutor() {
		
	}
	
	public InfracaoCondutor(int codCondutorInfrator) {
		this.codCondutorInfrator = codCondutorInfrator;
	}

	public int getCodCondutorInfrator() {
		return codCondutorInfrator;
	}

	public void setCodCondutorInfrator(int codCondutorInfrator) {
		this.codCondutorInfrator = codCondutorInfrator;
	}

	public String getNumAuto() {
		return numAuto;
	}

	public void setNumAuto(String numAuto) {
		this.numAuto = numAuto;
	}

	public String getNumProcesso() {
		return numProcesso;
	}

	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}

	public Date getDatApresentDoc() {
		return datApresentDoc;
	}

	public void setDatApresentDoc(Date datApresentDoc) {
		this.datApresentDoc = datApresentDoc;
	}

	public Date getDatEntradaSistema() {
		return datEntradaSistema;
	}

	public void setDatEntradaSistema(Date datEntradaSistema) {
		this.datEntradaSistema = datEntradaSistema;
	}
}
