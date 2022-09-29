package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagem_GenController {
	
	@GetMapping
	public String objetivosGen() {
	return "<hr>Objetivos de aprendizagem dessa semana:<hr>"
				+"<br><li>Melhorar o meu gerenciamento de tempo <li>Praticar mais exercícios de POO <li>Aprimorar conhecimento teórico em Spring Boot<br>";

}
}