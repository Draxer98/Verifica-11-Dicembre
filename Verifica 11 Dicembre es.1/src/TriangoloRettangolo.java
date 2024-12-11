//Michele Gaino
//4E

import java.util.Objects;

public class TriangoloRettangolo {
    private double base;
    private double altezza;

    public TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    //Metodo che serve per il calcolo dell'area del triangolo rettangolo
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    //metodo intero che serve per verificare se il primo triangolo abbia la stessa area del secondo triangolo.
    //Ritorna 0 se sono uguali
    //Ritorna 1 se il primo triangolo ha l'area maggiore
    //Ritorna -1 se il secondo triangolo ha l'area minore
    public int compareTo(Rettangolo rettangolo, TriangoloRettangolo triangolo){
        if(rettangolo.calcolaArea() == calcolaArea()){
            return 0;
        } else if(rettangolo.calcolaArea() > triangolo.calcolaArea()){
            return 1;
        }

        return -1;
    }

    @Override
    //Meotodo booleano che serve per verificare più oggeti. Se torna true vuol dire che i due oggetti sono uguali,
    // mentre se torna false i due oggetti non sono uguali
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangoloRettangolo that = (TriangoloRettangolo) o;
        return Double.compare(base, that.base) == 0 && Double.compare(altezza, that.altezza) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altezza);
    }

    @Override
    public String toString() {
        return "TriangoloRettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}