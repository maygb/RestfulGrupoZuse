package br.com.fiap.grupozuse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_HISTORICO_ACESSOS")
public class HistoricoAcessos {
	
	@Id
	@SequenceGenerator(name="historico", sequenceName="SQ_HISTORICO", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="historico")
	private int id;
	
	@ManyToOne
	private Cadastro cadastro;
	
	private String dataAcesso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}


	public String getDataAcesso() {
		return dataAcesso;
	}

	public void setDataAcesso(String dataAcesso) {
		this.dataAcesso = dataAcesso;
	}

}
