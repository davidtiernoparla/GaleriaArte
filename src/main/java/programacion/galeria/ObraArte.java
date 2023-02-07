package programacion.galeria;

public abstract class ObraArte {

    protected static enum Campo {
        ID("ID"), NOMBRE("Nombre"), AUTOR("Autor"), TIPO("TIPO"),
        TEC_MAT("Técnica/Material"), PRECIO("Precio(EUR)"),
        ALTURA("Altura(m)"), PESO("Peso(t)"), PIEZAS("Pieza/s"), DESC("Descripción");

        private String val;

        public String getVal() {
            return val;
        }

        private Campo(String val) {
            this.val = val;
        }
    }

    private int id;
    private String tipo;
    private String nombre;
    private String autor;
    private int precio;
    private double altura;
    private double peso;
    private int piezas;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int d) {
        this.precio = d;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public ObraArte(int id, String tipo, String nombre, String autor, int precio, double altura, double peso,
            int piezas, String desc) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.desc = desc;
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
        if (obra.getPeso() > LIMITE_PESO){
             comision_peso =  COMISION_LIMITE_FUERA;
        } else {
             comision_peso = COMISION_LIMITE_DENTRO;
        }
        final String MENSAJE_COMISION_PESO = "Importe por peso (EUR): " + comision_peso;
        if (obra.getAltura() > LIMITE_ALTURA){
            comision_altura = COMISION_LIMITE_FUERA;
        } else {
            comision_altura = COMISION_LIMITE_DENTRO;
        }
        final String MENSAJE_COMISION_ALTURA = "Importe por altura: " + comision_altura;
        if (obra.getPiezas() > LIMITE_PIEZAS){
            comision_piezas = COMISION_PIEZAS_EXTRA * (obra.getPiezas() - LIMITE_PIEZAS);
        }
        
        //Es el precioVenta sin descuentos
         precioVenta = PRECIO_ORIGINAL + COMISION_GAL + comision_peso + comision_altura + comision_piezas;
        final String MENSAJE_PRECIO_VENTA = "Precio de venta (EUR): " + precioVenta;
        final String MENSAJE_DESCUENTO_PINTURA = "Descuento (10% pintura EUR): " +  (precioVenta * DESCUENTO_PINTURA);
        final String MENSAJE_DESCUENTO_ESCULTURA = "Descuento (20% escultura EUR): " +  (precioVenta * DESCUENTO_PINTURA);
        //Ahora precioVenta con descuentos
        if (obra.getTipo().equals(Pintura.NOM_CLAS_PINT)){
            precioVenta = precioVenta + (precioVenta * DESCUENTO_PINTURA);
        } else {
            precioVenta = precioVenta + (precioVenta * DESCUENTO_ESCULTURA) + COMISION_ESCULTURA ;
        }
        final String MENSAJE_PRECIO_VENTA_FINAL = "Precio final de venta(EUR): " + precioVenta;
        System.out.println(MENSAJE_NOMBRE);
        System.out.println(MENSAJE_ALTURA);
        System.out.println(MENSAJE_PESO);
        System.out.println(MENSAJE_PIEZAS);
        System.out.println(MENSAJE_PRECIO);
        System.out.println(MENSAJE_COMISION_GALERIA);
        System.out.println(MENSAJE_COMISION_PESO);
        System.out.println(MENSAJE_COMISION_ALTURA);
        if (obra.getPiezas() > LIMITE_PIEZAS){
        for (int i = 3; i < obra.getPiezas(); i++) {
            System.out.println(MENSAJE_COMISION_PIEZAS_INICIO);
            System.out.print(i);
            System.out.print(MENSAJE_COMISION_PIEZAS_FINAL);
        }
        }
        System.out.println(MENSAJE_PRECIO_VENTA);
        if (obra.getClass().equals(Pintura.class)){
        System.out.println(MENSAJE_DESCUENTO_PINTURA);
        } else {
        System.out.println(MENSAJE_DESCUENTO_ESCULTURA);
        System.out.println(MENSAJE_COMISION_ESCULTURA);
        System.out.println(MENSAJE_PRECIO_VENTA);
        }
    }
}
