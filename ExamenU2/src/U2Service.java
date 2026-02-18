public class  U2Service {

    static boolean esIdValido(String id) {

        if (id == null || id.isEmpty() || id.length() != 8) {
            return false;
        }

        for (int i = 0; i < 8; i++) {
            char chat = id.charAt(i);
            boolean esNumero = (chat >= '0' && chat <= '9');
            boolean esMayuscula = (chat >= 'A' && chat <= 'Z');
            boolean esMinuscula = (chat >= 'a' && chat <= 'z');

            if (!esNumero && !esMayuscula && !esMinuscula) {
                return false;
            }
        }

        return true;
    }

    static boolean esHorarioPermitido(int hora) {
        return (hora >= 7 && hora <= 19);
    }
}