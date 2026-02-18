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
            if (!U2Service.esIdValido(id)) {
                System.out.println("ID inválido");
                continue;
            }

            System.out.print("Hora (0..23): ");

            if (sc.hasNextInt()){
                int hora = sc.nextInt();
                // Si hora fuera 0..23 -> terminar main
                if (hora < 0 || hora > 23) {
                    System.out.println("Hora inválida. Fin del programa.");
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
            } else {
                System.out.println("Hora invalida");
                sc.nextLine();
                return;
            }
        }

        if (totalRegistros == 0){
            System.out.println("EL total de registros es 0");
            return;
        } else {
            System.out.println("=== RESUMEN ===");
            System.out.println("Total registros: " + totalRegistros);
            System.out.println("Permitidos: " + totalPermitidos);
            System.out.println("Denegados: " + totalDenegados);
            double porcentaje=(totalPermitidos*100)/totalRegistros; //Falta hacer el calculo de porcentaje
            System.out.println("Porcentaje permitidos: %f.2% "+ porcentaje);
        }

    }
}

