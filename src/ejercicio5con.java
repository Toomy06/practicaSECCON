import java.util.Random;
import java.util.Scanner;

public class ejercicio5con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija entre (pierda, papel, tijera)");
        String opcion = scanner.nextLine();

        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        int indice = random.nextInt(opciones.length);

        String seleccion = opciones[indice];

        System.out.println("La computadora eligió: " + seleccion);
        if (opcion.equals("tijera") && seleccion.equals("piedra")) {
            System.out.println("Has perdido");
        } else if (opcion.equals("papel") && seleccion.equals("piedra")) {
            System.out.println("Has ganado");
        } else if (opcion.equals("piedra") && seleccion.equals("piedra")) {
            System.out.println("Empate");
        } else if (opcion.equals("piedra") && seleccion.equals("tijera")) {
            System.out.println("Has ganado");
        } else if (opcion.equals("papel") && seleccion.equals("tijera")) {
            System.out.println("Has perdido");
        } else if (opcion.equals("tijera") && seleccion.equals("tijera")) {
            System.out.println("Empate");
        } else if (opcion.equals("tijera") && seleccion.equals("papel")) {
            System.out.println("Has ganado");
        } else if (opcion.equals("piedra") && seleccion.equals("papel")) {
            System.out.println("Has perdido");
        } else if (opcion.equals("papel") && seleccion.equals("papel")) {
            System.out.println("Empate");
        }
    }
}