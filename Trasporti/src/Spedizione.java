public class Spedizione {

    // required parameters
    private Percorso percorso;
    private final Date tempistica;
    private final Autocarro autocarro;
    private final String numeroSpedizione;
    
    // get methods
    public Percorso getPercorso() { return percorso; }
    public Date getTempistica() { return tempistica; }
    public Autocarro getAutocarro() { return autocarro; }
    public String getNumeroSpedizione() { return numeroSpedizione; }

    // set methods
    public void setPercorso(Percorso percorso) { this.percorso = percorso; }

    // private builder method
    private Spedizione (SpedizioneBuilder builder) {
        this.setPercorso(builder.percorso);
        this.tempistica = builder.tempistica;
        this.autocarro = builder.autocarro;
        this.numeroSpedizione = builder.numeroSpedizione;
    }

    public static class SpedizioneBuilder {

        // required parameters
        private final Percorso percorso;
        private final Date tempistica;
        private final Autocarro autocarro;
        private final String numeroSpedizione;

        public SpedizioneBuilder(Percorso percorso, Date tempistica, Autocarro autocarro, String numeroSpedizione) {
            this.percorso = percorso;
            this.tempistica = tempistica;
            this.autocarro = autocarro;
            this.numeroSpedizione = numeroSpedizione;
        }

        public Spedizione build() {return new Spedizione(this);}
    }
}
