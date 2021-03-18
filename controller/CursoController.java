package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Curso;
import com.example.demo.repositories.CursoRepositorie;

@RestController
@RequestMapping ("/api/curso")
public class CursoController {
	
	
	@Autowired
	CursoRepositorie repo;
	
	@GetMapping ("/guardar")
	public void saveCurso() {
		repo.save(new Curso(4, "Ingles"));
	}	
	
	@GetMapping("/")
	public void okCurso () {
		repo.findAll();
	}
}
