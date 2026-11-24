package com.mycompany.meucciopoliapp;

import java.util.Random;

public class Dadi {

    protected int valore1;
    protected int valore2;
    protected Random random = new Random();

    public void lancioDadi() {
        valore1 = random.nextInt(6) + 1;
        valore2 = random.nextInt(6) + 1;
    }

    public boolean dadiDoppi() {
        if (valore1 == valore2) {
            return true;
        } else {
            return false;
        }
    }
    
    

}
