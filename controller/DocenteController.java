package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
		repo.save(new Docente("Damian", "Kuc")); 
	}
	@GetMapping("/")
	public void okDocentes() {
		//repo.save(new Docente("damian", "kuc"));
		repo.findAll();
	
	}
	
	
}
