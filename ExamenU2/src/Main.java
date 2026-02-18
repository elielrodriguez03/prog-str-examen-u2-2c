import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRegistros = 0;
        int totalPermitidos = 0;
        int totalDenegados = 0;

        while (true) {
            System.out.print("ID (o FIN): ");
            String id = sc.next();

            if (id.equalsIgnoreCase("FIN")) break;

            System.out.print("Hora (0..23): ");
            int hora = sc.nextInt();

            // Si hora fuera 0..23 -> terminar main
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Fin del programa.");
                return;
            }

            // Si ID inválido -> continue (no cuenta como registro)
            if (!U2Service.esIdValido(id)) {
                System.out.println("ID inválido");
                continue;
            }

            totalRegistros++;

            if (U2Service.esHorarioPermitido(hora)) {
                totalPermitidos++;
                System.out.println("ACCESO PERMITIDO");
            } else {
                totalDenegados++;
                System.out.println("ACCESO DENEGADO");
            }
        }

        System.out.println("=== RESUMEN ===");
        System.out.println("Total registros: " + totalRegistros);
        System.out.println("Permitidos: " + totalPermitidos);
        System.out.println("Denegados: " + totalDenegados);

        double porcentaje=0; //Falta hacer el calculo de porcentaje
        System.out.println("Porcentaje permitidos: %"+ porcentaje);
    }
}
