package zad1;

public class Brod {
    private String naziv;
    private double x, y, z;

    public Brod(int br, double x, double y, double z) {
        this.naziv = "Xwing" + br;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Brod() {
        this.naziv = "Xwing(n)";
        x = y = z = 0;
    }

    @Override
    public String toString() {
        return naziv + ": (" + x + "," + y + "," + z + ")";
    }

    public double udaljenost(Brod b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2) + Math.pow(this.z - b.z, 2))
    }
}
