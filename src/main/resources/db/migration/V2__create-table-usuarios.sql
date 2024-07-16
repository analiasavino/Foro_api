CREATE TABLE usuarios(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(100) NOT NULL,
        email VARCHAR(200) NOT NULL,
        contrasena VARCHAR(200) NOT NULL
        );