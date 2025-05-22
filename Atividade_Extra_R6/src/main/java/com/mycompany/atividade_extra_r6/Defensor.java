package com.mycompany.atividade_extra_r6;


public class Defensor extends Operador implements IGadgetEspecial {

    public Defensor(String codinome, int velocidade, int blindagem, String gadget) {
        super(codinome, velocidade, blindagem, gadget);
    }

    @Override
    public void executarAcaoBomba() {
        System.out.println("Interceptar o desativador");
    }

    @Override
    public void usarGadgetEspecial() {
        System.out.println("O defensor " + codinome + " usa " + gadget);
    }

    @Override
    public void exibirOperador() {
        System.out.println("[Defensor] ");
        super.exibirOperador();
    }
}
