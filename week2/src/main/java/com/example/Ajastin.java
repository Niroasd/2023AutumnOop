package com.example;

public class Ajastin {

    private int aika;

    public Ajastin() {
        aika = 0;
    }

    public void lisaa() {
        if ((this.aika + 5) <= 30) {
            this.aika += 5;
        }
    }

    public void vahenna() {
        if ((this.aika - 5) >= 0) {
            this.aika -= 5;
        }
    }

    public int aika() {
        return this.aika;
    }

    public boolean loppu() {
        return (this.aika == 30);
    }
}