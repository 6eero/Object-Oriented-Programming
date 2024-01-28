# Domotica - Programmazione Orientata agli Oggetti - 29 giugno 2022



Cosa fare:

Si progetti una o più gerarchie di tipo in Java in modo da supportare le operazioni indicate 
nel tema specificato sotto. Definire classi e interfacce, le segnature dei metodi, e gli 
stati astratti e concreti, specificando il ruolo e protocollo delle classi/interfacce e i 
contratti dei metodi più importanti; implementare lo stato concreto e i metodi.
Valuterò l'elaborato in base alla qualità del progetto e della sua implementazione 
(responsabilità, tipologie, contratti, ADT, parametrizzazione, qualità del body, pattern di 
design, astrazioni, incapsulamento). Non leggerò spiegazioni complesse, schemi e 
diagrammi. 

Non consegnare il compito se non si sono implementati almeno i metodi per le operazioni 
principali e un Main che funga da client per questa API con esempi di chiamate di 
ciascuna delle operazioni principali.
La soluzione va scritta su dei file di testo – in particolare non binari - (ad es. usando Intellij,
Eclipse o altro a piacere) che devono essere caricati sul sistema elearning.uniud.it entro il 
termine di scadenza (non ci sono deroghe se non per casi particolari concordati a priori e 
giustificati adeguatamente). 
Scrivere i propri nome e matricola su ciascuno dei file con la soluzione.


L’azienda E-case realizza e vende soluzioni di automazione domotica. La soluzione 
venduta consente agli occupanti di una casa di controllare le luci 
(accese/spente/percentuale di potenza) in ogni stanza, tende elettriche 
(aperte/chiuse/percentuale di apertura), serrature delle porte (bloccate o non), cancello 
elettrico (aperto/chiuso), portone del garage (aperto/chiuso), telecamere (in varie parti 
della casa come all'ingresso, sul giardino, sul retro) Ciascuna telecamera può essere 
accesa/spenta, in streaming con/senza registrazione, modalità="registra solo se oggetto si
muove nel campo visivo" o modalità="registra sempre". C’è anche il sistema di allarme 
(attivato/disattivato/vedi log delle operazioni fatte - operazioni che richiedono 
autenticazione con credenziali username e password). Inoltre è possibile definire dei profili
(ad es. “giorno-estivo”, con le tende al 50%, le luci spente, …; oppure “fuori-casa”, con 
tende chiuse, serrature bloccate, telecamere accese, luci spente, portoni chiusi. E 
ovviamente un profilo può essere attivato, modificato, rimosso dinamicamente.
Si necessita di un'API che consenta di implementare almeno queste operazioni principali 
(segnature solo indicative):

• statoImpianto(...) che dia in output una serie di oggetti che rappresentano lo stato 
di tutti i dispositivi;

• configuraCasa(...) che consente di specificare quali dispositivi sono disponibili;

• inviaComando(dispositivo, comando), che consente di dire a un determinato 
dispositivo di eseguire il comando dato (ad es. lla tenda di alzarsi, o all'allarme di 
disattivarsi). Ovviamente dispositivi diversi implementeranno i comandi in maniera 
diversa. Implementare almeno 3 comandi diversi.

• attivaProfilo(nome-profilo), che invia i comandi previsti dal prfilo a tutti i dispositivi 
riferiti dal profilo.

Si consideri che il numero dei dispositivi debba poter cambiare dinamicamente, e che 
mediamente ogni mese il codice viene esteso aggiungendo 1-2 nuovi tipi di dispositivi.

Scrivere un main che contenga chiamate a ciascuno di questi metodi. 
