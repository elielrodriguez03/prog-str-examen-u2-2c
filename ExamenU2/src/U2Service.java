public class U2Service {

    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9)
    public static boolean esIdValido(String id) {
        // sin espacios en blanco y longitud exacta
        if (id == null || id.length() != 8) return false;
        // solo alfanumérico
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            boolean esLetra = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
            boolean esDigito = (ch >= '0' && ch <= '9');

            if (!esLetra && !esDigito) {
                return false;
            }
        }
        return true;
    }

    public static boolean esHorarioPermitido(int hora) {
        return (hora >= 7 && hora <= 19);
    }
}
