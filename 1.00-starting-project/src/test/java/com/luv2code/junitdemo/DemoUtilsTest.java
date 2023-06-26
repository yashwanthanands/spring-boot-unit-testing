package com.luv2code.junitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author yashwanthanands
 */
class DemoUtilsTest {

    DemoUtils demoUtils;
    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("@BeforeAll executes only once before all the test methods execution in the class");
    }
    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @After Each");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all the test methods execution in the class");
    }

    @Test
    void addtestEqualsAndNotEquals() {

        System.out.println("Running test : addtestEqualsAndNotEquals");

        //execute
        int result=demoUtils.add(23,29);

        //assert
        assertEquals(52, result, "result should be 52");
        assertNotEquals(81, result, "result should not be 81");
    }

    @Test
    void checkNullTestForNullAndNotNull() {

        System.out.println("Running test : checkNullTestForNullAndNotNull");

        //setup
        String str1=null;
        String str2="Yash";

        //execute and assert
        assertNull(demoUtils.checkNull(str1)," Object should be null");
        assertNotNull(demoUtils.checkNull(str2)," Object should not be null");
    }
}
