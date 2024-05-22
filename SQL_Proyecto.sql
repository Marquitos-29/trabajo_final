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

CREATE TABLE TEquipo (
ID INT NOT NULL PRIMARY KEY,
categoria varchar (15),
genero char,
federado boolean,
primera_hora varchar (15),
segunda_hora varchar(15),
Precio int 
);

insert into TEquipo (ID, categoria, genero, federado, primera_hora, segunda_hora, Precio) values
(1, "alevin", "M", True, "L 16:00", "X 16:00", 30),
(2, "alevin", "F", True, "L 16:00", "X 16:00", 30),
(3, "alevin", "M", false, "M 16:00", "J 16:00", 15),
(4, "alevin", "F", false, "M 16:00", "J 16:00", 15),
(5, "Infantil", "M", True, "L 17:00", "X 17:00", 40),
(6, "Infantil", "F", True, "L 17:00", "X 17:00", 40),
(7, "Infantil", "M", false, "M 17:00", "J 17:00", 20),
(8, "Infantil", "F", false, "M 17:00", "J 17:00", 20),
(9, "Cadete", "M", True, "L 18:00", "X 18:00", 40),
(10, "Cadete", "F", True, "L 18:00", "X 18:00", 40),
(11, "Cadete", "M", false, "M 18:00", "J 18:00", 20),
(12, "Cadete", "F", false, "M 18:00", "J 18:00", 20),
(13, "Juvenil", "M", True, "L 19:00", "X 19:00", 45),
(14, "Juvenil", "F", True, "L 19:00", "X 19:00", 45),
(15, "Juvenil", "M", false, "M 19:00", "J 19:00", 25),
(16, "Juvenil", "F", false, "M 19:00", "J 19:00", 25),
(17, "Junior", "M", True, "L 20:00", "X 20:00", 45),
(18, "Junior", "F", True, "L 20:00", "X 20:00", 45),
(19, "Junior", "M", false, "M 20:00", "J 20:00", 25),
(20, "Junior", "F", false, "M 20:00", "J 20:00", 25),
(21, "Senior", "M", True, "L 21:00", "X 21:00", 50),
(22, "Senior", "F", True, "L 21:00", "X 21:00", 50),
(23, "Senior", "M", false, "M 21:00", "J 21:00", 30),
(24, "Senior", "F", false, "M 21:00", "J 21:00", 30);

insert into TInicio (Usuario, Contraseña) values 
("Marcos", "Marcos"),
("Alex", "Alex");

Select * from TInicio











