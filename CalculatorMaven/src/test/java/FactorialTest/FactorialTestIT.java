package FactorialTest;

import com.endava.calculator.ExpertCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTestIT {
    ExpertCalculator expertCalculator = new ExpertCalculator();

    @Test
    public void factorialTest() {

        assertThat(expertCalculator.factorial(0)).isNotNull();
    }

    @Test
    public void factorialTest2() {

        assertThat(expertCalculator.factorial(0)).isEqualTo(1);
    }

    @Test
    public void factorialTest3() {

        assertThat(expertCalculator.factorial(3)).isEqualTo(6);
    }

    @Test
    public void factorialTest4() {

        assertThat(expertCalculator.factorial(4)).isGreaterThan(4);
    }

    @Test
    public void factorialTest5() {

        assertThat(expertCalculator.factorial(2)).isBetween(1L, 5L);
    }

    @Test
    public void factorialTest6() {

        assertThat(expertCalculator.factorial(1)).isLessThan(3);
    }

    @Test
    public void factorialTest7() {

        assertThat(expertCalculator.factorial(3)).isNotNegative();
    }

    @Test
    public void factorialTest8() {

        assertThat(expertCalculator.factorial(4)).isNotZero();
    }

    @Test
    public void factorialTest9() {

        assertThat(expertCalculator.factorial(2)).isLessThanOrEqualTo(5);
    }
}




