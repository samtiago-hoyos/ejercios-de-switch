import java.util.Scanner;

public class Gimnasio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PLANES DE GIMNASIO ===");
        System.out.println("1. Plan Básico");
        System.out.println("2. Plan Intermedio");
        System.out.println("3. Plan Premium");
        System.out.print("Seleccione el plan: ");
        int plan = sc.nextInt();

        System.out.print("Ingrese número de meses (1, 3, 6, 12): ");
        int meses = sc.nextInt();

        if (meses <= 0) {
            System.out.println("Meses inválidos.");
            return;
        }

        int precio = 0;

        switch (plan) {
            case 1: // Básico
                if (meses == 1) precio = 30000;
                else if (meses == 3) precio = 80000;
                else if (meses >= 6) precio = 150000;
                break;

            case 2: // Intermedio
                if (meses == 1) precio = 40000;
                else if (meses == 3) precio = 110000;
                else if (meses >= 6) precio = 200000;
                break;

            case 3: // Premium
                if (meses == 1) precio = 60000;
                else if (meses == 3) precio = 160000;
                else if (meses >= 6) precio = 280000;
                break;

            default:
                System.out.println("Plan inválido.");
                return;
        }

        System.out.println("Total a pagar: $" + precio);
    }
}