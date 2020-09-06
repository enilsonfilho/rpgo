package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Historia;

public interface HistoriaRepository extends JpaRepository<Historia, Long>{

	Historia findById(long id);
	
}
