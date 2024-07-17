package com.analiasavino.Foro_Api.infra.security;

import com.analiasavino.Foro_Api.domain.usuario.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionService implements UserDetailsService {

  @Autowired
  private RepositoryUsuario repositoryUsuario;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return repositoryUsuario.findByUsername(username);
  }
}
