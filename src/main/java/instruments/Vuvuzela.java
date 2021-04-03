package instruments;

import behaviours.IPlay;
import shop.MarkUps;

public class Vuvuzela extends Instrument {


    public Vuvuzela(InstrumentType instrumentType, String colour, String material, double buyPrice) {
        super(instrumentType, colour, material, buyPrice);
    }

    public String play() {
        return "Horrible droning noise";
    }

    public double sellPrice(double buyPrice) {
        return buyPrice * MarkUps.VUVUZELA.getMarkup();
    }
}
