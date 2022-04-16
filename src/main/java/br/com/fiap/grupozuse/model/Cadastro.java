package br.com.fiap.grupozuse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="TB_CADASTRO")
public class Cadastro {
	
	@Id
	@SequenceGenerator(name="cadastro", sequenceName="SQ_CADASTRO", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cadastro")
	private int id;
	
	@NotBlank(message = "Nome obrigatório!")
	@Size(max=70)
	private String nome;
	
	@NotBlank(message = "CPF obrigatório!")
	private String cpf;
	
	@NotBlank(message = "Telefone obrigatório!")
	private String telefone;
	
	private String endereco;

	@Size(max=3)
	private String tipoSanguineo;
	
	@Size(max=70)
	private String alergia;
	
	@Size(max=70)
	private String doencaCronica;
	
	@NotBlank(message = "Contato de emergência é obrigatório!")
	@Size(max=70)
	private String nomeContatoEmergencia;
	
	@NotBlank(message = "Telefone do contato de emergência é obrigatório!")
	private String telContatoEmergencia;
	
	@Size(max=100)
	private String Observacoes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getDoencaCronica() {
		return doencaCronica;
	}

	public void setDoencaCronica(String doencaCronica) {
		this.doencaCronica = doencaCronica;
	}

	public String getNomeContatoEmergencia() {
		return nomeContatoEmergencia;
	}

	public void setNomeContatoEmergencia(String nomeContatoEmergencia) {
		this.nomeContatoEmergencia = nomeContatoEmergencia;
	}

	public String getTelContatoEmergencia() {
		return telContatoEmergencia;
	}

	public void setTelContatoEmergencia(String telContatoEmergencia) {
		this.telContatoEmergencia = telContatoEmergencia;
	}

	public String getObservacoes() {
		return Observacoes;
	}

	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", endereco="
				+ endereco + ", tipoSanguineo=" + tipoSanguineo + ", alergia=" + alergia + ", doencaCronica="
				+ doencaCronica + ", nomeContatoEmergencia=" + nomeContatoEmergencia + ", telContatoEmergencia="
				+ telContatoEmergencia + ", Observacoes=" + Observacoes + "]";
	}	
}
