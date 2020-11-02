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

import com.books.rest.entity.TrechoCandidato;
import com.books.rest.repository.TrechoCandidatoRepository;

@RestController
@RequestMapping(value = "/apirest")
public class TrechoCandidatoController {
	
	@Autowired
	private TrechoCandidatoRepository trechoCandidatoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/trechos/candidato")
	public List<TrechoCandidato> lTC(){
		return trechoCandidatoRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/trecho/candidato/{id}")
	public TrechoCandidato lTCById(@PathVariable(value = "id") long id){
		return trechoCandidatoRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/trecho/candidato")
    public TrechoCandidato sTC(@RequestBody TrechoCandidato trechoCandidato){
    	return trechoCandidatoRepository.save(trechoCandidato);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/trecho/candidato/{id}")
    public void dTC(@PathVariable(value = "id") long id){
		trechoCandidatoRepository.delete(id);
    }
}
