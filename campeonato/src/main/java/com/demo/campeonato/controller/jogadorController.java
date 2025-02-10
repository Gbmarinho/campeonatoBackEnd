package com.demo.campeonato.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.campeonato.service.jogadorService;
import com.demo.campeonato.entities.JogadorEntity;

@RestController
@RequestMapping("/jogador")
public class jogadorController {
	private final jogadorService jogadorService;
	
	public jogadorController(jogadorService jogadorService) {
		this.jogadorService = jogadorService;
	}
	
	@GetMapping
	public List<JogadorEntity> buscarTodos() {
		return jogadorService.buscarTodos();
	}
}