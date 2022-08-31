import com.company.Reversing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ReversingTest {
    private final Reversing reversing = new Reversing();


    @Test
    public void shouldWorkWithOnlyDigits() {
        final String expected = "12345";
        final String actual = reversing.reversingByRule("12345");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithOnlyLetters() {
        final String expected = "ytrewq";
        final String actual = reversing.reversingByRule("qwerty");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithTwoAndMoreWords() {
        final String expected = "ytrewq poiu";
        final String actual = reversing.reversingByRule("qwerty uiop");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWordWithNumbersAndSpecialSymbols() {
        final String expected = "ytr32@ewq";
        final String actual = reversing.reversingByRule("qwe32@rty");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithEmptyString() {
        final String expected = "";
        final String actual = reversing.reversingByRule("");
        Assertions.assertEquals(expected, actual);
    }
}
