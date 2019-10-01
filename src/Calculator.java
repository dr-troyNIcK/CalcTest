import java.util.Arrays;
import java.util.List;

public class Calculator {

    private final List<String> validInputArabicNumbers = Arrays.asList(null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    private final List<String> validInputRomanNumbers = Arrays.asList(null, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public String calc(String inputString) throws Exception {
        List<String> parsedStringList = Arrays.asList(inputString.split(" "));
        Arithmeticable arithmeticOperation;
        Numerable numOne;
        Numerable numTwo;
        Numerable result;

        if (parsedStringList.size() != 3)
            throw new Exception("Exception: invalid input format");

        if (Arithmeticable.ARITHMETIC_OPERATION.containsKey(parsedStringList.get(1))) {
            arithmeticOperation = Arithmeticable.ARITHMETIC_OPERATION.get(parsedStringList.get(1));
        } else {
            throw new Exception("Exception: invalid arithmetic symbol format");
        }

        if (validInputArabicNumbers.contains(parsedStringList.get(0)) && validInputArabicNumbers.contains(parsedStringList.get(2))) {
            numOne = new ArabicNumber(validInputArabicNumbers.indexOf(parsedStringList.get(0)));
            numTwo = new ArabicNumber(validInputArabicNumbers.indexOf(parsedStringList.get(2)));
            result = new ArabicNumber(arithmeticOperation.execute(numOne, numTwo));
        } else if (validInputRomanNumbers.contains(parsedStringList.get(0)) && validInputRomanNumbers.contains(parsedStringList.get(2))) {
            numOne = new RomanNumber(validInputRomanNumbers.indexOf(parsedStringList.get(0)));
            numTwo = new RomanNumber(validInputRomanNumbers.indexOf(parsedStringList.get(2)));
            result = new RomanNumber(arithmeticOperation.execute(numOne, numTwo));
        } else {
            throw new Exception("Exception: invalid numbers format");
        }

        return result.toString();
    }
}