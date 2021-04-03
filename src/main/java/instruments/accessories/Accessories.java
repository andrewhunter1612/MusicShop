package instruments.accessories;

import behaviours.ISell;
import shop.MarkUps;

public abstract class Accessories implements ISell {
    private double buyPrice;

    public Accessories(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public double sellPrice(double buyPrice) {
        return buyPrice * MarkUps.ACCESSORIES.getMarkup();
    }
}
