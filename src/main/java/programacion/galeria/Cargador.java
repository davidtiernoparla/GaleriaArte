package programacion.galeria;

import java.util.Scanner;

import programacion.galeria.Escultura.Material;
import programacion.galeria.Pintura.Tecnica;

public class Cargador {

        // Para cargar las 5 obras de arte al inicio
        protected ObraArte[] cargar5ObrasInicio() {
                final String TIPO_PINTURA = "Pintura";
                final String TIPO_ESCULTURA = "Escultura";
                final String PINTURA_1_NOMBRE = "Guernica";
                final String PINTURA_2_NOMBRE = "la Vie";
                final String PINTURA_3_NOMBRE = "El Sueño";
                final String PINTURA_4_NOMBRE = "Retrato de Dora Maar";
                final String ESCULTURA_NOMBRE = "El piel roja";
                final String PINTURA_1_2_3_4_AUTOR = "P.Picasso";
                final String ESCULTURA_AUTOR = "U.Checa";
                final String PINTURA_1_DESC = "cuadro guerra civil";
                final String PINTURA_2_3_4_DESC = "óleo";
                final String ESCULTURA_DESC = "escultura";
                final Tecnica PINTURA_1_2_3_4_TECNICA = Tecnica.OLEO;
                final Material ESCULTURA_MATERIAL = Material.ACERO;
                final int CANTIDAD_OBRAS = 5;
                final int PINTURA_1_ID = 1;
                final int PINTURA_2_ID = 2;
                final int PINTURA_3_ID = 3;
                final int PINTURA_4_ID = 4;
                final int ESCULTURA_ID = 5;
                final int PINTURA_1_PRECIO = 1000;
                final int PINTURA_2_PRECIO = 200;
                final int PINTURA_3_PRECIO = 300;
                final int PINTURA_4_PRECIO = 400;
                final int ESCULTURA_PRECIO = 350;
                final double PINTURA_1_ALTURA = 5;
                final double PINTURA_2_4_ALTURA = 1;
                final double PINTURA_3_ALTURA = 1.3;
                final double ESCULTURA_ALTURA = 1;
                final double PINTURA_1_PESO = 2;
                final double PINTURA_2_3_PESO = 1;
                final double PINTURA_4_PESO = 0.8;
                final double ESCULTURA_PESO = 0.8;
                final int PINTURA_1_PIEZAS = 5;
                final int PINTURA_2_3_4_PIEZAS = 1;
                final int ESCULTURA_PIEZAS = 1;

                // Almacenara varias ObraArte
                ObraArte[] obras = new ObraArte[CANTIDAD_OBRAS];
                // Las obras de inicio las pongo seguidas porque con un loop es incluso mas
                // farragoso
                // P1
                obras[PINTURA_1_ID - 1] = new Pintura(PINTURA_1_ID, TIPO_PINTURA,
                                PINTURA_1_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_1_PRECIO, PINTURA_1_ALTURA,
                                PINTURA_1_PESO,
                                PINTURA_1_2_3_4_TECNICA, PINTURA_1_PIEZAS,
                                PINTURA_1_DESC);
                // P2
                obras[PINTURA_2_ID - 1] = new Pintura(PINTURA_2_ID, TIPO_PINTURA,
                                PINTURA_2_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_2_PRECIO, PINTURA_2_4_ALTURA,
                                PINTURA_2_3_PESO,
                                PINTURA_1_2_3_4_TECNICA, PINTURA_2_3_4_PIEZAS,
                                PINTURA_2_3_4_DESC);
                // P3
                obras[PINTURA_3_ID - 1] = new Pintura(PINTURA_3_ID, TIPO_PINTURA,
                                PINTURA_3_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_3_PRECIO, PINTURA_3_ALTURA,
                                PINTURA_2_3_PESO,
                                PINTURA_1_2_3_4_TECNICA, PINTURA_2_3_4_PIEZAS,
                                PINTURA_2_3_4_DESC);
                // P4
                obras[PINTURA_4_ID - 1] = new Pintura(PINTURA_4_ID, TIPO_PINTURA,
                                PINTURA_4_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_4_PRECIO, PINTURA_2_4_ALTURA,
                                PINTURA_4_PESO,
                                PINTURA_1_2_3_4_TECNICA, PINTURA_2_3_4_PIEZAS,
                                PINTURA_2_3_4_DESC);
                // E5
                obras[ESCULTURA_ID - 1] = new Escultura(ESCULTURA_ID, TIPO_ESCULTURA,
                                ESCULTURA_NOMBRE, ESCULTURA_AUTOR, ESCULTURA_PRECIO, ESCULTURA_ALTURA, ESCULTURA_PESO,
                                ESCULTURA_MATERIAL, ESCULTURA_PIEZAS,
                                ESCULTURA_DESC);
                return obras;
        }

