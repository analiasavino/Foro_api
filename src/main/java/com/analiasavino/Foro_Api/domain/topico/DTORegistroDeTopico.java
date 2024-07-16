package com.analiasavino.Foro_Api.domain.topico;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DTORegistroDeTopico(
      @NotBlank
      String titulo,
      @NotBlank
      String mensaje,
      @NotNull
      LocalDateTime fecha,
      @NotNull
      Status status,
      @NotBlank
      String autor,
      @NotBlank
      String curso
      ){
}
