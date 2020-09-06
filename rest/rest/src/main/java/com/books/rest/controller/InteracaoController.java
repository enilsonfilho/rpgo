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

import com.books.rest.entity.Interacao;
import com.books.rest.repository.InteracaoRepository;

@RestController
@RequestMapping(value = "/apirest")
public class InteracaoController {

	@Autowired
	private InteracaoRepository interacaoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/interacoes")
	public List<Interacao> lI(){
		return interacaoRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/interacao/{id}")
	public Interacao lIById(@PathVariable(value = "id") long id){
		return interacaoRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/interacao")
    public Interacao sI(@RequestBody Interacao interacao){
    	return interacaoRepository.save(interacao);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/interacao/{id}")
    public void dI(@PathVariable(value = "id") long id){
		interacaoRepository.deleteById(id);
    }
}
