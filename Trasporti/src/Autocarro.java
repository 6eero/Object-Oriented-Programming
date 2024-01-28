public class Autocarro {

    // required parameters
    private final String targa;
    private final double quantitaMaxTrasportabile;
    private final String tipoMerce;

    //get methods
    public String getTarga() {
        return targa;
    }
    public double getQuantitaMaxTrasportabile() { return quantitaMaxTrasportabile; }
    public String getTipoMerce() { return tipoMerce; }

    // private builder method
    private Autocarro (AutocarroBuilder builder) {
        this.targa = builder.targa;
        this.quantitaMaxTrasportabile = builder.quantitaMaxTrasportabile;
        this.tipoMerce = builder.tipoMerce;
    }

    // builder class
    public  static class AutocarroBuilder {

        // required parameters
        private final String targa;
        public double quantitaMaxTrasportabile;
        private final String tipoMerce;

        public AutocarroBuilder(String trg, double qmt, String tmc) {
            this.targa = trg;
            this.quantitaMaxTrasportabile = qmt;
            this.tipoMerce = tmc;
        }

        public Autocarro build() { return new Autocarro(this); }
    }


}
