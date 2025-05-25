package com.mycompany.atividade_extra_r6;


public class Atacante extends Operador {

    public Atacante(String codinome, int velocidade, int blindagem, String gadget) {
        super(codinome, velocidade, blindagem, gadget);
    }

    @Override
    public void executarAcaoBomba() {
        System.out.println("Plantar o desativador");
    }

    @Override
    public void exibirOperador() {
        System.out.println("[Atacante] ");
        super.exibirOperador();
    }
}

