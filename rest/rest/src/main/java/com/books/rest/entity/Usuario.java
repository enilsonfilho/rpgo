package com.books.rest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@PrimaryKeyJoinColumn(name="id_usuario", referencedColumnName="id")
public class Usuario extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 767711119371336007L;
	
	@Column(name = "celular")
	private String celular;

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
