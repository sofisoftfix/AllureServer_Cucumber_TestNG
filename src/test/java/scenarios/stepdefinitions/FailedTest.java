package scenarios.stepdefinitions;

/**
 * @user bizadmin
 */
import static org.testng.Assert.*;


import org.testng.annotations.Test;


@Test
public class FailedTest {

    /*@Test
    @Description("Failing Test")
    public void failingTest() {
        assertEquals(1, 2);
    }*/

    @Test(description = "Successful test")
    public void successfulTest() {
        assertTrue(2 == 2);
    }
}
