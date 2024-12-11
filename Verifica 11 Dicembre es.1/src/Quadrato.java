//Michele Gaino
//4E

import java.util.Objects;

public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    //Metodo che serve per il calcolo dell'area del quadrato
    public double calcolaArea() {
        return lato * lato;
    }

    //metodo intero che serve per verificare se il primo quadrato abbia la stessa area del secondo quadrato.
    //Ritorna 0 se sono uguali
    //Ritorna 1 se il primo quadrato ha l'area maggiore
    //Ritorna -1 se il secondo quadrato ha l'area minore
    public int compareTo(Rettangolo rettangolo, Quadrato quadrato){
        if(rettangolo.calcolaArea() == quadrato.calcolaArea()){
            return 0;
        } else if(rettangolo.calcolaArea() > quadrato.calcolaArea()){
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
        Quadrato quadrato = (Quadrato) o;
        return Double.compare(lato, quadrato.lato) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lato);
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "lato=" + lato +
                '}';
    }
}
