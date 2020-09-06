package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.Dialogo;

public interface DialogoRepository extends JpaRepository<Dialogo, Long>{

	Dialogo findById(long id);
	
}
