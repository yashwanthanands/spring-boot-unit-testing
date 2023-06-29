package com.luv2code.junitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.DisplayNameGeneration;
//import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

/**
 * @author yashwanthanands
 */
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
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
    @DisplayName("Add Test -- Equals and Not Equals")
    void add_test_Equals_And_Not_Equals() {

        System.out.println("Running test : addtestEqualsAndNotEquals");

        //execute
        int result=demoUtils.add(23,29);

        //assert
        assertEquals(52, result, "result should be 52");
        assertNotEquals(81, result, "result should not be 81");
    }

    @Test
    @DisplayName("Check Null Test -- Null and Not Null")
    void check_Null_Test_For_Null_And_Not_Null() {

        System.out.println("Running test : checkNullTestForNullAndNotNull");

        //setup
        String str1=null;
        String str2="Yash";

        //execute and assert
        assertNull(demoUtils.checkNull(str1)," Object should be null");
        assertNotNull(demoUtils.checkNull(str2)," Object should not be null");
    }

    @Test
    @DisplayName("Check SameNotSame Test -- Same and Not Same")
    void check_SameNotSame_Test_For_Same_And_Not_Same() {

        System.out.println("Running test : checkSameNotSameTestForSameAndNotSame");

        //setup
        String str1="yashdevelopment";

        //execute and assert
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate()," Object should refer to the same");
        assertNotSame(str1,demoUtils.getAcademy()," Object should not refer to the same");
    }

}
