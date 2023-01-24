package programacion.galeria;

public class Menu {

    private void generarMenu(int opcion) {
        final int OPCION_VISUALIZAR_DATOS_TODAS = 1;
        final int OPCION_DAR_UNA = 2;
        final int OPCION_MODIFICAR_UNA = 3;
        final int OPCION_VISUALIZAR_DATOS_UNA = 4;
        final int OPCION_VISUALIZAR__PRECIO_UNA = 5;
        final int OPCION_VISUALIZAR_ETIQUETA_UNA = 6;
        int opcionElegida = opcion;
        switch (opcionElegida) {
            // Visualizar las obras de arte existentes. Permite Conocer todas las expuestas.
            case (OPCION_VISUALIZAR_DATOS_TODAS):

                break;
            // Dar de alta una nueva obra de arte
            case (OPCION_DAR_UNA):

                break;
            // Modificar los datos de las obras expuestas, pide cual modificar al usuario
            case (OPCION_MODIFICAR_UNA):

                break;
            // Visualizar los datos de las obras expuestas, pide cual mostrar al usuario
            case (OPCION_VISUALIZAR_DATOS_UNA):

                break;
            // Obtener el precio de las obras de arte expuestas, pide cual mostrar al
            // usuario
            case (OPCION_VISUALIZAR__PRECIO_UNA):

                break;
            // Mostrar una etiqueta para clasificar una de las obras expuestas y dar
            // informcion extra
            case (OPCION_VISUALIZAR_ETIQUETA_UNA):

                break;
            default:
                generarMenu(opcionElegida);
                break;
        }
    }
}
