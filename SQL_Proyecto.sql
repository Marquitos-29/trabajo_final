drop database if exists CVA;
create database CVA;

USE CVA;
-- Vamos a emepzar ha crear las tablas

CREATE TABLE TInicio (
ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Usuario varchar(15) not null,
Contraseña varchar(50) not null
);

CREATE TABLE TDatosP (
ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Usuario varchar(15),
Apellido varchar(15),
Categoria varchar(15),
Numero INT,
Federado boolean,
Apodo varchar(20)
);

CREATE TABLE TDatosC (
ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
NºTicket int,
Usuario varchar(15),
Talla INT,
Precio double,
Recogida int,
Descripcion varchar (700),
Pagado boolean 
);
