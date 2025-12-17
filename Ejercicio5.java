import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== RADIO DEL CARRO ===");
        System.out.println("1. Pop");
        System.out.println("2. Rock");
        System.out.println("3. Vallenato");
        System.out.print("Seleccione la emisora: ");
        int emisora = sc.nextInt();

        System.out.print("Ingrese la hora (0-23): ");
        int hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida.");
            return;
        }

        switch (emisora) {
            case 1:
                if (hora >= 6 && hora < 12) System.out.println("Pop de la mañana");
                else if (hora >= 12 && hora < 18) System.out.println("Éxitos del momento");
                else if (hora >= 18 && hora < 24) System.out.println("Noche Pop");
                else System.out.println("Sin programación.");
                break;

            case 2:
                if (hora >= 6 && hora < 12) System.out.println("Rock clásico");
                else if (hora >= 12 && hora < 18) System.out.println("Rock en español");
                else if (hora >= 18 && hora < 24) System.out.println("Rock pesado");
                else System.out.println("Sin programación.");
                break;

            case 3:
                if (hora >= 6 && hora < 12) System.out.println("Vallenato tradicional");
                else if (hora >= 12 && hora < 18) System.out.println("Vallenato moderno");
                else if (hora >= 18 && hora < 24) System.out.println("Parranda vallenata");
                else System.out.println("Sin programación.");
                break;

            default:
                System.out.println("Emisora inválida.");
        }
    }
}
