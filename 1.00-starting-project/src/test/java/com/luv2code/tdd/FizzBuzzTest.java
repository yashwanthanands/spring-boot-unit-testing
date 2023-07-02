package com.luv2code.tdd;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author yashwanthanands
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // If number is divisible by 3, print Fizz
    // If number is divisible by 5, print Buzz
    // if number is divisible by 3 and 5, print FizzBuzz
    // If number is NOT divisible by 3 or 5, then print the number


    @DisplayName(("Divisible by Three"))
    @Test
    @Order(1)
    void testForDivisibleByThree() {
        fail("fail");
    }
}
