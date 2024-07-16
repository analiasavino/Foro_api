package com.analiasavino.Foro_Api.domain.topico;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record DTOListadoTopicos(
      Long id,
      String titulo,
      String mensaje,
      String fecha,
      String status,
      String autor,
      String curso
      ) {
      public DTOListadoTopicos(Topico topico) {
            this(topico.getId(),
                  topico.getTitulo(),
                  topico.getMensaje(),
                  topico.getFecha().toString(),
                  topico.getStatus().toString(),
                  topico.getAutor(),
                  topico.getCurso()) ;
      }

}
