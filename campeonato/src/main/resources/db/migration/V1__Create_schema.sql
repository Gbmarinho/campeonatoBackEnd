CREATE TABLE tb_club (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    founded_date VARCHAR(10) NOT NULL,
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    stadium VARCHAR(100) NOT NULL,
    capacity INT NOT NULL,
    championships_won INT DEFAULT 0
);

CREATE TABLE tb_championship (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    start_date VARCHAR(10) NOT NULL,
    end_date VARCHAR(10) NOT NULL
);

CREATE TABLE tb_participa_campeonato (
    id SERIAL PRIMARY KEY,
    club_id INT NOT NULL,
    championship_id INT NOT NULL,
    FOREIGN KEY (club_id) REFERENCES tb_club(id),
    FOREIGN KEY (championship_id) REFERENCES tb_championship(id)
);

CREATE TABLE tb_match (
    id SERIAL PRIMARY KEY,
    championship_id INT NOT NULL,
    home_club_id INT NOT NULL,
    away_club_id INT NOT NULL,
    match_date VARCHAR(10) NOT NULL,
    stadium VARCHAR(100) NOT NULL,
    score_home INT DEFAULT 0,
    score_away INT DEFAULT 0,
    FOREIGN KEY (championship_id) REFERENCES tb_championship(id),
    FOREIGN KEY (home_club_id) REFERENCES tb_club(id),
    FOREIGN KEY (away_club_id) REFERENCES tb_club(id)
);

CREATE TABLE tb_player (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    birth_date VARCHAR(10) NOT NULL,
    nationality VARCHAR(50) NOT NULL,
    position VARCHAR(50) NOT NULL
);

CREATE TABLE tb_history (
    id SERIAL PRIMARY KEY,
    club_id INT NOT NULL,
    player_id INT NOT NULL,
    start_date VARCHAR(10) NOT NULL,
    end_date VARCHAR(10),
    goals_scored INT DEFAULT 0,
    yellow_cards INT DEFAULT 0,
    red_cards INT DEFAULT 0,
    FOREIGN KEY (club_id) REFERENCES tb_club(id),
    FOREIGN KEY (player_id) REFERENCES tb_player(id)
);

CREATE TABLE tb_participation (
    id SERIAL PRIMARY KEY,
    player_id INT NOT NULL,
    match_id INT NOT NULL,
    goals_scored INT DEFAULT 0,
    yellow_cards INT DEFAULT 0,
    red_cards INT DEFAULT 0,
    FOREIGN KEY (player_id) REFERENCES tb_player(id),
    FOREIGN KEY (match_id) REFERENCES tb_match(id)
);
