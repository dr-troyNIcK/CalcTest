import java.util.Arrays;
import java.util.List;

public class Calculator {

    private final List<String> validInputArabicNumbers = Arrays.asList(null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    private final List<String> validInputRomanNumbers = Arrays.asList(null, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public String calc(String inputString) throws Exception {
        List<String> parsedStringList = Arrays.asList(inputString.split(" "));
        Numerable numOne;
        Numerable numTwo;
        Arithmeticable arithmeticOperation;

        if (parsedStringList.size() != 3)
            throw new Exception("Exception: invalid input format");

        if (validInputArabicNumbers.contains(parsedStringList.get(0))) {
            numOne = new ArabicNumber(validInputArabicNumbers.indexOf(parsedStringList.get(0)));
        } else if (validInputRomanNumbers.contains(parsedStringList.get(0))) {
            numOne = new RomanNumber(validInputRomanNumbers.indexOf(parsedStringList.get(0)));
        } else {
            throw new Exception("Exception: invalid first number format");
        }

        if (validInputArabicNumbers.contains(parsedStringList.get(2))) {
            numTwo = new ArabicNumber(validInputArabicNumbers.indexOf(parsedStringList.get(2)));
        } else if (validInputRomanNumbers.contains(parsedStringList.get(2))) {
            numTwo = new RomanNumber(validInputRomanNumbers.indexOf(parsedStringList.get(2)));
        } else {
            throw new Exception("Exception: invalid second number format");
        }

        if (Arithmeticable.ARITHMETIC_OPERATION.keySet().contains(parsedStringList.get(1))) {
            arithmeticOperation = Arithmeticable.ARITHMETIC_OPERATION.get(parsedStringList.get(1));
        } else {
            throw new Exception("Exception: invalid arithmetic symbol format");
        }

        if (!numOne.getClass().getName().equals(numTwo.getClass().getName())) {
            throw new Exception("Exception: different numbers types");
        }

        return arithmeticOperation != null ? arithmeticOperation.execute(numOne, numTwo).toString() : null;
    }
}