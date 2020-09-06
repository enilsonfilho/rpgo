package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Trecho;

public interface TrechoRepository extends JpaRepository<Trecho, Long>{

	Trecho findById(long id);
	
}
