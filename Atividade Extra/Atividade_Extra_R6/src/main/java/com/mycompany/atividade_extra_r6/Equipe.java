package com.mycompany.atividade_extra_r6;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Operador> operadores;

    public Equipe(String nome) {
        this.nome = nome;
        this.operadores = new ArrayList<>();
    }

    public void adicionarOperador(Operador op) {
        operadores.add(op);
    }

    public void mostrarEquipe() {
        System.out.println("=== Equipe " + nome + " ===");
        for (Operador op : operadores) {
            op.exibirOperador();
            op.executarAcaoBomba();
            if (op instanceof Defensor) {
                ((IReforçar) op).reforçarParede();
            }
            //((IReforçar)op).usarGadgetEspecial();
            System.out.println();
        }
    }
}

