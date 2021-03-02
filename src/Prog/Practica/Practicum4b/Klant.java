package Prog.Practica.Practicum4b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        this.naam = nm;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString(){
        return (naam + "(korting: " + kortingsPercentage + ")");
    }
}
