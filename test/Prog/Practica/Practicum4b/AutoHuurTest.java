package Prog.Practica.Practicum4b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur a;

    @Test
    void testLegeHuurder(){
        Auto a1 = new Auto("Toyota Prius", 2);
        AutoHuur ah = new AutoHuur();
        assertEquals(null, ah.getHuurder());
    }

    @Test
    void testLegeAuto(){
        Klant k1 = new Klant("Jean-Pieter-Paul-Pierre de Vries");
        AutoHuur ah = new AutoHuur();
        assertEquals(null, ah.getGehuurdeAuto());
    }

    @Test
    void testBeideLeeg(){
        AutoHuur ah = new AutoHuur();
        assertEquals(null, ah.getHuurder());
        assertEquals(null, ah.getGehuurdeAuto());
    }

    @Test
    void testKortingGeenAuto(){
        Klant k1 = new Klant("Peter");
        k1.setKorting(80);
        AutoHuur ah = new AutoHuur();
        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    void testKortingMetAuto(){
        Klant k1 = new Klant("Peter");
        k1.setKorting(80);
        Auto a1 = new Auto("Dikke BMW",100);
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k1);
        ah.setGehuurdeAuto(a1);
        ah.setAantalDagen(1);
        assertEquals(20, ah.totaalPrijs());
    }

    @Test
    void testKortingGeenAutoToString(){
        Klant k1 = new Klant("Peter");
        k1.setKorting(80);
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k1);
        assertEquals("er is geen auto bekend.\n" +
                "Peter(korting: 80.0)\n" +
                "aantal dagen: 0 en dat kost 0.0", ah.toString());
    }

    @Test
    void testKortingMetAutoToString(){
        Klant k1 = new Klant("Peter");
        k1.setKorting(80);
        Auto a1 = new Auto("Dikke BMW",100);
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k1);
        ah.setGehuurdeAuto(a1);
        ah.setAantalDagen(1);
        assertEquals("Dikke BMW met prijs per dag: 100.0\n" +
                "Peter(korting: 80.0)\n" +
                "aantal dagen: 1 en dat kost 20.0", ah.toString());
    }
}
