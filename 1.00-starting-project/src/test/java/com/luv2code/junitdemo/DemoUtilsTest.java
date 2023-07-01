package com.luv2code.junitdemo;

import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.DisplayNameGeneration;
//import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author yashwanthanands
 */

//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
    @Order(1)
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
    @Order(0)
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

    @Test
    @DisplayName("Check TrueOrFalse Test -- True or False")
    void check_TrueOrFalse_Test_For_True_Or_False() {

        System.out.println("Running test : checkTrueOrFalseTestForTrueOrFalse");

        //setup
        int a=10;
        int b=20;

        //execute and assert
        assertTrue(demoUtils.isGreater(b,a)," This should return true");
        assertFalse(demoUtils.isGreater(a,b)," This should return false");
    }

    @Test
    @DisplayName("Check Array Equals Test")
    void check_ArrayEquals_Test() {

        System.out.println("Running test : checkArrayEqualsTest");

        //setup
        String[] stringArray = {"A","B","C"};

        //execute and assert
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet()," Array should be equal");
    }

    @Test
    @DisplayName("Check Iterable Equals Test")
    void check_IterableEquals_Test() {

        System.out.println("Running test : checkIterableEqualsTest");

        //setup
        List<String> theList =List.of("luv","2","code");

        //execute and assert
        assertIterableEquals(theList, demoUtils.getAcademyInList()," List should be equal");
    }

    @Test
    @DisplayName("Check LinesMatch Test")
    void check_LinesMatch_Test() {

        System.out.println("Running test : checkIterableEqualsTest");

        //setup
        List<String> theList =List.of("luv","2","code");

        //execute and assert
        assertLinesMatch(theList, demoUtils.getAcademyInList()," Lines should be matched");
    }

    @Test
    @DisplayName("Check Throws And Does Not Throw Exception Test")
    void check_Throws_And_Doesnot_Throw_Exception_Test() {

        System.out.println("Running test : checkThrowsAndDoesNotThrowExceptionTest");

        //execute and assert
        assertThrows(Exception.class, () -> {demoUtils.throwException(-1);}, "Should throw an exception" );
        assertDoesNotThrow(() -> {demoUtils.throwException(1);}, "Should throw an exception" );
    }

    @Test
    @DisplayName("Check Timeout Test")
    void check_Timeout_Test() {

        System.out.println("Running test : checkTimeoutTest");

        //execute and assert
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {demoUtils.checkTimeout();}, "Method should execute in 3 seconds" );
    }
}
