//Michele Gaino
//4E

//Importazione della classe Math
import static java.lang.Math.*;

public class Punto {
    private double x;
    private double y;

    //Metodo che assegna i parametri x e y
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    //Metodo double che serve a calcolare la distanza tra due due punti, ritorna un numero double
    public double distanza(Punto punto1){
        return sqrt(pow(punto1.getX() - getX(), 2) + pow(punto1.getY() - getY(), 2));
    }
}
