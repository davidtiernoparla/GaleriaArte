package programacion.galeria;

public class ObraArte {
    
    private int id;
    private String tipo;
    private String nombre;
    private String autor;
    private String tecnica;
    private int precio;
    private int altura;
    private int peso;
    private int piezas;
    private String desc;
    private String material;

    public ObraArte(int id,String tipo, String nombre, String autor, String tecnica, int precio, int altura, int peso, int piezas, String desc){
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.autor = autor;
        this.tecnica = tecnica;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.desc = desc;
    }
    public ObraArte(int id,String tipo, String nombre, String autor, int precio,String material, int altura, int peso, int piezas, String desc){
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.desc = desc;
    }
}
