 public class  U2Service {
    // ID válido: exactamente 8 caracteres alfanuméricos (A-Z, a-z, 0-9), sin espacios.
    public static boolean esIdValido(String id) {
        if (id == null) {
            System.out.println("es nulo");
            return false;
        }
        // sin espacios en blanco y longitud exacta
        if (id.length()<8) {
            System.out.println("no contiene 8 digitos ");
            return false;
        }
        // solo alfanumérico
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
           boolean esLetra =(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
             boolean esDigito = (ch >= '0' && ch <= '9');return true;
        }
        System.out.println("id INVALIDO");
        return false; // TODO
    }

    // Horario permitido: 7..19 inclusive
    public static boolean esHorarioPermitido(int hora) {
    if (hora >=7 && hora<=19){
        System.out.println("Es horario permitido ");
        return true;
    }else{
        System.out.println("Es horario no permitido");
        return false; // TODO
    }
    }
}
