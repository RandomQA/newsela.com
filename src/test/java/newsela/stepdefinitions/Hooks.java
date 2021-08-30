package newsela.stepdefinitions;
import newsela.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setUp() throws Exception {

    }


    @After
    public void tearDown() throws Exception {

        Driver.getDriver().quit();
    }
}
