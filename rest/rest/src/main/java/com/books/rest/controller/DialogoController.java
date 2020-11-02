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

import com.books.rest.entity.Dialogo;
import com.books.rest.repository.DialogoRepository;

@RestController
@RequestMapping(value = "/apirest")
public class DialogoController {

	@Autowired
	private DialogoRepository dialogoRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/dialogos")
	public List<Dialogo> lD(){
		return dialogoRepository.findAll();
	}
    
	@ResponseStatus(HttpStatus.OK)
    @GetMapping("/dialogo/{id}")
	public Dialogo lDById(@PathVariable(value = "id") long id){
		return dialogoRepository.findById(id);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/dialogo")
    public Dialogo sD(@RequestBody Dialogo dialogo){
    	return dialogoRepository.save(dialogo);
    }
    
	@ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/dialogo/{id}")
    public void dD(@PathVariable(value = "id") long id){
		dialogoRepository.delete(id);
    }
}
