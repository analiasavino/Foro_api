package com.analiasavino.Foro_Api.domain.topico;

import com.analiasavino.Foro_Api.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DTORegistroDeTopico(
      String titulo,
      String mensaje,
      LocalDateTime fechaCreacion,
      Status status,
      Long id_autor,
      String curso,
      String respuesta) {
}
