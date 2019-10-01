public class Plus implements Arithmeticable {

    @Override
    public Numerable execute(Numerable numOne, Numerable numTwo) throws Exception {
        Numerable result;
        switch (numOne.getClass().getName()) {
            case "ArabicNumber":
                result = new ArabicNumber(numOne.getValue() + numTwo.getValue());
                break;
            case "RomanNumber":
                result = new RomanNumber(numOne.getValue() + numTwo.getValue());
                break;
            default:
                throw new Exception("Exception: uncheckable error");
        }
        return result;
    }
}