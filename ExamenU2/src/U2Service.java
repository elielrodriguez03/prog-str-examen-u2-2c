 public class  U2Service {
         // ID válido: exactamente 8 caracteres alfanuméricos, sin espacios.
         public static boolean esIdValido(String id) {
             if (id == null) return false;

             // Usamos regex para validar alfanumérico y longitud 8
             return id.matches("^[a-zA-Z0-9]{8}$");
         }

         // Horario permitido: 7..19 inclusive
         public static boolean esHorarioPermitido(int hora) {
             // Retorna true si está entre 7 y 19
             return hora >= 7 && hora <= 19;
         }
     }

