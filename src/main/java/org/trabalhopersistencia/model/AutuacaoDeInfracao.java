package org.trabalhopersistencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ai_valido")
public class AutuacaoDeInfracao {
	@Id
	@Column(name = "num_auto")
	private String numAuto;
	
	@Column(name = "cod_status")
	private int codStatus;
	
	@Column(name = "tip_abordagem")
	private char tipAbordagem;
	
	@Column(name = "uf_placa")
	private String ufPlaca;
	
	@Column(name = "ind_assinou_auto")
	private char indAssinouAuto;
	
	@Column(name = "uf_infracao")
	private String ufInfracao;
	
	@Column(name = "num_km_infracao")
	private double numKmInfracao;
	
	@Column(name = "cod_municipio_infracao")
	private String codMunicipioInfracao;
	
	@Column(name = "hor_infracao")
	private String horInfracao;
	
	@Column(name = "ind_sentido_trafego")
	char indSentidoTrafego;
	
	@Column(name = "tip_medicao")
	private String tipMedicao;
	
	@Column(name = "med_realizada")
	private double medRealizada;
	
	@Column(name = "lim_regulamentar")
	double limRegulamentar;
	
	@Column(name = "med_considerada")
	double medConsiderada;
	
	@Column(name = "exc_verificado")
	private double excVerificado;
	
	@Column(name = "des_equip_medicao")
	private String desEquipMedicao;
	
	@Column(name = "mod_equip_medicao")
	private String modEquipMedicao;
	
	@Column(name = "num_equip_medicao")
	String numEquipMedicao;
	
	@Column(name = "ind_observacao")
	private char indObservacao;
	
	@Column(name = "txt_data_infracao")
	private String txtDataInfracao;
	
	@Column(name = "dat_infracao")
	private int datInfracao;
	
	@Column(name = "cod_ultima_infracao_medicao")
	private String codUltimaInfracaoMedicao;
	
	@Column(name = "uf_placa_pesq")
	char ufPlacaPesq;
	
	@Column(name = "cod_regional_inclusao")
	private String codRegionalInclusao;
	
	@Column(name = "nom_proprietario")
	private String nomProprietario;
	
	@Column(name = "nom_unidade_medida")
	private String nomUnidadeMedida;
	
	@Column(name = "dat_afericao")
	private Date datAfericao;
	
	@Column(name = "dat_env_correio")
	private Date datEnvCorreio;
	
	@Column(name = "nom_imagem_nao_tratada")
	private String nomImagemNaoTratada;
	
	@Column(name = "nom_imagem_tratada")
	private String nomImagemTratada;
	
	//FK tbl_veiculo_marca.
	@Column(name = "cod_veiculo_marca")
	private int codVeiculoMarca;
	
	//FK tbl_veiculo_marca.
	@Column(name = "cod_veiculo_especie")
	private int codVeiculoEspecie;
	
	@Column(name = "nome_veiculo_marca")
	private String nomeVeiculoMarca;
	
	@Column(name = "num_doc_arrendatario")
	String numDocArrendatario;
	
	@Column(name = "cpf_cnpj_transferido")
	String cpfCnpjTransferido;
	
	@Column(name = "fk_id_operador_inclusao")
	private int fkIdOperadorInclusao;
	
	@Column(name = "metragem_infracao")
	private char metragemInfracao;
	
	@Column(name = "ind_veiculo_estrangeiro")
	private char indVeiculoEstrangeiro;
	
	@Column(name = "fk_id_cor")
	private int fkIdCor;
	
	@Column(name = "nota_fiscal")
	private char nota_fiscal;
	
	public AutuacaoDeInfracao() {
		
	}

	public String getNumAuto() {
		return numAuto;
	}

	public void setNumAuto(String numAuto) {
		this.numAuto = numAuto;
	}

	public int getCodStatus() {
		return codStatus;
	}

