package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long>{

	Mensagem findById(long id);
	
}
