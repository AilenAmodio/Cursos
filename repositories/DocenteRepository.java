package com.example.demo.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Docente;

@Repository
@Transactional

public interface DocenteRepository extends CrudRepository<Docente, Long> {
	
	Optional<Docente> findByNombre(String nombre);
	Optional<Docente> findByNombreAndApellido(String nombre, String apellido);
	
	
	
	
}
