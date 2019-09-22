package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status_detran")
public class StatusDetran {
	@Id
	@Column(name = "cod_status")
	private int codStatus;
	
	@Column(name = "des_status_detran")
	private String desStatusDetran;
	
	public StatusDetran() {
		
	}
	
	public StatusDetran(int id, String status) {
		this.codStatus = id;
		this.desStatusDetran = status;
	}

	public int getCodStatus() {
		return codStatus;
	}

	public void setCodStatus(int codStatus) {
		this.codStatus = codStatus;
	}

	public String getDesStatusDetran() {
		return desStatusDetran;
	}

	public void setDesStatusDetran(String desStatusDetran) {
		this.desStatusDetran = desStatusDetran;
	}
	
	
}