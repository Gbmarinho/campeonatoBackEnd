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
@Table(name = "tb_participation")
public class ParticipacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty(value = "goals_scored")
   	private int goals_scored;
    
    @JsonProperty(value = "yellow_cards")
   	private int yellow_cards;
    
    @JsonProperty(value = "red_cards")
   	private int red_cards;

    @JsonProperty(value = "match_id")
    @Column(name = "match_id", insertable = false, updatable = false)
    private Integer matchId;
    
    @ManyToOne
    @JoinColumn(name = "match_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("partida")
    private PartidaEntity partida;
    
    @JsonProperty(value = "player_id")
    @Column(name = "player_id", insertable = false, updatable = false)
    private Integer playerId;
    
    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("jogador")
    private JogadorEntity jogador;
}

