package com.mycompany.meucciopoliapp;

public class Luogo extends Casella {

    protected int prezzoLuogo;
    protected int affitto;
    protected int moltiplicatore;
    protected boolean acquistato;
    protected int prezzoCase;
    protected int nCase;

    public Luogo() {
        super();
        prezzoLuogo = -1;
        affitto = -1;
        moltiplicatore = -1;
        acquistato = false;
        prezzoCase = -1;
        nCase = -1;
    }

    public Luogo(String nome, int posizione, int prezzoLuogo, int affitto, int moltiplicatore, boolean acquistato, int prezzoCase) {
        super(nome, posizione);
        this.prezzoLuogo = prezzoLuogo;
        this.affitto = affitto;
        this.moltiplicatore = 1;
        this.acquistato = false;
        this.prezzoCase = prezzoCase;

        nCase = 0;
    }

    public boolean acquistaLuogo(Player giocatori[]) { //da verificare se leva soldi al player(Da aggiungere controllo possessione luogo
        for(int i = 0; i < giocatori.length; i++)
        {    
            if (giocatori[i].portafoglio >= prezzoLuogo && giocatori[i].posizione == posizione && giocatori[i].rifiuto == false) {
                if (acquistato != true) {
                    if (giocatori[i].aggiungiProprieta(posizione, prezzoLuogo) == true) {
                        System.out.println("Hai acquistato la proprieta " + nome);
                        acquistato = true;
                        return acquistato;
                    }
                    System.out.println("Non puoi acquistare la proprieta " + nome);
                }
            }
        }
        return false;
    }

    public void acquistaCase(Player giocatore) {

        for (int i = 0; i < giocatore.proprieta.length; i++) {
            if (giocatore.proprieta[i] == posizione) {
                if (giocatore.portafoglio >= prezzoCase) {
                    nCase++;
                    giocatore.portafoglio -= prezzoCase;
                    applicaMoltiplicatore();
                    break;

                }
            }
        }
        System.out.println("Non puoi acquistare case");
    }

    public void applicaMoltiplicatore() {
        moltiplicatore *= nCase;

    }

    public void applicaAffitto(Player[] giocatori) {
        affitto *= moltiplicatore; //da riguardare
        if(acquistato == true)
        {
            for(int i = 0; i < giocatori.length; i++)
            {
                for(int j = 0; j < giocatori[i].proprieta.length; j++)
                {
                    if(giocatori[i].posizione == posizione && giocatori[i].proprieta[j] != posizione)
                    {
                        giocatori[i].portafoglio -= affitto;
                    }
                }
            }
        }
    }
    
    
}
