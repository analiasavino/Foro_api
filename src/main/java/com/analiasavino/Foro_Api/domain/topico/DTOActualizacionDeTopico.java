package com.analiasavino.Foro_Api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DTOActualizacionDeTopico(
      @NotNull Long id,
      String titulo,
      String mensaje,
      String status,
      String curso
      ){

}
