import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalRegistros=0;
        double totalPermitidos=0;
        int totalDenegados=0;
        int hora;

        while (true) {
            System.out.print("ID (o FIN): ");
            String id = sc.next();

            if (id.equalsIgnoreCase("FIN")) break;

            System.out.print("Hora (0..23): ");
            if (sc.hasNextInt()){
                hora = sc.nextInt();
            } else {
                System.out.println("Hora invalida");
                return;
            }

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

        double porcentaje;
        porcentaje = (totalRegistros / totalPermitidos ) * 0.10;

        System.out.println("Porcentaje permitidos: %"+ porcentaje);
    }
}