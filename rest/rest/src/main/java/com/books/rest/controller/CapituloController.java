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

import com.books.rest.entity.Capitulo;
import com.books.rest.repository.CapituloRepository;

@RestController
@RequestMapping(value = "/apirest")
public class CapituloController {

	@Autowired
	private CapituloRepository capituloRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/capitulos")
	public List<Capitulo> lV(){
		return capituloRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/capitulo/{id}")
	public Capitulo lCById(@PathVariable(value = "id") long id){
		return capituloRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/capitulo")
    public Capitulo sC(@RequestBody Capitulo capitulo){
    	return capituloRepository.save(capitulo);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/capitulo/{id}")
    public void dC(@PathVariable(value = "id") long id){
		capituloRepository.delete(id);
    }
}
