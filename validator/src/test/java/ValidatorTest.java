import cph.business.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatorTest {


    @Test
    @DisplayName("given a String with less then 8 characters when running validatePassword() then return false")
    public void testPasswordLength() {
        Validator validator = new Validator();
        boolean result = validator.validatePassword("123456789");
        assertEquals(result, true);

    }
}
