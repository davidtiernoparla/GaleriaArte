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

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public ObraArte() {

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

}
