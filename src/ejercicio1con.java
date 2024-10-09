import java.util.Scanner;

public class ejercicio1con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su genero de pelicula favorito (accion, comedia, drama, ciencia ficcion)");
        String pelicula = scanner.nextLine();

        if (pelicula.equals("accion")) {
            System.out.println("--- TE RECOMIENDO ESTAS 3 PELICULAS");
            System.out.println(" John Wick (2014)\nMad Max: Fury Road (2015)\nGladiator (2000)");
        } else if (pelicula.equals("comedia")) {
            System.out.println("--- TE RECOMIENDO ESTAS 3 PELICULAS");
            System.out.println("Supercool (2007)\nSon como niños (2010)\nTed (2012)");
        } else if (pelicula.equals("drama")) {
            System.out.println("--- TE RECOMIENDO ESTAS 3 PELICULAS");
            System.out.println("The whale (2022)\nWomen Talking (2022)\nThe Bansees of Iniserin (2022)");
        } else if (pelicula.equals("ciencia ficcion")) {
            System.out.println("--- TE RECOMIENDO ESTAS 3 PELICULAS");
            System.out.println("Blade Runner (2017)\nInception (2010)\nThe Matrix (1999)");
        } else {
            System.out.println("No tengo peliculas para recomendarte de ese genero");


        }
    }

}