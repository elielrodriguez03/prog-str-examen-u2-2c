import java.util.IllegalFormatCodePointException;

public class  U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        if (id == null || id.isBlank() || id.length() != 8) return false;

        if (!id.matches("^[A-Za-z0-9]")){
            return true;

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
