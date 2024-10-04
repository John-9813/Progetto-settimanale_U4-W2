package org.progettoListaGiochi.elementi;

// Classe astratta gioco
public abstract class Gioco {

    // Attributi comuni a tutti i giochi
    String titolo;
    private String id;
    private int annoPubblicazione;
    private double prezzo;

    public Gioco(String id, String titolo, int annoPubblicazione, double prezzo) {

        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;

    }

    // Uso i metodi get e set per accedere e modificare gli attributi
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPublicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
