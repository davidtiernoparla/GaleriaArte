package programacion.galeria;

public class Modificador {

    public ObraArte modificarObra(ObraArte[] obras, ObraArte obra) {
        final String RECORDATORIO_VALOR__CAMPO_ID = "El valor actual de" + ObraArte.Campo.ID + "es:" + obra.getId();
        final String RECORDATORIO_VALOR__CAMPO_TIPO = "El valor actual de" + ObraArte.Campo.TIPO + "es:"
                + obra.getTipo();
        final String RECORDATORIO_VALOR__CAMPO_NOMBRE = "El valor actual de" + ObraArte.Campo.NOMBRE + "es:"
                + obra.getNombre();
        final String RECORDATORIO_VALOR__CAMPO_AUTOR = "El valor actual de" + ObraArte.Campo.AUTOR + "es:"
                + obra.getAutor();
        final String RECORDATORIO_VALOR__CAMPO_PRECIO = "El valor actual de" + ObraArte.Campo.PRECIO + "es:"
                + obra.getPrecio();
        final String RECORDATORIO_VALOR__CAMPO_ALTURA = "El valor actual de" + ObraArte.Campo.ALTURA + "es:"
                + obra.getAltura();
        final String RECORDATORIO_VALOR__CAMPO_PESO = "El valor actual de" + ObraArte.Campo.PESO + "es:"
                + obra.getPeso();
        final String RECORDATORIO_VALOR__CAMPO_TEC = "El valor actual de" + ObraArte.Campo.TEC_MAT + "es:"
                + ((Pintura) obra).getTec();
        final String RECORDATORIO_VALOR__CAMPO_MAT = "El valor actual de" + ObraArte.Campo.TEC_MAT + "es:"
                + ((Escultura) obra).getMat();
        final String RECORDATORIO_VALOR__CAMPO_PIEZAS = "El valor actual de" + ObraArte.Campo.PIEZAS + "es:"
                + obra.getPiezas();
        final String RECORDATORIO_VALOR__CAMPO_DESC = "El valor actual de" + ObraArte.Campo.DESC + "es:"
                + obra.getDesc();
        System.out.println("La obra que desea modificar se encuentra de la siguiente manera:");
        Visualizador.visualizarObra(obras, obra.getNombre());

        System.out.println(RECORDATORIO_VALOR__CAMPO_ID);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.ID.getVal())) {
            obra.setId(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.ID));
        }
        // CUIDADO
        System.out.println(RECORDATORIO_VALOR__CAMPO_TIPO);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.TIPO.getVal())) {
            obra.setTipo(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.TIPO));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_NOMBRE);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.NOMBRE.getVal())) {
            obra.setNombre(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.NOMBRE));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_AUTOR);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.AUTOR.getVal())) {
            obra.setAutor(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.AUTOR));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_PRECIO);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PRECIO.getVal())) {
            obra.setPrecio(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PRECIO));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_ALTURA);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.ALTURA.getVal())) {
            obra.setAltura(Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.ALTURA));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_PESO);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PESO.getVal())) {
            obra.setPeso(Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.PESO));
        }
        if (obra.getTipo() == Pintura.NOM_CLAS_PINT) {
            System.out.println(RECORDATORIO_VALOR__CAMPO_TEC);
        } else {
            System.out.println(RECORDATORIO_VALOR__CAMPO_MAT);
        }
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.TEC_MAT.getVal())) {
            if (obra.getTipo() == Pintura.NOM_CLAS_PINT) {
                ((Pintura) obra).setTec(Entrevistador.preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT));
            } else {
                ((Escultura) obra).setMat(Entrevistador.preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT));
            }
            obra.setId(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.TEC_MAT));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_PIEZAS);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PIEZAS.getVal())) {
            obra.setPiezas(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PIEZAS));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_DESC);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.DESC.getVal())) {
            obra.setDesc(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.DESC));
        }
        Visualizador.visualizarObra(obras, obra.getNombre());
        return obra;
    }
}