package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.InteracaoDialogo;

public interface InteracaoDialogoRepository extends JpaRepository<InteracaoDialogo, Long>{

	InteracaoDialogo findById(long id);
	
}
