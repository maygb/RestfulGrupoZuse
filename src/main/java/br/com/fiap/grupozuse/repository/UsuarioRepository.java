package br.com.fiap.grupozuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.grupozuse.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByTelefone(String telefone);

}
