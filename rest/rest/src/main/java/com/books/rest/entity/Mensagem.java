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

import com.books.rest.entity.enumerated.TipoUM;

@Entity
@Table(name = "mensagem")
public class Mensagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7418478894554380076L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_interacao_dialogo")
	private InteracaoDialogo interacaoDialogo;
	
	@Column(name = "conteudo")
	private String conteudo;
	
	@Column(name = "tipo")
	private TipoUM tipoUM;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public InteracaoDialogo getInteracaoDialogo() {
		return interacaoDialogo;
	}

	public void setInteracaoDialogo(InteracaoDialogo interacaoDialogo) {
		this.interacaoDialogo = interacaoDialogo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public TipoUM getTipoUM() {
		return tipoUM;
	}

	public void setTipoUM(TipoUM tipoUM) {
		this.tipoUM = tipoUM;
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
		Mensagem other = (Mensagem) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
