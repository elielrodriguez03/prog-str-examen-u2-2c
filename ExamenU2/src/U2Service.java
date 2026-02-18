 public class  U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        boolean esDigito = false;
        boolean esLetra=false;
        if (id == null) return false;

        // sin espacios en blanco y longitud exacta
        if (id.isBlank() || id.length() != 8) return false;

        // solo alfanumérico

        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                esLetra = true;
            }
            if ((ch >= '0' && ch <= '9')){
                esDigito = true;
            }
            // Nota sobre charAt (ejemplo mini):
            // char ch = id.charAt(0); // primer carácter
            if (!esDigito && !esLetra) return false;

        }

        return true; // TODO
    }

    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {
        if (hora < 0 || hora > 23){
            return false;
        }
        // permitido 7..19 inclusive
        return true; // TODO
    }
}
