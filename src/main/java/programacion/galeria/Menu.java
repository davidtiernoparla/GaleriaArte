package programacion.galeria;

import java.util.Scanner;

public class Menu {

    private void mostrarMenu() {
        final String MENSAJE_LINEAS = "---------------------------------------------------------------";
        final String MENSAJE_TITULO_MENU = "----------------------------MENU-------------------------------";
        final String MENSAJE_PULSAR_OPCION = "Pulse el número correspondiente a la opción que deseas escoger.";
        final String MENSAJE_OPCION_UNO = "1 - Visualizar las obras de la galeria.";
        final String MENSAJE_OPCION_DOS = "2 - Dar de alta una nueva obra de arte.";
        final String MENSAJE_OPCION_TRES = "3 - Modificar los datos de una de las obras.";
        final String MENSAJE_OPCION_CUATRO = "4 - Visualizar los datos de una obra concreta.";
        final String MENSAJE_OPCION_CINCO = "5 - Obtener el precio de venta de una obra en particular.";
        final String MENSAJE_OPCION_SEIS = "6 - Imprimir la etiqueta de una obra.";
        final String MENSAJE_OPCION_CERO = "0 - Salir.";

        System.out.println(MENSAJE_LINEAS);
        System.out.println(MENSAJE_TITULO_MENU);
        System.out.println(MENSAJE_LINEAS);
        System.out.println(MENSAJE_PULSAR_OPCION);
        System.out.println(MENSAJE_LINEAS);
        System.out.println(MENSAJE_OPCION_UNO);
        System.out.println(MENSAJE_OPCION_DOS);
        System.out.println(MENSAJE_OPCION_TRES);
        System.out.println(MENSAJE_OPCION_CUATRO);
        System.out.println(MENSAJE_OPCION_CINCO);
        System.out.println(MENSAJE_OPCION_SEIS);
        System.out.println(MENSAJE_OPCION_CERO);
        System.out.println(MENSAJE_LINEAS);
    }

    public void lanzarMenu(ObraArte[] obras, Scanner teclado) {
        ejecutarOpcionMenu(obras, teclado);
    }

    private int recibirInputInt(ObraArte[] obras, Scanner teclado) {
        final int LIMITE_INFERIOR = 0;
        final int LIMITE_SUPERIOR = 6;
        String numRecibido = new String();
        do {
            numRecibido = teclado.nextLine();
            if ((!numRecibido.matches("[" + LIMITE_INFERIOR + "-" + LIMITE_SUPERIOR + "]"))) {
                System.out.println("El valor introducido es incorrecto, por favor pulse un numero entre "
                        + LIMITE_INFERIOR + " y " + LIMITE_SUPERIOR + ".");
            }
            // "[0-6]"
        } while (!numRecibido.matches("[" + LIMITE_INFERIOR + "-" + LIMITE_SUPERIOR + "]"));
        return Integer.parseInt(numRecibido);
    }

    private void ejecutarOpcionMenu(ObraArte[] obras, Scanner teclado) {
        final String MENSAJE_VACIO = "";
        final String MENSAJE_ENTER = "Enter";
        final String MENSAJE_DESPEDIDA = "Hasta otra.";
        final int OPCION_SALIR = 0;
        final int OPCION_VISUALIZAR_DATOS_TODAS = 1;
        final int OPCION_DAR_ALTA_UNA = 2;
        final int OPCION_MODIFICAR_UNA = 3;
        final int OPCION_VISUALIZAR_DATOS_UNA = 4;
        final int OPCION_VISUALIZAR__PRECIO_UNA = 5;
        final int OPCION_VISUALIZAR_ETIQUETA_UNA = 6;
        ObraArte[] obrasActualizadas = obras;
        int opcionElegida = OPCION_SALIR;
        boolean haTerminado = false;
        while (haTerminado == false) {
        System.out.println(MENSAJE_VACIO);
        System.out.println(MENSAJE_ENTER);
        teclado.nextLine();
        mostrarMenu();
        switch (opcionElegida = recibirInputInt(obras,teclado)) {
            case (OPCION_SALIR):
            haTerminado = true;
            System.out.println(MENSAJE_DESPEDIDA);
                break;
            // Visualizar las obras de arte existentes. Permite Conocer todas las expuestas.
            case (OPCION_VISUALIZAR_DATOS_TODAS):
                Visualizador.visualizarObras(obrasActualizadas);
                break;
            // Dar de alta una nueva obra de arte
            case (OPCION_DAR_ALTA_UNA):
                obrasActualizadas = Cargador.insertarObraArte(obrasActualizadas, teclado);
                break;
            // Modificar los datos de las obras expuestas, pide cual modificar al usuario
            case (OPCION_MODIFICAR_UNA):
                break;
            // Visualizar los datos de las obras expuestas, pide cual mostrar al usuario
            case (OPCION_VISUALIZAR_DATOS_UNA):
                Visualizador.visualizarObra(obrasActualizadas, Entrevistador.preguntarUsuarioObra(obrasActualizadas, teclado));
                break;
            // Obtener el precio de las obras de arte expuestas, pide cual mostrar al
            // usuario
            case (OPCION_VISUALIZAR__PRECIO_UNA):
                ObraArte.sacarPrecioVenta(obrasActualizadas, Entrevistador.preguntarUsuarioObra(obrasActualizadas, teclado));
                break;
            // Mostrar una etiqueta para clasificar una de las obras expuestas y dar
            // informcion extra
            case (OPCION_VISUALIZAR_ETIQUETA_UNA):
                Visualizador.mostrarEtiqueta(obrasActualizadas, Entrevistador.preguntarUsuarioObra(obrasActualizadas, teclado));
                break;
        }
    }
    }
}