import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

public class SecTests {
    double delta = 0.000001;

    @Test
    void testLeftPartOfPositiveValues() {
        double resultOfSecFunction;
        double input = 0;
        double expectedOutput = 1 / Math.cos(input);
        resultOfSecFunction = Function.sec(input);
        assertEquals(resultOfSecFunction, expectedOutput, delta);
    }

    @Test
    void testRightPartOfPositiveValues() {
        double input = PI / 3;
        double resultOfSecFunction = Function.sec(input);
        double expectedOutput = 1 / Math.cos(input);
        assertEquals(resultOfSecFunction, expectedOutput, delta);
    }

    @Test
    void testLeftPartOfNegativeValues() {
        double input = 2 * PI / 3;
        double resultOfSecFunction = Function.sec(input);
        double expectedOutput = 1 / Math.cos(input);
        assertEquals(resultOfSecFunction, expectedOutput, delta);
    }

    @Test
    void testRightPartOfNegativeValues() {
        double input = 3 * PI / 4;
        double resultOfSecFunction = Function.sec(input);
        double expectedOutput = 1 / Math.cos(input);
        assertEquals(resultOfSecFunction, expectedOutput, delta);
    }

    @Test
    void testAnotherValue() {
        double input = 7 * PI / 6;
        double resultOfSecFunction = Function.sec(input);
        double expectedOutput = 1 / Math.cos(input);
        assertEquals(resultOfSecFunction, expectedOutput, delta);
    }

    @Test
    void testIncorrectValue() {
        double input = PI / 2;
        assertThrows(ArithmeticException.class, () -> Function.sec(input));
    }

    @Test
    void testIncorrectValue2() {
        double input = 3 * PI / 2;
        assertThrows(ArithmeticException.class, () -> Function.sec(input));
    }

    @Test
    void testStringValue() {
        String input = "heeeyyouuu9";
        assertThrows(IllegalArgumentException.class, () -> Function.sec(Double.parseDouble(input)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test.csv", delimiter = ';')
    public void csvTest(double expected, double x) {
        double actual = Function.sec(x);
        assertEquals(expected, actual);
    }

}
