package com.demo.campeonato.controller;

import com.demo.campeonato.responseDto.testeResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraVez")
public class firstController {
	
	@GetMapping("/")
	public testeResponseDto primeiraMensagem() {
		return new testeResponseDto("Funcionou");
	}
}