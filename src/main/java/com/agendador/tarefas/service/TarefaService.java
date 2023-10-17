package com.agendador.tarefas.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agendador.tarefas.models.Tarefa;
import com.agendador.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository tarefaRepository;

    public ArrayList<Tarefa> getAll() {
        return (ArrayList<Tarefa>) tarefaRepository.findAll();
    }

    public Tarefa create(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}
