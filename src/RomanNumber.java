import java.util.HashMap;
import java.util.Map;

public class RomanNumber implements Numerable {

    private String name;
    private int value;

    static private final Map<Integer, String> romanFigures = new HashMap<>() {
        {
            put(1, "I");
            put(2, "II");
            put(3, "III");
            put(4, "IV");
            put(5, "V");
            put(6, "VI");
            put(7, "VII");
            put(8, "VIII");
            put(9, "IX");
            put(10, "X");
            put(20, "XX");
            put(30, "XXX");
            put(40, "XL");
            put(50, "L");
            put(60, "LX");
            put(70, "LXX");
            put(80, "LXXX");
            put(90, "XC");
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

    private String convert(int i) {
        StringBuilder result = new StringBuilder();
        if (i == 0) return "NULL";
        if (i < 0) result.append("-");
        if (i / 100 > 0) result.append(romanFigures.get(i / 100 * 100));
        i = i % 100;
        if (i / 10 > 0) result.append(romanFigures.get(i / 10 * 10));
        i = i % 10;
        if (i > 0) result.append(romanFigures.get(i));
        return result.toString();
    }
}