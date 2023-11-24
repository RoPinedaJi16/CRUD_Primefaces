package org.practica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Report implements Serializable {
	
	private int id;
	private String folio;
	private String tipo;
	private String comentario;
	
	
	public Report() {
		super();
	}


	public Report(int id, String folio, String tipo, String comentario) {
		super();
		this.id = id;
		this.folio = folio;
		this.tipo = tipo;
		this.comentario = comentario;
	}
	
	@Id
	@GeneratedValue


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFolio() {
		return folio;
	}


	public void setFolio(String folio) {
		this.folio = folio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
