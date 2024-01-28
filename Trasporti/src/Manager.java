import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Predicate;

public class Manager {

    private final Vector<Spedizione> registroSpedizioni;

    public Manager() {
        registroSpedizioni = new Vector<>();
    }


    /*
     * Metodo che permette di prenotare un certo viaggio, dati origine, destinazione, tipo di merce, kg, data-partenza o data-arrivo
     * @param spedizione != null
     */
    public void prenotaSpedizione(Spedizione spedizione) {
        registroSpedizioni.add(spedizione);
    }


    /*
     * VERSIONE CON ITERATORI
     * Metodo che permette di modificare il tragitto compiuto da un autocarro dato il suo numero di spedizione
     * @param spedizione deve appartenere al registro spedizioni
     * @param nuovaOrigine != null
     * @param nuovaDestinazione != null
     * @param nuovoPercorsointermedio può anche essere null
     */
    public void reinstradaSpedizione(Spedizione spedizione, String nuovaOrigine, String nuovaDestinazione, String[] nuovoPercorsointermedio) {

        Iterator<Spedizione> it = registroSpedizioni.iterator();

        while (it.hasNext()) {
            if (it.next() == spedizione) {
                if (nuovoPercorsointermedio == null) {
                    spedizione.setPercorso(new Percorso.PercorsoBuilder(nuovaOrigine, nuovaDestinazione, spedizione.getPercorso().getCittaIntermedie()).build());
                } else {
                    spedizione.setPercorso(new Percorso.PercorsoBuilder(nuovaOrigine, nuovaDestinazione, nuovoPercorsointermedio).build());
                }
            }
        }
    }


    /*
     * Metodo che permette di sapere quali viaggi sono prenotati per una certa data, o origine, o destinazione, o autocarro
     * @param campoDiRicerca devessere una data, un luogo di partenza o destinazione oppure una targa di un autocarro
     * @param manager deve esistere, può anche essere vuoto
     */
    public void ricercaUnaSpedizione(String campoDiRicerca, Manager manager) {

        Iterator<Spedizione> i = manager.viaggiPrenotati(new Filtro(campoDiRicerca));

        while (i.hasNext()) {
            System.out.println("La spedizione "+ i.next().getNumeroSpedizione() +" è prenotata");
        }
    }
    /*
     * @return un oggetto di tipo iteratore che contiene le spedizioni che soddisfano il criterio di ricerca
     */
    private Iterator<Spedizione> viaggiPrenotati(Predicate<Spedizione> predicate) {
        return registroSpedizioni.stream().filter(predicate).iterator();
    }


    /********************************************** FUNZIONI AGGIUNTIVE **********************************************/


    /*
     * VERSIONE CON ITERATORI
     * Metodo che, data una spedizone, ne stampa luogo di partenza, di arrivo e il tragitto intermedio
     * @param spedizione deve appartenere al registro spedizioni
     */
    public void stampaPercorso(Spedizione spedizione) {

        Iterator<Spedizione> it = registroSpedizioni.iterator();

        while(it.hasNext()) {
            if(Objects.equals(it.next(), spedizione)) {
                System.out.println("Il percorso della spediazione "+ spedizione.getNumeroSpedizione() +" è "+ spedizione.getPercorso().getOrigine() +" -> "+ Arrays.toString(spedizione.getPercorso().getCittaIntermedie())+" -> "+ spedizione.getPercorso().getDestinazione());
            }

        }

    }
}
