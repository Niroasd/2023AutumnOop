public class Main {

    public static void main(String[] args) {

        Ajastin time = new Ajastin();

        while (!time.loppu()) {

            System.out.println("Aika ei ole vielä loppu! Aika: " + time.aika());

            time.lisaa();

        }

        System.out.println("Aika loppui! Aika: " + time.aika());

        time.vahenna();

        System.out.println("Aika ei ole loppu! Aika: " + time.aika());

    }

}