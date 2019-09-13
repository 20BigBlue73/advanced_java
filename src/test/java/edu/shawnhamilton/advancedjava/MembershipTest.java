package edu.shawnhamilton.advancedjava;

import org.junit.Before;
import org.junit.Test;

import java.time.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the Membership class
 *
 * @author Shawn Hamilton
 */

public class MembershipTest {

    private String memberName;
    private LocalDate expirationDate;

@Before
    public void setup() {
        memberName = "Shawn Hamilton";
        expirationDate = LocalDate.of(2020, 4, 20);
    }

@Test
    public void testMembershipConstruction() {
        Membership membership = new Membership(memberName, expirationDate);

        /* NOTICE: I always put a descriptive string in front of my assert method.
         * You don't have to there is a version of assertEquals that does not take the String argument.
         * However, these descriptive strings are really helpful for debugging failing tests.
         * Get in the habit of always using them.
         */
        assertEquals("The memberName is correct", membership.getMemberName(), memberName);
        assertEquals("The expirationDate is correct", membership.getExpirationDate(), expirationDate);
    }
    
}
