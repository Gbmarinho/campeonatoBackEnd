package com.demo.campeonato.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

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
@Table(name = "tb_history")
public class HistoricoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty(value = "start_date")
	private String start_date;
    
    @JsonProperty(value = "end_date")
   	private String end_date;
    
    @JsonProperty(value = "goals_scored")
   	private int goals_scored;
    
    @JsonProperty(value = "yellow_cards")
   	private int yellow_cards;
    
    @JsonProperty(value = "red_cards")
   	private int red_cards;

    @ManyToOne
    @JoinColumn(name = "club_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("clube")
    private ClubeEntity clube;
    
    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("jogador")
    private JogadorEntity jogador;
}

