package programacion.galeria;

/**
 * Hello world!
 *
 */
public class GaleriaArte {
    public static void main(String[] args) {
        ObraArte[] obras = Cargador.cargar5ObrasInicio();
        Menu menu = new Menu();
        menu.lanzarMenu(obras);
    }
}