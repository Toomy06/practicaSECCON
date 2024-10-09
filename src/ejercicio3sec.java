
import java.util.Scanner;

public class ejercicio3sec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String condicionFisica;
        condicionFisica = "hola";

        while (!condicionFisica.equals("principiante")  && !condicionFisica.equals("intermedio")   && !condicionFisica.equals( "avanzado") ) {
            System.out.println("Ingrese si su condicion fisica es (principiante,intermedio,avanzado), en caso de no haber seleccionado alguna de esas 3 opciones se le volvera a preguntar.") ;
            condicionFisica = sc.nextLine();

            if (condicionFisica.equals("principiante")) {
                System.out.println("Calentamiento (1 min): Marcha en el lugar\n" +
                        "Ejercicio (8 min):\n" +
                        "Sentadillas: 2x5\n" +
                        "Flexiones (rodillas): 2x5\n" +
                        "Elevación de talones: 2x8\n" +
                        "Enfriamiento (1 min): Estiramientos");
            }
            else if (condicionFisica.equals("intermedio")){
                System.out.println("Rutina para Intermedios (10 min)\n" +
                        "Calentamiento (1 min): Saltos suaves\n" +
                        "Ejercicio (8 min):\n" +
                        "Sentadillas con salto: 2x5\n" +
                        "Flexiones: 2x5\n" +
                        "Mountain climbers: 2x20 seg\n" +
                        "Enfriamiento (1 min): Estiramientos");
            }
            else if (condicionFisica.equals("avanzado")) {
                System.out.println("Calentamiento (1 min): Saltos de tijera\n" +
                        "Ejercicio (8 min):\n" +
                        "Burpees: 2x4\n" +
                        "Flexiones: 2x6\n" +
                        "Plancha: 2x20 seg\n" +
                        "Enfriamiento (1 min): Estiramientos");
            }
        }
    }
}