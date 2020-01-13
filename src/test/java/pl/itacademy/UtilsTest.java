package pl.itacademy;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThrows;

public class UtilsTest {

    @Before
    public void setUp() {
        //setup actions here
    }

    @BeforeClass
    public void runBeforeTheClass() {

    }

    @After
    public void tearDown() {
        //perform clean up actions
    }

    @Test
    public void isEmpty_whenProvideEmptyString_returnsTrue() {
        boolean result = Utils.isEmpty("");
        assertThat(result, equalTo(true));
    }

    @Test
    public void isEmpty_whenProvideNotEmptyString_returnsFalse() {
        boolean result = Utils.isEmpty("NOT EMPTY");
        assertThat(result, equalTo(false));
    }

    @Test
    public void isEmpty_whenProvideNull_returnsTrue() {
        boolean result = Utils.isEmpty(null);
        assertThat(result, equalTo(true));
    }

    @Test
    public void divide_whenSecondArgumentIsZero_throwsArithmeticException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                () -> Utils.divide(10, 0));
        assertThat(exception.getMessage(), equalTo("Divider can't be 0"));
    }

    @Test
    public void divide_whenDivide9by3_returns3() {
        int result = Utils.divide(9, 3);
        assertThat(result, equalTo(3));
    }
}