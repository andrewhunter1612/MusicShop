package instruments;

import shop.MarkUps;

public abstract class Guitar extends Instrument{

    public Guitar(String colour,
                  String material, double buyPrice) {
        super(InstrumentType.STRING, colour, material, buyPrice);
    }

    @Override
    public double sellPrice(double buyPrice) {
        return buyPrice * MarkUps.GUITARS.getMarkup();
    }

}
