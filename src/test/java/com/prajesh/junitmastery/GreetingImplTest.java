package com.prajesh.junitmastery;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prajesh.junitmastery.impl.GreetingImpl;

/**
 * This test class introduces the use of assertThat which provide readability amongst others
 *
 * See <a href="https://objectpartners.com/2013/09/18/the-benefits-of-using-assertthat-over-other-assert-methods-in-unit-tests/</a>
 */
public class GreetingImplTest {

    private Greeting greeting;

    @Before
    public void setUp() throws Exception {
        greeting = new GreetingImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnException() {
        greeting.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldReturnNameIsBlank() {
        greeting.greet("");
    }

    @Test
    public void greetShouldReturnAValidOutput() {
        String result = greeting.greet("JUnit");
        assertNotNull(result);
        // assertThat(actual, is(equalTo(expected)))
        assertThat(result, is("Hello JUnit"));
    }

    @After
    public void tearDown() {
        greeting = null;
    }

}
