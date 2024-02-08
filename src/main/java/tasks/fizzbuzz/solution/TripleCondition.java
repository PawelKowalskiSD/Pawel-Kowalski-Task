package tasks.fizzbuzz.solution;

public class TripleCondition extends Condition {
    public TripleCondition(String name, int singleAssumption, int doubleAssumption, int tripleAssumption) {
        super(name, singleAssumption, doubleAssumption, tripleAssumption);
    }

    @Override
    public int condition(int n) {
        int result = 0;
        if (getSingleAssumption() == 0 || getDoubleAssumption() == 0 || getTripleAssumption() == 0) {
            throw new ArithmeticException();
        } else {
            if ((n % getSingleAssumption() == 0) && (n % getDoubleAssumption() == 0) && (n % getTripleAssumption() == 0)) {
                result += (getSingleAssumption() + getDoubleAssumption() + getTripleAssumption());
            }
        }
        return result;
    }
}
