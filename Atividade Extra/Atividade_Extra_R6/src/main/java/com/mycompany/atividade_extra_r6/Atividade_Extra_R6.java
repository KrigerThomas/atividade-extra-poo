package com.mycompany.atividade_extra_r6;


public class Atividade_Extra_R6 {

public static void main(String[] args) {
        
        //Operador op1 = new Operador("ash", 3, 1); Classe Abstrata - não pode ser instanciada diretamente
    
        Equipe equipeAtacante = new Equipe("Atacante");
        Equipe equipeDefensora = new Equipe("Defensora");
        
        
        //Time de ataque
        equipeAtacante.adicionarOperador(new Atacante("Ash", 3, 1, "M120 CREM"));
        equipeAtacante.adicionarOperador(new Atacante("Thermite", 2, 2, "Carga Exotermica"));
        equipeAtacante.adicionarOperador(new Atacante("Deimos", 2, 2, "Deimos Tracker"));
        equipeAtacante.adicionarOperador(new Atacante("Ace", 2, 2, "Selma"));
        equipeAtacante.adicionarOperador(new Atacante("Buck", 2, 2, "Chave mestra"));
        
        //Time de defesa
        
        equipeDefensora.adicionarOperador(new Defensor("Mute", 2, 2, "Jammer"));
        equipeDefensora.adicionarOperador(new Defensor("Jäger", 3, 1, "ADS"));
        equipeDefensora.adicionarOperador(new Defensor("Smoke", 2, 2, "Canister"));
        equipeDefensora.adicionarOperador(new Defensor("Azami", 2, 2, "Barreira Kiba"));
        equipeDefensora.adicionarOperador(new Defensor("Fenrir", 2, 2, "F-NATT"));

        equipeAtacante.mostrarEquipe();
        equipeDefensora.mostrarEquipe();
    }
}
