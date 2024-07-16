package com.analiasavino.Foro_Api.controller;

import com.analiasavino.Foro_Api.domain.topico.*;
import jakarta.transaction.Transactional;
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
  @PutMapping()
  @Transactional
  public void actualizarTopico(@RequestBody @Valid DTOActualizacionDeTopico dtoActualizacionDeTopico){
    Topico topico = repositoryTopic.getReferenceById(dtoActualizacionDeTopico.id());
    topico.actualizarTopico(dtoActualizacionDeTopico);
  }

  @DeleteMapping("/{id}")
  @Transactional
  public void eliminarTopico(@PathVariable Long id){
    Topico topico = repositoryTopic.getReferenceById(id);
    repositoryTopic.delete(topico);

  }
}
