import java.util.Scanner;

public class  U2Service {
     public static boolean esLetra;
   // Scanner sc = new Scanner(System.in);
     // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        if (id == null) return false;
        // sin espacios en blanco y longitud exacta
        if (id.length() > 8) return false;
        // solo alfanumérico
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            esLetra = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
            // Nota sobre charAt (ejemplo mini):
            // char ch = id.charAt(0); // primer carácter
            boolean esDigito = (ch >= '0' && ch <= '9');
            if (!esDigito)
                return true;
        }
            return false; // TODO

    }
    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {
        if (hora < 7 || hora >19){
            System.out.println("Hora no accesible");

        }else {
            System.out.println("Hora accesible");
            return true;
        }
        // permitido 7..19 inclusive
        return false; // TODO
    }
}
