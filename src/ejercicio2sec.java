import java.util.Scanner;

public class ejercicio2sec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer pesoUsuario;
        Integer tiempoEjer;
        String  tipoEjer;
        Integer caloriasQuemadasCorrer;
        Integer caloriasQuemadasNadar;
        Integer caloriasQuemadasBici;

        System.out.println("Ingrese su peso en kg: ");
        pesoUsuario =  sc.nextInt();
        System.out.println("Ingerese el tiempo que realiza el ejercicio en minutos: ");
        tiempoEjer = sc.nextInt();
        System.out.println("Ingrese el tipo de ejercicio, los tipos de ejercicio disponibles son: (correr, nadar, bicicleta)");
        tipoEjer = sc.next();

        caloriasQuemadasCorrer = 8 * pesoUsuario * tiempoEjer;
        caloriasQuemadasNadar = 6 * pesoUsuario * tiempoEjer;
        caloriasQuemadasBici = 7 * pesoUsuario * tiempoEjer;

        switch (tipoEjer) {
            case "correr":
                System.out.println("Has quemado:"+caloriasQuemadasCorrer);
                break;
            case "nadar":
                System.out.println("Has quemado:"+caloriasQuemadasNadar);
                break;
            case "bicicleta":
                System.out.println("Has quemado:"+caloriasQuemadasBici);
                break;
            default:
                System.out.println("Tipo de ejercicio no disponible");

        }


    }
}