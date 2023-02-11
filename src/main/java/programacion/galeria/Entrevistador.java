package programacion.galeria;

import java.util.Scanner;

public class Entrevistador {

    
    public static int preguntarDatoUsuarioInt(ObraArte.Campo campo) {
        final String PETICION_VALOR = "Indique el valor de: " + campo.getVal();
        final String PETICION_RECTIFICAR = "Introduzca un numero positivo (o 0) para el campo: "
                + campo.getVal();
        int num = -1;
        try (Scanner teclado = new Scanner(System.in)) {
            do {
                System.out.println(PETICION_VALOR);
                num = teclado.nextInt();
                while (!teclado.hasNextInt() | num < 0) {
                    System.out.println(PETICION_RECTIFICAR);
                    teclado.next(); // vacia el Scanner
                }
                return num;
            } while (num <= 0);
        }
    }

    public static double preguntarDatoUsuarioDouble(ObraArte.Campo campo) {
        final String PETICION_VALOR = "Indique el valor de: " + campo.getVal();
        final String PETICION_RECTIFICAR = "Introduzca un numero positivo (o 0) para el campo: "
                + campo.getVal();
        double num = -1;
        try (Scanner teclado = new Scanner(System.in)) {

            do {
                System.out.println(PETICION_VALOR);
                num = teclado.nextDouble();
                while (!teclado.hasNextDouble() | num < 0) {
                    System.out.println(PETICION_RECTIFICAR);
                    teclado.next(); // vacia el Scanner
                }
                return num;
            } while (num <= 0);
        }
    }

    public static String preguntarDatoUsuarioString(ObraArte.Campo campo) {
        final String PETICION_VALOR = "Indique el valor de: " + campo.getVal();
        final String PETICION_RECTIFICAR = "Introduzca un texto valido para el campo: " + campo.getVal();
        String palabras = new String();
        try (Scanner teclado = new Scanner(System.in)) {
            do {
                System.out.println(PETICION_VALOR);
                palabras = teclado.next();
                while (!teclado.hasNext()) {
                    System.out.println(PETICION_RECTIFICAR);
                    teclado.next(); // vacia el Scanner
                }
                return palabras;
            } while (!teclado.hasNext());
        }
    }

    public static String preguntarDatoUsuarioTecnica(ObraArte.Campo campo) {
        try (Scanner teclado = new Scanner(System.in)) {

            final String PETICION_OPCION = "Introduzca el número para elegir la tecnica correspondiente";

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
            int tecnica_escogida = -1;
            String tecnica = new String();
            do {
                System.out.println(PETICION_OPCION);
                System.out.println(PETICION_OPCION_OLEO);
                System.out.println(PETICION_OPCION_ACUARELA);
                System.out.println(PETICION_OPCION_CARBONCILLO);
                tecnica_escogida = teclado.nextInt();
                while (!teclado.hasNextInt()) {
                    System.out.println(PETICION_RECTIFICAR);
                    teclado.next(); // vacia el Scanner
                }
            } while (!(tecnica_escogida == OPCION_TECNICA_OLEO | tecnica_escogida == OPCION_TECNICA_ACUARELA
                    | tecnica_escogida == OPCION_TECNICA_CARBONCILLO));
            switch (tecnica_escogida) {
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
            tecnica = teclado.nextLine();
            return tecnica;
        }
    }

    public static String preguntarDatoUsuarioMaterial(ObraArte.Campo campo) {
        try (Scanner teclado = new Scanner(System.in)) {
            final String PETICION_OPCION = "Introduzca el número para elegir el material correspondiente";
            final String PETICION_RECTIFICAR = "Introduzca un texto valido para el campo: "
                    + campo.getVal();
            final int OPCION_MATERIAL_ACERO = 0;
            final int OPCION_MATERIAL_COBRE = 1;
            final int OPCION_MATERIAL_HIERRO = 2;
            final String PETICION_OPCION_ACERO = Pintura.Tecnica.OLEO + " - " + OPCION_MATERIAL_ACERO;
            final String PETICION_OPCION_COBRE = Pintura.Tecnica.ACUARELA + " - "
                    + OPCION_MATERIAL_COBRE;
            final String PETICION_OPCION_HIERRO = Pintura.Tecnica.CARBONCILLO + " - "
                    + OPCION_MATERIAL_HIERRO;
            int material_escogido = -1;
            String material = new String();
            do {
                System.out.println(PETICION_OPCION);
                System.out.println(PETICION_OPCION_ACERO);
                System.out.println(PETICION_OPCION_COBRE);
                System.out.println(PETICION_OPCION_HIERRO);
                material_escogido = teclado.nextInt();
                while (!teclado.hasNextInt()) {
                    System.out.println(PETICION_RECTIFICAR);
                    teclado.next(); // vacia el Scanner
                }
            } while (!(material_escogido == OPCION_MATERIAL_ACERO | material_escogido == OPCION_MATERIAL_COBRE
                    | material_escogido == OPCION_MATERIAL_HIERRO));
            switch (material_escogido) {
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
            material = teclado.nextLine();
            return material;
        }
    }

    public static boolean preguntarSiModificarCampo(String nombreCampo) {
        final String SI = "S";
        final String NO = "N";
        final String PREGUNTA_MODIFICAR = "¿Desea modificar su campo?:" + nombreCampo;
        final String PREGUNTA_SI_O_NO = "Pulse 'S' para afirmar, 'N' para pasar al siguiente campo sin modificar el actual (S/N) ";
        final String PIDE_INPUT_VALIDO = "Algo falló, intentelo nuevamente";
        try (Scanner teclado = new Scanner(System.in)) {
            String eligeSiNo = new String();
            boolean seModifica = false;
            do {
                System.out.println(PREGUNTA_MODIFICAR);
                System.out.println(PREGUNTA_SI_O_NO);
                eligeSiNo = teclado.next();
                if (eligeSiNo != SI && eligeSiNo != NO) {
                    System.out.println(PIDE_INPUT_VALIDO);
                    teclado.next();
                }
            } while (eligeSiNo != SI && eligeSiNo != NO);
            if (eligeSiNo.equals(SI)) {
                seModifica = true;
            }
            return seModifica;
        }
    }
}