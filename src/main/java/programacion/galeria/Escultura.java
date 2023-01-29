package programacion.galeria;

public class Escultura extends ObraArte {

    static enum Material {
        ACERO("Acero"), COBRE("Cobre"), HIERRO("Hierro");

        private String val;

        private Material(String val) {
            this.val = val;
        }
    }

    private Material mat;

    public Material getMaterial() {
        return mat;
    }

    public void setMaterial(Material mat) {
        this.mat = mat;
    }

    public Escultura(int id, String tipo, String nombre, String autor, int precio, double altura, double peso,
            Material material, int piezas, String desc) {
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.mat = mat;
    }

}
