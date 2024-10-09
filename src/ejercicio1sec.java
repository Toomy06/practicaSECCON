import java.util.Scanner;

public class ejercicio1sec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento completa DD/MM/AAAA: ");
        String fechaNacimiento = scanner.nextLine();

        String[] partes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signoZodiaco = obtenerSignoZodiaco(dia, mes);

        System.out.println("Tu signo del zodiaco es: "+signoZodiaco);
        System.out.println(obtenerMensajeHoroscopo(signoZodiaco));

        scanner.close();

    }
    public static String obtenerSignoZodiaco(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19) ){
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20) ){
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20) ){
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22) ){
            return "Cancer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22) ){
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22) ){
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22) ){
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21) ){
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21) ){
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19) ){
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18) ){
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20) ){
            return "Piscis";
        } else {
            return "Fecha no valida";
        }
    }
    public static String obtenerMensajeHoroscopo(String signo) {
        switch (signo) {
            case "Aries":
                return "Hoy es un buen día para tomar la iniciativa en tus proyectos.";
            case "Tauro":
                return "Es importante que te enfoques en la estabilidad y el confort.";
            case "Géminis":
                return "Tu curiosidad te llevará a nuevos descubrimientos.";
            case "Cáncer":
                return "El día de hoy estarás más conectado con tus emociones.";
            case "Leo":
                return "Brillas con intensidad y atraerás la atención de quienes te rodean.";
            case "Virgo":
                return "Hoy es un buen día para organizarte y poner orden en tu vida.";
            case "Libra":
                return "Busca el equilibrio en tus relaciones y evita conflictos.";
            case "Escorpio":
                return "Tus emociones profundas te guiarán hacia grandes transformaciones.";
            case "Sagitario":
                return "Es un buen día para explorar nuevas ideas y horizontes.";
            case "Capricornio":
                return "Tu ambición y disciplina te llevarán al éxito.";
            case "Acuario":
                return "Tu originalidad será reconocida por quienes te rodean.";
            case "Piscis":
                return "Escucha tu intuición y deja que te guíe en este día.";
            default:
                return "No se ha podido determinar un signo zodiacal válido.";
        }
}
}