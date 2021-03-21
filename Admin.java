package com.example.demo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity


public class Admin extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	public Admin(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
}
}