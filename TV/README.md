# Esame di Programmazione Orientata agli Oggetti - Parte 2 - 5 febbraio 2019 - TV Digitale

Una TV digitale consente di poter vedere trasmissioni A/V rese disponibili da diversi canali (ciascuno con un nome, un numero, e un elenco di trasmissioni); nella TV un canale può essere associato a un programma (selezionato con un numero sul telecomando). Ogni trasmissione, esclusiva di un canale, ha un
titolo, un eventuale genere (informazioni, film, documentario, show, sport, arte),
un’eventuale scheda informativa, una lingua di default, un eventuale elenco di
altre lingue, ciascuna lingua con eventuali sottotitoli e infine date e ore in cui
viene trasmessa.
La TV ha dei settaggi relativi al volume prescelto, alla luminosità, alla lingua
prescelta, al mostrare i sottotitoli se disponibili, alla visione 2-in-1 (in una parte
in grande dello schermo vedo e sento un programma, e in un riquadro ne vedo
un altro).

I canali disponibili, e le loro trasmissioni, vengono periodicamente aggiornati.
La TV dispone di un videoregistratore incorporato che funziona in automatico,
sulla base di un elenco di trasmissioni settate per essere registrate.
In una API per manipolare queste informazioni ci devono essere i metodi per le
seguenti operazioni:

- poter visionare un determinato programma (eventualmente con un secondo programma se si attiva la modalità 2-in-1);
- poter cambiare o aggiungere le trasmissioni di un canale (solo quelle future)
- poter cercare una trasmissione (per titolo, canale, giorno, ora) tra quelle future, e poterla settare per la registrazione in automatico, o poter verificare se è già “prenotata” per la registrazione, o poter annullare la richiesta di registrazione.

# Cosa fare

Si progetti una o più gerarchie di tipo in Java in modo da supportare le operazioni
indicate sopra. Definire classi e interfacce, le segnature dei metodi, e gli stati
astratti, specificando il ruolo e protocollo delle classi/interfacce e i contratti dei
metodi più importanti; implementare lo stato concreto e i metodi.

Valuterò l’elaborato in base alla qualità del progetto e della sua implementazione
(responsabilità, tipologie, contratti, ADT, parametrizzazione, qualità del body,
pattern di design, astrazioni, incapsulamento, . . . ). Non leggerò spiegazioni
complesse, schemi e diagrammi. Scrivere in maniera comprensibile: ciò
che non capisco lo interpreto come errato.
