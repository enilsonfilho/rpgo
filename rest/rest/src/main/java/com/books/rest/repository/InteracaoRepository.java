package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Interacao;

public interface InteracaoRepository extends JpaRepository<Interacao, Long>{

	Interacao findById(long id);
	
}
