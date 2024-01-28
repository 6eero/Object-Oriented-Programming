package org.example.emittente;

import org.example.tv.exceptions.TrasmissioneInvalidaException;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Emittente {

    LocalTime orarioAttuale = LocalTime.now();
    private final List<Trasmissione> listaDiTrasmissioni = new ArrayList<>();


    public List<Trasmissione> getListaDiTutteLeTrasmissioni() {

        return listaDiTrasmissioni;
    }

    /**
     * Metodo che si occuma di aggiungere una trasmissione a un canale
     * @param canale il canale a cui aggiungere
     * @param trasmissione trasmissione da aggiungere al canale
     */
    public void aggiungiTrasmissione(Canale canale, Trasmissione trasmissione) {

        //TODO: caso in cui a quell'ora è gia presente una trasmissione
        canale.aggiungi(trasmissione);
        listaDiTrasmissioni.add(trasmissione);
    }


    /**
     * Metodo per sostituire una trasmissione con un'altra
     * @param canale il canale in cui si trovano le trasmissioni
     * @param vecchiaTrasmissione trasmissione da sostiuire (solo se non gia iniziata)
     * @param nuovaTrasmissione trasmissione da aggiungere
     * @throws TrasmissioneInvalidaException se vecchiaTrasmissione non é programmata per il canale
     *                                       se l'orario della vecchiat=Trasmissione é prima dell'orario attuale
     */
    public void cambiaTrasmissione(Canale canale, Trasmissione vecchiaTrasmissione, Trasmissione nuovaTrasmissione) throws TrasmissioneInvalidaException {

        if (!canale.contains(vecchiaTrasmissione)) {
            throw new TrasmissioneInvalidaException("Trasmissione non programmata");
        }

        if (vecchiaTrasmissione.getOrarioInizio().isBefore(orarioAttuale)) {
            canale.rimuovi(vecchiaTrasmissione);
            nuovaTrasmissione.setOrarioInizio(vecchiaTrasmissione.getOrarioInizio());
            canale.aggiungi(nuovaTrasmissione);

        } else {
            throw new TrasmissioneInvalidaException("l'orario della trasmissione é prima dell'rario attuale ");
        }
    }


}
