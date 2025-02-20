package org.progettoListaGiochi.elementi;

public class GiocoDaTavolo extends Gioco {
    private int numeroGiocatori;
    private int durataMedia;

    public GiocoDaTavolo(String id, String titolo, int annoPubblicazione, double prezzo, int numeroGiocatori, int durataMedia) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.numeroGiocatori = numeroGiocatori;
        this.durataMedia = durataMedia;
    }

    // Metodi setter e getter..
    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataMedia() {
        return durataMedia;
    }

    public void setDurataMedia(int durataMedia) {
        this.durataMedia = durataMedia;
    }
}