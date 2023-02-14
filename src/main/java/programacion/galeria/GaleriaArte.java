package programacion.galeria;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class GaleriaArte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObraArte[] obras = Cargador.cargar5ObrasInicio();
        Menu menu = new Menu();
            menu.lanzarMenu(obras, teclado);
            teclado.nextLine();
    }
}