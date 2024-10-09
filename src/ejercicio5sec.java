import java.util.Scanner;


public class ejercicio5sec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double distancia;
        double consumo;
        double precioCombustible;
        double costoTotal;

        System.out.println("Inserte la distancia del viaje en kilometros: ");
        distancia = sc.nextDouble();
        System.out.println("Inserte el consumo de combustible del vehiculo: ");
        consumo = sc.nextDouble();
        System.out.println("Inserte el precio de combustible por litro: ");
        precioCombustible = sc.nextDouble();

        costoTotal = (distancia / consumo) * precioCombustible;

        System.out.println("El costo total del viaje sera de:"+costoTotal);

    }
}