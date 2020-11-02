package com.books.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.books.rest.entity.Usuario;
import com.books.rest.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/apirest")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/usuarios")
	public List<Usuario> lU(){
		return usuarioRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuario/{id}")
	public Usuario lUById(@PathVariable(value = "id") long id){
		return usuarioRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/usuario")
    public Usuario sU(@RequestBody Usuario usuario){
		if(usuario.getSenha() != null){
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String password = usuario.getSenha();
			String senhaCriptografada = passwordEncoder.encode(password);
			
			usuario.setSenha(senhaCriptografada); 
		}
    	return usuarioRepository.save(usuario);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/usuario/{id}")
    public void dU(@PathVariable(value = "id") long id){
		usuarioRepository.delete(id);
    }
}
