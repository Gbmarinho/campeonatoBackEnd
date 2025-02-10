package com.demo.campeonato.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.campeonato.entities.PartidaEntity;

@Repository
public interface PartidaRepository extends JpaRepository<PartidaEntity, Integer> {
	List<PartidaEntity> findByStadium(String stadium);
}