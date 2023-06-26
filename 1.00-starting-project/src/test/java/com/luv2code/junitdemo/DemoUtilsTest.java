package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 * @author yashwanthanands
 */
class DemoUtilsTest {

    @Test
    void addtestEqualsAndNotEquals() {
        //setup
        DemoUtils demoUtils = new DemoUtils();

        //execute
        int result=demoUtils.add(23,29);

        //assert
        assertEquals(52, result, "result should be 52");
        assertNotEquals(81, result, "result should not be 81");
    }

}
