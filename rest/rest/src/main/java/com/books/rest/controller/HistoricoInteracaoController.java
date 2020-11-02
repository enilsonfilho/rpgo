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

import com.books.rest.entity.HistoricoInteracao;
import com.books.rest.repository.HistoricoInteracaoRepository;

@RestController
@RequestMapping(value = "/apirest")
public class HistoricoInteracaoController {

	@Autowired
	private HistoricoInteracaoRepository historicoInteracaoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/historicos/interacao")
	public List<HistoricoInteracao> lHI(){
		return historicoInteracaoRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/historico/interacao/{id}")
	public HistoricoInteracao lHIById(@PathVariable(value = "id") long id){
		return historicoInteracaoRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/historico/interacao")
    public HistoricoInteracao sHI(@RequestBody HistoricoInteracao historicoInteracao){
    	return historicoInteracaoRepository.save(historicoInteracao);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/historico/interacao/{id}")
    public void dC(@PathVariable(value = "id") long id){
		historicoInteracaoRepository.delete(id);
    }
}
