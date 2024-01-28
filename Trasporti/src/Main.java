/**
 * L’azienda di trasporti Logistic vuole usare un’app mobile per consentire ai propri manager di creare e modificare dei
 * viaggi che i propri autocarri possono svolgere. Ciascun viaggio, che va da una città di origine a una di destinazione
 * eventualmente passando per città intermedie, riguarda quantità (in kg) di merce di un certo tipo (colli sfusi, liqui-
 * di, gas, da-frigo) per conto di un cliente. Il viaggio deve essere svolto con autocarri (di tipo compatibile col tipo
 * di merce) e capacità di carico adeguata (eventualmente più di uno) in modo che la merce parta a una certa data oppure
 * arrivi a una certa data. I percorsi per tutte le coppie servite (orgine, destinazione) sono prefissati; in certi casi
 * esistono percorsi ridondanti (ad es. da UD a MI si può passare per Mestre o per Treviso e poi Castelfranco Veneto).
 * I percorsi sono simmetrici: se esiste (origine –> destinazione) esiste anche (destinazione –> origine) ed è l’inverso.
 * Un viaggio può servire a 1 o più clienti. Un manager deve poter:
 *   - prenotare un certo viaggio, dati origine, destinazione, tipo di merce, kg, data-partenza o data-arrivo
 *   - sapere quali viaggi sono prenotati per una certa data, o origine, o destinazione, o autocarro
 *   - reinstradare un viaggio su un percorso alternativo qualora sia necessario.
 * Si necessita di un’API che consenta di implementare queste operazioni.
 */

public class Main {

     public static void main(String[] args) {

          Manager manager = new Manager();


          /*---------------------------------- Popolamento registro delle spedizioni ----------------------------------*/

          Spedizione spedizione1 = new Spedizione.SpedizioneBuilder (
                  new Percorso.PercorsoBuilder("Udine", "Roma", new String[] {"Napoli", "Milano"}).build(),
                  new Date.DateBuilder("12 dicembre", "18 dicembre").build(),
                  new Autocarro.AutocarroBuilder("BS 456GB", 324.12, "daFrigo").build(),
                  "#14456"
          ).build();
          manager.prenotaSpedizione(spedizione1);

          Spedizione spedizione2 = new Spedizione.SpedizioneBuilder (
                  new Percorso.PercorsoBuilder("Vicneza", "Sappada", new String[] {"Vicenza", "Bari", "Gubbio"}).build(),
                  new Date.DateBuilder("28 dicembre", "4 gennaio").build(),
                  new Autocarro.AutocarroBuilder("SD 856PT", 233.21, "Colli sfusi").build(),
                  "#74362"
          ).build();
          manager.prenotaSpedizione(spedizione2);


          /*-----------------------------------------------------------------------------------------------------------*/

          manager.ricercaUnaSpedizione("SD 856PT", manager);


          manager.stampaPercorso(spedizione2);

          manager.reinstradaSpedizione(spedizione2, "Las Vegas", "Monaco", null);
          manager.stampaPercorso(spedizione2);

          manager.reinstradaSpedizione(spedizione2, "New York", "Monaco", new String[]{"Capri"});
          manager.stampaPercorso(spedizione2);

     }
}


