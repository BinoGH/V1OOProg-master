package Prog.Practica.Practicum2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    //    Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);

    public Zwembad(){

    }
//        Zwembad z2 = new Zwembad( );

    public double getBreedte(){
        return breedte;
    }
    public double getLengte() {
        return lengte;
    }
    public double getDiepte() {
        return diepte;
    }
//  getters

    public void setBreedte(double breedte){
        this.breedte = breedte;
    }
    public void setLengte(double lengte) {
        this.lengte = lengte;
    }
    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }
//  setters

    public double inhoud(){
        return breedte * lengte * diepte;
    }
//  inhoud berekenen

    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
//  string return
}