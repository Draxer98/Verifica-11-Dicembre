public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        System.out.println(rettangolo.toString());
        System.out.println(quadrato.toString());
        System.out.println(triangolo.toString());
        if (rettangolo.compareTo(rettangolo, quadrato) > 0) {
            System.out.println("Il rettangolo ha un'area minore del quadrato.");
        } else {
            System.out.println("Il quadrato ha un'area minore o uguale a quella del rettangolo.");
        }
    }
}