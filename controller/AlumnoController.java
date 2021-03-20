package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
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
		repo.save(new Alumno("juan", "perez"));
	}
	@GetMapping("/")
	public void okAlumno() {
		repo.findAll();
	}
	
	
	@Bean
	public CommandLineRunner loadData (AlumnoRepository repo ) {
		return (args) -> {
			Alumno alumno= new Alumno("ailen", "amodio");
			Alumno alumno1= new Alumno("jim", "halpert");
			alumno1.setDni(1232565);
			alumno.setDni(13131225);
			repo.save(alumno1);
			repo.save(alumno);
		};
		
		
		
	}
}