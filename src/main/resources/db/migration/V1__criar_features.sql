CREATE SCHEMA IF NOT EXISTS deppit;

DROP TABLE IF EXISTS feature;

CREATE TABLE deppit.feature(
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL,
                              enable BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO deppit.feature (name, enable)VALUES
('feature 1', true),
('feature 2', false),
('feature 3', false),
('feature 4', true);