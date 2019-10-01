public class Multiply implements Arithmeticable {

    @Override
    public int execute(Numerable numOne, Numerable numTwo) {
        return numOne.getValue() * numTwo.getValue();
    }
}