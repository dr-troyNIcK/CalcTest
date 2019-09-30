import java.util.Arrays;

public class Calculator {

    public String calc(String inputString) {
        return Arrays.asList(inputString.split(" ")).toString();
    }

}