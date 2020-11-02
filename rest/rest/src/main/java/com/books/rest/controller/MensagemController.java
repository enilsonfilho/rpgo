package com.books.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.books.rest.entity.Mensagem;
import com.books.rest.repository.MensagemRepository;

@RestController
@RequestMapping(value = "/apirest")
public class MensagemController {

	@Autowired
	private MensagemRepository mensagemRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/mensagens")
	public List<Mensagem> lV(){
		return mensagemRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/mensagem/{id}")
	public Mensagem lCById(@PathVariable(value = "id") long id){
		return mensagemRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/mensagem")
    public Mensagem sC(@RequestBody Mensagem mensagem){
    	return mensagemRepository.save(mensagem);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/mensagem/{id}")
    public void dC(@PathVariable(value = "id") long id){
		mensagemRepository.delete(id);
    }
}
