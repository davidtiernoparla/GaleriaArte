package programacion.galeria;

/**
 * Hello world!
 *
 */
public class GaleriaArte {
    public static void main(String[] args) {
        Cargador cargador = new Cargador();
        Menu menu = new Menu();
        Visualizador visual = new Visualizador();
        
        ObraArte[] obras = cargador.cargar5ObrasInicio();
        visual.visualizarObras(obras);
    }
}
