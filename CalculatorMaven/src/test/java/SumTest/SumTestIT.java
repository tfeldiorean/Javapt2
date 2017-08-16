package SumTest;

import com.endava.calculator.BasicCalculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SumTestIT {
    BasicCalculator basicCalculator;

    @BeforeTest
    public void instantiateBasicCalculator() {
        basicCalculator = new BasicCalculator();
    }

    @Test
    public void addIntegers() {
        assertThat(basicCalculator.add(2, 3), equalTo(5L));
    }

    @Test
    public void doubleAdd() {
        assertThat(basicCalculator.add(1.0, 2.0), is(equalTo(3.0)));
    }

    @Test
    public void longAdd() {
        assertThat(basicCalculator.add(5L, 3L), greaterThan(4L));
    }

    @Test
    public void integerAdd() {
        assertThat(basicCalculator.add(60, 20), lessThan(90L));
    }
}





