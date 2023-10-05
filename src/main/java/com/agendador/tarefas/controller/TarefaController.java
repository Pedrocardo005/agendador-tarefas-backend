package com.agendador.tarefas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendador.tarefas.models.Tarefa;
import com.agendador.tarefas.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("")
    public ArrayList<Tarefa> getAll() {
        return tarefaService.getAll();
    }

    @PostMapping("")
    public Tarefa create(@RequestBody Tarefa tarefa) {
        return tarefaService.create(tarefa);
    }
}
