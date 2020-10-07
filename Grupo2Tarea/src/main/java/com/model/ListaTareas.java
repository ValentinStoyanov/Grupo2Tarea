package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ListaTareas")
public class ListaTareas {
	private String idLista;
	private String titulo;
	private String descripcion;
	private Tarea[] arrayTareas;
	
	public ListaTareas(String idLista, String titulo, String descripcion, Tarea[] arrayTareas) {
		this.idLista = idLista;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.arrayTareas = arrayTareas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdLista() {
		return idLista;
	}

	public void setIdLista(String idLista) {
		this.idLista = idLista;
	}

	public Tarea[] getArrayTareas() {
		return arrayTareas;
	}

	public void setArrayTareas(Tarea[] arrayTareas) {
		this.arrayTareas = arrayTareas;
	}
	
}
