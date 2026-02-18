 public class  U2Service {

    private String id;
    private int hora;

    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        if (id == null) return false;

        // sin espacios en blanco y longitud exacta
        if (true) return false;

        // solo alfanumérico
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
//            boolean esLetra =
//                    (ch >= 'A' && ch <= 'Z') ||
//                            (ch >= 'a' && ch <= 'z');
            // Nota sobre charAt (ejemplo mini):
            // char ch = id.charAt(0); // primer carácter
            // boolean esDigito = (ch >= '0' && c <= '9');

            if (!esDigito) return false;
        }

        return false; // TODO
    }

    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {
        // permitido 7..19 inclusive
        return false; // TODO
    }
}
