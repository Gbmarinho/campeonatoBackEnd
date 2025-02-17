package com.demo.campeonato.service;

import com.demo.campeonato.repository.PartidaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.campeonato.entities.PartidaEntity;

@Service
public class PartidaService {
	private final PartidaRepository partidaRepository;
	
	public PartidaService(PartidaRepository partidaRepository) {
		this.partidaRepository = partidaRepository;	
	}
	
	public List<PartidaEntity> buscarTodos(){
		return partidaRepository.findAll();
	}
	
	public Optional<PartidaEntity> buscarPorId (Integer id) {
		return partidaRepository.findById(id);
	}
	
	public List<PartidaEntity> buscarPorEstadio (String stadium) {
		return partidaRepository.findByStadium(stadium);
	}
	
	public PartidaEntity criarPartida(PartidaEntity partidaEntity) {
		return partidaRepository.save(partidaEntity);
	}
}