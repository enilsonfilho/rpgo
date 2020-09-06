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

import com.books.rest.entity.InteracaoDialogo;
import com.books.rest.repository.InteracaoDialogoRepository;

@RestController
@RequestMapping(value = "/apirest")
public class InteracaoDialogoController {

	@Autowired
	private InteracaoDialogoRepository interacaoDialogoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/interacoes/dialogo")
	public List<InteracaoDialogo> lID(){
		return interacaoDialogoRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/interacao/dialogo/{id}")
	public InteracaoDialogo lIDById(@PathVariable(value = "id") long id){
		return interacaoDialogoRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/interacao/dialogo")
    public InteracaoDialogo sID(@RequestBody InteracaoDialogo interacaoDialogo){
    	return interacaoDialogoRepository.save(interacaoDialogo);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/interacao/dialogo/{id}")
    public void dID(@PathVariable(value = "id") long id){
		interacaoDialogoRepository.deleteById(id);
    }
}