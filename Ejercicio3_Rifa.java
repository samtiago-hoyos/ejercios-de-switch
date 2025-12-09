import java.util.Scanner;

public class Ejercicio3_Rifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TIPOS DE BOLETAS ===");
        System.out.println("1. Plata");
        System.out.println("2. Oro");
        System.out.println("3. Diamante");
        System.out.print("Seleccione la boleta: ");
        int tipo = sc.nextInt();

        System.out.print("Cantidad de boletas: ");
        int cant = sc.nextInt();

        if (cant <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        int precio = 0;
        String nombre = "";

        switch (tipo) {
            case 1:
                nombre = "Plata";
                precio = (cant < 5) ? 5000 : 4500;
                break;

            case 2:
                nombre = "Oro";
                precio = (cant < 3) ? 10000 : 9000;
                break;

            case 3:
                nombre = "Diamante";
                precio = (cant < 2) ? 20000 : 18000;
                break;

            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("Boleta: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total a pagar: $" + (precio * cant));
    }
}