package org.trabalhopersistencia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "observacao_infracao")
public class ObservacaoInfracao {
	@Id
	@Column(name = "id_observacao_infracao")
	private int idObservacaoInfracao;
	
	@Column(name = "descricao")
	private String descricao;
	
	@OneToMany(mappedBy = "fkIdObservacaoInfracao")
	private List<Infracao> infracao;
	
	public ObservacaoInfracao() {
		
	}
	
	public ObservacaoInfracao(int id, String desc) {
		this.idObservacaoInfracao = id;
		this.descricao = desc;
	}

	public int getIdObservacaoInfracao() {
		return idObservacaoInfracao;
	}

	public void setIdObservacaoInfracao(int idObservacaoInfracao) {
		this.idObservacaoInfracao = idObservacaoInfracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
