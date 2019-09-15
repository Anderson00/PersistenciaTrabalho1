package org.trabalhopersistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_infracao_cometida")
public class InfracaoCometida {
	
	//FK tbl_ai_valido
	@Id
	@Column(name = "num_auto")
	String numAuto;
	
	@Id
	@Column(name = "cod_infracao")
	String cod_infracao;
}
