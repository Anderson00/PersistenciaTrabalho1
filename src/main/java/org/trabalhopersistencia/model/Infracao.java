package org.trabalhopersistencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_infracao")
public class Infracao {
	@Id
	@Column(name = "id_detran_endereco")
	private int id;
	
	@Column(name = "nit")
	private int nit;
	
	//FK
	@Column(name = "fk_id_infracao")
	private int idInfracao;
	
	@Column(name = "cod_infracao")
	private String codInfracao;
	
	@Column(name = "marca_modelo_veiculo")
	private String marcaModeloVeiculo;
	
	@Column(name = "tipo_veiculo")
	private String tipoVeiculo;
	
	@Column(name = "especie_veiculo")
	private String especieVeiculo;
	
	@Column(name = "cidade")
	private String cidade;
		
	@Column(name = "data_atualizacao")
	private Date dataAtualizacao;
	
	public Infracao() {
		
	}
	
	public Infracao(int id) {
		this.id = id;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public int getIdInfracao() {
		return idInfracao;
	}

	public void setIdInfracao(int idInfracao) {
		this.idInfracao = idInfracao;
	}

	public String getCodInfracao() {
		return codInfracao;
	}

	public void setCodInfracao(String codInfracao) {
		this.codInfracao = codInfracao;
	}

	public String getMarcaModeloVeiculo() {
		return marcaModeloVeiculo;
	}

	public void setMarcaModeloVeiculo(String marcaModeloVeiculo) {
		this.marcaModeloVeiculo = marcaModeloVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getEspecieVeiculo() {
		return especieVeiculo;
	}

	public void setEspecieVeiculo(String especieVeiculo) {
		this.especieVeiculo = especieVeiculo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public int getId() {
		return id;
	}
	
}
