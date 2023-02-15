package programacion.galeria;

import java.util.Scanner;

public class Modificador {

    public static ObraArte[] modificarObra(ObraArte[] obras, String nombreObra, Scanner teclado) {
        ObraArte[] obrasActualizadas = obras;
        for (ObraArte obra : obrasActualizadas) {
            if (obra.getNombre().equalsIgnoreCase(nombreObra)) {
                final String RECORDATORIO_VALOR__CAMPO_ID = "El valor actual de" + ObraArte.Campo.ID + "es:";
                final String RECORDATORIO_VALOR__CAMPO_TIPO = "El valor actual de" + ObraArte.Campo.TIPO + "es:";
                final String RECORDATORIO_VALOR__CAMPO_NOMBRE = "El valor actual de" + ObraArte.Campo.NOMBRE + "es:";
                final String RECORDATORIO_VALOR__CAMPO_AUTOR = "El valor actual de" + ObraArte.Campo.AUTOR + "es:";
                final String RECORDATORIO_VALOR__CAMPO_PRECIO = "El valor actual de" + ObraArte.Campo.PRECIO + "es:";
                final String RECORDATORIO_VALOR__CAMPO_ALTURA = "El valor actual de" + ObraArte.Campo.ALTURA + "es:";
                final String RECORDATORIO_VALOR__CAMPO_PESO = "El valor actual de" + ObraArte.Campo.PESO + "es:";
                final String RECORDATORIO_VALOR__CAMPO_TEC = "El valor actual de" + ObraArte.Campo.TEC_MAT + "es:";
                final String RECORDATORIO_VALOR__CAMPO_MAT = "El valor actual de" + ObraArte.Campo.TEC_MAT + "es:";
                final String RECORDATORIO_VALOR__CAMPO_PIEZAS = "El valor actual de" + ObraArte.Campo.PIEZAS + "es:";
                final String RECORDATORIO_VALOR__CAMPO_DESC = "El valor actual de" + ObraArte.Campo.DESC + "es:";
                System.out.println("La obra que desea modificar se encuentra de la siguiente manera:");
                Visualizador.visualizarObra(obrasActualizadas, obra.getNombre());
                System.out.println(RECORDATORIO_VALOR__CAMPO_ID + obra.getId());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.ID.getVal(), teclado)) {
                    obrasActualizadas = cambiarIds(obras, obra, teclado);
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_TIPO + obra.getClass().getName());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.TIPO.getVal(), teclado)) {
                    obrasActualizadas = cambiarTipo(obrasActualizadas, obra, teclado);
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_NOMBRE + obra.getNombre());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.NOMBRE.getVal(), teclado)) {
                    obra.setNombre(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.NOMBRE, teclado));
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_AUTOR + obra.getAutor());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.AUTOR.getVal(), teclado)) {
                    obra.setAutor(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.AUTOR, teclado));
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_PRECIO + obra.getPrecio());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PRECIO.getVal(), teclado)) {
                    obra.setPrecio(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PRECIO, teclado));
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_ALTURA + obra.getAltura());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.ALTURA.getVal(), teclado)) {
                    obra.setAltura(Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.ALTURA, teclado));
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_PESO + obra.getPeso());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PESO.getVal(), teclado)) {
                    obra.setPeso(Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.PESO, teclado));
                }
                if (obra.getClass().getName().equalsIgnoreCase(Pintura.class.getName())) {
                    System.out.println(RECORDATORIO_VALOR__CAMPO_TEC + ((Pintura) obra).getTec());
                } else {
                    System.out.println(RECORDATORIO_VALOR__CAMPO_MAT + ((Escultura) obra).getMat());
                }
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.TEC_MAT.getVal(), teclado)) {
                    if (obra.getClass().getName().equalsIgnoreCase(Pintura.class.getName())) {
                        ((Pintura) obra)
                                .setTec(Entrevistador.preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT, teclado));
                    } else {
                        ((Escultura) obra)
                                .setMat(Entrevistador.preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT, teclado));
                    }
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_PIEZAS + obra.getPiezas());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PIEZAS.getVal(), teclado)) {
                    obra.setPiezas(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PIEZAS, teclado));
                }
                System.out.println(RECORDATORIO_VALOR__CAMPO_DESC + obra.getDesc());
                if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.DESC.getVal(), teclado)) {
                    obra.setDesc(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.DESC, teclado));
                }
                Visualizador.visualizarObra(obras, obra.getNombre());
            }
        }
        return obrasActualizadas;
    }

    private static int obtenerIdValido(ObraArte[] obras, Scanner teclado) {
        final String PETICION_ID_POSIBLE = "Los IDs disponibles son del 1 hasta el " + obras.length + ".";
        final String PETICION_RECTIFICAR = "Trate de introducir un ID valido. " + PETICION_ID_POSIBLE;
        final int LIMITE_CERO = 0;
        int id = 0;
        System.out.println(PETICION_ID_POSIBLE);
        do {
            // este metodo solo devuelve int iguales o mayores que 0
            id = Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.ID, teclado);
            if (id > obras.length | id == LIMITE_CERO) {
                System.out.println(PETICION_RECTIFICAR);
            }
        } while (id > obras.length | id == LIMITE_CERO);
        return id;
    }

    private static ObraArte[] cambiarIds(ObraArte[] obras, ObraArte obraModificada, Scanner teclado) {
        final int ID_INICIAL_OBRA = obraModificada.getId();
        final int ID_DESTINO = obtenerIdValido(obras, teclado);
        final int RESTA_1 = 1;
        ObraArte[] obrasActualizadas = obras;
        for (int i = 0; i < obrasActualizadas.length - RESTA_1; i++) {
            if (i == ID_DESTINO - RESTA_1) {
                obrasActualizadas[i] = obraModificada;
                obrasActualizadas[ID_INICIAL_OBRA - RESTA_1] = obras[i];
            }
        }
        return obrasActualizadas;
    }

    private static ObraArte[] cambiarTipo(ObraArte[] obras, ObraArte obraModificada, Scanner teclado) {
        final String TIPO_DESTINO = Cargador.devolverUnTipoPosible(obras, teclado);
        final String TIPO_PINTURA = "Pintura";
        final String TIPO_ESCULTURA = "Escultura";
        for (int i = 0; i < obras.length; i++) {
            if (obras[i].equals(obraModificada)) {
                switch (TIPO_DESTINO) {
                    case TIPO_PINTURA:
                        obras[i] = (Pintura) obras[i];
                        obras[i].setTipo(TIPO_PINTURA);
                        break;
                    case TIPO_ESCULTURA:
                        obras[i] = (Escultura) obras[i];
                        obras[i].setTipo(TIPO_ESCULTURA);
                        break;
                }
            }
        }
        return obras;
    }
}