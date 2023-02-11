package programacion.galeria;

public class Visualizador {
     public static void visualizarObras(ObraArte[] obras) {
        final int PRIMERA_OBRA = 0;
        final boolean ES_TITULO_CAMPO = true;
        for (ObraArte obra : obras) {
            // Si es Pintura imprime datos de Pintura
            if (obra == obras[PRIMERA_OBRA]) {
                imprimirTitulo(obras, ES_TITULO_CAMPO, obra);
            }
            if (obra.getClass().getSimpleName().equals(Pintura.NOM_CLAS_PINT)) {
                imprimirPintura(obras, ES_TITULO_CAMPO, obra);
                // Si no, es Escultura, e imprime datos de Escultura
            } else {
                imprimirEscultura(obras, ES_TITULO_CAMPO, obra);
            }
        }
    }

    public void visualizarObra(ObraArte[] obras, String nombre) {
        final String MENSAJE_DE_NO_ENCONTRADO = "No hay ninguna obra con ese nombre.";
        final boolean ES_TITULO_CAMPO = true;
        boolean huboCoincidencia = false;
        for (ObraArte obra : obras) {
            if (obra.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                if (obra.getClass().getSimpleName().equals(Pintura.NOM_CLAS_PINT)) {
                    imprimirPintura(obras, ES_TITULO_CAMPO, obra);
                    // Si no, es Escultura, e imprime datos de Escultura
                } else {
                    imprimirEscultura(obras, ES_TITULO_CAMPO, obra);
                }
                huboCoincidencia = true;
            } else if (!huboCoincidencia) {
                System.out.println(MENSAJE_DE_NO_ENCONTRADO);
            }
        }

    }

