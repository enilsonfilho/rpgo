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
@Table(name = "trecho_candidato")
public class TrechoCandidato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7715891195909600742L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_dialogo")	
	private Dialogo dialogo;
	
	@ManyToOne
	@JoinColumn(name = "id_trecho")
	private Trecho trecho;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Dialogo getDialogo() {
		return dialogo;
	}

	public void setDialogo(Dialogo dialogo) {
		this.dialogo = dialogo;
	}

	public Trecho getTrecho() {
		return trecho;
	}

	public void setTrecho(Trecho trecho) {
		this.trecho = trecho;
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
		TrechoCandidato other = (TrechoCandidato) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
