package com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tarea")
public class Tarea {
	private String idTarea;
	private String contenido;
	private boolean completada;
	
	public Tarea(String idTarea, String contenido, boolean completada) {
		super();
		this.idTarea = idTarea;
		this.contenido = contenido;
		this.completada = completada;
	}

	public String getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	}
	
}
