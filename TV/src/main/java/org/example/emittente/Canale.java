package org.example.emittente;

import org.example.tv.exceptions.TrasmissioneInvalidaException;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;

public class Canale {

    private Queue<Trasmissione> programmazione = new LinkedList<>();
    private int numero;
    private String nome;

    LocalTime orarioCorrente = LocalTime.now();


    public Canale(int numero, String nome) {
        this.programmazione = new LinkedList<>();
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void aggiungi(Trasmissione trasmissione) {
        programmazione.add(trasmissione);
    }

    public void rimuovi(Trasmissione trasmissione) {
        programmazione.remove(trasmissione);
    }

    public boolean contains(Trasmissione vecchiaTrasmissione) {
        return programmazione.contains(vecchiaTrasmissione);
    }

    public Trasmissione getTrasmissioneCorrente() throws TrasmissioneInvalidaException {

        for(Trasmissione trasmissione : programmazione) {
            if (trasmissione.getOrarioInizio().isBefore(orarioCorrente) && (trasmissione.getOrarioFine().isAfter(orarioCorrente))) {
                return trasmissione;
            }
        }
        throw new TrasmissioneInvalidaException("Non c'è nessuna trasmissione");
    }
}

