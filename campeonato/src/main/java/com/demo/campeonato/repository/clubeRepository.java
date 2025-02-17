package com.demo.campeonato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.demo.campeonato.entities.ClubeEntity;

@Repository
public interface clubeRepository extends JpaRepository <ClubeEntity, Integer>{
	@Query("SELECT c FROM ClubeEntity c WHERE " +
		"(COALESCE(:name, '') = '' OR LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
		"(COALESCE(:city, '') = '' OR LOWER(c.city) LIKE LOWER(CONCAT('%', :city, '%'))) AND " +
		"(COALESCE(:country, '') = '' OR LOWER(c.country) LIKE LOWER(CONCAT('%', :country, '%'))) AND " +
		"(COALESCE(:stadium, '') = '' OR LOWER(c.stadium) LIKE LOWER(CONCAT('%', :stadium, '%')))")
	List<ClubeEntity> searchClubs(
		@Param("name") String name,
		@Param("city") String city,
		@Param("country") String country,
		@Param("stadium") String stadium
	);	
}