package com.demo.campeonato.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.campeonato.entities.HistoricoEntity;

@Repository
public interface HistoricoRepository extends JpaRepository<HistoricoEntity, Integer> {
	public List<HistoricoEntity> findByPlayerId(Integer id);

}