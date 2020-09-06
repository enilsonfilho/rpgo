package com.books.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.rest.entity.HistoricoInteracao;

public interface HistoricoInteracaoRepository extends JpaRepository<HistoricoInteracao, Long>{

	HistoricoInteracao findById(long id);
	
}
