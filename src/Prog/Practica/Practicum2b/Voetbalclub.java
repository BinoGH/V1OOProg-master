package Prog.Practica.Practicum2b;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        this.naam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString(){
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }
}
