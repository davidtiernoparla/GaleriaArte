package programacion.galeria;

public class Escultura extends ObraArte {

    protected static enum Material {
        ACERO("Acero"), COBRE("Cobre"), HIERRO("Hierro");

        private String val;

        public String getVal() {
            return val;
        }

        private Material(String val) {
            this.val = val;
        }
    }
    static String NOM_CLAS_ESC = Escultura.class.getSimpleName();

    private Material mat;

    public Material getMat() {
        return mat;
    }

    public void setMaterial(Material mat) {
        this.mat = mat;
    }

    public Escultura(int id, String tipo, String nombre, String autor, int precio, double altura, double peso,
            Material mat, int piezas, String desc) {
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.mat = mat;
    }

}
