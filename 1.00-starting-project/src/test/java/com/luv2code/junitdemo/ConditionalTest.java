package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author yashwanthanands
 */
public class ConditionalTest {

    @Test
    @Disabled("Dont run until JIRA #123 is resolved")
    void basicTest() {
        // execute method and perform asserts
    }
}
