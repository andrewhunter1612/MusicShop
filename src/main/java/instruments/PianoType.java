package instruments;

public enum PianoType {
    HYBRID("Hybrid"),
    ELECTRIC("Electric"),
    GRAND("Grand");

    private final String type;

    PianoType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
