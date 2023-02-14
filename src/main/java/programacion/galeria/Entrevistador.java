package programacion.galeria;

import java.util.Scanner;

public class Entrevistador {

    public static final String preguntarUsuarioObra(ObraArte[] obras, Scanner teclado) {
        final String PETICION_OBRA = "Introduzca el nombre de la obra que desee";

        System.out.println(PETICION_OBRA);
        String nombre = teclado.nextLine();
        return nombre;
    }

    public static int preguntarDatoUsuarioInt(ObraArte.Campo campo, Scanner teclado) {
        final String PETICION_VALOR = "Indique el valor de: " + campo.getVal();
        final String PETICION_RECTIFICAR = "Introduzca un numero positivo (o 0) para el campo: " + campo.getVal();
        ;
        final String REGEX_INT = "[0-9]+";
        String num = new String();
        do {
            System.out.println(PETICION_VALOR);
            num = teclado.nextLine();
            if (!num.matches(REGEX_INT)) {
                System.out.println(PETICION_RECTIFICAR);
            }
        } while (!num.matches(REGEX_INT));
        return Integer.parseInt(num);
    }

    public static double preguntarDatoUsuarioDouble(ObraArte.Campo campo, Scanner teclado) {
        final String PETICION_VALOR = "Indique el valor de: " + campo.getVal();
        final String PETICION_RECTIFICAR = "Introduzca un numero positivo (o 0) para el campo: " + campo.getVal();
        ;
        final String REGEX_DOUBLE = "[0-9]+([.][0-9]+)?";
        String num = new String();
        do {
            System.out.println(PETICION_VALOR);
            num = teclado.nextLine();
            if (!num.matches(REGEX_DOUBLE)) {
                System.out.println(PETICION_RECTIFICAR);
                teclado.nextLine(); // vacia el Scanner
            }

        } while (!num.matches(REGEX_DOUBLE));
        return Double.parseDouble(num);
    }

    public static String preguntarDatoUsuarioString(ObraArte.Campo campo, Scanner teclado) {
        final String PETICION_VALOR = "Indique el valor de: " + campo.getVal();
        final String PETICION_RECTIFICAR = "Introduzca un texto valido para el campo: " + campo.getVal();
        final String REGEX_STRING = ".+";
        String palabras = new String();
        do {
            System.out.println(PETICION_VALOR);
            palabras = teclado.nextLine();
            if (!palabras.matches(REGEX_STRING)) {
                System.out.println(PETICION_RECTIFICAR);
            }
            return palabras;
        } while (!palabras.matches(REGEX_STRING));
    }

    public static String preguntarDatoUsuarioTecnica(ObraArte.Campo campo, Scanner teclado) {
        final String PETICION_OPCION = "Introduzca el número para elegir la tecnica correspondiente";
        final String REGEX_OPCIONES = "[0-2]";
        final int OPCION_TECNICA_OLEO = 0;
        final int OPCION_TECNICA_ACUARELA = 1;
        final int OPCION_TECNICA_CARBONCILLO = 2;
        final String PETICION_RECTIFICAR = "Introduzca un numero valido (" + OPCION_TECNICA_OLEO + ","
                + OPCION_TECNICA_ACUARELA +
                "," + OPCION_TECNICA_CARBONCILLO +
                "para el campo:"
                + campo.getVal();
        final String PETICION_OPCION_OLEO = Pintura.Tecnica.OLEO + " - " + OPCION_TECNICA_OLEO;
        final String PETICION_OPCION_ACUARELA = Pintura.Tecnica.ACUARELA + " - "
                + OPCION_TECNICA_ACUARELA;
        final String PETICION_OPCION_CARBONCILLO = Pintura.Tecnica.CARBONCILLO + " - "
                + OPCION_TECNICA_CARBONCILLO;
        String num_tecnica_escogida = new String();
        String tecnica = new String();
        do {
            System.out.println(PETICION_OPCION);
            System.out.println(PETICION_OPCION_OLEO);
            System.out.println(PETICION_OPCION_ACUARELA);
            System.out.println(PETICION_OPCION_CARBONCILLO);
            num_tecnica_escogida = teclado.nextLine();
            if (!num_tecnica_escogida.matches(REGEX_OPCIONES)) {
                System.out.println(PETICION_RECTIFICAR);
            }
        } while (!num_tecnica_escogida.matches(REGEX_OPCIONES));
        switch (Integer.parseInt(num_tecnica_escogida)) {
            case OPCION_TECNICA_OLEO:
                tecnica = Pintura.Tecnica.OLEO.getVal();
                break;
            case OPCION_TECNICA_ACUARELA:
                tecnica = Pintura.Tecnica.ACUARELA.getVal();
                break;
            case OPCION_TECNICA_CARBONCILLO:
                tecnica = Pintura.Tecnica.CARBONCILLO.getVal();
                break;
        }
        return tecnica;
    }

