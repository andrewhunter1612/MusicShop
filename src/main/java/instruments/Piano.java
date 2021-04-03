package instruments;

import behaviours.IPlay;
import shop.MarkUps;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;
    private PianoType pianoType;


    public Piano(String colour, String material, double buyPrice,
                 int numberOfKeys, PianoType pianoType) {
        super(InstrumentType.KEYBOARD, colour, material, buyPrice);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "Piano sound";
    }

    @Override
    public double sellPrice(double buyPrice) {
        return buyPrice * MarkUps.PIANOS.getMarkup();
    }
}
