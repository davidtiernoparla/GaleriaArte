package programacion.galeria;

public class Pintura extends ObraArte {

    private enum Tecnica {
        OLEO("Óleo"), ACUARELA("Acuarela"), CARBONCILLO("Carboncillo");

        private String val;

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

    public Pintura(int id, String tipo, String nombre, String autor, int precio, int altura, int peso,
            Tecnica tec, int piezas, String desc) {
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.tec = tec;
    }

}
