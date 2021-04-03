import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;
import instruments.PianoType;
import instruments.guitar.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Instrument instrument, piano;

    @Before
    public void before(){
        instrument = new Electric("Red", "Wood", 500);
        piano = new Piano("Brown", "Wood", 3000, 88, PianoType.GRAND);
    }

    @Test
    public void checkSellPrice(){
        double sell = instrument.sellPrice(instrument.getBuyPrice());
        assertEquals(600, sell, 0.0);
    }

    @Test
    public void checkSound(){
        assertEquals("Electric twang", instrument.play());
    }

    @Test
    public void checkPiano(){
        assertEquals(3540, piano.sellPrice(piano.getBuyPrice()),0.0);
    }




}
