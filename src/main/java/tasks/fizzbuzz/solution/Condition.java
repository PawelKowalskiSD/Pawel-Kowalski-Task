package tasks.fizzbuzz.solution;

public abstract class Condition {
    private final String name;
    private final int singleAssumption;
    private int doubleAssumption;
    private int tripleAssumption;

    public Condition(String name, int singleAssumption) {
        this.name = name;
        this.singleAssumption = singleAssumption;
    }

    public Condition(String name, int singleAssumption, int doubleAssumption) {
        this.name = name;
        this.singleAssumption = singleAssumption;
        this.doubleAssumption = doubleAssumption;
    }

    public Condition(String name, int singleAssumption, int doubleAssumption, int tripleAssumption) {
        this.name = name;
        this.singleAssumption = singleAssumption;
        this.doubleAssumption = doubleAssumption;
        this.tripleAssumption = tripleAssumption;
    }

    public String getName() {
        return name;
    }

    public int getSingleAssumption() {
        return singleAssumption;
    }

    public int getDoubleAssumption() {
        return doubleAssumption;
    }

    public int getTripleAssumption() {
        return tripleAssumption;
    }


    public int condition(int n) {
        int result = 0;
        try {
            if (singleAssumption == 0) {
                throw new ArithmeticException();
            } else {
                if (n % singleAssumption == 0) {
                    result += singleAssumption;
                }
            }
        } catch (ArithmeticException e) {
        }
        return result;
    }
}
