package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentType instrumentType;
    private String colour;
    private String material;
    private double buyPrice;

    public Instrument(InstrumentType instrumentType, String colour,
                      String material, double buyPrice) {
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyPrice() {
        return buyPrice;
    }


}
