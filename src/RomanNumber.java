public class RomanNumber implements Numerable {

    private String name;
    private int value;

    public RomanNumber(int value) {
        this.value = value;
        name = convert(value);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }

    private String convert(int i) {
        return "N";
    }
}