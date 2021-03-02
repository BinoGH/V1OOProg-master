package Prog.Practica.Practicum4b;

import java.sql.SQLOutput;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;
    private String uitvoer;

    public AutoHuur(){}

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto a){
        gehuurdeAuto = a;
    }

    public Auto getGehuurdeAuto(){
        if (gehuurdeAuto == null){
            return null;
        }
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k){
        huurder = k;
    }

    public Klant getHuurder(){
        if (huurder == null){
            return null;
        }
        return huurder;
    }

    public double totaalPrijs(){
        if (gehuurdeAuto == null){
            return 0.0;
        } else {
            return (aantalDagen * gehuurdeAuto.getPrijsPerDag() * ((100 -huurder.getKorting()) / 100));
        }
    }

    public String toString(){
        uitvoer = "";

        if (gehuurdeAuto == null){
            uitvoer += ("er is geen auto bekend.\n");
        } else {
            uitvoer += (gehuurdeAuto.toString() + "\n");
        }
        if (huurder == null){
            uitvoer += ("er is geen huurder bekend.\n");
        } else {
            uitvoer += (huurder.toString() + "\n");
        }
        uitvoer += ("aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs());
        return uitvoer;
    }
}
