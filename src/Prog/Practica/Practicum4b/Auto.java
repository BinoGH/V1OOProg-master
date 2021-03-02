package Prog.Practica.Practicum4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPD){
        this.type = tp;
        this.prijsPerDag = prPD;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString(){
        return (type + " met prijs per dag: " + prijsPerDag);
    }
}
