package com.analiasavino.Foro_Api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "Topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String titulo;
  private String mensaje;
  private LocalDateTime fecha;
  @Enumerated(EnumType.STRING)
  private Status status;
  private String autor;
  private String curso;


  public Topico(DTORegistroDeTopico dtoRegistroDeTopico) {
    this.titulo = dtoRegistroDeTopico.titulo();
    this.mensaje = dtoRegistroDeTopico.mensaje();
    this.fecha = dtoRegistroDeTopico.fecha();
    this.status = dtoRegistroDeTopico.status();
    this.autor = dtoRegistroDeTopico.autor();
    this.curso = dtoRegistroDeTopico.curso();

  }

  public void actualizarTopico(DTOActualizacionDeTopico dtoActualizacionDeTopico) {
    if (dtoActualizacionDeTopico.titulo() != null) {
      this.titulo = dtoActualizacionDeTopico.titulo();
    }
    if (dtoActualizacionDeTopico.mensaje() != null) {
      this.mensaje = dtoActualizacionDeTopico.mensaje();
    }
    if (dtoActualizacionDeTopico.status() != null) {
      this.status = Status.valueOf(dtoActualizacionDeTopico.status());
    }
    if (dtoActualizacionDeTopico.curso() != null) {
      this.curso = dtoActualizacionDeTopico.curso();
    }
  }
}
