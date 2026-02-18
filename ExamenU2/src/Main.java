import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPermitidos=0, totalDenegados=0,totalRegistros=0;

        while (true) {
            System.out.print("ID (o FIN): ");
            String id = sc.next();

            if (id.equalsIgnoreCase("FIN")) break;

            int hora=horasTrabajo(sc,"Hora (0..23): ");



            // Si hora fuera 0..23 -> terminar main
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Fin del programa.");
                return;
            }

            // Si ID inválido -> continue (no cuenta como registro)
            if (U2Service.esIdValido(id)) {
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

        double porcentaje=100;//Falta hacer el calculo de porcentaje
        double calcularporcentaje=(porcentaje*totalRegistros/totalPermitidos);
        System.out.println("Porcentaje permitidos: %"+ calcularporcentaje);
    }

    public static int horasTrabajo(Scanner sc,String msg){
        System.out.println(msg);
        return sc.nextInt();
    }




}
