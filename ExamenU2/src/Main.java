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

          
            if (id.equalsIgnoreCase("FIN")) {
                break;
            }

        
            if (!U2Service.esIdValido(id)) {
                System.out.println("ID inválido");
                continue; 
            }

            System.out.print("Hora (0..23): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Hora inválida");
                return; 
            }

            int hora = sc.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida");
                return; 
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

        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total registros: " + totalRegistros);
        System.out.println("Permitidos: " + totalPermitidos);
        System.out.println("Denegados: " + totalDenegados);

        double porcentaje = 0;
        if (totalRegistros > 0) {
            porcentaje = ((double) totalPermitidos / totalRegistros) * 100;
        }
        
        System.out.printf("Porcentaje permitidos: %.2f%%\n", porcentaje);
    }
}