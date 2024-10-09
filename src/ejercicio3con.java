import java.util.Scanner;

public class ejercicio3con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su genero de libros (fantasia, romance, misterio, ciencia ficcion)");
        String libro = scanner.nextLine();

        if (libro.equals("fantasia")) {
            System.out.println("--- TE RECOMIENDO ESTOS 3 LIBROS");
            System.out.println(" El nombre del viento\nEl camino de los reyes\nThe Hobbit");
        } else if (libro.equals("romance")) {
            System.out.println("--- TE RECOMIENDO ESTOS 3 LIBROS");
            System.out.println("Yo Antes de Ti\nEl cuaderno de Noah\nOrgullo y Prejucio");
        } else if (libro.equals("ciencia ficcion")) {
            System.out.println("--- TE RECOMIENDO ESTOS 3 LIBROS");
            System.out.println("Neuromancer\nThe Left Hand of Darkness\nDune");
        } else if (libro.equals("misterio")) {
            System.out.println("--- TE RECOMIENDO ESTOS 3 LIBROS");
            System.out.println("The Da Vinci Code\nGone Girl\nThe Girl with Dragon Tatto");
        } else {
            System.out.println("No tengo libros para recomendarte de ese genero");

        }
    }
}