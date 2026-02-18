import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        int hora;


        int totalRegistros = 0;
        int totalPermitidos = 0;
        int totalDenegados = 0;


        while (true) {
            System.out.print("Coloca el ID del estudiante o 'FIN' para terminar: ");
            id = sc.next();


            if (id.equalsIgnoreCase("FIN")) {
                break;
            }


            // vamos a validar el id
            if (!U2Service.esIdValido(id)) {
                System.out.println("ID valido");
                continue;
            }


            // aqui vamos a solicitar y validar la hora
            System.out.print("pon tu hora de ingreso (0-23): ");
            if (!sc.hasNextInt()) {
                System.out.println("tu hora no es valida");
                return;
            }


            hora = sc.nextInt();


            // vamos a validar el rango de la hora
            if (hora < 0 || hora > 23) {
                System.out.println("tu hora no es valida");
                return;
            }


            // aqui vamo sa poner las reglas
            totalRegistros++;
            if (U2Service.esHorarioPermitido(hora)) {
                System.out.println("Acceso valido");
                totalPermitidos++;
            } else {
                System.out.println("Acceso no valido");
                totalDenegados++;
            }
            System.out.println("**************************");
        }


        // aqui vamos a poner ya los resultados
        System.out.println("*********resultados*********");
        System.out.println("Total registros: " + totalRegistros);
        System.out.println("Total permitidos: " + totalPermitidos);
        System.out.println("Total denegados: " + totalDenegados);


        if (totalRegistros > 0) {
            double porcentaje = ((double) totalPermitidos / totalRegistros) * 100;
            System.out.printf("Porcentaje permitidos: %.2f%%\n", porcentaje);
        } else {
            System.out.println("Porcentaje permitidos: 0.00%");
        }


        sc.close();
    }
}

