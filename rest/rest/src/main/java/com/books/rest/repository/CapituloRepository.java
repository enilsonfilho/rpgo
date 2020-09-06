package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Capitulo;

public interface CapituloRepository extends JpaRepository<Capitulo, Long>{
	
	Capitulo findById(long id);

}
