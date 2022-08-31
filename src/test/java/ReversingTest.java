import com.company.Reversing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ReversingTest {
    private static Reversing reversing;

    @BeforeAll
    public static void creatingObjectOfReversingClass() {
        reversing = new Reversing();
    }

    @Test
    public void shouldWorkWithOnlyDigits() {
        Assertions.assertEquals("12345", reversing.reversingByRule("12345"));
    }

    @Test
    public void shouldWorkWithOnlyLetters() {
        Assertions.assertEquals("ytrewq", reversing.reversingByRule("qwerty"));
    }

    @Test
    public void shouldWorkWithTwoAndMoreWords() {
        Assertions.assertEquals("ytrewq poiu", reversing.reversingByRule("qwerty uiop"));
    }

    @Test
    public void shouldWordWithNumbersAndSpecialSymbols() {
        Assertions.assertEquals("ytr32@ewq", reversing.reversingByRule("qwe32@rty"));
    }

    @Test
    public void shouldWorkWithEmptyString() {
        Assertions.assertEquals("", reversing.reversingByRule(""));
    }
}
