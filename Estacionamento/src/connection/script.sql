CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga (
idVaga int NOT NULL AUTO_INCREMENT,
numero int NOT NULL,
rua varchar(100) NOT NULL,
obliquia boolean NOT NULL,
PRIMARY KEY (idVaga));


)

CREATE TABLE motorista(
idMoto int NOT NULL AUTO_INCREMENT,
nome varchar (150) NOT NULL,
genero varchar(30) NOT NULL,
cpf int(11) NOT NULL,
rg int(8) NOT NULL,
celular int(11) NOT NULL,
email varchar(200) NOT NULL,
senha varchar(32) NOT NULL,
PRIMARY KEY (idMoto));

