import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {

    Hello hello = new Hello();

    @Test
    public void testAddition() {
        int result = hello.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = hello.subtract(5, 3);
        assertEquals(2, result);
    }
}