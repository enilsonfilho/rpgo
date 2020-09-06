package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.TrechoCandidato;

public interface TrechoCandidatoRepository extends JpaRepository<TrechoCandidato, Long>{

	TrechoCandidato findById(long id);
	
}
