package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Criador;

public interface CriadorRepository extends JpaRepository<Criador, Long>{
	
	Criador findById(long id);

}
