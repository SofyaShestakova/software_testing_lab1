import model.Walls;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WallsClassTests {
    @Test
    void testNegativeTemperature() {
        double input = -44.5777;
        assertEquals(true, Walls.checkWallsCharacteristics(input, "плитка", "запах цветов"));
    }

    @Test
    void testPositiveTemperature() {
        double input = 55.888;
        assertEquals(false, Walls.checkWallsCharacteristics(input, "камень", "запах тины"));
    }

    @Test
    void testZeroTemperature() {
        double input = 0;
        assertEquals(true, Walls.checkWallsCharacteristics(input, "пластик", "неприятный запах"));
    }

    @Test
    void testNull() {
        String input = null;
        assertThrows(NullPointerException.class, () -> Walls.checkWallsCharacteristics(Double.parseDouble(input), "null", ""));
    }

    @Test
    void testStringValue() {
        String input = "go";
        assertThrows(IllegalArgumentException.class, () -> Walls.checkWallsCharacteristics(Double.parseDouble(input), "null", ""));
    }
}
