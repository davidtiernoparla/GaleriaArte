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

    public void setMat(String tecnicaEscogida) {
        if (tecnicaEscogida.equals(Escultura.Material.ACERO.getVal())){
            this.mat = Escultura.Material.ACERO;
        } else if (tecnicaEscogida.equals(Escultura.Material.COBRE.getVal())){
            this.mat = Escultura.Material.COBRE;
        } else {
            this.mat = Escultura.Material.HIERRO;
        }
    }

    public Escultura(int id, String tipo, String nombre, String autor, int precio, double altura, double peso,
            Material mat, int piezas, String desc) {
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.mat = mat;
    }

}