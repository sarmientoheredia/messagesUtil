package ec.mil.ejercito.dtic.util;

import java.util.ResourceBundle;

public class ConvertirMensajeProperties {
    private static ConvertirMensajeProperties instance;

    private ConvertirMensajeProperties() {
    }

    public static ConvertirMensajeProperties getInstance() {
        if (instance == null) {
            instance = new ConvertirMensajeProperties();
        }
        return instance;
    }

    private static ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle("messages");
    }

    public static String getValue(String key) {
        return getResourceBundle().getString(key);
    }

}