    public static String preguntarDatoUsuarioMaterial(ObraArte.Campo campo, Scanner teclado) {
        final String PETICION_OPCION = "Introduzca el número para elegir el material correspondiente";
        final String PETICION_RECTIFICAR = "Introduzca un texto valido para el campo: "
                + campo.getVal();
        final String REGEX_OPCIONES = "[0-2]";
        final int OPCION_MATERIAL_ACERO = 0;
        final int OPCION_MATERIAL_COBRE = 1;
        final int OPCION_MATERIAL_HIERRO = 2;
        final String PETICION_OPCION_ACERO = Escultura.Material.ACERO + " - " + OPCION_MATERIAL_ACERO;
        final String PETICION_OPCION_COBRE = Escultura.Material.COBRE + " - "
                + OPCION_MATERIAL_COBRE;
        final String PETICION_OPCION_HIERRO = Escultura.Material.HIERRO + " - "
                + OPCION_MATERIAL_HIERRO;
        String num_material_escogido = new String();
        String material = new String();
        do {
            System.out.println(PETICION_OPCION);
            System.out.println(PETICION_OPCION_ACERO);
            System.out.println(PETICION_OPCION_COBRE);
            System.out.println(PETICION_OPCION_HIERRO);
            num_material_escogido = teclado.nextLine();
            if (!num_material_escogido.matches(REGEX_OPCIONES)) {
                System.out.println(PETICION_RECTIFICAR);
            }
        } while (!num_material_escogido.matches(REGEX_OPCIONES));
        switch (Integer.parseInt(num_material_escogido)) {
            case OPCION_MATERIAL_ACERO:
                material = Escultura.Material.ACERO.getVal();
                break;
            case OPCION_MATERIAL_COBRE:
                material = Escultura.Material.COBRE.getVal();
                break;
            case OPCION_MATERIAL_HIERRO:
                material = Escultura.Material.HIERRO.getVal();
                break;
        }
        return material;
    }

    public static boolean preguntarSiModificarCampo(String nombreCampo, Scanner teclado) {
        final String SI = "S";
        final String NO = "N";
        final String PREGUNTA_MODIFICAR = "¿Desea modificar su campo?:" + nombreCampo;
        final String PREGUNTA_SI_O_NO = "Pulse 'S' para afirmar, 'N' para pasar al siguiente campo sin modificar el actual (S/N) ";
        final String PIDE_INPUT_VALIDO = "Algo falló, intentelo nuevamente";
        String eligeSiNo = new String();
        boolean seModifica = false;
        do {
            System.out.println(PREGUNTA_MODIFICAR);
            System.out.println(PREGUNTA_SI_O_NO);
            eligeSiNo = teclado.nextLine();
            if (!eligeSiNo.equals(SI) && !eligeSiNo.equals(NO)) {
                System.out.println(PIDE_INPUT_VALIDO);
            }
        } while (!eligeSiNo.equals(SI) && !eligeSiNo.equals(NO));
        if (eligeSiNo.equals(SI)) {
            seModifica = true;
        }
        return seModifica;
    }
}