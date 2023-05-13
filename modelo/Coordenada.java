package modelo;

public class Coordenada {
    private double x;
    private double y;

    public Coordenada() {

    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordenada) {
            Coordenada otraCoordenada = (Coordenada) obj;
            return this.x == otraCoordenada.x && this.y == otraCoordenada.y;
        }
        return false;
    }
    public double distancia(Coordenada otraCoordenada) {
        double dx = this.x - otraCoordenada.x;
        double dy = this.y - otraCoordenada.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
}



