package com.mycompany.meucciopoliapp;

public class Casella {

    protected String nome;
    protected int posizione;

    public Casella() {
        nome = "Undefined";
        posizione = -1;
    }

    public Casella(String nome, int posizione) {
        this.nome = nome;
        this.posizione = posizione;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void azione() {
        System.out.println("Azione generica eseguita!");
    }

}
