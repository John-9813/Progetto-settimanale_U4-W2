package org.progettoListaGiochi.elementi;

public class Videogioco extends Gioco {
    private String piattaforma;
    private int durataGioco;
    private Genere genere;

    public Videogioco(String id, String titolo, int annoPubblicazione, double prezzo, String piattaforma, int durataGioco, Genere genere) {
        super(id, titolo, annoPubblicazione, prezzo); // Attributi richiamati dalla classe gioco
        this.piattaforma = piattaforma;
        this.durataGioco = durataGioco;
        this.genere = genere;
    }

    // I metodi setter e getter per la modifica e accesso agli attributi..
    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurataGioco() {
        return durataGioco;
    }

    public void setDurataGioco(int durataGioco) {
        this.durataGioco = durataGioco;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

}
