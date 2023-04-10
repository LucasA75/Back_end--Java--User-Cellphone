CREATE DATABASE IF NOT EXISTS prueba_tecnica;

-- Datos de users
INSERT INTO prueba_tecnica.user(email, is_active, modi_ed, name, password) values
("Camilo@gmail.com",1,"1999-02-1","Camilo","Hola121"),
("Pe@gmail.com",1,"1999-02-1","Pedro","Hola2123"),
("Juana@gmail.com",1,"1999-02-1","Juana","Hola31323");


-- Los phones los agregare por la API


SELECT * FROM prueba_tecnica.phone;
SELECT * FROM prueba_tecnica.user;
