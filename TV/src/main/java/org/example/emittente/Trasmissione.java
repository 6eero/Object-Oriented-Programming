package org.example.emittente;

import java.time.LocalTime;
import java.util.List;

public class Trasmissione {

    private LocalTime orarioInizio;
    private LocalTime orarioFine;
    private String titolo;
    private GenereTrasmissione genere;
    private String schedaInformativa;
    private Lingua linguaOriginale;
    private List<Lingua> lingueSupportate;
    private boolean sottotili;


    public Trasmissione(LocalTime orarioInizio, LocalTime orarioFine, String titolo, GenereTrasmissione genere, String schedaInformativa, Lingua linguaOriginale, List<Lingua> lingueSupportate, boolean sottotili) {
        this.setOrarioInizio(orarioInizio);
        this.setOrarioFine(orarioFine);
        this.titolo = titolo;
        this.genere = genere;
        this.schedaInformativa = schedaInformativa;
        this.linguaOriginale = linguaOriginale;
        this.lingueSupportate = lingueSupportate;
        this.sottotili = sottotili;
    }

    public LocalTime getOrarioInizio() {
        return orarioInizio;
    }

    public void setOrarioInizio(LocalTime orarioInizio) {
        this.orarioInizio = orarioInizio;
    }

    public LocalTime getOrarioFine() {
        return orarioFine;
    }

    public void setOrarioFine(LocalTime orarioFine) {
        this.orarioFine = orarioFine;
    }

    public String getTitolo() {
        return titolo;
    }
}