        protected ObraArte[] insertarObraArte(ObraArte[] obras) {
                final int INCREMENTO_1 = 1;
                final int RESTA_1 = -1;
                // copio el contenido de obras en nuevaObras
                ObraArte[] nuevaObras = new ObraArte[obras.length + INCREMENTO_1];
                for (int i = 0; i < obras.length; i++) {
                        nuevaObras[i] = obras[i];
                }
                final String TIPO = preguntarDatoUsuarioString(ObraArte.Campo.TIPO);
                final String NOMBRE = preguntarDatoUsuarioString(ObraArte.Campo.NOMBRE);
                final String AUTOR = preguntarDatoUsuarioString(ObraArte.Campo.AUTOR);
                final String DESC = preguntarDatoUsuarioString(ObraArte.Campo.DESC);

                final int ID = nuevaObras.length;
                final int PRECIO = preguntarDatoUsuarioInt(ObraArte.Campo.PRECIO);
                final double ALTURA = preguntarDatoUsuarioDouble(ObraArte.Campo.ALTURA);
                final double PESO = preguntarDatoUsuarioDouble(ObraArte.Campo.PESO);
                final int PIEZAS = preguntarDatoUsuarioInt(ObraArte.Campo.PIEZAS);
                if (TIPO.equals(Pintura.NOM_CLAS_PINT)) {
                        final String TECNICA = preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT);
                        // creo la nueva pintura y la introduzco
                        if (TECNICA.equals(Pintura.Tecnica.OLEO.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Pintura(ID, TIPO, NOMBRE, AUTOR, PRECIO,
                                                ALTURA, PESO, Pintura.Tecnica.OLEO, PIEZAS, DESC);
                        } else if (TECNICA.equals(Pintura.Tecnica.ACUARELA.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Pintura(ID, TIPO, NOMBRE, AUTOR, PRECIO,
                                                ALTURA, PESO, Pintura.Tecnica.ACUARELA, PIEZAS, DESC);
                        } else {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Pintura(ID, TIPO, NOMBRE, AUTOR, PRECIO,
                                                ALTURA, PESO, Pintura.Tecnica.CARBONCILLO, PIEZAS, DESC);
                        }

                } else {
                        final String MATERIAL = preguntarDatoUsuarioMaterial(ObraArte.Campo.TEC_MAT);
                        // creo la nueva escultura y la introduzco
                        if (MATERIAL.equals(Escultura.Material.ACERO.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Escultura(ID, TIPO, NOMBRE, AUTOR, PRECIO,
                                                ALTURA, PESO, Escultura.Material.ACERO, PIEZAS, DESC);
                        } else if (MATERIAL.equals(Escultura.Material.ACERO.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Escultura(ID, TIPO, NOMBRE, AUTOR, PRECIO,
                                                ALTURA, PESO, Escultura.Material.COBRE, PIEZAS, DESC);
                        } else {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Escultura(ID, TIPO, NOMBRE, AUTOR, PRECIO,
                                                ALTURA, PESO, Escultura.Material.HIERRO, PIEZAS, DESC);
                        }
                }

                return nuevaObras;
        }

        private int preguntarDatoUsuarioInt(ObraArte.Campo campo) {
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

        private double preguntarDatoUsuarioDouble(ObraArte.Campo campo) {
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

        private String preguntarDatoUsuarioString(ObraArte.Campo campo) {
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

        private String preguntarDatoUsuarioTecnica(ObraArte.Campo campo) {
                try (Scanner teclado = new Scanner(System.in)) {

                        final String PETICION_OPCION = "Introduzca el número para elegir la tecnica correspondiente";
                        
                        final int OPCION_TECNICA_OLEO = 0;
                        final int OPCION_TECNICA_ACUARELA = 1;
                        final int OPCION_TECNICA_CARBONCILLO = 2;
                        final String PETICION_RECTIFICAR = "Introduzca un numero valido (" + OPCION_TECNICA_OLEO + "," + OPCION_TECNICA_ACUARELA +
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

        private String preguntarDatoUsuarioMaterial(ObraArte.Campo campo) {
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
}
