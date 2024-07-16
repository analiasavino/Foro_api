package com.analiasavino.Foro_Api.domain.topico;

import com.analiasavino.Foro_Api.domain.usuario.Usuario;
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
  @ManyToOne
  @JoinColumn(name = "author_id")
  private Usuario autor;
  private String curso;


  public Topico(DTORegistroDeTopico dtoRegistroDeTopico){
    this.titulo = dtoRegistroDeTopico.titulo();
    this.mensaje = dtoRegistroDeTopico.mensaje();
    this.fecha = dtoRegistroDeTopico.fecha();
    this.status = dtoRegistroDeTopico.status();
    this.autor = new Usuario(dtoRegistroDeTopico.id_autor());
    this.curso = dtoRegistroDeTopico.curso();


  }
}
