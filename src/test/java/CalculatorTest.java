import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculatorTest
{
    Calculator c = null;

    @Before
    public void setUp()
    {
        c = new Calculator();
    }

    @Test
    public void testAdd()
    {
        assertEquals(5, c.add(2,3)); //expected and actual
    }

}