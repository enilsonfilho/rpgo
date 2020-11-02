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

import com.books.rest.entity.Trecho;
import com.books.rest.repository.TrechoRepository;

@RestController
@RequestMapping(value = "/apirest")
public class TrechoController {

	@Autowired
	private TrechoRepository trechoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/trechos")
	public List<Trecho> lT(){
		return trechoRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/trecho/{id}")
	public Trecho lTById(@PathVariable(value = "id") long id){
		return trechoRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/trecho")
    public Trecho sT(@RequestBody Trecho trecho){
    	return trechoRepository.save(trecho);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/trecho/{id}")
    public void dT(@PathVariable(value = "id") long id){
		trechoRepository.delete(id);
    }
}
