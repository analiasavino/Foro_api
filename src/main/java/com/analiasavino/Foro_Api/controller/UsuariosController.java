package com.analiasavino.Foro_Api.controller;

import com.analiasavino.Foro_Api.domain.usuario.DTOUsuario;
import com.analiasavino.Foro_Api.domain.usuario.RepositoryUsuario;
import com.analiasavino.Foro_Api.domain.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

  @Autowired
  private RepositoryUsuario repositoryUsuario;

  public void registrarUsuario(@RequestBody DTOUsuario dtoUsuario){
    repositoryUsuario.save(new Usuario(dtoUsuario));
  }
}
