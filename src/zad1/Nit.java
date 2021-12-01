package zad1;

public class Nit extends Thread {
    private int pauza;
    private Niz niz;

    public Nit(int pauza, Niz niz) {
        super();
        this.pauza = pauza;
        this.niz = niz;
    }

    @Override
    public void run() {
        while (true) {
            if(niz.toString().equals("LEGO"))
                break;

            try {
                if(this.getName() == "BRZA")
                    niz.promeni(1);

                else if(this.getName() == "SPORA")
                    niz.promeni(2);

                System.out.println(this.getName() + ": " + niz.toString());
                sleep(pauza);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
