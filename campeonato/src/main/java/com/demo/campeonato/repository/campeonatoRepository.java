package com.demo.campeonato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.campeonato.entities.CampeonatoEntity;
import java.util.List;

@Repository
public interface campeonatoRepository extends JpaRepository<CampeonatoEntity, Integer>{
	List<CampeonatoEntity> findByNameContainingIgnoreCase(String name); 
}