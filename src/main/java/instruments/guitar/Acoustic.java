package instruments.guitar;

import instruments.Guitar;
import instruments.InstrumentType;

public class Acoustic extends Guitar {
    public Acoustic(String colour, String material, double buyPrice) {
        super(colour, material, buyPrice);
    }

    @Override
    public String play() {
        return "Acoustic noise";
    }


}
