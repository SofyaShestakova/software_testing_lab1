import model.Zafod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ZafodClassTests {
    @Test
    void testSpeedValue1() {
        int inputSpeed = 1;
        assertEquals(false, Zafod.goFast(inputSpeed));
    }

    @Test
    void testSpeedValue2() {
        int inputSpeed = 50;
        assertEquals(true, Zafod.goFast(inputSpeed));
    }

    @Test
    void testSpeedValue3() {
        int inputSpeed = 120;
        assertEquals(true, Zafod.goFast(inputSpeed));
    }

    @Test
    void testSpeedValueIncorrect() {
        int inputSpeed = 0;
        assertThrows(IllegalArgumentException.class, () -> Zafod.goFast(inputSpeed));
    }

    @Test
    void testNegativeValue() {
        int inputSpeed = -5;
        assertThrows(IllegalArgumentException.class, () -> Zafod.goFast(inputSpeed));
    }

    @Test
    void testStringValue() {
        String inputSpeed = "why";
        assertThrows(IllegalArgumentException.class, () -> Zafod.goFast(Integer.parseInt(inputSpeed)));
    }

    @Test
    void testGetNervousTrue() {
        boolean input = true;
        assertEquals(true, Zafod.getNervous(input));
    }

    @Test
    void testGetNervousFalse() {
        boolean input = false;
        assertEquals(false, Zafod.getNervous(input));
    }

    @Test
    void testGetNervousStringValue() {
        String input = "heeeyyou";
        assertEquals(false, Zafod.getNervous(Boolean.parseBoolean(input)));
    }

    @Test
    void testGetNervousNullValue() {
        assertEquals(false, Zafod.getNervous(Boolean.parseBoolean(null)));
    }
}
