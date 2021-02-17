package Prog.Practica.Practicum2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub v;

    @BeforeEach
    public void init() {
        v = new Voetbalclub("Ajax");
    }

    @Test
    void testLegeClubnaam() {
        Voetbalclub v1 = new Voetbalclub("");
        assertEquals("FC", v1.getNaam());
    }

    @Test
    void testResultaatVerwerking() {
        v.verwerkResultaat('w');
        assertEquals(3, v.aantalPunten());

        v.verwerkResultaat('g');
        assertEquals(4, v.aantalPunten());

        v.verwerkResultaat('v');
        assertEquals(4, v.aantalPunten());

        v.verwerkResultaat('k');
        assertEquals(3, v.aantalGespeeld());
    }

    @Test
    void testStringRepresentatie() {
        v.verwerkResultaat('w');
        assertEquals(3, v.aantalPunten());

        v.verwerkResultaat('g');
        assertEquals(4, v.aantalPunten());

        v.verwerkResultaat('v');
        assertEquals(4, v.aantalPunten());

        assertEquals("Ajax 3 1 1 1 4", v.toString());
    }

    @Test
    void testHerhaaldelijkVerwerken() {
        v.verwerkResultaat('w');
        assertEquals(3, v.aantalPunten());
        v.verwerkResultaat('w');
        assertEquals(6, v.aantalPunten());

        v.verwerkResultaat('g');
        assertEquals(7, v.aantalPunten());

        v.verwerkResultaat('v');
        assertEquals(7, v.aantalPunten());

        // testcases
        assertEquals(4, v.aantalGespeeld());
        assertEquals(2, v.getAantalGewonnen());
        assertEquals(1, v.getAantalGelijk());
        assertEquals(1, v.getAantalVerloren());
    }
}