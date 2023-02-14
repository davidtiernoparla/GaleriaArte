package programacion.galeria;

import java.util.Scanner;

public class Modificador {

    public ObraArte modificarObra(ObraArte[] obras, ObraArte obra, Scanner teclado) {
        final String RECORDATORIO_VALOR__CAMPO_ID = "El valor actual de" + ObraArte.Campo.ID + "es:" + obra.getId();
        final String RECORDATORIO_VALOR__CAMPO_TIPO = "El valor actual de" + ObraArte.Campo.TIPO + "es:"
                + obra.getClass().getName();
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
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.ID.getVal(), teclado)) {
            obra.setId(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.ID, teclado));
        }
        // CUIDADO
        System.out.println(RECORDATORIO_VALOR__CAMPO_TIPO);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.TIPO.getVal(), teclado)) {
            obra.setTipo(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.TIPO, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_NOMBRE);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.NOMBRE.getVal(), teclado)) {
            obra.setNombre(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.NOMBRE, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_AUTOR);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.AUTOR.getVal(), teclado)) {
            obra.setAutor(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.AUTOR, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_PRECIO);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PRECIO.getVal(), teclado)) {
            obra.setPrecio(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PRECIO, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_ALTURA);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.ALTURA.getVal(), teclado)) {
            obra.setAltura(Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.ALTURA, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_PESO);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PESO.getVal(), teclado)) {
            obra.setPeso(Entrevistador.preguntarDatoUsuarioDouble(ObraArte.Campo.PESO, teclado));
        }
        if (obra.getClass().getName().equalsIgnoreCase(Pintura.class.getName())) {
            System.out.println(RECORDATORIO_VALOR__CAMPO_TEC);
        } else {
            System.out.println(RECORDATORIO_VALOR__CAMPO_MAT);
        }
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.TEC_MAT.getVal(), teclado)) {
            if (obra.getClass().getName().equalsIgnoreCase(Pintura.class.getName())) {
                ((Pintura) obra).setTec(Entrevistador.preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT, teclado));
            } else {
                ((Escultura) obra).setMat(Entrevistador.preguntarDatoUsuarioTecnica(ObraArte.Campo.TEC_MAT, teclado));
            }
            obra.setId(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.TEC_MAT, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_PIEZAS);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.PIEZAS.getVal(), teclado)) {
            obra.setPiezas(Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.PIEZAS, teclado));
        }
        System.out.println(RECORDATORIO_VALOR__CAMPO_DESC);
        if (Entrevistador.preguntarSiModificarCampo(ObraArte.Campo.DESC.getVal(), teclado)) {
            obra.setDesc(Entrevistador.preguntarDatoUsuarioString(ObraArte.Campo.DESC, teclado));
        }
        Visualizador.visualizarObra(obras, obra.getNombre());
        return obra;
    }
    private static int obtenerIdValido(ObraArte[] obras, Scanner teclado) {
        final int LIMITE_CERO = 0;
        int id = 0;
        
        do{
        //este metodo solo devuelve int iguales o mayores que 0
        id = Entrevistador.preguntarDatoUsuarioInt(ObraArte.Campo.ID, teclado);
        
        } while (id > obras.length);
        return id = 0;
    }
}