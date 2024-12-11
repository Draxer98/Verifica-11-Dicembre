public class Poligono {
    private int numeroLati;
    private double lunghezzaLato;

    //Metodo che assegna i parametri numeroLati e lunghezzaLato
    public Poligono(int numeroLati, double lunghezzaLato){
        this.numeroLati = numeroLati;
        this.lunghezzaLato = lunghezzaLato;
    }

    public double getLunghezzaLato() {
        return lunghezzaLato;
    }

    public void setLunghezzaLato(double lunghezzaLato) {
        this.lunghezzaLato = lunghezzaLato;
    }

    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    //Metodo che calcola il perimetro del poligono. Ritorna la somma di ogni lato
    public double calcolaPerimetro(){
        double somma = 0;

        for(int i = 0; i < numeroLati; i++){
            somma = somma + lunghezzaLato;
        }

        return somma;
    }

    @Override
    //metodo che serve per stampare a schermo i parametri numeroLati e lunghezzaLato. Stampa ache il perimetro
    //con il metodo calcolaPerimetro
    public String toString() {
        return "Poligono con " + numeroLati + " lati di lunghezza " + lunghezzaLato + ", perimetro: " + calcolaPerimetro();
    }
}
