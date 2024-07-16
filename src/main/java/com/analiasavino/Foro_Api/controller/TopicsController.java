package com.analiasavino.Foro_Api.controller;

import com.analiasavino.Foro_Api.domain.topico.DTORegistroDeTopico;
import com.analiasavino.Foro_Api.domain.topico.RepositoryTopic;
import com.analiasavino.Foro_Api.domain.topico.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicsController {

  @Autowired
  private RepositoryTopic repositoryTopic;

  @PostMapping
  public void ingresarTopic(@RequestBody DTORegistroDeTopico datosIngresoTopic) {
    repositoryTopic.save(new Topico(datosIngresoTopic));

  }

}
