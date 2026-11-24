package com.mycompany.meucciopoliapp;

public class Player {

    protected String nome;
    protected int portafoglio;
    protected boolean inPrigione;
    protected int posizione;
    int[] proprieta = new int[28];
    boolean rifiuto;

    public Player() {
        nome = "Not defined";
        portafoglio = -1;
        rifiuto = false;
    }

    public Player(String nome, int portafoglio) {
        this.nome = nome;
        this.portafoglio = portafoglio;
        inPrigione = false;
        rifiuto = false;
        posizione = 1;
    }

    public boolean aggiungiProprieta(int posizione, int prezzoLuogo) {
        if (portafoglio >= prezzoLuogo) {
            for (int i = 0; i < proprieta.length; i++) {
                if (proprieta[i] == 0) {
                    portafoglio -= prezzoLuogo;
                    proprieta[i] = posizione;
                    return true;
                }
            }

        }
        System.out.println("Non puoi acquistare altre propieta!");
        return false;
    }

}
