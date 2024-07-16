package com.analiasavino.Foro_Api.controller;

import com.analiasavino.Foro_Api.domain.topico.DTOListadoTopicos;
import com.analiasavino.Foro_Api.domain.topico.DTORegistroDeTopico;
import com.analiasavino.Foro_Api.domain.topico.RepositoryTopic;
import com.analiasavino.Foro_Api.domain.topico.Topico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

  @Autowired
  private RepositoryTopic repositoryTopic;

  @PostMapping
  public void ingresarTopico(@RequestBody @Valid DTORegistroDeTopico datosRegistroDeTopico) {
    repositoryTopic.save(new Topico(datosRegistroDeTopico));

  }
  @GetMapping
  public Page<DTOListadoTopicos> listadoTopicos(@PageableDefault(sort = {"curso"}) Pageable paginacion){
    return repositoryTopic.findAll(paginacion).map(DTOListadoTopicos::new);
  }
}
