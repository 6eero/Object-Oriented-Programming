import java.util.Objects;
import java.util.function.Predicate;

public class Filtro implements Predicate<Spedizione> {

        private final String s;

        Filtro(String s) { this.s = s;}

    /**
     *
     * @param spedizione the input argument
     * @return true se all'interno del registro spedizioni c'è una spedizione che soddisfa i reqs richiesti
     */
    @Override
        public boolean test(Spedizione spedizione) {
            return (
                    (spedizione.getTempistica().getDataPartenza().equals(s)) || (Objects.equals(spedizione.getPercorso().getOrigine(), s)) ||
                    (Objects.equals(spedizione.getPercorso().getDestinazione(), s)) || (Objects.equals(spedizione.getAutocarro().getTarga(), s))
            );
        }
}

