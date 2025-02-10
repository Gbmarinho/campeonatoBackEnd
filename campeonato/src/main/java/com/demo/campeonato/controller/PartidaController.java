package com.demo.campeonato.controller;

import com.demo.campeonato.service.PartidaService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.campeonato.entities.PartidaEntity;

@RestController
@RequestMapping("/partida")
public class PartidaController {
	private final PartidaService partidaService;
	
	public PartidaController(PartidaService partidaService) {
		this.partidaService = partidaService;
	}
	
	@GetMapping
	public List<PartidaEntity> buscarTodos() {
		return partidaService.buscarTodos();
	}
}