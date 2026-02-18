public class U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9)
    public static boolean esIdValido(String id) {
        if (id == null) return false;

        // Validación de longitud EXACTA de 8
        if (id.length() != 8) {
            return false;
        }

        // Validación manual de caracteres alfanuméricos
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            
            boolean esLetra = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
            boolean esDigito = (ch >= '0' && ch <= '9');
               if (!(esLetra || esDigito)) {
                return false;
            }
        }

        return true; 
    }

    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {
        return (hora >=7 && hora <=19);
    }
}
