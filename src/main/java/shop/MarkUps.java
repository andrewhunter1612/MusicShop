package shop;

public enum MarkUps {
    GUITARS(1.2),
    PIANOS(1.18),
    VUVUZELA(1.74),
    ACCESSORIES(1.43);

    private final double markup;

    MarkUps(double markup) {
        this.markup = markup;
    }

    public double getMarkup() {
        return markup;
    }
}
