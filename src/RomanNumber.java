import java.util.HashMap;
import java.util.Map;

public class RomanNumber implements Numerable {

    private String name;
    private int value;

    static private final Map<Integer, String> romanFigures = new HashMap<>() {
        {
            put(0, "N");
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
        }
    };

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

    static private String convert(int i) {
//        TODO: write converter from arabic to rome
        return Integer.toString(i);
    }
}