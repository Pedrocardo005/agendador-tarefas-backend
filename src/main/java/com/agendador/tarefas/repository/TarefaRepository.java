package com.agendador.tarefas.repository;

import java.util.ArrayList;
import java.util.Date;

import com.agendador.tarefas.models.Tarefa;

public class TarefaRepository {
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public TarefaRepository() {
        Tarefa tarefa = new Tarefa();
        tarefa.setInicio(new Date());
        tarefa.setNome("Primeira tarefa");
        tarefa.setPrioridade("Primeira prioridade");

        this.tarefas.add(tarefa);
    }

    public ArrayList<Tarefa> getAll() {
        return this.tarefas;
    }

    public Tarefa create(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        return tarefa;
    }
}
