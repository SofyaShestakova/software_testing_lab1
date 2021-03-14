import model.Lamp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LampClassTests {
    @Test
    void testLightTrue() {
        boolean input = true;
        assertEquals(true, Lamp.light(input));
    }

    @Test
    void testLightFalse() {
        boolean input = false;
        assertEquals(false, Lamp.light(input));
    }

    @Test
    void testLightNull() {
        boolean input = Boolean.parseBoolean(null);
        assertEquals(false, Lamp.light(input));
    }

    @Test
    void testLightStringValue() {
        String input = "hello";
        assertEquals(false, Lamp.light(Boolean.parseBoolean(input)));
    }

    @Test
    void testLightIntValue() {
        int input = 367;
        assertEquals(false, Lamp.light(Boolean.parseBoolean((String.valueOf(input)))));
    }
}