	public void setCodStatus(int codStatus) {
		this.codStatus = codStatus;
	}

	public char getTipAbordagem() {
		return tipAbordagem;
	}

	public void setTipAbordagem(char tipAbordagem) {
		this.tipAbordagem = tipAbordagem;
	}

	public String getUfPlaca() {
		return ufPlaca;
	}

	public void setUfPlaca(String ufPlaca) {
		this.ufPlaca = ufPlaca;
	}

	public char getIndAssinouAuto() {
		return indAssinouAuto;
	}

	public void setIndAssinouAuto(char indAssinouAuto) {
		this.indAssinouAuto = indAssinouAuto;
	}

	public String getUfInfracao() {
		return ufInfracao;
	}

	public void setUfInfracao(String ufInfracao) {
		this.ufInfracao = ufInfracao;
	}

	public double getNumKmInfracao() {
		return numKmInfracao;
	}

	public void setNumKmInfracao(double numKmInfracao) {
		this.numKmInfracao = numKmInfracao;
	}

	public String getCodMunicipioInfracao() {
		return codMunicipioInfracao;
	}

	public void setCodMunicipioInfracao(String codMunicipioInfracao) {
		this.codMunicipioInfracao = codMunicipioInfracao;
	}

	public String getHorInfracao() {
		return horInfracao;
	}

	public void setHorInfracao(String horInfracao) {
		this.horInfracao = horInfracao;
	}

	public char getIndSentidoTrafego() {
		return indSentidoTrafego;
	}

	public void setIndSentidoTrafego(char indSentidoTrafego) {
		this.indSentidoTrafego = indSentidoTrafego;
	}

	public String getTipMedicao() {
		return tipMedicao;
	}

	public void setTipMedicao(String tipMedicao) {
		this.tipMedicao = tipMedicao;
	}

	public double getMedRealizada() {
		return medRealizada;
	}

	public void setMedRealizada(double medRealizada) {
		this.medRealizada = medRealizada;
	}

	public double getLimRegulamentar() {
		return limRegulamentar;
	}

	public void setLimRegulamentar(double limRegulamentar) {
		this.limRegulamentar = limRegulamentar;
	}

	public double getMedConsiderada() {
		return medConsiderada;
	}

	public void setMedConsiderada(double medConsiderada) {
		this.medConsiderada = medConsiderada;
	}

	public double getExcVerificado() {
		return excVerificado;
	}

	public void setExcVerificado(double excVerificado) {
		this.excVerificado = excVerificado;
	}

	public String getDesEquipMedicao() {
		return desEquipMedicao;
	}

	public void setDesEquipMedicao(String desEquipMedicao) {
		this.desEquipMedicao = desEquipMedicao;
	}

	public String getModEquipMedicao() {
		return modEquipMedicao;
	}

	public void setModEquipMedicao(String modEquipMedicao) {
		this.modEquipMedicao = modEquipMedicao;
	}

	public String getNumEquipMedicao() {
		return numEquipMedicao;
	}

	public void setNumEquipMedicao(String numEquipMedicao) {
		this.numEquipMedicao = numEquipMedicao;
	}

	public char getIndObservacao() {
		return indObservacao;
	}

	public void setIndObservacao(char indObservacao) {
		this.indObservacao = indObservacao;
	}

	public String getTxtDataInfracao() {
		return txtDataInfracao;
	}

	public void setTxtDataInfracao(String txtDataInfracao) {
		this.txtDataInfracao = txtDataInfracao;
	}

	public int getDatInfracao() {
		return datInfracao;
	}

	public void setDatInfracao(int datInfracao) {
		this.datInfracao = datInfracao;
	}

	public String getCodUltimaInfracaoMedicao() {
		return codUltimaInfracaoMedicao;
	}

	public void setCodUltimaInfracaoMedicao(String codUltimaInfracaoMedicao) {
		this.codUltimaInfracaoMedicao = codUltimaInfracaoMedicao;
	}

