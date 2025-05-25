
# 🕹️ Sistema de Operadores – Rainbow Six  
**Atividade Extra – Programação Orientada a Objetos**

Este projeto simula um sistema de gerenciamento de operadores baseado no universo do jogo Rainbow Six Siege. O objetivo da atividade é aplicar os conceitos de **classe abstrata**, **interface**, **herança** e **coleções** em Java.

---

## 🚀 Funcionalidades
- Adição de operadores atacantes e defensores
- Exibição dos detalhes dos operadores
- Comportamentos específicos por tipo de operador
- Organização de operadores em equipes

---

---

## 📌 Requisitos da Atividade

- Criar classe abstrata `Operador`
- Implementar interface `IReforcar`
- Criar classes `Atacante` e `Defensor`
- Criar classe `Equipe` com uma lista de operadores
- Implementar lógica principal na classe `Atividade_Extra_R6`

---

## 💻 Execução

Para rodar o projeto:
1. Clone este repositório
2. Abra a pasta no NetBeans (ou importe em sua IDE preferida)
3. Compile e execute a classe `Atividade_Extra_R6`

---

## 📚 Exemplo de uso
```java
Equipe equipeAtacante = new Equipe("Atacante");
equipeAtacante.adicionarOperador(new Atacante("Ash", 3, 1, "M120 CREM"));

Equipe equipeDefensora = new Equipe("Defensora");
equipeDefensora.adicionarOperador(new Defensor("Mute", 2, 2, "Jammer"));

equipeAtacante.mostrarEquipe();
equipeDefensora.mostrarEquipe();
```

---

## 🔗 Link do Enunciado

[Clique aqui para acessar o PDF com o enunciado da atividade](https://github.com/KrigerThomas/atividade-extra-poo/blob/main/Atividade%20Extra.pdf)

---

## 👤 Autor

- Nome: [Thomás Kriger de Souza]
- Professor: [Cassio Capucho Peçanha]
- Data de entrega: [25/05/2025]

---

## 📄 Licença

Este projeto é acadêmico e não possui fins comerciais.
