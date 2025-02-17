package com.demo.campeonato.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.campeonato.entities.HistoricoEntity;
import com.demo.campeonato.repository.HistoricoRepository;

@Service
public class HistoricoService {
	private final HistoricoRepository historicoRepository;
	
	public HistoricoService(HistoricoRepository historicoRepository) {
		this.historicoRepository = historicoRepository;
	}
	
	public List<HistoricoEntity> buscarTodos() {
		return historicoRepository.findAll();
	}
	
	public Optional<HistoricoEntity> buscarPorId(Integer Id) {
		return historicoRepository.findById(Id);
	}
	
	public List<HistoricoEntity> buscarPorPlayerId(Integer player_id) {
		return historicoRepository.findByPlayerId(player_id);
	}
	
	public HistoricoEntity criarHistorico(HistoricoEntity historicoEntity) {
		return historicoRepository.save(historicoEntity);
	}
}