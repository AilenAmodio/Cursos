package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@DiscriminatorValue(value= "ALUMNO")

public class Alumno extends Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private boolean vacante= true;
	
	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

}
