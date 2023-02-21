package programacion.galeria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.jupiter.api.Test;

import programacion.galeria.Escultura.Material;
import programacion.galeria.Pintura.Tecnica;

public class CargadorTest {

    @Test
    void testCargar5ObrasInicio() {
        final String TIPO_PINTURA = "Pintura";
        final ObraArte[] OBRAS_RESULTADO = Cargador.cargar5ObrasInicio();
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
        ObraArte[] obrasEsperadas = new ObraArte[CANTIDAD_OBRAS];
        // Las obras de inicio las pongo seguidas porque con un loop es incluso mas
        // farragoso
        // P1
        obrasEsperadas[PINTURA_1_ID - 1] = new Pintura(PINTURA_1_ID, TIPO_PINTURA,
                PINTURA_1_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_1_PRECIO, PINTURA_1_ALTURA,
                PINTURA_1_PESO,
                PINTURA_1_2_3_4_TECNICA, PINTURA_1_PIEZAS,
                PINTURA_1_DESC);
        // P2
        obrasEsperadas[PINTURA_2_ID - 1] = new Pintura(PINTURA_2_ID, TIPO_PINTURA,
                PINTURA_2_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_2_PRECIO, PINTURA_2_4_ALTURA,
                PINTURA_2_3_PESO,
                PINTURA_1_2_3_4_TECNICA, PINTURA_2_3_4_PIEZAS,
                PINTURA_2_3_4_DESC);
        // P3
        obrasEsperadas[PINTURA_3_ID - 1] = new Pintura(PINTURA_3_ID, TIPO_PINTURA,
                PINTURA_3_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_3_PRECIO, PINTURA_3_ALTURA,
                PINTURA_2_3_PESO,
                PINTURA_1_2_3_4_TECNICA, PINTURA_2_3_4_PIEZAS,
                PINTURA_2_3_4_DESC);
        // P4
        obrasEsperadas[PINTURA_4_ID - 1] = new Pintura(PINTURA_4_ID, TIPO_PINTURA,
                PINTURA_4_NOMBRE, PINTURA_1_2_3_4_AUTOR, PINTURA_4_PRECIO, PINTURA_2_4_ALTURA,
                PINTURA_4_PESO,
                PINTURA_1_2_3_4_TECNICA, PINTURA_2_3_4_PIEZAS,
                PINTURA_2_3_4_DESC);
        // E5
        obrasEsperadas[ESCULTURA_ID - 1] = new Escultura(ESCULTURA_ID, TIPO_ESCULTURA,
                ESCULTURA_NOMBRE, ESCULTURA_AUTOR, ESCULTURA_PRECIO, ESCULTURA_ALTURA, ESCULTURA_PESO,
                ESCULTURA_MATERIAL, ESCULTURA_PIEZAS,
                ESCULTURA_DESC);

        for (int i = 0; i < obrasEsperadas.length; i++) {
            assertEquals(obrasEsperadas[i].getId(), OBRAS_RESULTADO[i].getId());
            assertEquals(obrasEsperadas[i].getTipo(), OBRAS_RESULTADO[i].getTipo());
            assertEquals(obrasEsperadas[i].getNombre(), OBRAS_RESULTADO[i].getNombre());
            assertEquals(obrasEsperadas[i].getAutor(), OBRAS_RESULTADO[i].getAutor());
            assertEquals(obrasEsperadas[i].getPrecio(), OBRAS_RESULTADO[i].getPrecio());
            assertEquals(obrasEsperadas[i].getAltura(), OBRAS_RESULTADO[i].getAltura());
            assertEquals(obrasEsperadas[i].getPeso(), OBRAS_RESULTADO[i].getPeso());
            assertEquals(obrasEsperadas[i].getPiezas(), OBRAS_RESULTADO[i].getPiezas());
            assertEquals(obrasEsperadas[i].getDesc(), OBRAS_RESULTADO[i].getDesc());
            if (obrasEsperadas[i].getClass().equals(Pintura.class)) {
                assertEquals((((Pintura) obrasEsperadas[i]).getTec()), (((Pintura) OBRAS_RESULTADO[i]).getTec()));
            } else {
                assertEquals((((Escultura) obrasEsperadas[i]).getMat()), (((Escultura) OBRAS_RESULTADO[i]).getMat()));
            }
            ;
        }
    }
    @Rule
    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();
      
    @Test
    void testDevolverUnTipoPosible() {
        final String POSIBLE_TIPO_PINTURA = "Pintura";
        final String POSIBLE_TIPO_ESCULTURA = "Escultura";
        systemInMock.provideLines(POSIBLE_TIPO_PINTURA);
        final Scanner teclado = new Scanner(System.in);
        
       
        final String TIPO_RESULTADO = Cargador.devolverUnTipoPosible(Cargador.cargar5ObrasInicio(),teclado);
        assertEquals(POSIBLE_TIPO_ESCULTURA, TIPO_RESULTADO);
    }


    @Test
    void testInsertarObraArte() {

    }
}
