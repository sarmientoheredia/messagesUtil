package ec.mil.ejercito.dtic.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author sarmiento
 */
public class Mensaje {

    private static Mensaje instance;

    private Mensaje() {
    }

    public static Mensaje getInstance() {
        if (instance == null) {
            return new Mensaje();
        }
        return instance;
    }

    public static void infoMessage(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_INFO,"EXITO");
    }

    public static void errorMessage(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_ERROR,"ERROR");
    }

    public static void warningMessage(String mensaje ) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_WARN,"ADVERTENCIA");
    }

    public static void fatalMessages(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_FATAL,"FATAL");
    }

    private static void mostrarMensaje(String mensaje, FacesMessage.Severity severidad,String detail) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severidad,detail, mensaje));
    }
}
