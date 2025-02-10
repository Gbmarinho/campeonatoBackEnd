-- Inserindo clubes
INSERT INTO tb_club (name, founded_date, city, country, stadium, capacity, championships_won) VALUES
('FC Barcelona', '1899-11-29', 'Barcelona', 'Spain', 'Camp Nou', 99354, 26),
('Real Madrid', '1902-03-06', 'Madrid', 'Spain', 'Santiago Bernabéu', 81044, 35),
('Manchester United', '1878-01-01', 'Manchester', 'England', 'Old Trafford', 74879, 20),
('Bayern Munich', '1900-02-27', 'Munich', 'Germany', 'Allianz Arena', 75024, 32);

-- Inserindo campeonatos
INSERT INTO tb_championship (name, start_date, end_date) VALUES
('UEFA Champions League', '2024-09-15', '2025-06-01'),
('Premier League', '2024-08-10', '2025-05-20'),
('La Liga', '2024-08-15', '2025-05-25');

-- Inserindo clubes que participam dos campeonatos
INSERT INTO tb_participa_campeonato (club_id, championship_id) VALUES
(1, 1), -- Barcelona na Champions League
(2, 1), -- Real Madrid na Champions League
(3, 2), -- Manchester United na Premier League
(4, 2), -- Bayern Munich na Premier League
(1, 3), -- Barcelona na La Liga
(2, 3); -- Real Madrid na La Liga

-- Inserindo partidas
INSERT INTO tb_match (championship_id, home_club_id, away_club_id, match_date, stadium, score_home, score_away) VALUES
(1, 1, 2, '2024-10-01', 'Camp Nou', 2, 1),
(2, 3, 4, '2024-11-10', 'Old Trafford', 3, 2),
(3, 2, 1, '2024-12-15', 'Santiago Bernabéu', 1, 1);

-- Inserindo jogadores
INSERT INTO tb_player (name, birth_date, nationality, position) VALUES
('Lionel Messi', '1987-06-24', 'Argentina', 'Forward'),
('Cristiano Ronaldo', '1985-02-05', 'Portugal', 'Forward'),
('Kevin De Bruyne', '1991-06-28', 'Belgium', 'Midfielder'),
('Manuel Neuer', '1986-03-27', 'Germany', 'Goalkeeper');

-- Inserindo histórico de jogadores em clubes
INSERT INTO tb_history (club_id, player_id, start_date, end_date, goals_scored, yellow_cards, red_cards) VALUES
(1, 1, '2004-07-01', NULL, 672, 50, 1),
(2, 2, '2009-07-01', '2018-07-10', 450, 45, 2),
(3, 3, '2015-08-30', NULL, 90, 30, 1),
(4, 4, '2011-07-01', NULL, 0, 10, 0);

-- Inserindo participações de jogadores em partidas
INSERT INTO tb_participation (player_id, match_id, goals_scored, yellow_cards, red_cards) VALUES
(1, 1, 1, 1, 0),
(2, 1, 1, 0, 0),
(3, 2, 1, 0, 0),
(4, 3, 0, 0, 0);
