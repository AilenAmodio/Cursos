package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Alumno;
import com.example.demo.repositories.AlumnoRepository;

@RestController
@RequestMapping ("/api/alumno")
public class AlumnoController {
	
	@Autowired 
	AlumnoRepository repo;
	
	@GetMapping("/guardar")
	public void saveAlumno() {
		repo.save(new Alumno("Ailen", "Amodio"));
		repo.save(new Alumno("juan", "perez"));
	}
	@GetMapping("/")
	public void okAlumno() {
		repo.findAll();
	}
}