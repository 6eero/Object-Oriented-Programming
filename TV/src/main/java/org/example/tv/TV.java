package org.example.tv;

import org.example.emittente.Canale;
import org.example.emittente.Lingua;
import org.example.emittente.Trasmissione;
import org.example.tv.exceptions.CanaleNonTrovatoException;
import org.example.tv.exceptions.TrasmissioneInvalidaException;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * La TV permette di vedere i programmi (eventualmente con un secondo programma se si
 * attiva la modalità 2-in-1), permette di cambiare o aggiungere le trasmissioni di un
 * canale e permette la ricerca di una trasmissione tra quelle future
 */
public class TV {

    private final Map<Integer, Canale> listaCanali = new HashMap<>();

    private int volume;
    private int luminosita;
    private Lingua lingua;

    public Map<Integer, Canale> getListaCanali() {
        return listaCanali;
    }

    /**
     * Metodo per aggiungere un nuovo canale alla lista dei canali supportati dalla televisione
     *
     * @param canale il canale da aggiungere
     */
    public void aggiungiCanale(@NotNull Canale canale) {
        getListaCanali().put((Integer) canale.getNumero(), canale);
    }


    /**
     * Metodo che permette di poter stampare la trasmissione in riproduzione a seconda del canale scelto
     * (eventualmente con un secondo programma con volume 0 se si attiva la modalità 2-in-1);
     *
     * @param numeroCanale il numero del canale che si vuole guardare
     * @throws CanaleNonTrovatoException     se il canale non è presente nella lista dei canali della tv
     * @throws TrasmissioneInvalidaException se non c'è nessun programma in riproduzione all'orario corrente nel canale corrente
     */
    public void visionaTrasmissione(@NotNull Integer numeroCanale) throws CanaleNonTrovatoException, TrasmissioneInvalidaException {

        if (!getListaCanali().containsKey(numeroCanale)) {
            throw new CanaleNonTrovatoException("Canale non trovato");
        }

        System.out.println("Tv sta riproducendo " +
                getListaCanali().get(numeroCanale).getTrasmissioneCorrente().getTitolo() +
                " su " +
                getListaCanali().get(numeroCanale).getNome());

    }


    /**
     * Metodo per poter cercare una trasmissione (per titolo, canale, giorno, ora)
     * tra quelle future
     */
    public String cercaTrasmissione(String titolo, List<Trasmissione> listaDiTutteLeTrasmissioni) {

        return listaDiTutteLeTrasmissioni
                .stream()
                .filter(i -> Objects.equals(i.getTitolo(), titolo))
                .toList()
                .get(0)
                .getTitolo();

    }
}

