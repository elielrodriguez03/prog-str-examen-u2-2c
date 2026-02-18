 public class  U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {

        if (id == null){
            return false;
        }
        // sin espacios en blanco y longitud exacta
        if (id.isBlank()) return false;

        // solo alfanumérico

        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            boolean esLetra = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
            ch = id.charAt(0); // primer carácter
            boolean esDigito = (ch >= '0' && ch <= '9');

            if (!esDigito && !esLetra) return false;
        }

        return false; // TODO
    }

    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {

        if (hora>=7&&hora<=19){
            System.out.println("Horario permitido");
            return true;
        }else {
            return false;
        }

        // permitido 7..19 inclusive
         // TODO
    }
}
