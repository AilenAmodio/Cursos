package com.example.demo.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Curso;
@Repository
@Transactional
public interface CursoRepositorie extends CrudRepository<Curso, Long> {
	
	Optional<Curso> findByNombre(String nombre);
	Optional<Curso> findByNombreAndHora (String nombre, Integer hora);

}
