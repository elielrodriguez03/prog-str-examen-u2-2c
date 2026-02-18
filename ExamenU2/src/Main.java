import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRegistros = 0;
        int totalPermitidos = 0;
        int totalDenegados = 0;

        while (true) {
            System.out.print("ID (o FIN para terminar): ");
            String id = sc.next();

            if (id.equalsIgnoreCase("FIN")) break;

            if (!U2Service.esIdValido(id)) {
                System.out.println("ID inválido (debe tener 8 caracteres alfanuméricos)");
                continue;
            }

            System.out.print("Hora (0..23): ");
            if (!sc.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número.");
                sc.next();
                continue;
            }

            int hora = sc.nextInt();

            // Si hora fuera 0..23 -> terminar main
            if (hora < 0 || hora > 23) {
                System.out.println("Hora fuera de rango (0-23). Fin del programa.");
                return;
            }

            totalRegistros++;
            // Si ID inválido -> continue (no cuenta como registro)
            if (U2Service.esHorarioPermitido(hora)) {
                totalPermitidos++;
                System.out.println("ACCESO PERMITIDO");
            } else {
                totalDenegados++;
                System.out.println("ACCESO DENEGADO");
            }
        }

        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total registros: " + totalRegistros);
        System.out.println("Permitidos: " + totalPermitidos);
        System.out.println("Denegados: " + totalDenegados);

        if (totalRegistros > 0) {
            double porcentaje = (double) totalPermitidos / totalRegistros * 100;
            System.out.println("Porcentaje permitidos: " + porcentaje + "%");
        } else {
            System.out.println("No se procesaron registros.");
        }
    }
}
