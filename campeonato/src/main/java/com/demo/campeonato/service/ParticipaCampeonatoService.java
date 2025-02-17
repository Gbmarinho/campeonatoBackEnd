package com.demo.campeonato.service;

import com.demo.campeonato.repository.ParticipaCampeonatoRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.campeonato.entities.ParticipaCampeonatoEntity;

@Service
public class ParticipaCampeonatoService {
	private final ParticipaCampeonatoRepository participaCampeonatoRepository;
	
	public ParticipaCampeonatoService(ParticipaCampeonatoRepository participaCampeonatoRepository) {
		this.participaCampeonatoRepository = participaCampeonatoRepository;	
	}
	
	public List<ParticipaCampeonatoEntity> buscarTodos(){
		return participaCampeonatoRepository.findAll();
	}
	
	public Optional<ParticipaCampeonatoEntity> buscarPorId (Integer id) {
		return participaCampeonatoRepository.findById(id);
	}
	
	public List<ParticipaCampeonatoEntity> buscarPorPlayerId (Integer clubeId) {
		return participaCampeonatoRepository.findByClubeId(clubeId);
	}
	
	public ParticipaCampeonatoEntity criarParticipaCameponato(ParticipaCampeonatoEntity participaCampeonatoEntity) {
		return participaCampeonatoRepository.save(participaCampeonatoEntity);
	}
}