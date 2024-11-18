// Notificaciones.java
import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion(); // Polimorfismo
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje); // Interfaz
            }
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            System.out.println("Usuario: " + canal.usuario + ", Mensaje: " + canal.mensaje);
        }
    }
}

