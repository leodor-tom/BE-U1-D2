public class Exercise1 {
    public static void main(String[] args) {

        String pariDispari = "non mangiare il pesce a gubbio";

        if (pariDispari.length() % 2 == 0) System.out.println("il numero di caratteri è pari");
        else System.out.println("il numero di caratteri è dispari");

        int anno = 2400;

        if (anno % 100 == 0) {
            if (anno % 400 == 0) {
                System.out.println("è un anno bisestile");
            }
        } else if (anno % 4 == 0) {
            System.out.println("è un anno bisestile");
        } else System.out.println("non è un anno bisestile");
    }
}
