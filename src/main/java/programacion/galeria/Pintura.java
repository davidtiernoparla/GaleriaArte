package programacion.galeria;

public class Pintura extends ObraArte {

    protected static enum Tecnica {
        OLEO("Óleo"), ACUARELA("Acuarela"), CARBONCILLO("Carboncillo");

        private String val;

        public String getVal() {
            return val;
        }

        private Tecnica(String val) {
            this.val = val;
        }
    }

    private Tecnica tec;

    public Tecnica getTec() {
        return tec;
    }

    public void setTec(Tecnica tec) {
        this.tec = tec;
    }

    public Pintura(int id, String tipo, String nombre, String autor, int precio, double altura, double peso,
            Tecnica tec, int piezas, String desc) {
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.tec = tec;
    }

}
