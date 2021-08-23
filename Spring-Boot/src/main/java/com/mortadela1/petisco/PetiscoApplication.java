package com.mortadela1.petisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class PetiscoApplication {
	
	@GetMapping()
	public String Helloworld1() {
		return "<hr><br><br>Resposta do Exercicio 1<br><br>Eu utilizei Persistência, trabalho em equipe. ";
	}
	
	@GetMapping("/exercicio2")
	public String Helloworld2() {
		return "<hr><br><br>Resposta do Exercicio 2<br><br> Completar a semana com o entendimento do conteudo e me preparar para o quem vem por ai.</hr>";
	}

	public static void main(String[] args) {
		SpringApplication.run(PetiscoApplication.class, args);
	}

}
