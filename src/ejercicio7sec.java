import java.util.Scanner;

public class ejercicio7sec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nivelSatisfaccion;
        int nivelEstres;
        int nivelSalud;
        double felicidaTotal;
        nivelSatisfaccion = 0;
        nivelSalud = 0;
        nivelEstres =0;

        while (nivelSatisfaccion<1 || nivelSatisfaccion>10){
            System.out.println("Ingrese de una escala del 1 al 10, su nivel de satisfaccion con la vida: ");
            nivelSatisfaccion = sc.nextInt();
        }
        while (nivelEstres<1 || nivelEstres>10){
            System.out.println("Ingrese de una escala del 1 al 10, su nivel de estres: ");
            nivelEstres = sc.nextInt();
        }
        while (nivelSalud<1 || nivelSalud>10){
            System.out.println("Ingrese de una escala del 1 al 10, su nivel de salud: ");
            nivelSalud = sc.nextInt();
        }

        felicidaTotal = (nivelSalud + nivelEstres + nivelSatisfaccion) / 3;
        System.out.println("Su nivel de felicidad es: "+felicidaTotal);




    }
}