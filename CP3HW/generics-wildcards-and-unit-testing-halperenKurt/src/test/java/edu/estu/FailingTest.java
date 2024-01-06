package edu.estu;

import org.junit.Test;
import static org.junit.Assert.fail;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {
    @Test
    public void testInfiniteLoopBug() {
        try {
            // Provide an input that triggers the infinite loop
            App.infiniteLoop(Double.POSITIVE_INFINITY);

            // If the above line does not throw an exception, fail the test
            fail("Expected infinite loop, but the method completed successfully.");
        } catch (Exception expected) {
            // The test passes if an exception is thrown (intentional bug)
        }
    }
}
