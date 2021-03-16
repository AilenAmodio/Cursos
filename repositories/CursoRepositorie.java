package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Curso;
@Repository
@Transactional
public interface CursoRepositorie extends CrudRepository<Curso, Long> {

}
