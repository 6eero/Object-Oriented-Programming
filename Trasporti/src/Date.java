public class Date {

    // required parameters
    private final String dataPartenza;
    private final String dataArrivo;

    // get methods
    public String getDataPartenza() {
        return dataPartenza;
    }
    public String getDataArrivo() {
        return dataArrivo;
    }

    // private builder method
    private Date (DateBuilder builder) {
       this.dataPartenza = builder.dataPartenza;
       this.dataArrivo = builder.dataArrivo;
    }

    // builder class
    public static class DateBuilder{

        // required parameters
        private final String dataPartenza;
        private final String dataArrivo;

        public DateBuilder(String prt, String arr) {
            this.dataPartenza = prt;
            this.dataArrivo = arr;
        }

        public Date build() { return new Date(this); }
    }


}
