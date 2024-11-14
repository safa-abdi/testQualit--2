import java.util.ArrayList;
import java.util.List;

public class SimpleExample {
    public static void main(String[] args) {
        // Création d'une liste d'entiers
        List<Integer> numbers = new ArrayList<>();
        
        // Ajout d'éléments à la liste
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Suppression d'un élément
        numbers.remove(1); // Supprime l'élément à l'index 1 (20)

        // Affichage des éléments de la liste
        for (int number : numbers) {
            System.out.println("Nombre : " + number);
        }
        
        // Division sans gestion d'exception
        int result = 10 / 0; // Provoque une exception ArithmeticException (division par zéro)
        
        System.out.println("Le résultat est : " + result);
    }
}
