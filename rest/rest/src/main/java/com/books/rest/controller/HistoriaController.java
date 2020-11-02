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

import com.books.rest.entity.Historia;
import com.books.rest.repository.HistoriaRepository;

@RestController
@RequestMapping(value = "/apirest")
public class HistoriaController {

	@Autowired
	private HistoriaRepository historiaRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/historias")
	public List<Historia> lH(){
		return historiaRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/historia/{id}")
	public Historia lHById(@PathVariable(value = "id") long id){
		return historiaRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/historia")
    public Historia sH(@RequestBody Historia historia){
    	return historiaRepository.save(historia);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/historia/{id}")
    public void dH(@PathVariable(value = "id") long id){
		historiaRepository.delete(id);
    }
}
