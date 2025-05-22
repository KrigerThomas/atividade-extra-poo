package com.mycompany.atividade_extra_r6;


public abstract class Operador {
    protected String codinome;
    protected int velocidade;
    protected int blindagem;
    protected String gadget;
    
    public Operador(String codinome, int velocidade, int blindagem, String gadget) {
        this.codinome = codinome;
        this.velocidade = velocidade;
        this.blindagem = blindagem;
        this.gadget = gadget;
    }
    
        public void exibirOperador() {
        System.out.println("Codinome: " + codinome + " | Velocidade: " + velocidade + " | Blindagem: " + blindagem);
    }

    public abstract void executarAcaoBomba();
}
