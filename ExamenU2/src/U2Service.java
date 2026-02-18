public class  U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        // lo que dijo
        if (id == null || id.length() != 8) {
            return false;
        }


        // aqui es por si ponen numeros y letras para que los agarre
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }


    public static boolean esHorarioPermitido(int hora) {
        // aqui vamos a poner el horario permitido
        return hora >= 7 && hora <= 19;
    }
}