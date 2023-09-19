// Luo luokka Ajastin. Ajastimella on oliomuuttuja private int aika, parametriton konstruktori (asettaa muuttujan aika alkuarvoksi 0), sekä seuraavat neljä metodia: 

// Metodi public void lisaa() kasvattaa oliomuuttujan aika arvoa viidellä. Arvoa ei kasvateta yli 30:n. 

// Metodi public void vahenna() vähentää oliomuuttujan aika arvoa viidellä. Arvoa ei vähennetä negatiiviseksi. 

// Metodi public int aika() palauttaa oliomuuttujan aika arvon. 

// Metodi public boolean loppu() palauttaa arvon true, mikäli oliomuuttujan arvo on 30, muutoin palautetaan false. 

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