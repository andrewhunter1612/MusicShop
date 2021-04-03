package instruments.guitar;

import instruments.Guitar;
import instruments.InstrumentType;
import shop.MarkUps;

public class Electric extends Guitar {

    public Electric(String colour, String material, double buyPrice) {
        super(colour, material, buyPrice);
    }

    @Override
    public String play() {
        return "Electric twang";
    }


}
