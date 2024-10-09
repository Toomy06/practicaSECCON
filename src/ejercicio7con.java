import java.util.Scanner;

public class ejercicio7con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = scanner.nextLine().toLowerCase();


        if (estadoAnimo.equals("feliz")) {
            System.out.println("Te recomendamos que salgas a celebrar con amigos y a disfrutar.");
        } else if (estadoAnimo.equals("triste")) {
            System.out.println("Quizás un paseo al aire libre te ayude.");
        } else if (estadoAnimo.equals("energico")) {
            System.out.println("Sal a hacer ejercicio o a practicar un deporte.");
        } else if (estadoAnimo.equals("relajado")) {
            System.out.println("Perfecto, podrias leer un libro o hacer yoga");
        } else {
            System.out.println("Estado de ánimo no reconocido. Intenta con 'feliz', 'triste', 'energico' o 'relajado'.");
        }
    }
}