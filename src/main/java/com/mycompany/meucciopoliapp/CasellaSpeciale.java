package com.mycompany.meucciopoliapp;

public class CasellaSpeciale extends Casella{
    
    public CasellaSpeciale()
    {
        super();
    }
    
    public CasellaSpeciale(String nome, int posizione)
    {
        super(nome, posizione);
    }
    public void azioneSpeciale(Player giocatore)
    {
        
        if (posizione == 1)//via
        {
            giocatore.portafoglio += 200;
        }
        
        if(posizione == 11)//transito-prigione
        {
            if(giocatore.inPrigione == true)
            {
                System.out.print("Vuoi aspettare tre turni oppure pagare la cauzione?");
                //aspetta 3 turni-paga cauzione
            }
            
        }
        
        
        if(posizione == 31)//vigile
        {
            giocatore.posizione = 11;
            giocatore.inPrigione = true;
        }
    }
    

    
}
