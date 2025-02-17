package com.demo.campeonato.controller;

import com.demo.campeonato.service.clubeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.demo.campeonato.entities.ClubeEntity;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clube")
public class clubeController {
	private final clubeService clubeService;
	
	public clubeController(clubeService clubeService) {
		this.clubeService = clubeService;
	}
	
	@GetMapping
	public ResponseEntity<?> buscarTodos(
			@RequestParam(required = false) Integer id
	) {
		if(id != null) {
			return ResponseEntity.ok(clubeService.buscarPorId(id));
		}
		return ResponseEntity.ok(clubeService.buscarTodos()) ;
	}
	
	@GetMapping("/busca") 
	public ResponseEntity<List<ClubeEntity>> busca(
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String city,
			@RequestParam(required = false) String country,
			@RequestParam(required = false) String stadium
	){
		return ResponseEntity.ok(clubeService.buscarClubes(name, city, country, stadium));
	}
	
	@PostMapping
	public ResponseEntity<ClubeEntity> criarClube(@RequestBody ClubeEntity clubeEntity) {
		return ResponseEntity.ok(clubeService.criarClube(clubeEntity));
	} 
}