public class Multiply implements Arithmeticable {

    @Override
    public int execute(Numerable numOne, Numerable numTwo) throws Exception {
        return numOne.getValue() * numTwo.getValue();
    }
}