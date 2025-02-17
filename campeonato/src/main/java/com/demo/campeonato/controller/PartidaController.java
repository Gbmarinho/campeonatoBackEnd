package com.demo.campeonato.controller;

import com.demo.campeonato.service.PartidaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<PartidaEntity> buscarTodos(
			@RequestParam(required = false) String stadium
	) {
		return partidaService.buscarTodos();
	}
	
	@GetMapping("/busca")
	public List<PartidaEntity> buscarPorEstadio(
		@RequestParam(required = false) String stadium
	) {
		return partidaService.buscarPorEstadio(stadium);
	}
	
	@PostMapping
	public ResponseEntity<PartidaEntity> criacaoPartida(@RequestBody PartidaEntity partidaEntity){
		return ResponseEntity.ok(partidaService.criarPartida(partidaEntity));
	}
}