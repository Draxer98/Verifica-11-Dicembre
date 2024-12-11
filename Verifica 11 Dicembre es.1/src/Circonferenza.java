//Michele gaino
//4E

import java.util.Objects;

public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    //Metodo che serve per il calcolo dell'area della circonferenza
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    //metodo intero che serve per verificare se la prima circonferenza abbia la stessa area della seconda circonferenza.
    //Ritorna 0 se sono uguali
    //Ritorna 1 se la prima circonferena ha l'area maggiore
    //Ritorna -1 se la seconda circonferenza ha l'area minore
    public int compareTo(Rettangolo rettangolo, Circonferenza circonferenza){
        if(rettangolo.calcolaArea() == circonferenza.calcolaArea()){
            return 0;
        } else if(rettangolo.calcolaArea() > circonferenza.calcolaArea()){
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
        Circonferenza that = (Circonferenza) o;
        return Double.compare(raggio, that.raggio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(raggio);
    }

    @Override
    public String toString() {
        return "Circonferenza{" +
                "raggio=" + raggio +
                '}';
    }
}