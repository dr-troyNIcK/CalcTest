import java.util.HashMap;
import java.util.Map;

public interface Arithmeticable {
    Map<String, Arithmeticable> ARITHMETIC_OPERATION = new HashMap<>() {
        {
            put("+", new Plus());
            put("-", new Minus());
            put("*", new Multiply());
            put("/", new Divide());
        }
    };

    int execute(Numerable numOne, Numerable numTwo) throws Exception;
}