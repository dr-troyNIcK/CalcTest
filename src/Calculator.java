import java.util.Arrays;
import java.util.List;

public class Calculator {

    private String inputString;
    private List<String> parsedStringList;
    private String firstListItem;
    private String secondListItem;
    private String thirdListItem;
    private String outputString;
    private String firstNumber;
    private String secondNumber;
    private String arithmeticOperation;

    private List<String> arabicNumbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    private List<String> romanNumbers = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
    private List<String> arithmeticOperations = Arrays.asList("+", "-", "*", "/");

    public String calc(String inputString) throws Exception {
        this.inputString = inputString;
        parseInputString();
        checkFormatInputString();
        executeCalculation();
        return outputString;
    }

    private void parseInputString() {
        parsedStringList = Arrays.asList(inputString.split(" "));
    }

    private void checkFormatInputString() throws Exception {
        if (parsedStringList.size() != 3)
            throw new Exception("Exception: invalid input format");
        firstListItem = parsedStringList.get(0);
        secondListItem = parsedStringList.get(1);
        thirdListItem = parsedStringList.get(2);
        if (!arabicNumbers.contains(firstListItem) && !romanNumbers.contains(firstListItem))
            throw new Exception("Exception: invalid first number format");
        if (!arabicNumbers.contains(thirdListItem) && !romanNumbers.contains(thirdListItem))
            throw new Exception("Exception: invalid second number format");
        if (!arithmeticOperations.contains(secondListItem))
            throw new Exception("Exception: invalid arithmetic symbol format");
        firstNumber = firstListItem;
        secondNumber = thirdListItem;
        arithmeticOperation = secondListItem;
        if (!firstNumber.getClass().getName().equals(secondNumber.getClass().getName()))
            throw new Exception("Exception: different numbers types");

    }

    private void executeCalculation() throws Exception {
        if (arabicNumbers.contains(firstNumber)) {
            switch (arithmeticOperation) {
                case "+":
                    outputString = Integer.toString((arabicNumbers.indexOf(firstNumber) + 1) + (arabicNumbers.indexOf(secondNumber) + 1));
                    break;
                case "-":
                    outputString = Integer.toString((arabicNumbers.indexOf(firstNumber) + 1) - (arabicNumbers.indexOf(secondNumber) + 1));
                    break;
                case "*":
                    outputString = Integer.toString((arabicNumbers.indexOf(firstNumber) + 1) * (arabicNumbers.indexOf(secondNumber) + 1));
                    break;
                case "/":
                    outputString = Float.toString((float) (arabicNumbers.indexOf(firstNumber) + 1) / (float) (arabicNumbers.indexOf(secondNumber) + 1));
                    break;
                default:
                    throw new Exception("Exception: uncheckable error");
            }
        } else if (romanNumbers.contains(firstNumber)) {
            switch (arithmeticOperation) {
                case "+":
                    outputString = Integer.toString((romanNumbers.indexOf(firstNumber) + 1) + (romanNumbers.indexOf(secondNumber) + 1));
                    break;
                case "-":
                    outputString = Integer.toString((romanNumbers.indexOf(firstNumber) + 1) - (romanNumbers.indexOf(secondNumber) + 1));
                    break;
                case "*":
                    outputString = Integer.toString((romanNumbers.indexOf(firstNumber) + 1) * (romanNumbers.indexOf(secondNumber) + 1));
                    break;
                case "/":
                    outputString = Float.toString((float) (romanNumbers.indexOf(firstNumber) + 1) / (float) (romanNumbers.indexOf(secondNumber) + 1));
                    break;
                default:
                    throw new Exception("Exception: uncheckable error");
            }
        } else {
            throw new Exception("Exception: uncheckable error");
        }
    }
}