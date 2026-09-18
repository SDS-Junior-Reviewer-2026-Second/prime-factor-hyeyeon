import org.example.PrimeFactor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

    private PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimefactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimefactorOf2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void testPrimefactorOf3() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }
}
