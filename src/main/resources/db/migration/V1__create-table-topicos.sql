CREATE TABLE topicos(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL UNIQUE,
    mensaje  VARCHAR(255) UNIQUE,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    curso VARCHAR(255) NOT NULL
    );