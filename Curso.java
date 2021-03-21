package com.example.demo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long id; //numero de curso
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Curso(Integer hora, String nombre) {
		super();
		this.hora = hora;
		this.nombre = nombre;
	}


	private Integer hora;
	protected String nombre;
	protected Integer fecha; // duracion ¿meses?
	private Boolean vacantes =true;
	
	@ManyToOne
	private Docente docente;
	
	@OneToMany
	private List<Curso> cursos= new ArrayList<>();


}
