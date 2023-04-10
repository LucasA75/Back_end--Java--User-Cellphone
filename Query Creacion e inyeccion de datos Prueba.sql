CREATE DATABASE IF NOT EXISTS prueba_tecnica;

-- Datos de users
INSERT INTO prueba_tecnica.user(email, is_active, modi_ed, name, password) values
("Camilo@gmail.com","Montoya",1,"01-03-1999","Camilo","Hola1"),
("Pe@gmail.com","gutierrez",1,"01-03-1999","Pedro","Hola2"),
("Juana@gmail.com","Castro",1,"01-03-1999","Juana","Hola3");


-- Los phones los agregare por la API


SELECT * FROM prueba_tecnica.supervisor;
SELECT * FROM prueba_tecnica.empleado;


