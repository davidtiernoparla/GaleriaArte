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

    static String NOM_CLAS_PINT = Pintura.class.getSimpleName();
    private Tecnica tec;

    public Tecnica getTec() {
        return tec;
    }

    public void setTec(String tecnicaEscogida) {
        if (tecnicaEscogida.equals(Pintura.Tecnica.OLEO.getVal())) {
            this.tec = Pintura.Tecnica.OLEO;
        } else if (tecnicaEscogida.equals(Pintura.Tecnica.CARBONCILLO.getVal())) {
            this.tec = Pintura.Tecnica.CARBONCILLO;
        } else {
            this.tec = Pintura.Tecnica.ACUARELA;
        }
    }

    public Pintura(int id, String tipo, String nombre, String autor, double precio, double altura, double peso,
            Tecnica tec, int piezas, String desc) {
        super(id, tipo, nombre, autor, precio, altura, peso, piezas, desc);
        this.tec = tec;
    }

    public static void setNOM_CLAS_PINT(String nOM_CLAS_PINT) {
        NOM_CLAS_PINT = nOM_CLAS_PINT;
    }

    public void setTec(Tecnica tec) {
        this.tec = tec;
    }

}