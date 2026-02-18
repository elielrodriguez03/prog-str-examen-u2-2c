import java.util.Scanner;

public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    int totalRegistros = 0;
    int totalPermitidos = 0;
    int totalDenegados = 0;


    double porcentajePermitidos = 0;
    while (true) {
        System.out.println("Ingrese el ID del estudiante (o 'FIN' para terminar): ");
        String id = leer.nextLine();


        if (id != null && id.equals("FIN")) {
            break;
        }


        if (!U2Service.esIdValido(id)) {
            System.out.println("ID inválido");
            continue;
        }

        System.out.print("Ingrese la hora de ingreso (0-23): ");


        if (!leer.hasNextInt()) {
            System.out.println("Hora inválida");
            return;
        }

        int hora = leer.nextInt();
        leer.nextLine();


        if (hora < 0 || hora > 23) {
            return;
        }

        totalRegistros++;

        if (U2Service.esHorarioPermitido(hora)) {
            totalPermitidos++;
            System.out.println("Acceso PERMITIDO");
        } else {
            totalDenegados++;
            System.out.println("Acceso DENEGADO");
        }

        porcentajePermitidos = 0.0;
        if (totalRegistros > 0) {
            porcentajePermitidos = ((double) totalPermitidos / totalRegistros) * 100.0;
        }
    }


    System.out.println("--- Resumen Final ---");
    System.out.println("Total de registros: " + totalRegistros);
    System.out.println("Total permitidos: " + totalPermitidos);
    System.out.println("Total denegados: " + totalDenegados);
    System.out.println("Porcentaje permitidos: " + porcentajePermitidos + "%");
    leer.close();
}

