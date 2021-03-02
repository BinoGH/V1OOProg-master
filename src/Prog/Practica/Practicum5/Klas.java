package Prog.Practica.Practicum5;

import java.util.ArrayList;

public class Klas {
    private String klas;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();
    private Leerling naam;
    private Leerling cijfer;

    public Klas(String kC){
        this.klas = kC;
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling l : deLeerlingen){
            if (l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen(){
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    public String toString(){
        System.out.println("In klas " + klas + " zitten de volgende leerlingen:");
        for(Leerling l : deLeerlingen){
            System.out.println(l.getNaam() + " heeft cijfer: " + l.getCijfer());
        }
        return "";
    }
}
