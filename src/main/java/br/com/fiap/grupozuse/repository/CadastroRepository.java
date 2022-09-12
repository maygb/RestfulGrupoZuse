package br.com.fiap.grupozuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupozuse.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{
	
	Cadastro findByCpf(String cpf);
}
