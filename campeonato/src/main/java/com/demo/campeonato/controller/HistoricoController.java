package com.demo.campeonato.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.campeonato.entities.HistoricoEntity;
import com.demo.campeonato.service.HistoricoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/historico")
public class HistoricoController {
	private final HistoricoService historicoService;
	
	public HistoricoController(HistoricoService historicoService) {
		this.historicoService = historicoService;
	}
	
	@GetMapping
	public ResponseEntity<?> buscarTodos(
			@RequestParam(required = false) Integer playerId,
			@RequestParam(required = false) Integer id
	) {
		if(id != null) {
			return ResponseEntity.ok(historicoService.buscarPorId(id));
		}
	
		if(playerId != null) {
			return ResponseEntity.ok(historicoService.buscarPorPlayerId(playerId));
		}

		return ResponseEntity.ok(historicoService.buscarTodos());
	}
	
	@PostMapping
	public ResponseEntity<HistoricoEntity> criacaoHistorico(@RequestBody HistoricoEntity historicoEntity){
		return ResponseEntity.ok(historicoService.criarHistorico(historicoEntity));
	}
}