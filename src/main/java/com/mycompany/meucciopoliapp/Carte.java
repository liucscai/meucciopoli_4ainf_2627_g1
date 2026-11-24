package com.mycompany.meucciopoliapp;

import java.util.Random;

public class Carte extends CasellaSpeciale {

    protected int carta;
    Random random = new Random();

    protected int random() {
        int nCarta = random.nextInt(16) + 1;
        return nCarta;
    }

    protected void azioneImprevisto(Player giocatore) {
        System.out.println("Hai pescato: ");
        switch (random()) {
            case 1:
                System.out.print("andare fino al via!");
                giocatore.posizione = 1;
                break;
            case 2:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 3:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;

            case 4:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 5:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 6:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 7:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 8:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 9:
                System.out.println("andare fino a !");
                //impostare posizione casella
                break;
            case 10:
                System.out.println("pagare !");
                //impostare pagamento
                break;
            case 11:
                System.out.println("pagare !");
                //impostare pagamento
                break;

            case 12:

                System.out.println("pagare !");
                //impostare pagamento
                break;
            case 13:
                System.out.println("Andare in prigione senza passare dal via!");
                giocatore.posizione = 11;
                giocatore.inPrigione = true;
                azioneSpeciale(giocatore);
                break;
            case 14:
                System.out.println("Esci gratis di prigione!");
                giocatore.inPrigione = false;
                azioneSpeciale(giocatore);
                break;

            case 15:
                System.out.println("Ricevi !");
                //imposta soldi;
                break;

            case 16:
                System.out.println("Ricevi !");
                //imposta soldi;
                break;

            default:
                break;
        }

    }

    protected void azioneProbabilita() {
        
        //inserire probabilita

    }

}
