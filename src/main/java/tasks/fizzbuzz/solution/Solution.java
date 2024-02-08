package tasks.fizzbuzz.solution;

import java.util.ArrayList;
import java.util.List;

public final class Solution {
    private final List<Condition> conditionList;

    public static class ProblemSolverBuilder {
        private final List<Condition> conditionList = new ArrayList<>();

        public ProblemSolverBuilder addCondition(Condition condition) {
            this.conditionList.add(condition);
            return this;
        }

        public Solution build() {
            return new Solution(conditionList);
        }
    }

    private Solution(List<Condition> conditionList) {
        this.conditionList = conditionList;
    }

    public List<Condition> getConditionList() {
        return conditionList;
    }

    public List<String> solvingTheAssumptions(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean isValid = true;
            int value = chooseTheBestSolution(i);
            addResultToList(result, i, isValid, value);
        }
        return result;
    }

    private int chooseTheBestSolution(int i) {
        int maxValue = 0;
        for (Condition listCondition : getConditionList()) {
            int max = listCondition.condition(i);
            if (max > maxValue && max > 1) {
                maxValue = max;
            }
        }
        return maxValue;
    }

    private void addResultToList(List<String> result, int i, boolean isValid, int value) {
        for (Condition res : getConditionList()) {
            if (res.condition(i) == value && value > 0) {
                result.add(res.getName());
                isValid = false;
            }
        }
        if (isValid) {
            result.add(Integer.toString(i));
        }
    }
}
