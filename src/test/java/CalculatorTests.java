import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
        }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(6, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(20, 10));
    }
    @Test
    public void canMultiply(){
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(10, calculator.divide(20, 2), 0.0);
    }
}
