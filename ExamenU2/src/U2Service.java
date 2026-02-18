 public class  U2Service {

    static boolean esIdValido(String id){

        boolean verificacion = (id == null) || id.isEmpty() || id.matches(("(A-Z, a-z, 0-9).")) || ((id.length() ==8));
        return verificacion;

    }


     static boolean esHorarioPermitido(int hora){
      return (hora>0 && hora<23);

    }

 }

