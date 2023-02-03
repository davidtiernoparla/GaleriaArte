package programacion.galeria;

public class Visualizador {
    public void visualizarObras(ObraArte[] obras) {
        final String SEPARADOR_CAMPO = " | ";
        final String SEPARADOR_TITULO = "   ";
        final int PRIMERA_OBRA = 0;
        final boolean ES_TITULO_CAMPO = true;
        // Falta printear lo de arriba

        for (ObraArte obra : obras) {
            // Si es Pintura imprime datos de Pintura
            if (obra == obras[PRIMERA_OBRA]) {
                final String SALIDA_TITULO = ObraArte.Campo.ID.getVal()
                        + justificarCampo(obras, obra, Posicionador.POS_ELEM_ID, ES_TITULO_CAMPO) + SEPARADOR_TITULO
                        + ObraArte.Campo.NOMBRE.getVal() + justificarCampo(obras, obra, Posicionador.POS_ELEM_NOM, ES_TITULO_CAMPO)
                        + SEPARADOR_TITULO
                        + ObraArte.Campo.AUTOR.getVal() + justificarCampo(obras, obra, Posicionador.POS_ELEM_AUT, ES_TITULO_CAMPO)
                        + SEPARADOR_TITULO + ObraArte.Campo.TEC_MAT.getVal()
                        + justificarCampo(obras, obra, Posicionador.POS_ELEM_TEC_MAT, ES_TITULO_CAMPO)
                        + SEPARADOR_TITULO + ObraArte.Campo.PRECIO.getVal()
                        + justificarCampo(obras, obra, Posicionador.POS_ELEM_PRECIO, ES_TITULO_CAMPO) + SEPARADOR_TITULO
                        + ObraArte.Campo.ALTURA.getVal() + justificarCampo(obras, obra, Posicionador.POS_ELEM_ALT, ES_TITULO_CAMPO)
                        + SEPARADOR_TITULO
                        + ObraArte.Campo.PESO.getVal() + justificarCampo(obras, obra, Posicionador.POS_ELEM_PESO, ES_TITULO_CAMPO)
                        + SEPARADOR_TITULO
                        + ObraArte.Campo.PIEZAS.getVal()
                        + justificarCampo(obras, obra, Posicionador.POS_ELEM_PIEZ, ES_TITULO_CAMPO) + SEPARADOR_TITULO
                        + ObraArte.Campo.DESC.getVal()
                        + justificarCampo(obras, obra, Posicionador.POS_ELEM_DESC, ES_TITULO_CAMPO) + SEPARADOR_TITULO;
                System.out.println(SALIDA_TITULO);
            }
            if (obra.getClass().getSimpleName().equals(Pintura.NOM_CLAS_PINT)) {
                Pintura pintura = (Pintura) obra;
                final String SALIDA_PINTURA = pintura.getId()
                        + justificarCampo(obras, pintura, Posicionador.POS_ELEM_ID, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + pintura.getNombre() + justificarCampo(obras, pintura, Posicionador.POS_ELEM_NOM, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO
                        + pintura.getAutor() + justificarCampo(obras, pintura, Posicionador.POS_ELEM_AUT, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO + pintura.getTec()
                        + justificarCampo(obras, pintura, Posicionador.POS_ELEM_TEC_MAT, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO + pintura.getPrecio()
                        + justificarCampo(obras, pintura, Posicionador.POS_ELEM_PRECIO, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + pintura.getAltura() + justificarCampo(obras, pintura, Posicionador.POS_ELEM_ALT, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO
                        + pintura.getPeso() + justificarCampo(obras, pintura, Posicionador.POS_ELEM_PESO, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO
                        + pintura.getPiezas()
                        + justificarCampo(obras, pintura, Posicionador.POS_ELEM_PIEZ, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + pintura.getDesc()
                        + justificarCampo(obras, pintura, Posicionador.POS_ELEM_DESC, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO;

                System.out.println(SALIDA_PINTURA);
                // Si no, es Escultura e imprime datos de Escultura
            } else {
                Escultura escultura = (Escultura) obra;
                final String SALIDA_ESCULTURA = escultura.getId()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_ID, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO
                        + escultura.getNombre() + justificarCampo(obras, escultura, Posicionador.POS_ELEM_NOM, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO
                        + escultura.getAutor()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_AUT, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + escultura.getMat()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_TEC_MAT, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + escultura.getPrecio()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_PRECIO, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + escultura.getAltura()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_ALT, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + escultura.getPeso() + justificarCampo(obras, escultura, Posicionador.POS_ELEM_PESO, !ES_TITULO_CAMPO)
                        + SEPARADOR_CAMPO
                        + escultura.getPiezas()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_PIEZ, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO
                        + escultura.getDesc()
                        + justificarCampo(obras, escultura, Posicionador.POS_ELEM_DESC, !ES_TITULO_CAMPO) + SEPARADOR_CAMPO;

                System.out.println(SALIDA_ESCULTURA);
            }

        }

    }

    private String justificarCampo(ObraArte[] obras, ObraArte obra, int posElem, boolean esTitulo) {
        final String ESPACIO = " ";

        String espacios = "";
        int diferencia = 0;
        int maxLong = 0;

        maxLong = hallarMaxLong(obras, posElem);
        switch (posElem) {
            case Posicionador.POS_ELEM_ID:
                if (!esTitulo) {
                    diferencia = maxLong - String.valueOf(obra.getId()).length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.ID.getVal().length();
                }

                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_NOM:
                if (!esTitulo) {
                    diferencia = maxLong - obra.getNombre().length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.NOMBRE.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_AUT:
                if (!esTitulo) {
                    diferencia = maxLong - obra.getAutor().length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.AUTOR.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_TEC_MAT:
                if (!esTitulo) {
                    if (obra.getClass().getSimpleName().equals(Pintura.NOM_CLAS_PINT)) {
                        Pintura pintura = (Pintura) obra;
                        diferencia = maxLong - pintura.getTec().toString().length();
                    } else {
                        Escultura escultura = (Escultura) obra;
                        diferencia = maxLong - escultura.getMat().toString().length();
                    }
                } else {
                    diferencia = maxLong - ObraArte.Campo.TEC_MAT.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_PRECIO:
                if (!esTitulo) {
                    diferencia = maxLong - String.valueOf(obra.getPrecio()).length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.PRECIO.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);

                break;
            case Posicionador.POS_ELEM_ALT:
                if (!esTitulo) {
                    diferencia = maxLong - String.valueOf(obra.getAltura()).length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.ALTURA.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_PESO:
                if (!esTitulo) {
                    diferencia = maxLong - String.valueOf(obra.getPeso()).length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.ALTURA.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_PIEZ:
                if (!esTitulo) {
                    diferencia = maxLong - String.valueOf(obra.getPiezas()).length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.PIEZAS.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
            case Posicionador.POS_ELEM_DESC:
                if (!esTitulo) {
                    diferencia = maxLong - obra.getDesc().length();
                } else {
                    diferencia = maxLong - ObraArte.Campo.DESC.getVal().length();
                }
                espacios = imprimirEspacios(ESPACIO, diferencia);
                break;
        }
        return espacios;
    }

    private String imprimirEspacios(final String ESPACIO, int diferencia) {
        String espacios = ESPACIO;
        for (int i = 0; i < diferencia; i++) {
            espacios += ESPACIO;
        }
        return espacios;
    }

    private int hallarMaxLong(ObraArte[] obras, int posElem) {
        final String NOM_CLAS_PINT = "Pintura";

        int maxLong = 0;

        switch (posElem) {
            case Posicionador.POS_ELEM_ID:
                maxLong = ObraArte.Campo.ID.getVal().length();
                for (ObraArte obra : obras) {
                    if ((String.valueOf(obra.getId()).length()) > maxLong) {
                        maxLong = String.valueOf(obra.getId()).length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_NOM:
                maxLong = ObraArte.Campo.ID.getVal().length();
                for (ObraArte obra : obras) {
                    if (obra.getNombre().length() > maxLong) {
                        maxLong = obra.getNombre().length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_AUT:
                maxLong = ObraArte.Campo.AUTOR.getVal().length();
                for (ObraArte obra : obras) {
                    if (obra.getAutor().length() > maxLong) {
                        maxLong = obra.getAutor().length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_TEC_MAT:
                maxLong = ObraArte.Campo.TEC_MAT.getVal().length();
                for (ObraArte obra : obras) {
                    if (obra.getClass().getSimpleName().equals(NOM_CLAS_PINT)) {
                        Pintura pintura = (Pintura) obra;
                        if (pintura.getTec().toString().length() > maxLong) {
                            maxLong = pintura.getTec().toString().length();
                        }
                    } else {
                        Escultura escultura = (Escultura) obra;
                        if (escultura.getMat().toString().length() > maxLong) {
                            maxLong = escultura.getMat().toString().length();
                        }
                    }

                }
                break;
            case Posicionador.POS_ELEM_PRECIO:
                maxLong = ObraArte.Campo.PRECIO.getVal().length();
                for (ObraArte obra : obras) {
                    if ((String.valueOf(obra.getPrecio()).length()) > maxLong) {
                        maxLong = String.valueOf(obra.getPrecio()).length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_ALT:
                maxLong = ObraArte.Campo.ALTURA.getVal().length();
                for (ObraArte obra : obras) {
                    if ((String.valueOf(obra.getAltura()).length()) > maxLong) {
                        maxLong = String.valueOf(obra.getAltura()).length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_PESO:
                maxLong = ObraArte.Campo.PESO.getVal().length();
                for (ObraArte obra : obras) {
                    if ((String.valueOf(obra.getPeso()).length()) > maxLong) {
                        maxLong = String.valueOf(obra.getPeso()).length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_PIEZ:
                maxLong = ObraArte.Campo.PIEZAS.getVal().length();
                for (ObraArte obra : obras) {
                    if ((String.valueOf(obra.getPiezas()).length()) > maxLong) {
                        maxLong = String.valueOf(obra.getPiezas()).length();
                    }
                }
                break;
            case Posicionador.POS_ELEM_DESC:
                maxLong = ObraArte.Campo.DESC.getVal().length();
                for (ObraArte obra : obras) {
                    if (obra.getDesc().length() > maxLong) {
                        maxLong = obra.getDesc().length();
                    }
                }
                break;
        }

        return maxLong;
    }
}
