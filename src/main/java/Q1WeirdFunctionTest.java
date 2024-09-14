import org.junit.Test;
import static org.junit.Assert.*;

public class Q1WeirdFunctionTest {

    @Test
    public void testRecursive() {
        assertEquals(0, Q1WeirdFunction.fRecursive(0));  // Base case, returns 0
        assertEquals(1, Q1WeirdFunction.fRecursive(1));  // Base case, returns 1
        assertEquals(2, Q1WeirdFunction.fRecursive(2));  // Base case, returns 2
        assertEquals(4, Q1WeirdFunction.fRecursive(3));  // Computed, returns 4
        assertEquals(11, Q1WeirdFunction.fRecursive(4)); // Computed, returns 11
    }

    @Test
    public void testIterative() {
        assertEquals(0, Q1WeirdFunction.fIterative(0));  // Base case, returns 0
        assertEquals(1, Q1WeirdFunction.fIterative(1));  // Base case, returns 1
        assertEquals(2, Q1WeirdFunction.fIterative(2));  // Base case, returns 2
        assertEquals(4, Q1WeirdFunction.fIterative(3));  // Computed, returns 4
        assertEquals(11, Q1WeirdFunction.fIterative(4)); // Computed, returns 11
    }
}
