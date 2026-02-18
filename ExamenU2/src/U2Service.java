 public class  U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        if (id == null || id.isBlank() || id.length() != 8) return false;

        // solo alfanumérico
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            boolean esLetra = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

            if (!esLetra) return false;

             char car = id.charAt(0); // primer carácter
             boolean esDigito = (car >= '0' && car <= '9');

            if (!esDigito) return false;
        }

        return false; // TODO
    }

    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {
        if (hora >= 7 && hora <= 19){
            return true;
        }else {
            return false; // TODO
        }
        // permitido 7..19 inclusive

    }
}
