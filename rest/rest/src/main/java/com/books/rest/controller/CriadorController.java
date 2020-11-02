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

import com.books.rest.entity.Criador;
import com.books.rest.repository.CriadorRepository;

@RestController
@RequestMapping(value = "/apirest")
public class CriadorController {

	@Autowired
	private CriadorRepository criadorRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/criadores")
	public List<Criador> lV(){
		return criadorRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/criador/{id}")
	public Criador lCById(@PathVariable(value = "id") long id){
		return criadorRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/criador")
    public Criador sC(@RequestBody Criador criador){
		if(criador.getSenha() != null){
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String password = criador.getSenha();
			String senhaCriptografada = passwordEncoder.encode(password);
			
			criador.setSenha(senhaCriptografada); 
		}
    	return criadorRepository.save(criador);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/criador/{id}")
    public void dC(@PathVariable(value = "id") long id){
		criadorRepository.delete(id);
    }
}
