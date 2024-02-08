package tasks.fizzbuzz.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionFizzBuzzTest {

    @Test
    void shouldCreateFizzBuzzSolution() {
        //Given
        SingleCondition fizz = new SingleCondition("Fizz", 3);
        SingleCondition buzz = new SingleCondition("Buzz", 5);
        DoubleCondition fizzBuzz = new DoubleCondition("FizzBuzz", 3, 5);
        Solution fizzBuzzSolution = new Solution.ProblemSolverBuilder()
                .addCondition(fizz)
                .addCondition(buzz)
                .addCondition(fizzBuzz)
                .build();
        //When
        List<String> result = fizzBuzzSolution.solvingTheAssumptions(20);
        //Then
        System.out.println(result);
        assertEquals(20, result.size());
        assertEquals("Fizz", result.get(2));
        assertEquals("Buzz", result.get(4));
        assertEquals("FizzBuzz", result.get(14));
    }

    @Test
    void shouldCreateFizzBuzzJazzSolution() {
        //Given
        TripleCondition fizzBuzzJazz = new TripleCondition("FizzBuzzJazz", 5, 7, 3);
        DoubleCondition fizzJazz = new DoubleCondition("FizzJazz", 7, 3);
        DoubleCondition buzzJazz = new DoubleCondition("BuzzJazz", 5, 7);
        SingleCondition jazz = new SingleCondition("Jazz", 7);
        Solution fizzBuzzJazzSolution = new Solution.ProblemSolverBuilder()
                .addCondition(fizzBuzzJazz)
                .addCondition(fizzJazz)
                .addCondition(buzzJazz)
                .addCondition(jazz)
                .build();
        //When
        List<String> result = fizzBuzzJazzSolution.solvingTheAssumptions(110);
        //Then
        System.out.println(result);
        assertEquals(110, result.size());
        assertEquals("FizzJazz", result.get(20));
        assertEquals("BuzzJazz", result.get(34));
        assertEquals("Jazz", result.get(6));
        assertEquals("FizzBuzzJazz", result.get(104));
    }
}