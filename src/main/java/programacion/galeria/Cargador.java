package programacion.galeria;

import java.util.Scanner;

import programacion.galeria.Escultura.Material;
import programacion.galeria.Pintura.Tecnica;

public class Cargador {

        // Para cargar las 5 obras de arte al inicio
        protected static ObraArte[] cargar5ObrasInicio() {
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

        protected static ObraArte[] insertarObraArte(ObraArte[] obras, Scanner teclado) {
                final String TIPO = devolverUnTipoPosible(obras, teclado);
                final String NOMBRE = Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.NOMBRE, teclado);
                final String AUTOR = Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.AUTOR, teclado);
                final String DESC = Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.DESC, teclado);
                final double PRECIO = Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.PRECIO, teclado);
                final double ALTURA = Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.ALTURA, teclado);
                final double PESO = Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.PESO, teclado);
                final int PIEZAS = Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PIEZAS, teclado);
                final int INCREMENTO_1 = 1;
                final int RESTA_1 = -1;
                // copio el contenido de obras en nuevaObras
                ObraArte[] nuevaObras = new ObraArte[obras.length + INCREMENTO_1];
                for (int i = 0; i < obras.length; i++) {
                        nuevaObras[i] = obras[i];
                }
                final int ID = nuevaObras.length;

                if (TIPO.equalsIgnoreCase(Pintura.class.getName())) {
                        final String TECNICA = Entrevistador
                                        .preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT, teclado);
                        // creo la nueva pintura y la introduzco
                        if (TECNICA.equals(Pintura.Tecnica.OLEO.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Pintura(ID, TIPO, NOMBRE, AUTOR,
                                                PRECIO,
                                                ALTURA, PESO, Pintura.Tecnica.OLEO, PIEZAS, DESC);
                        } else if (TECNICA.equals(Pintura.Tecnica.ACUARELA.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Pintura(ID, TIPO, NOMBRE, AUTOR,
                                                PRECIO,
                                                ALTURA, PESO, Pintura.Tecnica.ACUARELA, PIEZAS, DESC);
                        } else {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Pintura(ID, TIPO, NOMBRE, AUTOR,
                                                PRECIO,
                                                ALTURA, PESO, Pintura.Tecnica.CARBONCILLO, PIEZAS, DESC);
                        }

                } else {
                        final String MATERIAL = Entrevistador
                                        .preguntarDatoUsuarioMaterial(ObraArte.Campo.TEC_MAT, teclado);
                        // creo la nueva escultura y la introduzco
                        if (MATERIAL.equals(Escultura.Material.ACERO.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Escultura(ID, TIPO, NOMBRE, AUTOR,
                                                PRECIO,
                                                ALTURA, PESO, Escultura.Material.ACERO, PIEZAS, DESC);
                        } else if (MATERIAL.equals(Escultura.Material.ACERO.getVal())) {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Escultura(ID, TIPO, NOMBRE, AUTOR,
                                                PRECIO,
                                                ALTURA, PESO, Escultura.Material.COBRE, PIEZAS, DESC);
                        } else {
                                nuevaObras[nuevaObras.length + RESTA_1] = new Escultura(ID, TIPO, NOMBRE, AUTOR,
                                                PRECIO,
                                                ALTURA, PESO, Escultura.Material.HIERRO, PIEZAS, DESC);
                        }
                }
                return nuevaObras;
        }

        private static String devolverUnTipoPosible(ObraArte[] obras, Scanner teclado) {
                final String POSIBLE_TIPO_PINTURA = "Pintura";
                final String POSIBLE_TIPO_ESCULTURA = "Escultura";
                final String MENSAJE_TIPOS_POSIBLES = "La obras puede ser de tipo " + POSIBLE_TIPO_PINTURA + " o "
                                + POSIBLE_TIPO_ESCULTURA + ".";
                final String MENSAJE_RECTIFICAR = "Ese " + ObraArte.Campo.TIPO + " no es valido, la obra puede ser de "
                                + ObraArte.Campo.TIPO + " " + POSIBLE_TIPO_PINTURA + " o " + ObraArte.Campo.TIPO + " "
                                + POSIBLE_TIPO_ESCULTURA;
                String tipoCorrecto = new String();
                do {
                        System.out.println(MENSAJE_TIPOS_POSIBLES);
                        tipoCorrecto = Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.TIPO, teclado);
                        if (!(tipoCorrecto.equalsIgnoreCase(POSIBLE_TIPO_PINTURA)
                                        | tipoCorrecto.equalsIgnoreCase(POSIBLE_TIPO_ESCULTURA))) {
                                System.out.println(MENSAJE_RECTIFICAR);
                        }
                } while (!(tipoCorrecto.equalsIgnoreCase(POSIBLE_TIPO_PINTURA)
                                | tipoCorrecto.equalsIgnoreCase(POSIBLE_TIPO_ESCULTURA)));
                return tipoCorrecto;
        }
}