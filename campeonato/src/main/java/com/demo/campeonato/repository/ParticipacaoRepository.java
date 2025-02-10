package com.demo.campeonato.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.campeonato.entities.ParticipacaoEntity;

@Repository
public interface ParticipacaoRepository extends JpaRepository<ParticipacaoEntity, Integer> {
	public List<ParticipacaoEntity> findByPlayerId(Integer id);
}