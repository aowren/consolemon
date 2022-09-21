import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovesTest {

    // Test for the calculateAccuracy method.
    // return true if the value of Math.random() is less than the value of accuracy.
    @Test
    public void testCalculateAccuracy() {
        Moves razorleaf = new Moves("Razor Leaf", 55, 100);
        assertEquals(true, razorleaf.calculateAccuracy());

        Moves zeroChance = new Moves("Zero Chance", 100, 0);
        assertEquals(false, zeroChance.calculateAccuracy());

       /* Moves flamethrower = new Moves("Flamethrower", 80, 10);
        assertEquals(true, flamethrower.calculateAccuracy());*/
    }
}