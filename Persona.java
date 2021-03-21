package com.example.demo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public abstract class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	protected String nombre;
	protected String apellido;
	protected Integer dni;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona (String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

}
