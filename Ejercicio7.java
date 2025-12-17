import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAMAS DEL SENA ===");
        System.out.println("1. ADSO");
        System.out.println("2. Gestión Empresarial");
        System.out.println("3. Mantenimiento de Equipos de Cómputo");
        System.out.print("Seleccione un programa: ");
        int programa = sc.nextInt();

        System.out.println("Modalidad: 1=Presencial, 2=Virtual");
        int modalidad = sc.nextInt();

        if (modalidad != 1 && modalidad != 2) {
            System.out.println("Modalidad inválida.");
            return;
        }

        String nombre = "";
        String mode = (modalidad == 1) ? "Presencial" : "Virtual";
        String duracion = "";
        String jornada = "";

        switch (programa) {
            case 1:
                nombre = "ADSO";
                duracion = "24 meses";
                jornada = "Mañana";
                break;

            case 2:
                nombre = "Gestión Empresarial";
                duracion = "18 meses";
                jornada = "Tarde";
                break;

            case 3:
                nombre = "Mantenimiento de Equipos de Cómputo";
                duracion = "12 meses";
                jornada = "Noche";
                break;

            default:
                System.out.println("Programa inválido.");
                return;
        }

        System.out.println("Programa: " + nombre);
        System.out.println("Modalidad: " + mode);
        System.out.println("Duración: " + duracion);
        System.out.println("Jornada recomendada: " + jornada);
    }
}
