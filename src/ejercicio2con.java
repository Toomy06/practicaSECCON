import java.util.Scanner;

public class ejercicio2con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la categoría a la que pertenece (estudiante, adulto, jubilado)");
        String categoria = scanner.nextLine();
        System.out.println("Ingrese el precio del producto que desea comprar");
        double precio = scanner.nextDouble();


        if (categoria.equals("estudiante")) {
            double descuento = precio * 0.10;
            double precioTotal = precio - descuento;
            System.out.println("El precio total es de $ " + precioTotal);
        } else if (categoria.equals("adulto")) {
            double descuento = precio * 0.05;
            double precioTotal = precio - descuento;
            System.out.println("El precio total es de $ " + precioTotal);
        } else if (categoria.equals("jubilado")) {
            double descuento = precio * 0.15;
            double precioTotal = precio - descuento;
            System.out.println("El precio total es de $ " + precioTotal);
        }
    }
}