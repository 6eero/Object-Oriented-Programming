package org.example;

import org.example.emittente.*;
import org.example.tv.TV;
import org.example.tv.exceptions.CanaleNonTrovatoException;
import org.example.tv.exceptions.TrasmissioneInvalidaException;

import java.time.LocalTime;
import java.util.Objects;

/**

 * Esame di Programmazione Orientata agli Oggetti - Parte 2 - 5 febbraio 2019 - TV Digitale

 * Una TV digitale consente di poter vedere trasmissioni A/V rese disponibili da
 * diversi canali (ciascuno con un nome, un numero, e un elenco di trasmissioni);
 * nella TV un canale può essere associato a un programma (selezionato con un
 * numero sul telecomando). Ogni trasmissione, esclusiva di un canale, ha un
 * titolo, un eventuale genere (informazioni, film, documentario, show, sport, arte),
 * un’eventuale scheda informativa, una lingua di default, un eventuale elenco di
 * altre lingue, ciascuna lingua con eventuali sottotitoli e infine date e ore in cui
 * viene trasmessa.

 * La TV ha dei settaggi relativi al volume prescelto, alla luminosità, alla lingua
 * prescelta, al mostrare i sottotitoli se disponibili, alla visione 2-in-1 (in una parte
 * in grande dello schermo vedo e sento un programma, e in un riquadro ne vedo
 * un altro).

 * In una API per manipolare queste informazioni ci devono essere i metodi per le seguenti
 * operazioni:


 * • poter visionare un determinato programma (eventualmente con un secondo programma se si
 *   attiva la modalità 2-in-1);

 * • poter cambiare o aggiungere le trasmissioni di un canale (solo quelle future)

 * • poter cercare una trasmissione (per titolo, canale, giorno, ora) tra quelle future, e
 *   poterla settare per la registrazione in automatico, o poter verificare se è già “prenotata”
 *   per la registrazione, o poter annullare la richiesta di registrazione.

 */

public class Main {
    public static void main(String[] args) throws CanaleNonTrovatoException, TrasmissioneInvalidaException {

        TV tv = new TV();
        Emittente emittente = new Emittente();

        Trasmissione trasmissione1 = new Trasmissione(
                LocalTime.of(18, 30),
                LocalTime.of(20, 00),
                "Avanti un altro",
                GenereTrasmissione.show,
                "Avanti un altro! è una game show televisivo in onda su Canale 5 dal 5 settembre 2011. Il programma – ideato da Paolo Bonolis e Stefano Santucci – nasce per sostituire Chi vuole essere milionario?, lo storico quiz di Gerry Scotti andato in onda per ben undici anni.",
                Lingua.italiano,
                null,
                false
        );

        Trasmissione trasmissione2 = new Trasmissione(
                LocalTime.of(20, 00),
                LocalTime.of(21, 30),
                "tg5",
                GenereTrasmissione.informazioni,
                "Il TG5 è il notiziario di Canale 5, realizzato dall'omonima testata e in onda dal 13 gennaio 1992",
                Lingua.italiano,
                null,
                true
        );

        Trasmissione trasmissione3 = new Trasmissione(
                LocalTime.of(20, 00),
                LocalTime.of(21, 30),
                "Caduta Libera",
                GenereTrasmissione.show,
                "Caduta libera è un game show italiano in onda su Canale 5 dal 4 maggio 2015 nella fascia preserale con la conduzione di Gerry Scotti.",
                Lingua.italiano,
                null,
                false
        );

        Trasmissione trasmissione4 = new Trasmissione(
                LocalTime.of(20, 00),
                LocalTime.of(23, 30),
                "Juventus - Lecce",
                GenereTrasmissione.informazioni,
                "Il TG5 è il notiziario di Canale 5, realizzato dall'omonima testata e in onda dal 13 gennaio 1992",
                Lingua.italiano,
                null,
                true
        );

        Canale canale1 = new Canale(1, "rai1");
        Canale canale4 = new Canale(4, "rete4");
        Canale canale5 = new Canale(5, "canale5");
        tv.aggiungiCanale(canale1);
        tv.aggiungiCanale(canale4);
        tv.aggiungiCanale(canale5);

        emittente.aggiungiTrasmissione(canale5, trasmissione1);
        emittente.aggiungiTrasmissione(canale5, trasmissione2);
        emittente.aggiungiTrasmissione(canale1, trasmissione3);

        //.out.println(emittente.getListaDiTutteLeTrasmissioni());

        //emittente.cambiaTrasmissione(canale5, trasmissione2, trasmissione4);

        //.visionaTrasmissione(5);

        //System.out.println(tv.cercaTrasmissione("Avanti un altro", emittente.getListaDiTutteLeTrasmissioni()));

    }
}