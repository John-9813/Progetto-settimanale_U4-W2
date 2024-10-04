package org.progettoListaGiochi.elementi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Classe che rappresenta una lista di giochi dove uso dei metodi per le ricerche e aggiunte in base agli attributi
public class Collezione {
    // Creo la lista che contiene tutti i giochi
    public List<Gioco> giochi;

    public Collezione() {
        giochi = new ArrayList<>();
    }

    // La ricerca del gioco tramite ID
    public Optional<Gioco> ricercaPerId(String id) {
        return giochi.stream().filter(gioco -> gioco.getId().equals(id)).findFirst();
    }

    // La ricerca del gioco tramite prezzo
    public List<Gioco> ricercaPerPrezzo(double prezzoLimite) {
        return giochi.stream().filter(gioco -> gioco.getPrezzo() < prezzoLimite).collect(Collectors.toList());
    }

    // Ricerca tramite numero di giocatori per i giochi da tavolo ( ci ho perso 3 ore)
    public List<GiocoDaTavolo> ricercaPerNumeroGiocatori(int numeroGiocatori) {
        return giochi.stream().filter(gioco -> gioco instanceof GiocoDaTavolo).map(gioco -> (GiocoDaTavolo) gioco).filter(giocoDaTavolo -> giocoDaTavolo.getNumeroGiocatori() == numeroGiocatori).collect(Collectors.toList());
    }

    public void aggiungiGioco(Gioco gioco) {
        // Verifico se l'ID è già presente
        if (giochi.stream().anyMatch(g -> g.getId().equals(gioco.getId()))) {
            throw new IllegalArgumentException("ID già presente nella collezione");

        }
        giochi.add(gioco);
    }

}
