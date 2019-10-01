import java.util.HashMap;
import java.util.Map;

public interface Arithmeticable {
    Map<String, Arithmeticable> ARITHMETIC_OPERATION = new HashMap<String, Arithmeticable>() {
        {
            put("+", new Plus());
            put("-", new Minus());
            put("*", new Multiply());
            put("/", new Divide());
        }
    };

    Numerable execute(Numerable numOne, Numerable numTwo) throws Exception;
}