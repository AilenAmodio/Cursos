package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entidades.Docente;
import com.example.demo.repositories.DocenteRepository;


@RestController
@RequestMapping ("/api/docente")
public class DocenteController {
	
	
	@Autowired
	DocenteRepository repo;
	
	@GetMapping("/guardar")
	public void saveDocente() {
		repo.save(new Docente("juancito", "Perez")); 
	}
	
	@GetMapping("/")
	public void okDocentes() {
		repo.findAll();
	}
	
	@Bean
	public CommandLineRunner loadDat (DocenteRepository repo ) {
		return (args) -> {
			Docente docente = new Docente("michael", "scott");
			docente.setDni(1234567);
			repo.save(docente);
		};
	}
}
