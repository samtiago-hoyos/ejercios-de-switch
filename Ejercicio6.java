import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LISTAS DE SPOTIFY ===");
        System.out.println("1. Estudio");
        System.out.println("2. Entrenamiento");
        System.out.println("3. Fiesta");
        System.out.print("Seleccione una lista: ");
        int lista = sc.nextInt();

        System.out.println("Tipo: 1 = Corta, 2 = Larga");
        int tipo = sc.nextInt();

        if (tipo != 1 && tipo != 2) {
            System.out.println("Tipo inválido.");
            return;
        }

        String nombre = "";
        String duracion = (tipo == 1) ? "30 min" : "1h 15 min";
        int canciones = (tipo == 1) ? 10 : 25;

        switch (lista) {
            case 1: nombre = "Estudio"; break;
            case 2: nombre = "Entrenamiento"; break;
            case 3: nombre = "Fiesta"; break;
            default:
                System.out.println("Lista inválida.");
                return;
        }

        System.out.println("Lista: " + nombre);
        System.out.println("Tipo: " + (tipo == 1 ? "Corta" : "Larga"));
        System.out.println("Canciones: " + canciones);
        System.out.println("Duración: " + duracion);
    }
}
