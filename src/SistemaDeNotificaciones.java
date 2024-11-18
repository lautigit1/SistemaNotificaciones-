// SistemaNotificaciones.java
public class SistemaDeNotificaciones {
    public static void main(String[] args) {
        // Crear instancias de canales de notificación
        CorreoElectronico correo = new CorreoElectronico("Juan Perez", "Bienvenido a nuestra app", "juan@gmail.com");
        MensajeTexto mensajeTexto = new MensajeTexto("Maria Lopez", "Tu código es 1234", "987654321");

        // Crear el sistema de notificaciones
        Notificaciones sistemaNotificaciones = new Notificaciones();
        sistemaNotificaciones.agregarCanal(correo);
        sistemaNotificaciones.agregarCanal(mensajeTexto);

        // Mostrar canales de notificación
        System.out.println("Canales de Notificación:");
        sistemaNotificaciones.mostrarCanales();

        // Enviar notificaciones
        System.out.println("\nEnviando Notificaciones:");
        sistemaNotificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando Mensajes:");
        sistemaNotificaciones.personalizarMensajes("Este es un mensaje actualizado para todos los usuarios");

        // Enviar notificaciones nuevamente
        System.out.println("\nEnviando Notificaciones Personalizadas:");
        sistemaNotificaciones.enviarNotificaciones();
    }
}
