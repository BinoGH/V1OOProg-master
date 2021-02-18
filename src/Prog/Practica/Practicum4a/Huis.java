package Prog.Practica.Practicum4a;

public class Huis {
    public String adres;
    public int bouwjaar;
    public Persoon huisbaas;

    public Huis(String adres, int bouwjaar){
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon h){
        huisbaas = h;
    }

    public Persoon getHuisbaas(){
        return huisbaas;
    }

    public String toString(){
        return ("Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas);
    }
}
