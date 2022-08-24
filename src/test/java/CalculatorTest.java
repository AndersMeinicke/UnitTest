import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addition() {
        System.out.println("See if the two numbers add up");
        int actual = new Calculator().addition(2,3);
        int expected = 5;
        assertEquals(expected,actual);
    }
}