package org.progettoListaGiochi.main;

import org.progettoListaGiochi.elementi.Collezione;
import org.progettoListaGiochi.elementi.Genere;
import org.progettoListaGiochi.elementi.GiocoDaTavolo;
import org.progettoListaGiochi.elementi.Videogioco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inizio a creare la collezioni di giochi e le azioni di input dell'utente
        Collezione collezione = new Collezione();
        Scanner scanner = new Scanner(System.in);

        // ciclo per le opzioni di selezione
        while (true) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi un gioco");
            System.out.println("2. Ricerca ID di gioco");
            System.out.println("3. Ricerca giochi per il prezzo");
            System.out.println("4. Ricerca giochi da tavolo per quanti giocatori siete");
            System.out.println("0. Esci.");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (scelta) {
                    case 1:
                        aggiungiGioco(collezione, scanner);
                        break;
                    case 2:
                        ricercaPerId(collezione, scanner);
                        break;
                    case 3:
                        ricercaPerPrezzo(collezione, scanner);
                        break;
                    case 4:
                        ricercaPerNumeroGiocatori(collezione, scanner);
                        break;
                    case 0:
                        System.out.println("Uscita dall'applicazione.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Errore di input. Assicurati di inserire un numero.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Mostra messaggi di eccezioni personalizzate
            }
        }
    }

    // Metodo per aggiungere un gioco alla collezione
    private static void aggiungiGioco(Collezione collezione, Scanner scanner) {
        System.out.print("Inserisci ID del gioco: ");
        String id = scanner.nextLine();

        System.out.print("Inserisci titolo del gioco: ");
        String titolo = scanner.nextLine();

        System.out.print("Inserisci anno di pubblicazione: ");
        int anno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Inserisci prezzo del gioco: ");
        double prezzo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Il gioco è un videogioco o un gioco da tavolo (v = Videogioco/t = Da tavolo)? ");
        String tipo = scanner.nextLine().trim().toLowerCase();

        // Gestione delle due possibilità di scelta
        if (tipo.equals("v")) {
            System.out.print("Inserisci piattaforma (PC, PS5, Xbox): ");
            String piattaforma = scanner.nextLine();

            System.out.print("Inserisci durata di gioco (in ore): ");
            int durataGioco = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Inserisci genere del videogioco: ");
            String genereStr = scanner.nextLine();
            Genere genere = Genere.valueOf(genereStr.toUpperCase());

            Videogioco videogioco = new Videogioco(id, titolo, anno, prezzo, piattaforma, durataGioco, genere);
            collezione.aggiungiGioco(videogioco);
            System.out.println("Videogioco aggiunto con successo!");
        } else if (tipo.equals("t")) {
            System.out.print("Inserisci numero di giocatori: ");
            int numeroGiocatori = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Inserisci durata media circa della partita (in minuti): ");
            int durataMedia = scanner.nextInt();
            scanner.nextLine();

            GiocoDaTavolo giocoDaTavolo = new GiocoDaTavolo(id, titolo, anno, prezzo, numeroGiocatori, durataMedia);
            collezione.aggiungiGioco(giocoDaTavolo);
            System.out.println("Gioco da tavolo aggiunto con successo!");
        } else {
            System.out.println("Tipo di gioco non riconosciuto.");
        }
    }

 
}
