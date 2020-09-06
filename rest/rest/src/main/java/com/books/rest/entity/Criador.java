package com.books.rest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.books.rest.entity.enumerated.Preferencia;

@Entity
@Table(name = "criador")
@PrimaryKeyJoinColumn(name="id_criador", referencedColumnName="id")
public class Criador extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1428269380399923446L;
	
	@Column(name = "preferencia")
	private Preferencia preferencia;

	public Preferencia getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(Preferencia preferencia) {
		this.preferencia = preferencia;
	}
	
}
