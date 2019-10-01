public class ArabicNumber implements Numerable {

    private String name;
    private int value;

    public ArabicNumber(int value) {
        this.value = value;
        name = Integer.toString(value);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }

}