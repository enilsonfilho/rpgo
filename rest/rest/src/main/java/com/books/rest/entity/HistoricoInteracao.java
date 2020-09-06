package com.books.rest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historico_interacao")
public class HistoricoInteracao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 736187028901396991L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_interacao")
	private Interacao interacao;
	
	@ManyToOne
	@JoinColumn(name = "id_capitulo")
	private Capitulo capitulo;
	
	@ManyToOne
	@JoinColumn(name = "id_trecho")
	private Trecho trecho;
	
	@ManyToOne
	@JoinColumn(name = "id_dialogo")
	private Dialogo dialogo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Interacao getInteracao() {
		return interacao;
	}

	public void setInteracao(Interacao interacao) {
		this.interacao = interacao;
	}

	public Capitulo getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
	}

	public Trecho getTrecho() {
		return trecho;
	}

	public void setTrecho(Trecho trecho) {
		this.trecho = trecho;
	}

	public Dialogo getDialogo() {
		return dialogo;
	}

	public void setDialogo(Dialogo dialogo) {
		this.dialogo = dialogo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricoInteracao other = (HistoricoInteracao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
