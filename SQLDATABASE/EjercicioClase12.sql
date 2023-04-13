-- ****************************************************************** --
--   DDL : Lenguaje de Definicón de Datos
-- ****************************************************************** --

-- verifico que se no exista la bases de datos
show databases;


-- creo base de dato
create database Qatar2022;


-- verifico que se creo la bd correctamente
show databases;



-- entro a la base de datos creada para poder crear las tablas
use Qatar2022; 




-- controlo que no tenga tablas y sea accesible
show tables;



-- crear una tabla en la base de datos
create table Empleado( IdEmpleado int not null
                      ,DNI int not null
                      ,nombre varchar(65)
                      ,apellido varchar(65)
                      ,nacionalidad varchar(45)
                      , Depto varchar(45)
                      );
                      
                      
-- controlo que se haya creado bien la tabla
show tables; 



-- Veo los campos dentro de la tabla        
desc empleado;          

   
-- Creo clave primaria y la hago autoincremental
alter table empleado add primary key (IdEmpleado);


-- Clave primaria: la hago autoincremental
alter table empleado modify IdEmpleado int auto_increment;



-- ****************************************************************** --
--   DML-DQL : Lenguaje de Manipulación y Consulta de Datos 
-- ****************************************************************** --

-- Insertamos datos a la table, hay que respetar la definicion de los campos
INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(99888777,'Lionel Andrés','Messi','Argentino','sistemas');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(11222333,'Emiliano','Martinez','Argentino','mantenimiento');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(44555666,'Enzo','Perez','Argentino','logistica');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(44555666,'Diego','Ramiro','Argentino','dev java');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(34555566,'Juancito Mengano','Fulano','Argentino','testing');

-- Seleccionamos y mostramos todos(*) los datos de la tabla 
select * from empleado;

-- Seleccionamos una fila de la tabla con where
select * from empleado where Depto= 'sistemas';

-- Seleccionamos fila y algunas columnas tabla con where
select  Depto, apellido, nombre as Nombre from empleado where Depto= 'logistica';

-- Seleccionamos fila y algunas columnas tabla con where , concateno Ap y Nombre

select  Depto, CONCAT_WS(', ',apellido,nombre) as Nombre from empleado where Depto= 'logistica';

-- Seleccionamos fila y algunas columnas tabla con where
select  * from empleado where apellido= 'Messi';

-- Modifico las columnas DNI, Nombre, Apellido y Depto la fila cuyo IdEmpleado es 2 
UPDATE empleado SET DNI = 40229235, nombre = 'Manuel', apellido = 'Martino'
WHERE IdEmpleado = 4;

-- Elimino fila repetida IdEmpleado = 5
delete from empleado where IdEmpleado = 5;




-- ****************************************************************** --
-- Sentecias utiles pero peligrosas
-- ****************************************************************** --
-- create database cursojava; use cursojava; create table t1(dato int);
-- alter table t1 rename t2;
-- drop table t2;
-- DROP DATABASE IF EXISTS argentina2023;
-- ****************************************************************** --