import java.util.Scanner;

public class ejercicio4sec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String estadoUsuario;
        System.out.println("Ingrese su estado de animo y le asignaremos una cancion");
        estadoUsuario = sc.next();


        switch (estadoUsuario) {

            case "triste":
                System.out.println("La cancion para tu estado de animo triste es: Esa cruz");
                break;
            case "feliz:":
                System.out.println("La cancion para tu estado de animo feliz es: Tamo chelo");
                break;
            case "energetico":
                System.out.println("La cancion para tu estado de animo energetico es: Harakiri");
                break;
            case "relajado":
                System.out.println("La cancion para tu estado de animo relajado es: APA");
                break;
            default:
                System.out.println("Ese estado de animo esta disponible para brindarte una cancion");
        }
    }
}