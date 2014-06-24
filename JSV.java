package G.JSV.WebVersion;

/**
 *
 * @author rodrigo
 */
public class JSV {

    JSV() {
    }

    public boolean JSV_Alfabetico_SinEspeciales(String cadena) {
        if (!cadena.matches(".*[0-9].*")) {
            if(!cadena.matches(".*[ªº.:,;\\-_\\\\'@¡¬!\"·$%&/()=?¿].*")){
            System.out.println("valido");
            return true;
            }
        }
        System.out.println("no valido");
        return false;
    }
    
    public boolean JSV_Alfabetico_ConEspeciales(String cadena) {
        if (!cadena.matches(".*[0-9].*")) {
            System.out.println("valido");
            return true;
        }
        System.out.println("no valido");
        return false;
    }

    public boolean JSV_Numerico_SinEspeciales(String cadena) {
        if (!cadena.matches(".*[aA-zZ].*")) {
            if(!cadena.matches(".*[ªº.:,;\\-_\\\\'@¡¬!\"·$%&/()=?¿].*")){
            System.out.println("valido");
            return true;
            }
        }
        System.out.println("no valido");
        return false;
    }    
    
    public boolean JSV_Numerico_ConEspeciales(String cadena) {
        if (!cadena.matches(".*[aA-zZ].*")) {
            System.out.println("valido");
            return true;
        }
        System.out.println("no valido");
        return false;
    }
    
    public boolean JSV_Alfanumerico_SinEspeciales(String cadena) {
        if (!cadena.matches(".*[ªº.:,;\\-_\\\\'@¡¬!\"·$%&/()=?¿].*")) {
            System.out.println("valido");
            return true;
        }
        System.out.println("no valido");
        return false;
    }
}