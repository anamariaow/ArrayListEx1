import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //creare Array List con n elementi e stamparlo in console

        Student studente1 = new Student ("Ana", 26);
        Student studente2 = new Student ("Marco", 25);
        Student studente3 = new Student ("Luca", 32);

        ArrayList<Student> studenti = new ArrayList<>(List.of(studente1, studente2, studente3));
        System.out.println("Lista studenti iniziale: " + studenti);

        //Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
        studenti.add(new Student("Francesco", 23));
        studenti.add(new Student("Andrea", 28));
        studenti.add(new Student("Sara", 30));
        System.out.println("Nuova lista studenti: " + studenti);

    }
}