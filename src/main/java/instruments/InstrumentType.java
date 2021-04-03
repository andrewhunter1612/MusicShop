package instruments;

public enum InstrumentType {

    BRASS("Brass"),
    STRING("String"),
    WOODWIND("Woodwind"),
    KEYBOARD("Keyboard");

    public final String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
