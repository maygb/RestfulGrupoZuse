package br.com.fiap.grupozuse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupozuse.model.Cadastro;
import br.com.fiap.grupozuse.model.HistoricoAcessos;

public interface HistoricoAcessosRepository extends JpaRepository<HistoricoAcessos, Integer>{
	
	List<HistoricoAcessos> findByCadastro(Cadastro cadastro);
}
