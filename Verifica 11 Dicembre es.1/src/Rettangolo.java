//Michele Gaino
//4E

import java.util.Objects;

public class Rettangolo {
    private double base;
    private double altezza;

    //Metodo che assegna i parametri base e altezza
    public Rettangolo(double base, double altezza) {
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

    //Metodo che serve per il calcolo dell'area del rettangolo
    public double calcolaArea() {
        return base * altezza;
    }

    /**Nelle classi, è meglio avere dei metodi che calcolano perché per prima cosa
    * è più semplice nel trovare il metodo. Un altro vantaggio sta che il codice diventa più ordinato,
    * cioè che di solito nella classe main deve trovarsi solo il metoto main. Poi, quando si sta lavorando ad
    * oggetti, quando si lavora con un oggetto specifico, è meglio che i metodi che vanno a modificare parameri
    * o semplicemenete utilizzando i parametri stessi siano accessibili nella classe di appartenenza.*/
    //Metodo che serve per il calcolo del perimetro del rettangolo
    public double calcolaPerimetro() {
        return (base*2) + (altezza*2);
    }

    //metodo intero che serve per verificare se il primo rettangolo abbia la stessa area del secondo rettangolo.
    //Ritorna 0 se sono uguali
    //Ritorna 1 se il primo rettangolo ha l'area maggiore
    //Ritorna -1 se il secondo rettangolo ha l'area minore
    public int compareTo(Rettangolo rettangolo, Quadrato quadrato){
        if(rettangolo.calcolaArea() == calcolaArea()){
            return 0;
        } else if(rettangolo.calcolaArea() > calcolaArea()){
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
        Rettangolo that = (Rettangolo) o;
        return Double.compare(base, that.base) == 0 && Double.compare(altezza, that.altezza) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altezza);
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}