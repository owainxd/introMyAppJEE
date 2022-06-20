CREATE DATABASE IF NOT EXISTS myapp_2022; 
USE myapp_2022;

CREATE TABLE users (
	id INT AUTO_INCREMENT, 
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL, 
    login VARCHAR(255) NOT NULL, 
    password VARCHAR(255) NOT NULL,
    
    PRIMARY KEY(id)
);

INSERT INTO users(nom, prenom, login, password)  VALUES ("Owain", "James", "owain", "123" );
INSERT INTO users(nom, prenom, login, password)  VALUES ("Chloe", "Klar",  "chloe", "123" );
INSERT INTO users(nom, prenom, login, password)  VALUES ("Max", "Jordi",  "max", "123");