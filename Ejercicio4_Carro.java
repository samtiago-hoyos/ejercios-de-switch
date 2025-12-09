import java.util.Scanner;

public class Ejercicio4_Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PANEL DEL CARRO ===");
        System.out.println("1. Luces");
        System.out.println("2. Velocidad");
        System.out.println("3. Modo de conducción");
        System.out.print("Seleccione una opción: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.print("¿Desea encender o apagar las luces? ");
                String accion = sc.next().toLowerCase();
                if (accion.equals("encender"))
                    System.out.println("Luces encendidas.");
                else if (accion.equals("apagar"))
                    System.out.println("Luces apagadas.");
                else
                    System.out.println("Opción inválida.");
                break;

            case 2:
                System.out.print("Velocidad actual: ");
                int actual = sc.nextInt();
                System.out.print("Velocidad objetivo: ");
                int objetivo = sc.nextInt();

                if (objetivo > actual)
                    System.out.println("El carro debe acelerar.");
                else if (objetivo < actual)
                    System.out.println("El carro debe frenar.");
                else
                    System.out.println("Mantener velocidad.");
                break;

            case 3:
                System.out.println("Modos: 1=Normal, 2=Eco, 3=Sport");
                int modo = sc.nextInt();

                if (modo == 1)
                    System.out.println("Modo Normal activado.");
                else if (modo == 2)
                    System.out.println("Modo Eco activado.");
                else if (modo == 3)
                    System.out.println("Modo Sport activado.");
                else
                    System.out.println("Modo inválido.");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
}