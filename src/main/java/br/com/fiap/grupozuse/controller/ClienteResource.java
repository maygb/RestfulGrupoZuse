package br.com.fiap.grupozuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.grupozuse.model.Cadastro;
import br.com.fiap.grupozuse.model.HistoricoAcessos;
import br.com.fiap.grupozuse.model.Usuario;
import br.com.fiap.grupozuse.repository.CadastroRepository;
import br.com.fiap.grupozuse.repository.HistoricoAcessosRepository;
import br.com.fiap.grupozuse.repository.UsuarioRepository;

@RestController
@RequestMapping("pessoa")
public class ClienteResource {
	
	@Autowired
	public CadastroRepository cadastroRepository;
	
	@Autowired
	public HistoricoAcessosRepository historicoRepository;
	
	@Autowired
	public UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Cadastro> listarCadastros(){
		return cadastroRepository.findAll();
	}
	
	@GetMapping("cadastro/{telefone}")
	public Cadastro buscarTelefoneCadastro(@PathVariable String telefone) {
		Cadastro cadastro = cadastroRepository.findByTelefone(telefone);
		
		return cadastro;
	}
	
	
	@GetMapping("usuario/{telefone}")
	public Usuario buscarTelefoneUsuario(@PathVariable String telefone) {
		Usuario usuario = usuarioRepository.findByTelefone(telefone);

		return usuario;
	}
		
	@GetMapping("historico/{telefone}")
	public List<HistoricoAcessos> buscarHistoricoAcessos(@PathVariable String telefone) {
		Cadastro cadastro = cadastroRepository.findByTelefone(telefone);
		List<HistoricoAcessos> listAcessos = historicoRepository.findByCadastro(cadastro);

		return listAcessos;
	}

}
