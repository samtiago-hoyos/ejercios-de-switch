import java.util.Scanner;

public class Lavadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ALQUILER DE LAVADORAS ===");
        System.out.println("1. Lavadora estándar");
        System.out.println("2. Lavadora grande");
        System.out.println("3. Lavadora industrial");
        System.out.print("Seleccione el tipo de lavadora: ");
        int tipo = sc.nextInt();

        System.out.print("Ingrese el número de horas: ");
        int horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("Error: las horas deben ser mayores que 0.");
            return;
        }

        int precioHora = 0;

        switch (tipo) {
            case 1:
                if (horas <= 3) precioHora = 5000;
                else precioHora = 4000;
                break;

            case 2:
                if (horas <= 3) precioHora = 7000;
                else precioHora = 6000;
                break;

            case 3:
                if (horas <= 3) precioHora = 10000;
                else precioHora = 8000;
                break;

            default:
                System.out.println("Tipo de lavadora inválido.");
                return;
        }

        int total = horas * precioHora;
        System.out.println("Costo total: $" + total);
    }
}
