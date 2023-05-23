import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseTests {
    @Test
    public void check() {
        int i = 2;
        Assertions.assertEquals(i, 2);
    }
}
