package com.demo.campeonato.service;

import com.demo.campeonato.repository.ParticipacaoRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.campeonato.entities.ParticipacaoEntity;

@Service
public class ParticipacaoService {
	private final ParticipacaoRepository participacaoRepository;
	
	public ParticipacaoService(ParticipacaoRepository participacaoRepository) {
		this.participacaoRepository = participacaoRepository;	
	}
	
	public List<ParticipacaoEntity> buscarTodos(){
		return participacaoRepository.findAll();
	}
	
	public Optional<ParticipacaoEntity> buscarPorId (Integer id) {
		return participacaoRepository.findById(id);
	}
	
	public List<ParticipacaoEntity> buscarPorPlayerId (Integer playerId) {
		return participacaoRepository.findByPlayerId(playerId);
	}
}