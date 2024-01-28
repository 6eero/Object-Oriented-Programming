public class Percorso {

    // required parameters
    private final String origine;
    private final String destinazione;
    private final String[] cittaIntermedie;

    // get methods
    public String getOrigine() {
        return origine;
    }
    public String getDestinazione() {
        return destinazione;
    }
    public String[] getCittaIntermedie() {
        return cittaIntermedie;
    }

    // private builder method
    private Percorso (PercorsoBuilder builder) {
        this.origine = builder.origine;
        this.destinazione = builder.destinazione;
        this.cittaIntermedie = builder.cittaIntermedie;
    }

    // builder class
    public static class PercorsoBuilder {

        // required parameters
        private final String origine;
        private final String destinazione;
        private final String[] cittaIntermedie;

        public PercorsoBuilder(String org, String dst, String[] itr) {
            this.origine = org;
            this.destinazione = dst;
            this.cittaIntermedie = itr;
        }

        public Percorso build() { return new Percorso(this); }
    }

}
