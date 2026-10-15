import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        assertEquals("pohStramS", ReverseString.reverse("SmartShop"));
    }
}