	public char getUfPlacaPesq() {
		return ufPlacaPesq;
	}

	public void setUfPlacaPesq(char ufPlacaPesq) {
		this.ufPlacaPesq = ufPlacaPesq;
	}

	public String getCodRegionalInclusao() {
		return codRegionalInclusao;
	}

	public void setCodRegionalInclusao(String codRegionalInclusao) {
		this.codRegionalInclusao = codRegionalInclusao;
	}

	public String getNomProprietario() {
		return nomProprietario;
	}

	public void setNomProprietario(String nomProprietario) {
		this.nomProprietario = nomProprietario;
	}

	public String getNomUnidadeMedida() {
		return nomUnidadeMedida;
	}

	public void setNomUnidadeMedida(String nomUnidadeMedida) {
		this.nomUnidadeMedida = nomUnidadeMedida;
	}

	public Date getDatAfericao() {
		return datAfericao;
	}

	public void setDatAfericao(Date datAfericao) {
		this.datAfericao = datAfericao;
	}

	public Date getDatEnvCorreio() {
		return datEnvCorreio;
	}

	public void setDatEnvCorreio(Date datEnvCorreio) {
		this.datEnvCorreio = datEnvCorreio;
	}

	public String getNomImagemNaoTratada() {
		return nomImagemNaoTratada;
	}

	public void setNomImagemNaoTratada(String nomImagemNaoTratada) {
		this.nomImagemNaoTratada = nomImagemNaoTratada;
	}

	public String getNomImagemTratada() {
		return nomImagemTratada;
	}

	public void setNomImagemTratada(String nomImagemTratada) {
		this.nomImagemTratada = nomImagemTratada;
	}

	public int getCodVeiculoMarca() {
		return codVeiculoMarca;
	}

	public void setCodVeiculoMarca(int codVeiculoMarca) {
		this.codVeiculoMarca = codVeiculoMarca;
	}

	public int getCodVeiculoEspecie() {
		return codVeiculoEspecie;
	}

	public void setCodVeiculoEspecie(int codVeiculoEspecie) {
		this.codVeiculoEspecie = codVeiculoEspecie;
	}

	public String getNomeVeiculoMarca() {
		return nomeVeiculoMarca;
	}

	public void setNomeVeiculoMarca(String nomeVeiculoMarca) {
		this.nomeVeiculoMarca = nomeVeiculoMarca;
	}

	public String getNumDocArrendatario() {
		return numDocArrendatario;
	}

	public void setNumDocArrendatario(String numDocArrendatario) {
		this.numDocArrendatario = numDocArrendatario;
	}

	public String getCpfCnpjTransferido() {
		return cpfCnpjTransferido;
	}

	public void setCpfCnpjTransferido(String cpfCnpjTransferido) {
		this.cpfCnpjTransferido = cpfCnpjTransferido;
	}

	public int getFkIdOperadorInclusao() {
		return fkIdOperadorInclusao;
	}

	public void setFkIdOperadorInclusao(int fkIdOperadorInclusao) {
		this.fkIdOperadorInclusao = fkIdOperadorInclusao;
	}

	public char getMetragemInfracao() {
		return metragemInfracao;
	}

	public void setMetragemInfracao(char metragemInfracao) {
		this.metragemInfracao = metragemInfracao;
	}

	public char getIndVeiculoEstrangeiro() {
		return indVeiculoEstrangeiro;
	}

	public void setIndVeiculoEstrangeiro(char indVeiculoEstrangeiro) {
		this.indVeiculoEstrangeiro = indVeiculoEstrangeiro;
	}

	public int getFkIdCor() {
		return fkIdCor;
	}

	public void setFkIdCor(int fkIdCor) {
		this.fkIdCor = fkIdCor;
	}

	public char getNota_fiscal() {
		return nota_fiscal;
	}

	public void setNota_fiscal(char nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}	
}
