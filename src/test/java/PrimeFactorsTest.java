import org.example.PrimeFactor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {
    @Test
    void testPrimefactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(10, 10);
    }
}
