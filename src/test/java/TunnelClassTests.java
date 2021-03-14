import model.Tunnel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TunnelClassTests {
    @Test
    void testRightHigherCorner(){
        double inputX = 1;
        double inputY = 35;
        assertEquals("right", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testLeftHigherCorner(){
        double inputX = -1000;
        double inputY = 35;
        assertEquals("left", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testRightLowerCorner(){
        double inputX = 18;
        double inputY = -35;
        assertEquals("right", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testLeftLowerCorner(){
        double inputX = -13;
        double inputY = 368;
        assertEquals("left", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testZeroValue(){
        double inputX = 0;
        double inputY = 0;
        assertEquals("zero", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testOY1(){
        double inputX = 0;
        double inputY = 48;
        assertEquals("OY", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testOY2(){
        double inputX = 0;
        double inputY = -537;
        assertEquals("OY", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testOX1(){
        double inputX = 53890;
        double inputY = 0;
        assertEquals("OX", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testOX2(){
        double inputX = - 537870;
        double inputY = 0;
        assertEquals("OX", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testNonIntegerValues1(){
        double inputX = -56.6779;
        double inputY = 345.99998;
        assertEquals("left", Tunnel.checkLocation(inputX,inputY));
    }
    @Test
    void testNonIntegerValues2(){
        double inputX = 53.9870;
        double inputY = 1150.7777;
        assertEquals("right", Tunnel.checkLocation(inputX,inputY));
    } @Test
    void testStringValues(){
        String inputX = "hhhjkk";
        String inputY = "ppppppppppppllll";
        assertThrows(NumberFormatException.class, () -> Tunnel.checkLocation(Double.parseDouble(inputX), Double.parseDouble(inputY)));
    }
    @Test
    void testNullValues(){
        String inputX = null;
        String inputY = null;
        assertThrows(NullPointerException.class, () -> Tunnel.checkLocation(Double.parseDouble(inputX), Double.parseDouble(inputY)));
    }
}
