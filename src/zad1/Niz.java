package zad1;

public class Niz {
    private char[] niz;
    private int n;

    public Niz(int n) {
        this.n = n;
        this.niz = new char[n];
    }

    public Niz(String rec) {
        this.n = rec.length();
        niz = new char[n];
        for(int i=0; i<n; i++)
            niz[i] = rec.charAt(i);
    }

    public Niz() {
        this.n = 0;
    }

    @Override
    public String toString() {
        String a = "";

        for(int i=0; i<n; i++)
            a += niz[i];

        return a;
    }

    private void dobra() {
        
    }

    private void losa() {

    }

    public synchronized void promeni(int ind) {
        if(ind == 1)
            this.dobra();

        else if(ind == 2)
            this.losa();

        else
            return;
    }
}