    private static void imprimirEscultura(ObraArte[] obras, final boolean ES_TITULO_CAMPO,
            ObraArte obra) {
        final String SEPARADOR_CAMPO = " | ";
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

    private static void imprimirPintura(ObraArte[] obras, final boolean ES_TITULO_CAMPO,
            ObraArte obra) {
        final String SEPARADOR_CAMPO = " | ";
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
    }

    private static void imprimirTitulo(ObraArte[] obras, final boolean ES_TITULO_CAMPO,
            ObraArte obra) {
        final String SEPARADOR_TITULO = "   ";
        final String SALIDA_TITULO = ObraArte.Campo.ID.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_ID, ES_TITULO_CAMPO) + SEPARADOR_TITULO
                + ObraArte.Campo.NOMBRE.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_NOM, ES_TITULO_CAMPO)
                + SEPARADOR_TITULO
                + ObraArte.Campo.AUTOR.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_AUT, ES_TITULO_CAMPO)
                + SEPARADOR_TITULO + ObraArte.Campo.TEC_MAT.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_TEC_MAT, ES_TITULO_CAMPO)
                + SEPARADOR_TITULO + ObraArte.Campo.PRECIO.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_PRECIO, ES_TITULO_CAMPO) + SEPARADOR_TITULO
                + ObraArte.Campo.ALTURA.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_ALT, ES_TITULO_CAMPO)
                + SEPARADOR_TITULO
                + ObraArte.Campo.PESO.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_PESO, ES_TITULO_CAMPO)
                + SEPARADOR_TITULO
                + ObraArte.Campo.PIEZAS.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_PIEZ, ES_TITULO_CAMPO) + SEPARADOR_TITULO
                + ObraArte.Campo.DESC.getVal()
                + justificarCampo(obras, obra, Posicionador.POS_ELEM_DESC, ES_TITULO_CAMPO) + SEPARADOR_TITULO;
        System.out.println(SALIDA_TITULO);
    }

    private static String justificarCampo(ObraArte[] obras, ObraArte obra, int posElem, boolean esTitulo) {
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

    private static String imprimirEspacios(final String ESPACIO, int diferencia) {
        String espacios = ESPACIO;
        for (int i = 0; i < diferencia; i++) {
            espacios += ESPACIO;
        }
        return espacios;
    }

    private static int hallarMaxLong(ObraArte[] obras, int posElem) {
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

    public void mostrarPrecioVenta(ObraArte obra) {
        final String MENSAJE_NOMBRE = "Nombre: " + obra.getNombre();
        final String MENSAJE_ALTURA = "Altura(m): 5" + obra.getAltura();
        final String MENSAJE_PESO = "Peso(t): " + obra.getPeso();
        final String MENSAJE_PIEZAS = "Número de piezas: " + obra.getPiezas();
        final String MENSAJE_PRECIO = "Precio(EUR): " + obra.getPrecio();
        final String MENSAJE_COMISION_PIEZAS_INICIO = "Importe adicional - Pieza ";
        final int LIMITE_PESO = 1;
        final int LIMITE_ALTURA = 2;
        final int LIMITE_PIEZAS = 2;
        final int COMISION_LIMITE_FUERA = 100;
        final int COMISION_LIMITE_DENTRO = 20;
        final int COMISION_PIEZAS_EXTRA = 10;
        final String MENSAJE_COMISION_PIEZAS_FINAL = "(EUR): " + COMISION_PIEZAS_EXTRA;
        final double PRECIO_ORIGINAL = obra.getPrecio();
        final double COMISION_GAL = PRECIO_ORIGINAL * 0.25;
        final String MENSAJE_COMISION_GALERIA = "Comisión Galería(EUR): " + COMISION_GAL;
        final double COMISION_ESCULTURA = 50;
        final String MENSAJE_COMISION_ESCULTURA = "Gastos de manipulación: " + COMISION_ESCULTURA;
        final double DESCUENTO_PINTURA = 0.1;
        final double DESCUENTO_ESCULTURA = 0.2;
        double precioVenta = obra.getPrecio();
        double comision_peso = 0;
        double comision_altura = 0;
        double comision_piezas = 0;
        if (obra.getPeso() > LIMITE_PESO) {
            comision_peso = COMISION_LIMITE_FUERA;
        } else {
            comision_peso = COMISION_LIMITE_DENTRO;
        }
        final String MENSAJE_COMISION_PESO = "Importe por peso (EUR): " + comision_peso;
        if (obra.getAltura() > LIMITE_ALTURA) {
            comision_altura = COMISION_LIMITE_FUERA;
        } else {
            comision_altura = COMISION_LIMITE_DENTRO;
        }
        final String MENSAJE_COMISION_ALTURA = "Importe por altura: " + comision_altura;
        if (obra.getPiezas() > LIMITE_PIEZAS) {
            comision_piezas = COMISION_PIEZAS_EXTRA * (obra.getPiezas() - LIMITE_PIEZAS);
        }

        // Es el precioVenta sin descuentos
        precioVenta = PRECIO_ORIGINAL + COMISION_GAL + comision_peso + comision_altura + comision_piezas;
        final String MENSAJE_PRECIO_VENTA = "Precio de venta (EUR): " + precioVenta;
        final String MENSAJE_DESCUENTO_PINTURA = "Descuento (10% pintura EUR): " + (precioVenta * DESCUENTO_PINTURA);
        final String MENSAJE_DESCUENTO_ESCULTURA = "Descuento (20% escultura EUR): "
                + (precioVenta * DESCUENTO_PINTURA);
        // Ahora precioVenta con descuentos
        if (obra.getTipo().equals(Pintura.NOM_CLAS_PINT)) {
            precioVenta = precioVenta + (precioVenta * DESCUENTO_PINTURA);
        } else {
            precioVenta = precioVenta + (precioVenta * DESCUENTO_ESCULTURA) + COMISION_ESCULTURA;
        }
        System.out.println(MENSAJE_NOMBRE);
        System.out.println(MENSAJE_ALTURA);
        System.out.println(MENSAJE_PESO);
        System.out.println(MENSAJE_PIEZAS);
        System.out.println(MENSAJE_PRECIO);
        System.out.println(MENSAJE_COMISION_GALERIA);
        System.out.println(MENSAJE_COMISION_PESO);
        System.out.println(MENSAJE_COMISION_ALTURA);
        if (obra.getPiezas() > LIMITE_PIEZAS) {
            for (int i = 3; i < obra.getPiezas(); i++) {
                System.out.println(MENSAJE_COMISION_PIEZAS_INICIO);
                System.out.print(i);
                System.out.print(MENSAJE_COMISION_PIEZAS_FINAL);
            }
        }
        System.out.println(MENSAJE_PRECIO_VENTA);
        if (obra.getClass().equals(Pintura.class)) {
            System.out.println(MENSAJE_DESCUENTO_PINTURA);
        } else {
            System.out.println(MENSAJE_DESCUENTO_ESCULTURA);
            System.out.println(MENSAJE_COMISION_ESCULTURA);
            System.out.println(MENSAJE_PRECIO_VENTA);
        }
    }

    public void mostrarEtiqueta (ObraArte obra) {
        final String MENSAJE_NOMBRE = "Nombre: " + obra.getNombre();
        final String MENSAJE_AUTOR = "Autor:" + obra.getAutor();
        final String MENSAJE_DESC = "Descripción: " + obra.getDesc();
        System.out.println(MENSAJE_NOMBRE);
        System.out.println(MENSAJE_AUTOR);
        System.out.println(MENSAJE_DESC);
    }
}