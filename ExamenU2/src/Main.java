import java.util.Scanner;
import java.util.Scanner;

public class Main {
    static int contadorFueraRango = 0;
    static int contadorDentroRango = 0;
    static int contadorRegistros = 0;
    static String id;

    static U2Service examenU2 = new U2Service();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingresa el id del alumno (ingresa FIN para acabar el ciclo)");
            id = sc.nextLine();

            if (id.equalsIgnoreCase("FIN")) {
                break;
            }

            if (!examenU2.esIdValido(id)) {
                System.out.println("ID inválido");
                continue;
            }

            System.out.println("Ingresa la hora en la que va a entrar el alumno");

            if (!sc.hasNextInt()) {
                System.out.println("Hora inválida");
                sc.nextLine();
                continue;
            }

            int hora = sc.nextInt();
            sc.nextLine();

            contadorRegistros++;

            if (examenU2.esHorarioPermitido(hora)) {
                System.out.println("Se ACEPTA el acceso");
                contadorDentroRango++;
            } else {
                System.out.println("Acceso DENEGADO");
                contadorFueraRango++;
            }

        } while (true);

        System.out.println("Total de registros: " + contadorRegistros);
        System.out.println("Total de permitidos: " + contadorDentroRango);
        System.out.println("Total denegados: " + contadorFueraRango);

        sc.close();
    }
}