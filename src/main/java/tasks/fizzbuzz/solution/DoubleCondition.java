package tasks.fizzbuzz.solution;

public class DoubleCondition extends Condition {
    public DoubleCondition(String name, int singleAssumption, int doubleAssumption) {
        super(name, singleAssumption, doubleAssumption);
    }

    @Override
    public int condition(int n) {
        int result = 0;
        try {
            if (getSingleAssumption() == 0 || getDoubleAssumption() == 0) {
                throw new ArithmeticException();
            } else {
                if ((n % getSingleAssumption() == 0) && (n % getDoubleAssumption() == 0)) {
                    result += (getSingleAssumption() + getDoubleAssumption());
                }
            }
        } catch (ArithmeticException e) {
        }
        return result;
    }
}
