package com.helloworld.helloworld.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/BSM-gen")
public class BSM_GenerationController {
	
	@GetMapping
		public String bsmGen() {
			return "<hr>BSMs da Generation Brasil<hr>"
					+ "<br><br>Mentalidades:<br><li>Orientação ao Futuro <li>Responsabilidade Pessoal <li>Mentalidade de Crescimento <li>Persistencia</br>"
					+ "<br>Habilidades:<li>Trabalho em Equipe <li>Atenção ao Detalhe <li>Proatividade <li>Comunicação</br>";
	}
	
}
