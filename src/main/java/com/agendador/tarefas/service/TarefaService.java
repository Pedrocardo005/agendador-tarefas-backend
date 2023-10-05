package com.agendador.tarefas.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.agendador.tarefas.models.Tarefa;
import com.agendador.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {
    private TarefaRepository tarefaRepository = new TarefaRepository();

    public ArrayList<Tarefa> getAll() {
        return tarefaRepository.getAll();
    }

    public Tarefa create(Tarefa tarefa) {
        return tarefaRepository.create(tarefa);
    }
}
