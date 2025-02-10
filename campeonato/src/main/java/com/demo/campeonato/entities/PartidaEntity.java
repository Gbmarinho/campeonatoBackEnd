package com.demo.campeonato.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_match")
public class PartidaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty(value = "match_date")
	private String match_date;
    
    @JsonProperty(value = "stadium")
   	private String stadium;
    
    @JsonProperty(value = "score_home")
   	private int score_home;
    
    @JsonProperty(value = "score_away")
   	private int score_away;

    @JsonProperty(value = "home_club_id")
    @Column(name = "home_club_id", insertable = false, updatable = false)
    private Integer homeClubId;
    
    @ManyToOne
    @JoinColumn(name = "home_club_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("clube_home")
    private ClubeEntity clube_home;
    
    @JsonProperty(value = "away_club_id")
    @Column(name = "away_club_id", insertable = false, updatable = false)
    private Integer awayClubId;
    
    @ManyToOne
    @JoinColumn(name = "away_club_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("clube_away")
    private ClubeEntity clube_away;
    
  
    @JsonProperty(value = "championship_id")
    @Column(name = "championship_id", insertable = false, updatable = false)
    private Integer championshipId;
    
    @ManyToOne
    @JoinColumn(name = "championship_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("campeonato")
    private CampeonatoEntity campeonato;
    
}

