package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Alumno;
@Repository
@Transactional
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
