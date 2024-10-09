import java.util.Scanner;

public class ejercicio6sec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int horasEstudio;

        System.out.println("Inserte cuantas horas estudia por dia: ");
        horasEstudio = sc.nextInt();

        //el programa va a suponer que el alumno tiene 5 materias.

        if (horasEstudio>0 && horasEstudio<=5){
            System.out.println("Tu plan de estudio va a ser estudiar 2 horas por dia,con descansos de 10m, de la siguiente manera:\n" +
                    "lunes:Matematica\n" +
                    "martes:Lengua\n" +
                    "miercoles:Historia\n" +
                    "jueves:Quimica\n" +
                    "viernes:Fisica\n");
        }
        else if (horasEstudio>5 && horasEstudio<=10){
            System.out.println("Tu plan de estudio va a ser estudiar 6 horas por dia,con descansos de 20m, de la siguiente manera:\n" +
                    "lunes:Matematica\n" +
                    "martes:Lengua\n" +
                    "miercoles:Historia\n" +
                    "jueves:Quimica\n" +
                    "viernes:Fisica\n");
        }
        else if (horasEstudio>10){
            System.out.println("Tu plan de estudio va a ser estudiar 10 horas por dia, con descansos de 30m, de la siguiente manera:\n" +
                    "lunes:Matematica\n" +
                    "martes:Lengua\n" +
                    "miercoles:Historia\n" +
                    "jueves:Quimica\n" +
                    "viernes:Fisica\n");
        }
        else{
            System.out.println("Tiempo insuficiente para estudiar");
        }


    }
}