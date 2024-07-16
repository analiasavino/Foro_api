package com.analiasavino.Foro_Api.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuarios")
@Table(name= "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String email;
  private String contrasena;


  public Usuario(DTOUsuario dtoUsuario){
    this.nombre = dtoUsuario.nombre();
    this.email = dtoUsuario.email();
    this.contrasena = dtoUsuario.contrasena();
  }


  public Usuario(Long aLong) {
  }
}
