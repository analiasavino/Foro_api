package com.analiasavino.Foro_Api.controller;

import com.analiasavino.Foro_Api.domain.usuario.DatosAutenticacionUsuario;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

  private AuthenticationManager authenticationManager;

  @PostMapping
  public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
    Authentication token = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.username(),
          datosAutenticacionUsuario.contrasena());
    authenticationManager.authenticate(token);
    return ResponseEntity.ok().build();
  }
}

