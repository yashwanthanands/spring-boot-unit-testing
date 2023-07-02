package com.luv2code.junitdemo;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * @author yashwanthanands
 */
public class ConditionalTest {

    
    @Test
    @Disabled("Dont run until JIRA #123 is resolved")
    void basicTest() {
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testforWindowsOnly() {
        // execute method and perform asserts
    }
}
